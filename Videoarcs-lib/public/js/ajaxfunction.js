//On Page load - register listeners and load existing videos in datatable
$(document).ready(function() {
loadDataTable();
//process the form newVideo
$("#newVideo").submit(function(event) {
postVideo(event);
});
//Load Datatable
$('#loadtable').click(function() {
loadDataTable();
});
});

function postVideo(event) {
// get the form data
var formData = {
'title' : $('input[name=title]').val(),
'description' : $('textarea[name=description]').val(),
'ageRating' : $('input[name=agerating]').val(),
'genre' : $('input[name=genre]').val()
};

// process the form
$.ajax({
type : 'POST', // define the type of HTTP verb we want to use (POST for our form)
contentType : 'application/json',
url : '/videos', // url where we want to POST
data : JSON.stringify(formData), // data we want to POST
success: function( data, textStatus, jQxhr ){
loadDataTable();
},
error: function( jqXhr, textStatus, errorThrown ){
console.log(errorThrown);
}
});
// stop the form from submitting the normal way and refreshing the page
event.preventDefault();
}

function loadDataTable() {
var table = $('#videotable').DataTable({
destroy: true,
"ajax": {
			"url": "/videos", //URL
			"dataSrc": "" // Cause of flat JsonObjects
},
"columns": [
{ "data": "title" },
{ "data": "description" },
{ "data": "ageRating" },
{ "data": "genre"}
]
});
}
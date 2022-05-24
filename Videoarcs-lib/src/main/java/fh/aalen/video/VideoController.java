package fh.aalen.video;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

	@Autowired 
	VideoService videoService;

	@RequestMapping("/videos")
	public List<Video> getVideoList() {
		return videoService.getVideoList();
	}

	@RequestMapping("/videos/{title}")
	public Video getVideo(@PathVariable String title) {
		return videoService.getVideo(title);
	}

	@RequestMapping(method = RequestMethod.POST, value  =  "/videos") 
	public void addVideo(@RequestBody Video video) {
		videoService.addVideo(video);
	}


	@RequestMapping(method  =  RequestMethod.PUT, value  =  "/videos/{title}")
	public void updateVideo(@PathVariable String title, @RequestBody Video video) {
		videoService.updateVideo(title, video);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/videos/{title}")
	public void deleteVideo(@PathVariable String title) {
		videoService.deleteVideo(title);
	}

	@RequestMapping("/videosbygenre/{genre}")
	public List<Video> getAllVideosOfGenre(@PathVariable String genre){
		return videoService.getAllVideosOfGenre(genre); 
	}

	@RequestMapping("/videosbyage/{ageRating}")
	public List<Video> getAllVideosOfAgeRating(@PathVariable String ageRating){
		return videoService.getAllVideosOfAgeRating(ageRating); 
	}

	@RequestMapping("/videogenres")
	public List<GenresOnly> getAllGenres(){
		return videoService.getAllGenres(); 
	}



}

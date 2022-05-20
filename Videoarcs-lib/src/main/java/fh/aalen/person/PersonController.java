package fh.aalen.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fh.aalen.video.Video;

@RestController
public class PersonController {

	
	@Autowired 
	PersonService personService; 
	
	
	@RequestMapping("/persons")
	public List<Person> getPersons() {
		return personService.getPersons();
	}

	@RequestMapping("/persons/{id}")
	public Person getPerson(@PathVariable String id) {
		return personService.getPerson(id);
	}

	@RequestMapping(method  =  RequestMethod.POST, value = "/persons") 
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/persons/{id}")
	public void updatePerson(@PathVariable String id, @RequestBody Person person) {
		personService.updatePerson(id, person);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/persons/{id}")
	public void deletePerson(@PathVariable String id) {
		personService.deletePerson(id);
		
	}
}

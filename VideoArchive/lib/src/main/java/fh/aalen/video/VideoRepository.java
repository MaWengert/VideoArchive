package fh.aalen.video;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface VideoRepository extends CrudRepository<Video, String> {
	public List<Video> findByGenreOrderByTitle(String genre);	
	public List<Video> findByAgeRating(String ageRating);
	public List<GenresOnly> findAllProjectedBy();
	
}

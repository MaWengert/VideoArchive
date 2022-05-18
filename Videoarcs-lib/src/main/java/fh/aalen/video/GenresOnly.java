package fh.aalen.video;

public interface GenresOnly {
	
	@org.springframework.beans.factory.annotation.Value("#{target.genre}")
	public String getGenre(); 
}

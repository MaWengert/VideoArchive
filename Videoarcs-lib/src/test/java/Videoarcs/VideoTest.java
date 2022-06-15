package Videoarcs;

import org.junit.jupiter.api.Test;


import fh.aalen.video.Video;
import fh.aalen.video.VideoService;
import fh.aalen.Anwendung; 

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;



class VideoTest {
	
    @Test void checkAgeRatingValidityTest() {
		Video vid = new Video("Test", "12", "Test", "Test"); 
		VideoService v = new VideoService(); 
        assertThrows(NumberFormatException.class, ()->{
        	v.checkAgeRatingValidity(vid); 
        });
        }
    }


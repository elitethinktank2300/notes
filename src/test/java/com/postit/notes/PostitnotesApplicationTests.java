package com.postit.notes;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import com.postit.notes.model.PostItNoteEntity;
import com.postit.notes.test.config.WebClientTestConfiguration;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@Import(WebClientTestConfiguration.class)
class PostitnotesApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	@DisplayName("Get All PostIt Notes.")
	void testGetAllNotes() throws Exception {

		URI targetUrl= UriComponentsBuilder.fromUriString("/postit/all").build().encode().toUri();
		ResponseEntity<PostItNoteEntity[]> response = this.restTemplate.getForEntity(targetUrl, PostItNoteEntity[].class);
		
		PostItNoteEntity[] objects 		= response.getBody();
		List<PostItNoteEntity> postItNoteEntity= Arrays.asList(objects);
		
		MediaType contentType 	= response.getHeaders().getContentType();
		HttpStatus statusCode 	= response.getStatusCode();
		
		//TODO:  this sysout test toString of PostItNoteEntity class. Convert into assertion
		System.out.println(postItNoteEntity);
		
		//TODO:  this sysout test contentType -> convert into assert
		System.out.println(contentType);
		
		//TODO: this sysout test contentType -> convert into assert
		System.out.println(statusCode);
		
		Assertions.assertTrue(postItNoteEntity.get(0).getPostTitle().equalsIgnoreCase("IPhone6"));
	}
}

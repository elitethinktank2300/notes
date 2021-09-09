package com.postit.notes.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.postit.notes.exception.PostNotFundException;

@ControllerAdvice
public class PostItExceptionHandler {

	@ExceptionHandler(value = PostNotFundException.class)
	public ResponseEntity<Object> exception(PostNotFundException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}
}

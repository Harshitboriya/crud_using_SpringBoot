package com.crud.restapi.s.exception;

import javax.management.RuntimeOperationsException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


// mannual exception for if resource not found mostly used on server to show client the request they made is not available
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExc extends RuntimeException{
	
//	constructor
	public ResourceNotFoundExc(String message)
	{
//		Invoke messgae from parent RuntimeException
		super(message);
	}

}

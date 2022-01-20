package br.com.accurate.desafiosb.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AchadosPerdidosException extends ResponseEntityExceptionHandler{

	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity <Object> handleAnyException(Exception e, WebRequest request){
		String ErroDescricao = e.getLocalizedMessage();
		if(ErroDescricao == null){ErroDescricao = e.toString();}
		ErroMensagens erroMensagens = new ErroMensagens(new Date(), ErroDescricao);
		
		return new ResponseEntity<>(erroMensagens,new org.springframework.http.HttpHeaders(),
				HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
}

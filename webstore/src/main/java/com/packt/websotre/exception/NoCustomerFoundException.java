package com.packt.websotre.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No Customer Found!")
public class NoCustomerFoundException extends RuntimeException{

	private static final long serialVersionUID =3935230281455340039L;

}
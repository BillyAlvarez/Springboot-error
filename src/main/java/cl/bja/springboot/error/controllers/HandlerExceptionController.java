package cl.bja.springboot.error.controllers;

import cl.bja.springboot.error.models.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class HandlerExceptionController {

    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<Error> handleException(Exception ex) {

        Error error = new Error();
        error.setMessage(ex.getMessage());
        error.setError("Error division por 0");
        error.setTimestamp(new Date());
        error.setStatus(500);
        //return ResponseEntity.internalServerError().body(error);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
    }

}

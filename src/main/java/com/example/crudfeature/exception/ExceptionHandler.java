
/*package com.example.crudfeature.exception;

import antlr.debug.Tracer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@ControllerAdvice
public class ExceptionHandler {

    private final Tracer tracer;

    public ExceptionHandler(Tracer tracer) {
        this.tracer = tracer;
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {ChangeSetPersister.NotFoundException.class})
    public ResponseEntity<ExceptionResponse> notFoundExceptionHandler(){
        return buildExceptionResponse(HttpStatus.NOT_FOUND);
    }

    private ResponseEntity<ExceptionResponse> buildExceptionResponse(
            final Exception exception,
            final HttpServletRequest request,
            final HttpStatus status,
            final String ... errorMessages
            ){

        final ExceptionResponse body = new ExceptionResponse();
        body.setType(exception.getClass().getSimpleName());
        body.setError(errorMessages.length > 0 ? errorMessages[0] : exception.getMessage());

    }

}
*/
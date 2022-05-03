package com.example.crudfeature.exception;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Builder
@Data
public class ExceptionResponse
{
    private String error;
    private String cause;
    private String path;
    private String type;
}

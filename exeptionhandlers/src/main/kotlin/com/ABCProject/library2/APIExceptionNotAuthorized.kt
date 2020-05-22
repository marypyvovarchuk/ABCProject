package com.ABCProject.library2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
class APIExceptionNotAuthorized : APIException {

    constructor() : super(HttpStatus.UNAUTHORIZED, "Not uthorized")
    constructor(msg: String) : super(HttpStatus.UNAUTHORIZED, msg)
}
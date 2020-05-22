package com.ABCProject.library2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
class APIForbiddenException : APIException {

    constructor() : super(HttpStatus.FORBIDDEN, "Access forbidden")
    constructor(msg: String) : super(HttpStatus.FORBIDDEN, msg)
}
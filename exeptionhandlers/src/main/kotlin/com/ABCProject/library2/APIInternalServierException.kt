package com.ABCProject.library2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
class APIInternalServierException : APIException {

    constructor() : super(HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL_SERVER_ERROR")
    constructor(msg: String) : super(HttpStatus.INTERNAL_SERVER_ERROR, msg)
}
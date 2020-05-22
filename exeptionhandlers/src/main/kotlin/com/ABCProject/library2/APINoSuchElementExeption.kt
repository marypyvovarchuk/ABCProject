package com.ABCProject.library2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
class APINoSuchElementExeption : APIException {

    constructor() : super(HttpStatus.NOT_FOUND, "Failed to find object with specified id")
    constructor(msg: String) : super(HttpStatus.NOT_FOUND, msg)
}
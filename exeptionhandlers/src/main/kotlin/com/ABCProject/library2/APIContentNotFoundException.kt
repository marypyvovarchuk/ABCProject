package com.ABCProject.library2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NO_CONTENT)
class APIContentNotFoundException : APIException {

    constructor() : super(HttpStatus.NO_CONTENT, "Content not found")
    constructor(msg: String) : super(HttpStatus.NO_CONTENT, msg)
}
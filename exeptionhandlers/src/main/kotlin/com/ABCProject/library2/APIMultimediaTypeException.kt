package com.ABCProject.library2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNSUPPORTED_MEDIA_TYPE)
class APIMultimediaTypeException : APIException {

    constructor() : super(HttpStatus.UNSUPPORTED_MEDIA_TYPE, "Image type required")
    constructor(msg: String) : super(HttpStatus.UNSUPPORTED_MEDIA_TYPE, msg)
}
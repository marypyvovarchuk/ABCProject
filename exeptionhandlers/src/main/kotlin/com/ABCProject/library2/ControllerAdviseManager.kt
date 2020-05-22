package com.ABCProject.library2;

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ControllerAdviseManager {

    @ExceptionHandler(ExceptionControllerAdvise::class)
    //fun handleEx() = "exception_page"// add exception page
}
package com.ABCProject.library2;

import com.vakoms.beacons.api.models.APIError
import org.springframework.http.HttpStatus

open class APIException(status: HttpStatus, message: String) : RuntimeException(message) {

    private val data = APIError()

    init {
        this.data().setHttpStatus(status.value())
        this.data().setMessage(msg)
    }

    fun data(): APIError {
        return data
    }
}
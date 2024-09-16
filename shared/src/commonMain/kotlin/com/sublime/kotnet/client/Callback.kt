package com.sublime.kotnet.client

import com.sublime.kotnet.model.Response

interface Callback {
    fun onResponse(
        call: Call,
        response: Response,
    )

    fun onFailure(
        call: Call,
        throwable: Throwable,
    )
}

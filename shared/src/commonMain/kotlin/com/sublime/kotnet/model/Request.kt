package com.sublime.kotnet.model

import com.sublime.kotnet.http.Headers
import com.sublime.kotnet.http.HttpMethod
import com.sublime.kotnet.http.RequestBody

data class Request(
    val url: String,
    val method: HttpMethod,
    val headers: Headers,
    val body: RequestBody?,
)

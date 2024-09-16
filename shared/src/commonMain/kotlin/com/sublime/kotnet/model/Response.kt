package com.sublime.kotnet.model

import com.sublime.kotnet.http.ResponseBody

data class Response(
    val code: Int,
    val message: String,
    val headers: Headers,
    val body: ResponseBody?,
)

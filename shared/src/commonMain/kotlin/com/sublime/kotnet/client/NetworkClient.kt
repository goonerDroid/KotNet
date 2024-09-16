package com.sublime.kotnet.client

import com.sublime.kotnet.model.Request

interface NetworkClient {
    fun create(baseUrl: String): NetworkClient

    fun newCall(request: Request): Call
}

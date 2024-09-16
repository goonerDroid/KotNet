package com.sublime.kotnet.client

import com.sublime.kotnet.model.Response

interface Call {
    fun execute(): Response

    fun enqueue(callback: Callback)

    fun cancel()
}

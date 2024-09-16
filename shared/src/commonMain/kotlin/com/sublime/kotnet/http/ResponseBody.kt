package com.sublime.kotnet.http

interface ResponseBody {
    fun contentType(): String?

    fun contentLength(): Long

    fun source(): ByteArray
}

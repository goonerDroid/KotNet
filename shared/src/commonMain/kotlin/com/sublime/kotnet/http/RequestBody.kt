package com.sublime.kotnet.http

interface RequestBody {
    fun contentType(): String

    fun contentLength(): Long

    fun writeTo(sink: ByteArray)
}

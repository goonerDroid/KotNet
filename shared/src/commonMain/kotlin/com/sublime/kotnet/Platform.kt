package com.sublime.kotnet

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
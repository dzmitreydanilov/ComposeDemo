package com.ddanilov.composedemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package com.togglr.toggle

import java.lang.annotation.Inherited

@Target(AnnotationTarget.FUNCTION, AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Inherited
annotation class Toggle(
        val name: String,
        val fallback: String = ""
)
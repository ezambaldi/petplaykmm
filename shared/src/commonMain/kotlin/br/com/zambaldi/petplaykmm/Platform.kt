package br.com.zambaldi.petplaykmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
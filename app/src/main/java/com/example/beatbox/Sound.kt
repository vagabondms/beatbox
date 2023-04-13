package com.example.beatbox

private const val WAV = ".wav"

class Sound(val assetPath: String) {

    val name: String
    get() = assetPath.split("/").last().removeSuffix(WAV)
}
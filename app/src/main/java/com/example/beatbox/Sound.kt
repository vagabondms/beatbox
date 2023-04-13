package com.example.beatbox

private const val WAV = ".wav"

class Sound(val assetPath: String, var soundId: Int? = null) {

    val name: String
    get() = assetPath.split("/").last().removeSuffix(WAV)
}

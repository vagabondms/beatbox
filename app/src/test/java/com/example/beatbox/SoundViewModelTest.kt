package com.example.beatbox

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

internal class SoundViewModelTest {

    private lateinit var beatBox: BeatBox
    private lateinit var sound: Sound
    private lateinit var subject: SoundViewModel

    @Before
    fun setUp() {
        beatBox = mock(BeatBox::class.java)
        sound = Sound("assetPath")
        subject = SoundViewModel(beatBox)
        subject.sound = sound
    }

    @Test
    fun `check if sound name is exposed as title`(){
        MatcherAssert.assertThat(subject.title, `is`(sound.name))
    }

    @Test
    fun `check if button click trigger playing beat box`(){
        subject.onButtonClicked()
        verify(beatBox).play(sound)
    }
}
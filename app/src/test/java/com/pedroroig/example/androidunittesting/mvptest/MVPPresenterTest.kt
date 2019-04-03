package com.pedroroig.example.androidunittesting.mvptest

import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito
import org.mockito.Mockito.times
import org.mockito.Mockito.verify

class MVPPresenterTest {

    private val expectedGreetingMessage = "Hi, unknown person"

    @Test
    fun layoutDefaultGreetingMessage() {
        val mockView = Mockito.mock(MVPView::class.java)
        val presenter = MVPPresenter(mockView)

        presenter.layoutDefaultGreetingMessage()

        verify(mockView, times(1)).setMessageText(expectedGreetingMessage)
    }
}
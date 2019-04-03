package com.pedroroig.example.androidunittesting.mvptest

class MVPPresenter(private val view: MVPView) {

    private val model = SupercomplexBusinessModel()

    fun layoutDefaultGreetingMessage() {
        view.setMessageText(model.getDefaultGreetingMessage())
    }

}
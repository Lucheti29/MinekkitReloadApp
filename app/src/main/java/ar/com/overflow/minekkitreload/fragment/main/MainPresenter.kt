package ar.com.overflow.minekkitreload.fragment.main

import android.content.Context
import ar.com.overflow.minekkitreload.core.presenter.BasePresenter

class MainPresenter : BasePresenter<MainView> {

    constructor(viewInstance: MainView, context: Context) : super(viewInstance, context)

    override fun init() {
        view?.setFirstText("My first text!")
    }
}
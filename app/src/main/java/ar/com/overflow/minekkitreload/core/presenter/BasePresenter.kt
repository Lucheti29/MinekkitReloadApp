package ar.com.overflow.minekkitreload.core.presenter

import android.content.Context

open class BasePresenter<T> : Presenter {

    var view: T?
    var context: Context?

    constructor(viewInstance: T, context: Context) {
        this.view = viewInstance
        this.context = context
    }

    fun isViewAttached(): Boolean = view != null

    fun detachView() {
        view = null
        context = null
    }

    override fun init() {}
}
package ar.com.overflow.minekkitreload.core.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ar.com.overflow.minekkitreload.R
import ar.com.overflow.minekkitreload.core.presenter.Presenter
import ar.com.overflow.minekkitreload.core.toast.ToastUtils

abstract class BaseFragment<T : Presenter> : Fragment() {

    lateinit var mPresenter: T

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val v = inflater!!.inflate(layout(), container, false)
        if (arguments == null || checkArguments(arguments)) {
            mPresenter = createPresenter()
        } else {
            ToastUtils.showToast(context, R.string.unknown_error)
            activity.finish()
        }
        return v
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        populate()
        setListeners()
        mPresenter.init()
    }

    open fun checkArguments(arg: Bundle): Boolean = true

    open fun populate() {}

    open fun setListeners() {}

    abstract fun layout(): Int

    abstract fun createPresenter(): T
}

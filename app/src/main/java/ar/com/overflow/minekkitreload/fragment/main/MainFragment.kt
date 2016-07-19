package ar.com.overflow.minekkitreload.fragment.main

import ar.com.overflow.minekkitreload.R
import ar.com.overflow.minekkitreload.core.fragment.BaseFragment
import ar.com.overflow.minekkitreload.core.toast.ToastUtils
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : BaseFragment<MainPresenter>(), MainView {

    override fun layout(): Int = R.layout.main_fragment

    override fun createPresenter(): MainPresenter = MainPresenter(this, context)

    override fun setFirstText(text: String) {
        main_fragment_text.text = "Oh my god! 2"
    }

    override fun setListeners() {
        main_fragment_text.setOnClickListener {
            ToastUtils.showToast(activity, R.string.unknown_error)
        }
    }
}
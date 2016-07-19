package ar.com.overflow.minekkitreload.core.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import ar.com.overflow.minekkitreload.R
import ar.com.overflow.minekkitreload.core.toast.ToastUtils

abstract class BaseActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(layout())
        super.onCreate(savedInstanceState)
        if (intent == null || intent.extras == null || checkArguments(intent.extras)) {
            loadFragment()
            init()
            populate()
            setListeners()
        } else {
            ToastUtils.showToast(this, R.string.unknown_error)
            finish()
        }
    }

    fun loadFragment() {
        replaceFragment(R.id.base_activity_content, createFragment())
    }

    fun layout() : Int {
        return R.layout.base_activity
    }

    fun replaceFragment(resId: Int, f: Fragment) {
        supportFragmentManager.beginTransaction().replace(resId, f).commit()
    }

    protected final fun replaceFragment(resId: Int, f: Fragment, tag: String) {
        supportFragmentManager.beginTransaction().replace(resId, f, tag).commit()
    }

    /**
     * Protected functions
     */
    open fun init() {}

    open fun populate() {}

    open fun setListeners() {}

    open fun checkArguments(args: Bundle) : Boolean = true

    /**
     * Abstract functions
     */
    abstract fun createFragment(): Fragment
}
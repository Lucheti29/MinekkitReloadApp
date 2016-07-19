package ar.com.overflow.minekkitreload.activity

import android.support.v4.app.Fragment
import ar.com.overflow.minekkitreload.core.activity.BaseActivity
import ar.com.overflow.minekkitreload.fragment.main.MainFragment

class MainActivity : BaseActivity() {

    override fun createFragment(): Fragment = MainFragment()
}

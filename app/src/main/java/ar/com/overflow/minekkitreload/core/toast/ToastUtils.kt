package ar.com.overflow.minekkitreload.core.toast

import android.content.Context
import android.widget.Toast

class ToastUtils {
    companion object {
        fun showToast(context: Context, textId: Int, duration: Int = Toast.LENGTH_SHORT) {
            Toast.makeText(context, textId, duration).show()
        }
    }
}

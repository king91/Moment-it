package kr.co.sleeptime.momentit

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import kr.co.sleeptime.momentit.di.MyModules
import org.koin.android.ext.android.startKoin

class MomentIt : Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
        startKoin(this, MyModules.modules)
    }
}
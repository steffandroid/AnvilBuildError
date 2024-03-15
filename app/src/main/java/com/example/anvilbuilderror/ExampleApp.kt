package com.example.anvilbuilderror

import android.app.Application
import androidx.core.app.NotificationManagerCompat
import com.example.lib.ExampleInterface
import com.example.lib.ExampleProcessor
import javax.inject.Inject

class ExampleApp: Application() {
    @Inject
    lateinit var exampleProcessor: ExampleProcessor

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.factory().create(this)
            .inject(this)

        exampleProcessor.process()
    }
}

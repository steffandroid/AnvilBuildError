package com.example.anvilbuilderror

import android.content.Context
import androidx.core.app.NotificationManagerCompat
import com.example.scope.AppScope
import com.squareup.anvil.annotations.ContributesTo
import com.squareup.anvil.annotations.optional.SingleIn
import dagger.Module
import dagger.Provides

@Module
@ContributesTo(AppScope::class)
class ExampleModule {
    @Provides
    @SingleIn(AppScope::class)
    fun provide(context: Context): NotificationManagerCompat {
        return NotificationManagerCompat.from(context)
    }
}

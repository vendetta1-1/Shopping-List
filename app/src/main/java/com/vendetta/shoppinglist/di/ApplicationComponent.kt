package com.vendetta.shoppinglist.di

import android.app.Application
import com.vendetta.shoppinglist.presentation.MainActivity
import com.vendetta.shoppinglist.presentation.ShopItemFragment
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(
    modules = [
        DataModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    fun inject(fragment: ShopItemFragment)

    @Component.Factory
    interface Factory {

        @ApplicationScope
        fun create(
            @BindsInstance application: Application
        ): ApplicationComponent
    }
}
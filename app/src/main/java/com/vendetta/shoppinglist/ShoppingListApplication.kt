package com.vendetta.shoppinglist

import android.app.Application
import com.vendetta.shoppinglist.di.ApplicationComponent
import com.vendetta.shoppinglist.di.DaggerApplicationComponent

class ShoppingListApplication : Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerApplicationComponent.factory().create(this)
    }
}
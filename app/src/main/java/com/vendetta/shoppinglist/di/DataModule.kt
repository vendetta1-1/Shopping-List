package com.vendetta.shoppinglist.di

import android.app.Application
import com.vendetta.shoppinglist.data.AppDataBase
import com.vendetta.shoppinglist.data.ShopListDao
import com.vendetta.shoppinglist.data.ShopListRepositoryImpl
import com.vendetta.shoppinglist.domain.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {


    @ApplicationScope
    @Binds
    fun bindRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {

        @ApplicationScope
        @Provides
        fun provideShopListDao(
            application: Application
        ): ShopListDao {
            return AppDataBase.getInstance(application).shopListDao()
        }

    }

}
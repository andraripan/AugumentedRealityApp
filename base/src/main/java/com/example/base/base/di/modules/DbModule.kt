package com.example.base.base.di.modules

import com.example.base.base.db.DbCreator
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DbModule {
    @Singleton
    @Provides
    internal fun provideDb(dbCreator: DbCreator) =
        dbCreator.arDb
    //TODO add dao here
}
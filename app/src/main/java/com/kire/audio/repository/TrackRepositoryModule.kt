package com.kire.audio.repository
//
//import android.content.Context
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.android.qualifiers.ApplicationContext
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Singleton
//
//@Module
//@InstallIn(SingletonComponent::class)
//object TrackRepositoryModule {
//    @Provides
//    @Singleton
//    fun provideTrackRepository(
//        @ApplicationContext context: Context
//    ): TrackRepository = TrackRepository(context)
//
//}
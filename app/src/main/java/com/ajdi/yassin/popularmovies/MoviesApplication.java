package com.ajdi.yassin.popularmovies;

import android.app.Application;

import timber.log.Timber;

/**
 * @author Pulkit jindal
 * @since 11/10/2018.
 */
public class MoviesApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}

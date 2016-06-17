package org.marcsmen;

import android.app.Application;
import android.util.Log;

import timber.log.Timber;

/**
 * Created by Chris on 6/16/2016.
 */

public class ApplicationSession extends Application {

    @Override public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

}

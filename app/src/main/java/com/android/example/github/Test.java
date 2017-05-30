package com.android.example.github;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;

import static android.arch.lifecycle.Lifecycle.Event.ON_CREATE;
import static android.arch.lifecycle.Lifecycle.Event.ON_START;
import static android.arch.lifecycle.Lifecycle.Event.ON_STOP;

/**
 * @author Mike
 */

public class Test {
    public static class TestObserver implements LifecycleObserver {
        @OnLifecycleEvent(ON_CREATE)
        void onCreated(LifecycleOwner source) {}
        @OnLifecycleEvent({ON_STOP, ON_START})
        void onStoppedOrStarted(LifecycleOwner source, Lifecycle.Event event) {}
        @OnLifecycleEvent(ON_STOP)
        void onStopped() {}
    }


}

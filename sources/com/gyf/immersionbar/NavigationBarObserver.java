package com.gyf.immersionbar;

import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
final class NavigationBarObserver extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21437a = 0;

    public static class NavigationBarObserverInstance {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigationBarObserver f21438a = new NavigationBarObserver(new Handler(Looper.getMainLooper()));
    }
}

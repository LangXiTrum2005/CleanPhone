package com.google.android.gms.common.api.internal;

import android.app.Activity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ActivityLifecycleObserver {
    public static final ActivityLifecycleObserver of(Activity activity) {
        return new zab(zaa.zaa(activity));
    }

    public abstract ActivityLifecycleObserver onStopCallOnce(Runnable runnable);
}

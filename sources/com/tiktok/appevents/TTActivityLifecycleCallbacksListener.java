package com.tiktok.appevents;

import androidx.lifecycle.LifecycleOwner;
import com.tiktok.util.TTUtil;

/* JADX INFO: loaded from: classes6.dex */
class TTActivityLifecycleCallbacksListener extends TTLifeCycleCallbacksAdapter {
    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        throw null;
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        try {
            TTUtil.a(0L).put("latency", System.currentTimeMillis() - 0);
            throw null;
        } catch (Exception unused) {
            System.currentTimeMillis();
            throw null;
        }
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        throw null;
    }
}

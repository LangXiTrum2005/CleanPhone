package com.bumptech.glide.manager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
final class FirstFrameAndAfterTrimMemoryWaiter implements FrameWaiter, ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
    }
}

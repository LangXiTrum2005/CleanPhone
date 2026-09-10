package com.bumptech.glide.manager;

import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bumptech.glide.util.Util;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements Lifecycle, LifecycleObserver {
    public final HashSet X = new HashSet();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final androidx.lifecycle.Lifecycle f12748Y;

    public LifecycleLifecycle(androidx.lifecycle.Lifecycle lifecycle) {
        this.f12748Y = lifecycle;
        lifecycle.a(this);
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public final void a(LifecycleListener lifecycleListener) {
        this.X.remove(lifecycleListener);
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public final void b(LifecycleListener lifecycleListener) {
        this.X.add(lifecycleListener);
        androidx.lifecycle.Lifecycle lifecycle = this.f12748Y;
        if (lifecycle.getD() == androidx.lifecycle.Lifecycle.State.X) {
            lifecycleListener.onDestroy();
        } else if (lifecycle.getD().compareTo(androidx.lifecycle.Lifecycle.State.e0) >= 0) {
            lifecycleListener.onStart();
        } else {
            lifecycleListener.onStop();
        }
    }

    @OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Iterator it = Util.e(this.X).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().c(this);
    }

    @OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        Iterator it = Util.e(this.X).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        Iterator it = Util.e(this.X).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStop();
        }
    }
}

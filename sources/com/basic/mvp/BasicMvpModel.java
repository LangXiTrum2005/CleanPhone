package com.basic.mvp;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4508rh;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wm0;

/* JADX INFO: loaded from: classes.dex */
public class BasicMvpModel implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Wm0 f213a = new Wm0(2);

    /* JADX WARN: Multi-variable type inference failed */
    public BasicMvpModel(Context context) {
        if (context == 0 || !(context instanceof LifecycleOwner)) {
            return;
        }
        ((LifecycleOwner) context).getLifecycle().addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C4508rh c4508rh = (C4508rh) this.f213a.b;
        if (c4508rh.f4940a) {
            return;
        }
        synchronized (c4508rh) {
            try {
                if (!c4508rh.f4940a) {
                    c4508rh.f4940a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

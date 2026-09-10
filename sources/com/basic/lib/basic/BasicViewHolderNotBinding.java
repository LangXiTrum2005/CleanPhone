package com.basic.lib.basic;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.mbridge.msdk.MBridgeConstans;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3265da;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasicViewHolderNotBinding<T> implements InterfaceC3265da, LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onActivityDestroy() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3265da
    public final void onClickView(View view) {
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }
}

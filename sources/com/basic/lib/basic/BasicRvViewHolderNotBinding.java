package com.basic.lib.basic;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3265da;

/* JADX INFO: loaded from: classes.dex */
public class BasicRvViewHolderNotBinding<T> extends RecyclerView.ViewHolder implements InterfaceC3265da, LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f208a;

    /* JADX WARN: Multi-variable type inference failed */
    public BasicRvViewHolderNotBinding(View view) {
        super(view);
        Context context = view.getContext();
        AbstractC2995aW.p(context, "getContext(...)");
        this.f208a = context;
        if (context instanceof LifecycleOwner) {
            ((LifecycleOwner) context).getLifecycle().addObserver(this);
        }
    }

    public void c(Object obj) {
    }

    public void d(boolean z) {
        this.itemView.setSelected(z);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onActivityDestroy() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3265da
    public final void onClickView(View view) {
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }
}

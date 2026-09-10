package com.basic.lib.withbinding;

import android.view.View;
import androidx.lifecycle.LifecycleObserver;
import androidx.viewbinding.ViewBinding;
import com.basic.lib.basic.BasicRvViewHolderNotBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public class BasicRvViewHolder<T, VB extends ViewBinding> extends BasicRvViewHolderNotBinding<T> implements LifecycleObserver {
    public final ViewBinding b;

    /* JADX WARN: Illegal instructions before constructor call */
    public BasicRvViewHolder(ViewBinding viewBinding) {
        View root = viewBinding.getRoot();
        AbstractC2995aW.p(root, "getRoot(...)");
        super(root);
        this.b = viewBinding;
    }
}

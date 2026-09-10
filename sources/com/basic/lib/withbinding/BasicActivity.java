package com.basic.lib.withbinding;

import androidx.viewbinding.ViewBinding;
import com.basic.lib.basic.BasicActivityNotBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasicActivity<VB extends ViewBinding> extends BasicActivityNotBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewBinding f211a;

    @Override // com.basic.lib.basic.BasicActivityNotBinding
    public final void h() {
        ViewBinding viewBindingI = i();
        AbstractC2995aW.q(viewBindingI, "<set-?>");
        this.f211a = viewBindingI;
        setContentView(viewBindingI.getRoot());
    }

    public abstract ViewBinding i();
}

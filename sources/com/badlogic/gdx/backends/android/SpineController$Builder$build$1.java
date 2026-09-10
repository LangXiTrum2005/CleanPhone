package com.badlogic.gdx.backends.android;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC2314Bl(c = "com.badlogic.gdx.backends.android.SpineController$Builder", f = "SpineController.kt", l = {136}, m = "build")
public final class SpineController$Builder$build$1 extends AbstractC2883Xj {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SpineController.Builder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpineController$Builder$build$1(SpineController.Builder builder, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.this$0 = builder;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.build(null, null, this);
    }
}

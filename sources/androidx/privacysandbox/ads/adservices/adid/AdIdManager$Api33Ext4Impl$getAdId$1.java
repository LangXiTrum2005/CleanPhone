package androidx.privacysandbox.ads.adservices.adid;

import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC2314Bl(c = "androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl", f = "AdIdManager.kt", l = {Input.Keys.SPACE}, m = "getAdId")
public final class AdIdManager$Api33Ext4Impl$getAdId$1 extends AbstractC2883Xj {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdIdManager.Api33Ext4Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdIdManager$Api33Ext4Impl$getAdId$1(AdIdManager.Api33Ext4Impl api33Ext4Impl, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.this$0 = api33Ext4Impl;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAdId(this);
    }
}

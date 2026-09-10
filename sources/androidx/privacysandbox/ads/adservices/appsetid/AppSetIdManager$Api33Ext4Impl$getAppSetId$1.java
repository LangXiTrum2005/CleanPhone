package androidx.privacysandbox.ads.adservices.appsetid;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC2314Bl(c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl", f = "AppSetIdManager.kt", l = {55}, m = "getAppSetId")
public final class AppSetIdManager$Api33Ext4Impl$getAppSetId$1 extends AbstractC2883Xj {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppSetIdManager.Api33Ext4Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSetIdManager$Api33Ext4Impl$getAppSetId$1(AppSetIdManager.Api33Ext4Impl api33Ext4Impl, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.this$0 = api33Ext4Impl;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAppSetId(this);
    }
}

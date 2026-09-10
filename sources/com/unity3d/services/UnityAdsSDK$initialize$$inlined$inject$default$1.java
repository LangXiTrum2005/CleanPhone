package com.unity3d.services;

import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.services.core.di.IServiceComponent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3263dY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes4.dex */
public final class UnityAdsSDK$initialize$$inlined$inject$default$1 extends WG implements InterfaceC2714Qw {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$initialize$$inlined$inject$default$1(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.ShouldAllowInitialization, java.lang.Object] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final ShouldAllowInitialization invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        return iServiceComponent.getServiceProvider().getRegistry().getService(this.$named, AbstractC3263dY.a(ShouldAllowInitialization.class));
    }
}

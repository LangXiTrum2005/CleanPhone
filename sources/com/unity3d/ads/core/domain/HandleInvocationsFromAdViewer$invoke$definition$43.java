package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3263dY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes4.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$43 extends WG implements InterfaceC2714Qw {
    final /* synthetic */ HandleInvocationsFromAdViewer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleInvocationsFromAdViewer$invoke$definition$43(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        super(0);
        this.this$0 = handleInvocationsFromAdViewer;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.hbTokenReset((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", AbstractC3263dY.a(SessionRepository.class)));
    }
}

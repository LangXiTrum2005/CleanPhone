package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes4.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$26 extends WG implements InterfaceC2714Qw {
    final /* synthetic */ AdObject $adObject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleInvocationsFromAdViewer$invoke$definition$26(AdObject adObject) {
        super(0);
        this.$adObject = adObject;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.updateTrackingToken(this.$adObject);
    }
}

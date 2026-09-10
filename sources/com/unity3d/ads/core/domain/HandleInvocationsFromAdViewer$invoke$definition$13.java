package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes4.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$13 extends WG implements InterfaceC2714Qw {
    public static final HandleInvocationsFromAdViewer$invoke$definition$13 INSTANCE = new HandleInvocationsFromAdViewer$invoke$definition$13();

    public HandleInvocationsFromAdViewer$invoke$definition$13() {
        super(0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.clearStorage();
    }
}

package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3263dY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes4.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$1 extends WG implements InterfaceC2714Qw {
    final /* synthetic */ String $adDataObject;
    final /* synthetic */ String $adDataRefreshTokenObject;
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ String $impressionConfigObject;
    final /* synthetic */ HandleInvocationsFromAdViewer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleInvocationsFromAdViewer$invoke$definition$1(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, String str, String str2, String str3, AdObject adObject) {
        super(0);
        this.this$0 = handleInvocationsFromAdViewer;
        this.$adDataObject = str;
        this.$impressionConfigObject = str2;
        this.$adDataRefreshTokenObject = str3;
        this.$adObject = adObject;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.m76getAdContextyLuu4LI((AndroidGetAdPlayerContext) this.this$0.getServiceProvider().getRegistry().getService("", AbstractC3263dY.a(AndroidGetAdPlayerContext.class)), this.$adDataObject, this.$impressionConfigObject, this.$adDataRefreshTokenObject, (IsOMActivated) this.this$0.getServiceProvider().getRegistry().getService("", AbstractC3263dY.a(IsOMActivated.class)), this.$adObject);
    }
}

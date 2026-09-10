package com.google.ads.mediation.vungle;

import android.content.Context;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3282di0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3856kD;

/* JADX INFO: loaded from: classes2.dex */
public final class VungleSdkWrapper$delegate$1 implements SdkWrapper {
    @Override // com.google.ads.mediation.vungle.SdkWrapper
    public String getBiddingToken(Context context) {
        AbstractC2995aW.q(context, f.X);
        return C3282di0.Companion.getBiddingToken(context);
    }

    @Override // com.google.ads.mediation.vungle.SdkWrapper
    public String getSdkVersion() {
        return C3282di0.Companion.getSdkVersion();
    }

    @Override // com.google.ads.mediation.vungle.SdkWrapper
    public void init(Context context, String str, InterfaceC3856kD interfaceC3856kD) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(str, "appId");
        AbstractC2995aW.q(interfaceC3856kD, "initializationListener");
        C3282di0.Companion.init(context, str, interfaceC3856kD);
    }

    @Override // com.google.ads.mediation.vungle.SdkWrapper
    public boolean isInitialized() {
        return C3282di0.Companion.isInitialized();
    }
}

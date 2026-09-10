package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Application;
import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.VungleAds$WrapperFramework;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ci0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3193ci0 {
    private C3193ci0() {
    }

    public /* synthetic */ C3193ci0(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    public final void deInit(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        C3282di0.initializer.deInit$vungle_ads_release();
        C5064y0.Companion.deInit(context);
    }

    public final String getBiddingToken(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        return C3282di0.vungleInternal.getAvailableBidTokens(context);
    }

    public final String getSdkVersion() {
        return C3282di0.vungleInternal.getSdkVersion();
    }

    public final void init(Context context, String str, InterfaceC3856kD interfaceC3856kD) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(str, "appId");
        AbstractC2995aW.q(interfaceC3856kD, "callback");
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        Si0 si0 = C3282di0.initializer;
        AbstractC2995aW.p(context, "appContext");
        si0.init(str, context, interfaceC3856kD);
    }

    public final boolean isInitialized() {
        return C3282di0.initializer.isInitialized();
    }

    public final boolean isInline(String str) {
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        C4664tU placement = C3457fi.INSTANCE.getPlacement(str);
        if (placement != null) {
            return placement.isInline();
        }
        return false;
    }

    public final void setIntegrationName(VungleAds$WrapperFramework vungleAds$WrapperFramework, String str) {
        AbstractC2995aW.q(vungleAds$WrapperFramework, "wrapperFramework");
        AbstractC2995aW.q(str, "wrapperFrameworkVersion");
        C3282di0.initializer.setIntegrationName(vungleAds$WrapperFramework, str);
    }

    public final void getBiddingToken(Context context, InterfaceC4055ma interfaceC4055ma) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(interfaceC4055ma, "callback");
        C3282di0.vungleInternal.getAvailableBidTokensAsync(context, interfaceC4055ma);
    }
}

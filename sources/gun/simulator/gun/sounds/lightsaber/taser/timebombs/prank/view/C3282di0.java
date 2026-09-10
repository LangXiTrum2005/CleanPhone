package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.vungle.ads.VungleAds$WrapperFramework;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.di0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3282di0 {
    public static final String TAG = "VungleAds";
    public static final C3193ci0 Companion = new C3193ci0(null);
    private static Yi0 vungleInternal = new Yi0();
    private static Si0 initializer = new Si0();
    public static final C2634Nu firstPartyData = new C2634Nu();

    public static final void deInit(Context context) {
        Companion.deInit(context);
    }

    public static final String getBiddingToken(Context context) {
        return Companion.getBiddingToken(context);
    }

    public static final String getSdkVersion() {
        return Companion.getSdkVersion();
    }

    public static final void init(Context context, String str, InterfaceC3856kD interfaceC3856kD) {
        Companion.init(context, str, interfaceC3856kD);
    }

    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    public static final boolean isInline(String str) {
        return Companion.isInline(str);
    }

    public static final void setIntegrationName(VungleAds$WrapperFramework vungleAds$WrapperFramework, String str) {
        Companion.setIntegrationName(vungleAds$WrapperFramework, str);
    }

    public static final void getBiddingToken(Context context, InterfaceC4055ma interfaceC4055ma) {
        Companion.getBiddingToken(context, interfaceC4055ma);
    }
}

package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4896w4 {
    private C4896w4() {
    }

    public /* synthetic */ C4896w4(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    public final String getCarrierName$vungle_ads_release(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        Object systemService = context.getSystemService("phone");
        AbstractC2995aW.o(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((TelephonyManager) systemService).getNetworkOperatorName();
    }
}

package com.facebook.ads.redexgen.core;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1566fg extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final C1570fk A00;

    public C1566fg(C1570fk c1570fk) {
        this.A00 = c1570fk;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        boolean is5gNsa = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        this.A00.A07(is5gNsa ? 10 : 5);
    }
}

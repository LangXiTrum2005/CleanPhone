package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class am0 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12463b;

    public /* synthetic */ am0(Object obj, int i10) {
        this.f12462a = i10;
        this.f12463b = obj;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        switch (this.f12462a) {
            case 0:
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                ((wo0) this.f12463b).d(true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
                break;
            default:
                int overrideNetworkType2 = telephonyDisplayInfo.getOverrideNetworkType();
                ((l1.p) this.f12463b).c(overrideNetworkType2 == 3 || overrideNetworkType2 == 4 || overrideNetworkType2 == 5 ? 10 : 5);
                break;
        }
    }
}

package com.mbridge.msdk.timer;

import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: com.mbridge.msdk.timer.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class C0191b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static b f36842a = new b();
    }

    public static b getInstance() {
        return C0191b.f36842a;
    }

    public void addInterstitialList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().a(str, str2);
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("addInterstitialList error:"), "TimerController");
        }
    }

    public void addRewardList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().b(str, str2);
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("addRewardList error:"), "TimerController");
        }
    }

    public void start() {
        g gVarI = f2.i(i.b());
        if (gVarI == null) {
            gVarI = i.b().a();
        }
        int iH = gVarI.h();
        if (iH > 0) {
            com.mbridge.msdk.timer.a.a().b(iH * 1000);
        }
    }

    private b() {
    }
}

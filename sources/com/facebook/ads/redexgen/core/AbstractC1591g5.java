package com.facebook.ads.redexgen.core;

import android.os.Trace;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1591g5 {
    public static void A00() {
        if (PS.A00 && AbstractC1600gE.A02 >= 18) {
            A01();
        }
    }

    public static void A01() {
        Trace.endSection();
    }

    public static void A02(String str) {
        if (PS.A00 && AbstractC1600gE.A02 >= 18) {
            A03(str);
        }
    }

    public static void A03(String str) {
        Trace.beginSection(str);
    }
}

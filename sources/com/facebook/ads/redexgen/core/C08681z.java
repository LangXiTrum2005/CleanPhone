package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C08681z {
    public final AudioAttributes A00;

    public C08681z(C2697qQ c2697qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c2697qQ.A02).setFlags(c2697qQ.A03).setUsage(c2697qQ.A05);
        if (C5C.A02 >= 29) {
            C08661x.A00(usage, c2697qQ.A01);
        }
        if (C5C.A02 >= 32) {
            C08671y.A00(usage, c2697qQ.A04);
        }
        this.A00 = usage.build();
    }
}

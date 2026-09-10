package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10371z {
    public final AudioAttributes A00;

    public C10371z(C2866qQ c2866qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c2866qQ.A02).setFlags(c2866qQ.A03).setUsage(c2866qQ.A05);
        if (C5C.A02 >= 29) {
            C10351x.A00(usage, c2866qQ.A01);
        }
        if (C5C.A02 >= 32) {
            C10361y.A00(usage, c2866qQ.A04);
        }
        this.A00 = usage.build();
    }
}

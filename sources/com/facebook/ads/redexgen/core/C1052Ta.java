package com.facebook.ads.redexgen.core;

import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1052Ta {
    public final EnumC1125Wd A00 = EnumC1125Wd.A03;

    private boolean A00() {
        return this.A00 == EnumC1125Wd.A04;
    }

    public final UK A01(int i) {
        if (A00()) {
            return new FragmentedMp4Extractor2(i);
        }
        return new C1056Te(i);
    }
}

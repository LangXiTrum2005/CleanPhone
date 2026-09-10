package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11365y {
    public final MediaCodec.CryptoInfo.Pattern A00;
    public final MediaCodec.CryptoInfo A01;

    public C11365y(MediaCodec.CryptoInfo cryptoInfo) {
        this.A01 = cryptoInfo;
        this.A00 = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i2, int i3) {
        this.A00.set(i2, i3);
        this.A01.setPattern(this.A00);
    }
}

package com.google.android.exoplayer2.decoder;

import android.media.MediaCodec;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class CryptoInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f17418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f17419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17420c;
    public int[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f17421e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f17423i;
    public final PatternHolderV24 j;

    public static final class PatternHolderV24 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f17424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f17425b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public PatternHolderV24(MediaCodec.CryptoInfo cryptoInfo) {
            this.f17424a = cryptoInfo;
        }
    }

    public CryptoInfo() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f17423i = cryptoInfo;
        this.j = Util.f18979a >= 24 ? new PatternHolderV24(cryptoInfo) : null;
    }

    public final void a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.f = i2;
        this.d = iArr;
        this.f17421e = iArr2;
        this.f17419b = bArr;
        this.f17418a = bArr2;
        this.f17420c = i3;
        this.g = i4;
        this.f17422h = i5;
        MediaCodec.CryptoInfo cryptoInfo = this.f17423i;
        cryptoInfo.numSubSamples = i2;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i3;
        if (Util.f18979a >= 24) {
            PatternHolderV24 patternHolderV24 = this.j;
            patternHolderV24.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = patternHolderV24.f17425b;
            pattern.set(i4, i5);
            patternHolderV24.f17424a.setPattern(pattern);
        }
    }
}

package androidx.media3.decoder;

import android.media.MediaCodec;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final class CryptoInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f5793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f5794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5795c;
    public int[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f5796e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f5798i;
    public final PatternHolderV24 j;

    public static final class PatternHolderV24 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f5799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f5800b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public PatternHolderV24(MediaCodec.CryptoInfo cryptoInfo) {
            this.f5799a = cryptoInfo;
        }
    }

    public CryptoInfo() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f5798i = cryptoInfo;
        this.j = Util.f5683a >= 24 ? new PatternHolderV24(cryptoInfo) : null;
    }

    public final void a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.f = i2;
        this.d = iArr;
        this.f5796e = iArr2;
        this.f5794b = bArr;
        this.f5793a = bArr2;
        this.f5795c = i3;
        this.g = i4;
        this.f5797h = i5;
        MediaCodec.CryptoInfo cryptoInfo = this.f5798i;
        cryptoInfo.numSubSamples = i2;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i3;
        if (Util.f5683a >= 24) {
            PatternHolderV24 patternHolderV24 = this.j;
            patternHolderV24.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = patternHolderV24.f5800b;
            pattern.set(i4, i5);
            patternHolderV24.f5799a.setPattern(pattern);
        }
    }
}

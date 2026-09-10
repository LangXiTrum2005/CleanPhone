package com.smartdigimkt.z3;

import android.media.MediaCodec;
import com.smartdigimkt.p4.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f40337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f40338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40339c;
    public int[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f40340e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f40342i;
    private final C0651b j;

    /* JADX INFO: renamed from: com.smartdigimkt.z3.b$b, reason: collision with other inner class name */
    public static final class C0651b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f40343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f40344b;

        private C0651b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f40343a = cryptoInfo;
            this.f40344b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i2, int i3) {
            this.f40344b.set(i2, i3);
            this.f40343a.setPattern(this.f40344b);
        }
    }

    public b() {
        int i2 = f0.f37540a;
        byte b2 = 0;
        MediaCodec.CryptoInfo cryptoInfoB = i2 >= 16 ? b() : null;
        this.f40342i = cryptoInfoB;
        this.j = i2 >= 24 ? new C0651b(cryptoInfoB) : null;
    }

    private MediaCodec.CryptoInfo b() {
        return new MediaCodec.CryptoInfo();
    }

    private void c() {
        MediaCodec.CryptoInfo cryptoInfo = this.f40342i;
        cryptoInfo.numSubSamples = this.f;
        cryptoInfo.numBytesOfClearData = this.d;
        cryptoInfo.numBytesOfEncryptedData = this.f40340e;
        cryptoInfo.key = this.f40338b;
        cryptoInfo.iv = this.f40337a;
        cryptoInfo.mode = this.f40339c;
        if (f0.f37540a >= 24) {
            this.j.a(this.g, this.f40341h);
        }
    }

    public void a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.f = i2;
        this.d = iArr;
        this.f40340e = iArr2;
        this.f40338b = bArr;
        this.f40337a = bArr2;
        this.f40339c = i3;
        this.g = i4;
        this.f40341h = i5;
        if (f0.f37540a >= 16) {
            c();
        }
    }

    public MediaCodec.CryptoInfo a() {
        return this.f40342i;
    }
}

package miliaria;

import android.media.MediaCodec;
import decarock.grimness;

/* JADX INFO: compiled from: CryptoInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public byte[] f33442attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f33443beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f33444competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final saneness f33445cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f33446dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f33447impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int[] f33448marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public byte[] f33449saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f33450taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int[] f33451wireman;

    /* JADX INFO: compiled from: CryptoInfo.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f33452attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f33453saneness;

        public final void saneness(int i, int i2) {
            this.f33453saneness.set(i, i2);
            this.f33452attabal.setPattern(this.f33453saneness);
        }

        public saneness(MediaCodec.CryptoInfo cryptoInfo) {
            this.f33452attabal = cryptoInfo;
            this.f33453saneness = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public dern() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f33450taiyuan = cryptoInfo;
        this.f33445cutely = grimness.f25080attabal >= 24 ? new saneness(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo attabal() {
        return this.f33450taiyuan;
    }

    public void dern(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f33443beachfront = i;
        this.f33451wireman = iArr;
        this.f33448marial = iArr2;
        this.f33449saneness = bArr;
        this.f33442attabal = bArr2;
        this.f33446dern = i2;
        this.f33444competently = i3;
        this.f33447impromptu = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f33450taiyuan;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (grimness.f25080attabal >= 24) {
            ((saneness) decarock.attabal.marial(this.f33445cutely)).saneness(i3, i4);
        }
    }

    public void saneness(int i) {
        if (i == 0) {
            return;
        }
        if (this.f33451wireman == null) {
            int[] iArr = new int[1];
            this.f33451wireman = iArr;
            this.f33450taiyuan.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f33451wireman;
        iArr2[0] = iArr2[0] + i;
    }
}

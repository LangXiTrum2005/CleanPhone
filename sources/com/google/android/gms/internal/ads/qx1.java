package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f19230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f19231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f19233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f19234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f19238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f19239j;

    public qx1(int i10) {
        switch (i10) {
            case 1:
                MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
                this.f19238i = cryptoInfo;
                this.f19239j = new m0.s1(cryptoInfo);
                break;
            default:
                MediaCodec.CryptoInfo cryptoInfo2 = new MediaCodec.CryptoInfo();
                this.f19238i = cryptoInfo2;
                this.f19239j = new f81(cryptoInfo2);
                break;
        }
    }

    public void a(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f19233d == null) {
            int[] iArr = new int[1];
            this.f19233d = iArr;
            this.f19238i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f19233d;
        iArr2[0] = iArr2[0] + i10;
    }
}

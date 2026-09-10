package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ci1 extends yg1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final we f13178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f13179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f13180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13183j;

    public ci1(byte[] bArr) {
        we weVar = new we(bArr, 1);
        super(false);
        this.f13178e = weVar;
        ps1.v(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final long l(po1 po1Var) throws xl1 {
        a(po1Var);
        this.f13179f = po1Var.f18750a;
        byte[] bArr = this.f13178e.f21496a;
        this.f13180g = bArr;
        long j10 = po1Var.f18752c;
        int length = bArr.length;
        if (j10 > length) {
            throw new xl1();
        }
        int i10 = (int) j10;
        this.f13181h = i10;
        int i11 = length - i10;
        this.f13182i = i11;
        long j11 = po1Var.f18753d;
        if (j11 != -1) {
            this.f13182i = (int) Math.min(i11, j11);
        }
        this.f13183j = true;
        c(po1Var);
        return j11 != -1 ? j11 : this.f13182i;
    }

    @Override // com.google.android.gms.internal.ads.vx1
    public final int t(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f13182i;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f13180g;
        bArr2.getClass();
        System.arraycopy(bArr2, this.f13181h, bArr, i10, iMin);
        this.f13181h += iMin;
        this.f13182i -= iMin;
        d(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final Uri zzc() {
        return this.f13179f;
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final void zzd() {
        if (this.f13183j) {
            this.f13183j = false;
            e();
        }
        this.f13179f = null;
        this.f13180g = null;
    }
}

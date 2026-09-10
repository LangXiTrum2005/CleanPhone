package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 implements m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18908f;

    public q3(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f18903a = i10;
        this.f18904b = i11;
        this.f18905c = i12;
        this.f18906d = i13;
        this.f18907e = i14;
        this.f18908f = i15;
    }

    public final int a() {
        int i10 = this.f18903a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        v71.y("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i10))));
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.m3
    public final int zza() {
        return 1752331379;
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f16317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f16318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f16322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f16323g;

    public k5(int i10) {
        switch (i10) {
            case 1:
                this.f16317a = new byte[8];
                this.f16318b = new ArrayDeque();
                this.f16322f = new f3.f();
                break;
            default:
                this.f16317a = new byte[8];
                this.f16318b = new ArrayDeque();
                this.f16322f = new q5(0);
                break;
        }
    }

    public long a(n2.l lVar, int i10) {
        byte[] bArr = this.f16317a;
        lVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (bArr[i11] & 255));
        }
        return j10;
    }

    public long b(n2 n2Var, int i10) {
        byte[] bArr = this.f16317a;
        n2Var.p(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (bArr[i11] & 255));
        }
        return j10;
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ni f18842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f18844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g22[] f18845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18846e;

    public q(ni niVar, int[] iArr) {
        int length = iArr.length;
        ps1.c0(length > 0);
        niVar.getClass();
        g22[] g22VarArr = niVar.f17832d;
        this.f18842a = niVar;
        this.f18843b = length;
        this.f18845d = new g22[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f18845d[i10] = g22VarArr[iArr[i10]];
        }
        Arrays.sort(this.f18845d, b.f12571q);
        this.f18844c = new int[this.f18843b];
        for (int i11 = 0; i11 < this.f18843b; i11++) {
            int[] iArr2 = this.f18844c;
            g22 g22Var = this.f18845d[i11];
            int i12 = 0;
            while (true) {
                if (i12 >= g22VarArr.length) {
                    i12 = -1;
                    break;
                } else if (g22Var == g22VarArr[i12]) {
                    break;
                } else {
                    i12++;
                }
            }
            iArr2[i11] = i12;
        }
    }

    public static void a(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            z91 z91Var = (z91) arrayList.get(i11);
            if (z91Var != null) {
                z91Var.a(new x42(j10, jArr[i11]));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f18842a.equals(qVar.f18842a) && Arrays.equals(this.f18844c, qVar.f18844c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.p
    public final int g(int i10) {
        for (int i11 = 0; i11 < this.f18843b; i11++) {
            if (this.f18844c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final int hashCode() {
        int i10 = this.f18846e;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f18844c) + (System.identityHashCode(this.f18842a) * 31);
        this.f18846e = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.p
    public final ni zza() {
        return this.f18842a;
    }

    @Override // com.google.android.gms.internal.ads.p
    public final g22 zzb(int i10) {
        return this.f18845d[i10];
    }

    @Override // com.google.android.gms.internal.ads.p
    public final g22 zzc() {
        return this.f18845d[0];
    }

    @Override // com.google.android.gms.internal.ads.p
    public final int zze() {
        return this.f18844c.length;
    }

    @Override // com.google.android.gms.internal.ads.p
    public final int zzf(int i10) {
        return this.f18844c[i10];
    }

    @Override // com.google.android.gms.internal.ads.p
    public final int zzh() {
        return this.f18844c[0];
    }
}

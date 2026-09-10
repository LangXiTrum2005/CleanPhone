package com.google.android.gms.internal.measurement;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gi extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f23518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f23519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f23520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23521e;

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public gi(h hVar, h hVar2) {
        this.f23518b = hVar;
        this.f23519c = hVar2;
        int iA = hVar2.a();
        if (!(iA <= 28)) {
            throw new IllegalArgumentException("metadata size too large");
        }
        int[] iArr = new int[iA];
        this.f23520d = iArr;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < iA) {
            mh mhVarD = d(i10);
            long j11 = mhVarD.f23757e | j10;
            if (j11 == j10) {
                int i12 = 0;
                while (true) {
                    if (i12 >= i11) {
                        i12 = -1;
                        break;
                    } else if (mhVarD.equals(d(iArr[i12] & 31))) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 != -1) {
                    iArr[i12] = mhVarD.f23755c ? iArr[i12] | (1 << (i10 + 4)) : i10;
                } else {
                    iArr[i11] = i10;
                    i11++;
                }
            } else {
                iArr[i11] = i10;
                i11++;
            }
            i10++;
            j10 = j11;
        }
        this.f23521e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final void a(di diVar, yh yhVar) {
        for (int i10 = 0; i10 < this.f23521e; i10++) {
            int i11 = this.f23520d[i10];
            mh mhVarD = d(i11 & 31);
            if (mhVarD.f23755c) {
                diVar.b(mhVarD, new fi(this, mhVarD, i11), yhVar);
            } else {
                h hVar = this.f23518b;
                int iA = hVar.a();
                if (i11 >= iA) {
                    hVar = this.f23519c;
                    i11 -= iA;
                }
                diVar.a(mhVarD, mhVarD.f23754b.cast(hVar.i(i11)), yhVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final int b() {
        return this.f23521e;
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final Set c() {
        return new androidx.datastore.preferences.protobuf.i1(this, 4);
    }

    public final mh d(int i10) {
        h hVar = this.f23518b;
        int iA = hVar.a();
        return i10 >= iA ? this.f23519c.h(i10 - iA) : hVar.h(i10);
    }
}

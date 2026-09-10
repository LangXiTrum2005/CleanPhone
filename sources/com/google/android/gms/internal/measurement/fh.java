package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fh extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f23470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23471f;

    @Override // com.google.android.gms.internal.measurement.h
    public final int a() {
        return this.f23471f;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final mh h(int i10) {
        if (i10 < this.f23471f) {
            return (mh) this.f23470e[i10 + i10];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final Object i(int i10) {
        if (i10 < this.f23471f) {
            return this.f23470e[i10 + i10 + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final Object j(mh mhVar) {
        int iL = l(mhVar);
        if (iL == -1) {
            return null;
        }
        return mhVar.f23754b.cast(this.f23470e[iL + iL + 1]);
    }

    public final void k(mh mhVar, Object obj) {
        int iL;
        if (!mhVar.f23755c && (iL = l(mhVar)) != -1) {
            gb.b(obj, "metadata value");
            this.f23470e[iL + iL + 1] = obj;
            return;
        }
        int i10 = this.f23471f + 1;
        Object[] objArr = this.f23470e;
        int length = objArr.length;
        if (i10 + i10 > length) {
            this.f23470e = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.f23470e;
        int i11 = this.f23471f;
        int i12 = i11 + i11;
        objArr2[i12] = mhVar;
        gb.b(obj, "metadata value");
        objArr2[i12 + 1] = obj;
        this.f23471f++;
    }

    public final int l(mh mhVar) {
        for (int i10 = 0; i10 < this.f23471f; i10++) {
            if (this.f23470e[i10 + i10].equals(mhVar)) {
                return i10;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata{");
        for (int i10 = 0; i10 < this.f23471f; i10++) {
            sb2.append(" '");
            sb2.append(h(i10));
            sb2.append("': ");
            sb2.append(i(i10));
        }
        sb2.append(" }");
        return sb2.toString();
    }
}

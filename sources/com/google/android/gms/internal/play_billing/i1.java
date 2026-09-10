package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class i1 implements Iterable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i1 f24285c = new i1(z1.f24508b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24286a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f24287b;

    static {
        int i10 = e1.f24262a;
    }

    public i1(byte[] bArr) {
        bArr.getClass();
        this.f24287b = bArr;
    }

    public static int n(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(defpackage.e.h(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(defpackage.e.g(i11, i12, "End index: ", " >= "));
    }

    public static i1 p(byte[] bArr, int i10, int i11) {
        n(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new i1(bArr2);
    }

    public byte b(int i10) {
        return this.f24287b[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof i1) && m() == ((i1) obj).m()) {
            if (m() == 0) {
                return true;
            }
            if (!(obj instanceof i1)) {
                return obj.equals(this);
            }
            i1 i1Var = (i1) obj;
            int i10 = this.f24286a;
            int i11 = i1Var.f24286a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                int iM = m();
                if (iM > i1Var.m()) {
                    throw new IllegalArgumentException("Length too large: " + iM + m());
                }
                if (iM > i1Var.m()) {
                    throw new IllegalArgumentException(defpackage.e.g(iM, i1Var.m(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = i1Var.f24287b;
                int i12 = 0;
                int i13 = 0;
                while (i12 < iM) {
                    if (this.f24287b[i12] == bArr[i13]) {
                        i12++;
                        i13++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public byte h(int i10) {
        return this.f24287b[i10];
    }

    public final int hashCode() {
        int i10 = this.f24286a;
        if (i10 != 0) {
            return i10;
        }
        int iM = m();
        int i11 = iM;
        for (int i12 = 0; i12 < iM; i12++) {
            i11 = (i11 * 31) + this.f24287b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f24286a = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public int m() {
        return this.f24287b.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iM = m();
        if (m() <= 50) {
            strConcat = com.google.android.gms.internal.auth.i.I(this);
        } else {
            int iN = n(0, 47, m());
            strConcat = com.google.android.gms.internal.auth.i.I(iN == 0 ? f24285c : new h1(this.f24287b, iN)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iM);
        sb2.append(" contents=\"");
        return defpackage.e.q(strConcat, "\">", sb2);
    }
}

package com.google.android.gms.internal.consent_sdk;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class n5 implements Iterable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n5 f23112c = new n5(a6.f22938b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23113a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f23114b;

    static {
        int i10 = k5.f23071a;
    }

    public n5(byte[] bArr) {
        bArr.getClass();
        this.f23114b = bArr;
    }

    public static void p(int i10) {
        if (((i10 - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(l1.d.e(i10, "End index: 47 >= "));
        }
    }

    public byte b(int i10) {
        return this.f23114b[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        int iM = m();
        if (iM != n5Var.m()) {
            return false;
        }
        if (iM == 0) {
            return true;
        }
        int i10 = this.f23113a;
        int i11 = n5Var.f23113a;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return n(n5Var);
        }
        return false;
    }

    public byte h(int i10) {
        return this.f23114b[i10];
    }

    public final int hashCode() {
        int i10 = this.f23113a;
        if (i10 != 0) {
            return i10;
        }
        int iM = m();
        int i11 = iM;
        for (int i12 = 0; i12 < iM; i12++) {
            i11 = (i11 * 31) + this.f23114b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f23113a = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public int m() {
        return this.f23114b.length;
    }

    public final boolean n(n5 n5Var) {
        if (!(n5Var instanceof n5)) {
            return n5Var.n(this);
        }
        int iM = m();
        if (iM > n5Var.m()) {
            throw new IllegalArgumentException("Length too large: " + iM + m());
        }
        if (iM > n5Var.m()) {
            throw new IllegalArgumentException(defpackage.e.g(iM, n5Var.m(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = n5Var.f23114b;
        int i10 = 0;
        int i11 = 0;
        while (i10 < iM) {
            if (this.f23114b[i10] != bArr[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iM = m();
        if (m() <= 50) {
            strConcat = d0.b(this);
        } else {
            p(m());
            byte[] bArr = this.f23114b;
            m5 m5Var = new m5(bArr);
            p(bArr.length);
            strConcat = d0.b(m5Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iM);
        sb2.append(" contents=\"");
        return defpackage.e.q(strConcat, "\">", sb2);
    }
}

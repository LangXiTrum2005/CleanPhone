package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f23949b = new r0(q1.f23877a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23950a;

    static {
        int i10 = n0.f23760a;
    }

    public static r0 s(byte[] bArr, int i10, int i11) {
        try {
            return t(bArr, i10, i11);
        } catch (u1 e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    public static r0 t(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return f23949b;
        }
        v(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new r0(bArr2);
    }

    public static int v(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(com.applovin.impl.ca.m(new StringBuilder(String.valueOf(i10).length() + 21), "Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(l1.d.j(new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length()), i10, "Beginning index larger than ending index: ", i11, ", "));
        }
        throw new IndexOutOfBoundsException(l1.d.j(new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length()), i11, "End index: ", i12, " >= "));
    }

    public static /* synthetic */ boolean w(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = i10 + i12;
        v(i10, i13, bArr.length);
        v(i11, i12 + i11, bArr2.length);
        while (i10 < i13) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public abstract byte b(int i10);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        int iH = h();
        if (iH != s0Var.h()) {
            return false;
        }
        if (iH == 0) {
            return true;
        }
        int i10 = this.f23950a;
        int i11 = s0Var.f23950a;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return q(s0Var);
        }
        return false;
    }

    public abstract int h();

    public final int hashCode() {
        int iR = this.f23950a;
        if (iR == 0) {
            int iH = h();
            iR = r(iH, iH);
            if (iR == 0) {
                iR = 1;
            }
            this.f23950a = iR;
        }
        return iR;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public abstract q0 m(int i10, int i11);

    public abstract void n(int i10, byte[] bArr);

    public abstract void p(x0 x0Var);

    public abstract boolean q(s0 s0Var);

    public abstract int r(int i10, int i11);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iH = h();
        String strD = h() <= 50 ? h.d(u()) : h.d(m(0, 47).u()).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iH);
        sb2.append(" contents=\"");
        return defpackage.e.q(strD, "\">", sb2);
    }

    public final byte[] u() {
        int iH = h();
        if (iH == 0) {
            return q1.f23877a;
        }
        byte[] bArr = new byte[iH];
        n(iH, bArr);
        return bArr;
    }
}

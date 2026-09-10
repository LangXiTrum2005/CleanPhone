package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f24569b = new h(b0.f24540b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f24570c;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24571a;

    static {
        f24570c = c.a() ? new e(1) : new e(0);
    }

    public static int h(int i10, int i11, int i12) {
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

    public static h m(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange;
        h(i10, i10 + i11, bArr.length);
        switch (f24570c.f24550a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new h(bArrCopyOfRange);
    }

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f24571a;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        h hVar = (h) this;
        int iR = hVar.r();
        int i11 = size;
        for (int i12 = iR; i12 < iR + size; i12++) {
            i11 = (i11 * 31) + hVar.f24565d[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f24571a = i11;
        return i11;
    }

    public abstract void n(int i10, byte[] bArr);

    public abstract byte p(int i10);

    public final byte[] q() {
        int size = size();
        if (size == 0) {
            return b0.f24540b;
        }
        byte[] bArr = new byte[size];
        n(size, bArr);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = j1.f.s(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            h hVar = (h) this;
            int iH = h(0, 47, hVar.size());
            sb2.append(j1.f.s(iH == 0 ? f24569b : new f(hVar.f24565d, hVar.r(), iH)));
            sb2.append("...");
            string = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return defpackage.e.q(string, "\">", sb3);
    }
}

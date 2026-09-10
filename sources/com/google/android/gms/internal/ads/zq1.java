package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f22697a;

    public zq1(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        this.f22697a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static zq1 a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        int length2 = bArr.length;
        if (length > length2) {
            length = length2;
        }
        return new zq1(bArr, length);
    }

    public final byte[] b() {
        byte[] bArr = this.f22697a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zq1) {
            return Arrays.equals(((zq1) obj).f22697a, this.f22697a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22697a);
    }

    public final String toString() {
        byte[] bArr = this.f22697a;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            sb2.append("0123456789abcdef".charAt((b10 & 255) >> 4));
            sb2.append("0123456789abcdef".charAt(b10 & 15));
        }
        String string = sb2.toString();
        return q4.a.j(new StringBuilder(string.length() + 7), "Bytes(", string, ")");
    }
}

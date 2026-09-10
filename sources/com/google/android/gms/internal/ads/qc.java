package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qc f19022b = new qc(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f19023a;

    public qc(byte[] bArr) {
        this.f19023a = bArr;
    }

    public static qc e(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        if (length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            bArr2 = bArr3;
        }
        return new qc(bArr2);
    }

    public static int f(byte b10) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        return b10 & ((iArr[7] % 837626799) ^ com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16));
    }

    public final byte[] a() {
        byte[] bArr = this.f19023a;
        int length = bArr.length;
        if (length == 0) {
            return new byte[0];
        }
        if (length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final byte b(int i10) {
        int i11 = ((((~2106914653) & 587408197) | 1537377410) + ((2106914653 & 536945509) | 443419704)) - 2137956065;
        int i12 = 2013725218 % 1633938701;
        int i13 = ((((~1287859999) & 62941354) | 437464817) + ((1287859999 & 1639989262) | 1644309956)) - 2060977796;
        int i14 = 1442767057 % 63299708;
        byte[] bArr = this.f19023a;
        int length = bArr.length;
        if (((length - (i10 + 1)) | i10) >= 0) {
            return bArr[i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.e(i10, i11 ^ i12));
            sb2.append(pc.a("Akelqh1fajntGgo="));
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(com.applovin.impl.ca.e(length, com.applovin.impl.ca.e(i10, i13 ^ i14)));
        sb3.append(pc.a("Akelqh1faDmxRUSK1T9GeQ=="));
        sb3.append(i10);
        sb3.append(pc.a("Zwk="));
        sb3.append(length);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    public final String c() {
        Charset charsetForName = Charset.forName(pc.a("Hn2H4l0="));
        byte[] bArr = this.f19023a;
        return new String(bArr, 0, bArr.length, charsetForName);
    }

    public final qc d(qc qcVar) {
        byte[] bArr = qcVar.f19023a;
        int length = bArr.length;
        byte[] bArr2 = this.f19023a;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return e(bArr3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qc) {
            return Arrays.equals(this.f19023a, ((qc) obj).f19023a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(Arrays.hashCode(this.f19023a));
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iG = com.applovin.impl.ca.g((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        String string = Arrays.toString(this.f19023a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + ((i17 % 981766422) ^ iG));
        sb2.append(pc.a("CVC1qiQNJHikW0iU1TIPZA=="));
        sb2.append(string);
        sb2.append(pc.a("Ng=="));
        return sb2.toString();
    }
}

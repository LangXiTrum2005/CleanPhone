package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzatw {
    public static final zzatw zzb = new zzatw(new byte[0]);
    public static final Comparator zzc = new zzatv();
    public final byte[] zza;

    public zzatw(byte[] bArr) {
        this.zza = bArr;
    }

    public static zzatw zze(byte[] bArr) {
        return new zzatw(zzh(bArr, 0, bArr.length));
    }

    public static zzatw zzf(String str) {
        return zze(str.getBytes(Charset.forName(zzatu.zza("Hn2H4l0="))));
    }

    public static int zzg(byte b2) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        return b2 & (Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, iArr[5], iArr[6]) ^ (iArr[7] % 837626799));
    }

    public static byte[] zzh(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzatw) {
            return Arrays.equals(this.zza, ((zzatw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(Arrays.hashCode(this.zza));
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iC = Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        String string = Arrays.toString(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + ((i9 % 981766422) ^ iC));
        sb.append(zzatu.zza("CVC1qiQNJHikW0iU1TIPZA=="));
        sb.append(string);
        sb.append(zzatu.zza("Ng=="));
        return sb.toString();
    }

    public final byte[] zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        return length == 0 ? new byte[0] : zzh(bArr, 0, length);
    }

    public final byte zzb(int i2) {
        int i3 = ((((~2106914653) & 587408197) | 1537377410) + ((2106914653 & 536945509) | 443419704)) - 2137956065;
        int i4 = 2013725218 % 1633938701;
        int i5 = ((((~1287859999) & 62941354) | 437464817) + ((1287859999 & 1639989262) | 1644309956)) - 2060977796;
        int i6 = 1442767057 % 63299708;
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (((length - (i2 + 1)) | i2) >= 0) {
            return bArr[i2];
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(Z.a(i2, i3 ^ i4));
            sb.append(zzatu.zza("Akelqh1fajntGgo="));
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(Z.a(length, Z.a(i2, i5 ^ i6)));
        sb2.append(zzatu.zza("Akelqh1faDmxRUSK1T9GeQ=="));
        sb2.append(i2);
        sb2.append(zzatu.zza("Zwk="));
        sb2.append(length);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final String zzc() {
        Charset charsetForName = Charset.forName(zzatu.zza("Hn2H4l0="));
        byte[] bArr = this.zza;
        return new String(bArr, 0, bArr.length, charsetForName);
    }

    public final zzatw zzd(zzatw zzatwVar) {
        byte[] bArr = zzatwVar.zza;
        int length = bArr.length;
        byte[] bArr2 = this.zza;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return zze(bArr3);
    }
}

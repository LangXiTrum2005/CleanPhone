package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhsw extends zzhts {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhsv zzd;
    private final zzhsu zze;

    public /* synthetic */ zzhsw(int i2, BigInteger bigInteger, zzhsv zzhsvVar, zzhsu zzhsuVar, byte[] bArr) {
        this.zzb = i2;
        this.zzc = bigInteger;
        this.zzd = zzhsvVar;
        this.zze = zzhsuVar;
    }

    public static zzhst zzb() {
        return new zzhst(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhsw)) {
            return false;
        }
        zzhsw zzhswVar = (zzhsw) obj;
        return zzhswVar.zzb == this.zzb && Objects.equals(zzhswVar.zzc, this.zzc) && zzhswVar.zzd == this.zzd && zzhswVar.zze == this.zze;
    }

    public final int hashCode() {
        return Objects.hash(zzhsw.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhsu zzhsuVar = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzhsuVar);
        String strValueOf3 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i2).length() + 13);
        androidx.media3.extractor.text.ttml.a.C(sb, "RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        sb.append(", publicExponent: ");
        sb.append(strValueOf3);
        sb.append(", and ");
        sb.append(i2);
        sb.append("-bit modulus)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zzd != zzhsv.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhsv zze() {
        return this.zzd;
    }

    public final zzhsu zzf() {
        return this.zze;
    }
}

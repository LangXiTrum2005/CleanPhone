package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhti extends zzhts {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhth zzd;
    private final zzhtg zze;
    private final zzhtg zzf;
    private final int zzg;

    public /* synthetic */ zzhti(int i2, BigInteger bigInteger, zzhth zzhthVar, zzhtg zzhtgVar, zzhtg zzhtgVar2, int i3, byte[] bArr) {
        this.zzb = i2;
        this.zzc = bigInteger;
        this.zzd = zzhthVar;
        this.zze = zzhtgVar;
        this.zzf = zzhtgVar2;
        this.zzg = i3;
    }

    public static zzhtf zzb() {
        return new zzhtf(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhti)) {
            return false;
        }
        zzhti zzhtiVar = (zzhti) obj;
        return zzhtiVar.zzb == this.zzb && Objects.equals(zzhtiVar.zzc, this.zzc) && Objects.equals(zzhtiVar.zzd, this.zzd) && Objects.equals(zzhtiVar.zze, this.zze) && Objects.equals(zzhtiVar.zzf, this.zzf) && zzhtiVar.zzg == this.zzg;
    }

    public final int hashCode() {
        return Objects.hash(zzhti.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf, Integer.valueOf(this.zzg));
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhtg zzhtgVar = this.zzf;
        zzhtg zzhtgVar2 = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzhtgVar2);
        String strValueOf3 = String.valueOf(zzhtgVar);
        String strValueOf4 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i2 = this.zzg;
        int length4 = String.valueOf(i2).length();
        int length5 = strValueOf4.length();
        int i3 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i3).length() + 13);
        androidx.media3.extractor.text.ttml.a.C(sb, "RSA SSA PSS Parameters (variant: ", strValueOf, ", signature hashType: ", strValueOf2);
        sb.append(", mgf1 hashType: ");
        sb.append(strValueOf3);
        sb.append(", saltLengthBytes: ");
        sb.append(i2);
        sb.append(", publicExponent: ");
        sb.append(strValueOf4);
        sb.append(", and ");
        sb.append(i3);
        sb.append("-bit modulus)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zzd != zzhth.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhth zze() {
        return this.zzd;
    }

    public final zzhtg zzf() {
        return this.zze;
    }

    public final zzhtg zzg() {
        return this.zzf;
    }

    public final int zzh() {
        return this.zzg;
    }
}

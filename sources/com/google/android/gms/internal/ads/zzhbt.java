package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhbt extends zzhbf {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzhbs zze;
    private final zzhbr zzf;

    public /* synthetic */ zzhbt(int i2, int i3, int i4, int i5, zzhbs zzhbsVar, zzhbr zzhbrVar, byte[] bArr) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = zzhbsVar;
        this.zzf = zzhbrVar;
    }

    public static zzhbq zzb() {
        return new zzhbq(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhbt)) {
            return false;
        }
        zzhbt zzhbtVar = (zzhbt) obj;
        return zzhbtVar.zza == this.zza && zzhbtVar.zzb == this.zzb && zzhbtVar.zzc == this.zzc && zzhbtVar.zzd == this.zzd && zzhbtVar.zze == this.zze && zzhbtVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzhbt.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        zzhbr zzhbrVar = this.zzf;
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(zzhbrVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i2 = this.zzc;
        int length3 = String.valueOf(i2).length();
        int i3 = this.zzd;
        int length4 = String.valueOf(i3).length();
        int i4 = this.zza;
        int length5 = String.valueOf(i4).length();
        int i5 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i5).length() + 15);
        androidx.media3.extractor.text.ttml.a.C(sb, "AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        androidx.datastore.preferences.protobuf.a.z(sb, ", ", i2, "-byte IV, and ", i3);
        androidx.datastore.preferences.protobuf.a.z(sb, "-byte tags, and ", i4, "-byte AES key, and ", i5);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zze != zzhbs.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzc;
    }

    public final zzhbs zzg() {
        return this.zze;
    }

    public final zzhbr zzh() {
        return this.zzf;
    }
}

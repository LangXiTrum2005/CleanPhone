package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhre extends zzhts {
    private final zzhrc zza;
    private final zzhra zzb;
    private final zzhrb zzc;
    private final zzhrd zzd;

    public /* synthetic */ zzhre(zzhrc zzhrcVar, zzhra zzhraVar, zzhrb zzhrbVar, zzhrd zzhrdVar, byte[] bArr) {
        this.zza = zzhrcVar;
        this.zzb = zzhraVar;
        this.zzc = zzhrbVar;
        this.zzd = zzhrdVar;
    }

    public static zzhqz zzb() {
        return new zzhqz(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhre)) {
            return false;
        }
        zzhre zzhreVar = (zzhre) obj;
        return zzhreVar.zza == this.zza && zzhreVar.zzb == this.zzb && zzhreVar.zzc == this.zzc && zzhreVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhre.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        String string = this.zzd.toString();
        int length = string.length();
        String string2 = this.zzc.toString();
        int length2 = string2.length();
        String string3 = this.zza.toString();
        int length3 = string3.length();
        String string4 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + string4.length() + 1);
        androidx.media3.extractor.text.ttml.a.C(sb, "ECDSA Parameters (variant: ", string, ", hashType: ", string2);
        androidx.media3.extractor.text.ttml.a.C(sb, ", encoding: ", string3, ", curve: ", string4);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zzd != zzhrd.zzd;
    }

    public final zzhrc zzc() {
        return this.zza;
    }

    public final zzhra zzd() {
        return this.zzb;
    }

    public final zzhrb zze() {
        return this.zzc;
    }

    public final zzhrd zzf() {
        return this.zzd;
    }
}

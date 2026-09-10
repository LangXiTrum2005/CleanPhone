package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhct extends zzhbf {
    private final int zza;
    private final zzhcs zzb;

    public /* synthetic */ zzhct(int i2, zzhcs zzhcsVar, byte[] bArr) {
        this.zza = i2;
        this.zzb = zzhcsVar;
    }

    public static zzhcr zzb() {
        return new zzhcr(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhct)) {
            return false;
        }
        zzhct zzhctVar = (zzhct) obj;
        return zzhctVar.zza == this.zza && zzhctVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhct.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        int length = strValueOf.length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i2).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zzb != zzhcs.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhcs zzd() {
        return this.zzb;
    }
}

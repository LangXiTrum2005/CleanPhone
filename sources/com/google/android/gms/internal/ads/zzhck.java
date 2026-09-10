package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhck extends zzhbf {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzhcj zzd;

    public /* synthetic */ zzhck(int i2, int i3, int i4, zzhcj zzhcjVar, byte[] bArr) {
        this.zza = i2;
        this.zzd = zzhcjVar;
    }

    public static zzhci zzb() {
        return new zzhci(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhck)) {
            return false;
        }
        zzhck zzhckVar = (zzhck) obj;
        return zzhckVar.zza == this.zza && zzhckVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhck.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(android.support.v4.media.a.b(length + 30 + length2 + 10 + length3, 15, String.valueOf(i2).length(), 10));
        sb.append("AesGcm Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zzd != zzhcj.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhcj zzd() {
        return this.zzd;
    }
}

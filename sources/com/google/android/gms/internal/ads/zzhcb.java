package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhcb extends zzhbf {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzhca zzd;

    public /* synthetic */ zzhcb(int i2, int i3, int i4, zzhca zzhcaVar, byte[] bArr) {
        this.zza = i2;
        this.zzb = i3;
        this.zzd = zzhcaVar;
    }

    public static zzhbz zzb() {
        return new zzhbz(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhcb)) {
            return false;
        }
        zzhcb zzhcbVar = (zzhcb) obj;
        return zzhcbVar.zza == this.zza && zzhcbVar.zzb == this.zzb && zzhcbVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhcb.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int i2 = this.zzb;
        int length2 = String.valueOf(i2).length();
        int length3 = String.valueOf(16).length();
        int i3 = this.zza;
        StringBuilder sb = new StringBuilder(android.support.v4.media.a.b(length + 30 + length2 + 10 + length3, 15, String.valueOf(i3).length(), 10));
        sb.append("AesEax Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i2);
        return Z.n(sb, "-byte IV, 16-byte tag, and ", i3, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zzd != zzhca.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final zzhca zze() {
        return this.zzd;
    }
}

package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhku extends zzhll {
    private final int zza;
    private final int zzb;
    private final zzhkt zzc;

    public /* synthetic */ zzhku(int i2, int i3, zzhkt zzhktVar, byte[] bArr) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = zzhktVar;
    }

    public static zzhks zzb() {
        return new zzhks(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhku)) {
            return false;
        }
        zzhku zzhkuVar = (zzhku) obj;
        return zzhkuVar.zza == this.zza && zzhkuVar.zze() == zze() && zzhkuVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhku.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        int length = strValueOf.length();
        int i2 = this.zzb;
        int length2 = String.valueOf(i2).length();
        int i3 = this.zza;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i3).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i2);
        return Z.n(sb, "-byte tags, and ", i3, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zzc != zzhkt.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhkt zzhktVar = this.zzc;
        if (zzhktVar == zzhkt.zzd) {
            return this.zzb;
        }
        if (zzhktVar == zzhkt.zza || zzhktVar == zzhkt.zzb || zzhktVar == zzhkt.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhkt zzf() {
        return this.zzc;
    }
}

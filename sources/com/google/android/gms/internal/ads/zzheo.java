package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzheo extends zzhbf {
    private final zzhen zza;
    private final int zzb;

    private zzheo(zzhen zzhenVar, int i2) {
        this.zza = zzhenVar;
        this.zzb = i2;
    }

    public static zzheo zzb(zzhen zzhenVar, int i2) throws GeneralSecurityException {
        if (i2 < 8 || i2 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzheo(zzhenVar, i2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzheo)) {
            return false;
        }
        zzheo zzheoVar = (zzheo) obj;
        return zzheoVar.zza == this.zza && zzheoVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzheo.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i2).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(string);
        sb.append("salt_size_bytes: ");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zza != zzhen.zzb;
    }

    public final zzhen zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }
}

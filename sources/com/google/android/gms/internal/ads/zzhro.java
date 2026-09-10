package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhro extends zzhts {
    private final zzhrn zza;

    private zzhro(zzhrn zzhrnVar) {
        this.zza = zzhrnVar;
    }

    public static zzhro zzb(zzhrn zzhrnVar) {
        return new zzhro(zzhrnVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhro) && ((zzhro) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhro.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        return android.support.v4.media.a.s(new StringBuilder(string.length() + 30), "Ed25519 Parameters (variant: ", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zza != zzhrn.zzd;
    }

    public final zzhrn zzc() {
        return this.zza;
    }
}

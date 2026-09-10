package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhev extends zzhbf {
    private final zzheu zza;

    private zzhev(zzheu zzheuVar) {
        this.zza = zzheuVar;
    }

    public static zzhev zzb(zzheu zzheuVar) {
        return new zzhev(zzheuVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhev) && ((zzhev) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhev.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        return android.support.v4.media.a.s(new StringBuilder(string.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zza != zzheu.zzc;
    }

    public final zzheu zzc() {
        return this.zza;
    }
}

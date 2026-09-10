package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhcz extends zzhbf {
    private final zzhcy zza;

    private zzhcz(zzhcy zzhcyVar) {
        this.zza = zzhcyVar;
    }

    public static zzhcz zzb(zzhcy zzhcyVar) {
        return new zzhcz(zzhcyVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhcz) && ((zzhcz) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhcz.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        return android.support.v4.media.a.s(new StringBuilder(string.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zza != zzhcy.zzc;
    }

    public final zzhcy zzc() {
        return this.zza;
    }
}

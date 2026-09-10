package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwo {
    public final long zza;
    public final long zzb;

    public zzwo(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwo)) {
            return false;
        }
        zzwo zzwoVar = (zzwo) obj;
        return this.zza == zzwoVar.zza && this.zzb == zzwoVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}

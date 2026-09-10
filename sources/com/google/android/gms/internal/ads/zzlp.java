package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlp {
    public static final zzlp zza;
    public static final zzlp zzb;
    public final long zzc;
    public final long zzd;

    static {
        zzlp zzlpVar = new zzlp(0L, 0L);
        zza = zzlpVar;
        new zzlp(Long.MAX_VALUE, Long.MAX_VALUE);
        new zzlp(Long.MAX_VALUE, 0L);
        new zzlp(0L, Long.MAX_VALUE);
        zzb = zzlpVar;
    }

    public zzlp(long j, long j2) {
        zzcw.zzd(j >= 0);
        zzcw.zzd(j2 >= 0);
        this.zzc = j;
        this.zzd = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlp.class == obj.getClass()) {
            zzlp zzlpVar = (zzlp) obj;
            if (this.zzc == zzlpVar.zzc && this.zzd == zzlpVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzc) * 31) + ((int) this.zzd);
    }
}

package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzog {
    public final String zza;

    @Nullable
    private final zzof zzb;

    @Nullable
    private final Object zzc;

    static {
        if (zzei.zza < 31) {
            new zzog("");
        } else {
            int i = zzof.zzb;
        }
    }

    @RequiresApi(31)
    public zzog(LogSessionId logSessionId, String str) {
        this.zzb = new zzof(logSessionId);
        this.zza = str;
        this.zzc = new Object();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzog)) {
            return false;
        }
        zzog zzogVar = (zzog) obj;
        return Objects.equals(this.zza, zzogVar.zza) && Objects.equals(this.zzb, zzogVar.zzb) && Objects.equals(this.zzc, zzogVar.zzc);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc);
    }

    @RequiresApi(31)
    public final LogSessionId zza() {
        zzof zzofVar = this.zzb;
        zzofVar.getClass();
        return zzofVar.zza;
    }

    public zzog(String str) {
        zzcw.zzf(zzei.zza < 31);
        this.zza = str;
        this.zzb = null;
        this.zzc = new Object();
    }
}

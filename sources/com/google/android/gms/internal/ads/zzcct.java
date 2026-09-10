package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcct {
    final /* synthetic */ zzccu zza;
    private long zzb;
    private long zzc;

    public zzcct(zzccu zzccuVar) {
        Objects.requireNonNull(zzccuVar);
        this.zza = zzccuVar;
        this.zzb = -1L;
        this.zzc = -1L;
    }

    public final long zza() {
        return this.zzc;
    }

    public final void zzb() {
        this.zzc = this.zza.zzk().elapsedRealtime();
    }

    public final void zzc() {
        this.zzb = this.zza.zzk().elapsedRealtime();
    }

    public final Bundle zzd() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }
}

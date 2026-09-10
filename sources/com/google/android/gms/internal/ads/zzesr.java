package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzesr {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzesq zzb;

    public final void zza(boolean z2) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    public final void zzc(zzesq zzesqVar) {
        this.zzb = zzesqVar;
    }

    public final zzesq zzd() {
        return this.zzb;
    }
}

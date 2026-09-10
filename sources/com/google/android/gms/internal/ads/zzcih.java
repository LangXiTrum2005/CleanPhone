package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcih {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public zzcih(String str) {
    }

    public final boolean zza() {
        return this.zza.get();
    }

    public final void zzb() {
        this.zza.set(true);
    }

    public final void zzc() {
        this.zza.set(false);
    }

    public final void zzd() {
        this.zza.set(false);
    }
}

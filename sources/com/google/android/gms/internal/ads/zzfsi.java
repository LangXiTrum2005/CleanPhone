package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfsi {
    private final zzftw zza;
    private final String zzb;
    private final zzfro zzc;
    private final String zzd = "Ad overlay";

    public zzfsi(View view, zzfro zzfroVar, String str) {
        this.zza = new zzftw(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfroVar;
    }

    public final zzftw zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzfro zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}

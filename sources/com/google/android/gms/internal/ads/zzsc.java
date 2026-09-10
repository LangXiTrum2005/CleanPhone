package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsc {
    private final Context zza;
    private zzsk zzb;
    private zzpp zzc;
    private zzsi zzd;

    public zzsc(Context context) {
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzb = zzsk.zza;
        if (context == null) {
            this.zzc = zzpp.zza;
        }
    }

    public final zzsc zza(zzsk zzskVar) {
        this.zzb = zzskVar;
        return this;
    }

    public final zzsc zzb(zzpp zzppVar) {
        if (this.zza == null) {
            this.zzc = zzppVar;
        }
        return this;
    }

    public final zzqj zzc() {
        if (this.zzd == null) {
            this.zzd = new zzsi(this.zza);
        }
        return new zzse(this, null);
    }

    public final /* synthetic */ Context zzd() {
        return this.zza;
    }

    public final /* synthetic */ zzpp zze() {
        return this.zzc;
    }

    public final zzsc zzf(zzsi zzsiVar) {
        this.zzd = zzsiVar;
        return this;
    }

    public final /* synthetic */ zzsi zzg() {
        return this.zzd;
    }
}

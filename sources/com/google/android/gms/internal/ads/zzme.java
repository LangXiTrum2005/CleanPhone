package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzme {
    private final zzmd zza;
    private final zzmc zzb;
    private final zzbf zzc;
    private int zzd;
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzme(zzmc zzmcVar, zzmd zzmdVar, zzbf zzbfVar, int i2, zzdn zzdnVar, Looper looper) {
        this.zzb = zzmcVar;
        this.zza = zzmdVar;
        this.zzc = zzbfVar;
        this.zzf = looper;
        this.zzg = i2;
    }

    public final zzmd zza() {
        return this.zza;
    }

    public final zzme zzb(int i2) {
        zzgqa.zzi(!this.zzh);
        this.zzd = i2;
        return this;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzme zzd(Object obj) {
        zzgqa.zzi(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final Object zze() {
        return this.zze;
    }

    public final Looper zzf() {
        return this.zzf;
    }

    public final zzme zzg() {
        zzgqa.zzi(!this.zzh);
        this.zzh = true;
        this.zzb.zzk(this);
        return this;
    }

    public final synchronized boolean zzh() {
        return false;
    }

    public final synchronized void zzi(boolean z2) {
        this.zzi = z2 | this.zzi;
        notifyAll();
    }
}

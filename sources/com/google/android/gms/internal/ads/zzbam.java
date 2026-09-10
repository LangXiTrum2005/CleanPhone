package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbam implements Callable {
    private final zzazt zza;
    private final zzavs zzb;

    public zzbam(zzazt zzaztVar, zzavs zzavsVar) {
        this.zza = zzaztVar;
        this.zzb = zzavsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzazt zzaztVar = this.zza;
        if (zzaztVar.zzm() != null) {
            zzaztVar.zzm().get();
        }
        zzawp zzawpVarZzl = zzaztVar.zzl();
        if (zzawpVarZzl == null) {
            return null;
        }
        try {
            zzavs zzavsVar = this.zzb;
            synchronized (zzavsVar) {
                try {
                    zzavsVar.zzaY(zzawpVarZzl.zzaN(), zziab.zza());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (zzibg | NullPointerException unused) {
            return null;
        }
    }
}

package com.google.android.gms.internal.ads;

import com.p004ironsource.d9;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzgzl extends zzgyd implements RunnableFuture {
    private volatile zzgyt zza;

    public zzgzl(zzgxt zzgxtVar) {
        this.zza = new zzgzj(this, zzgxtVar);
    }

    public static zzgzl zze(Runnable runnable, Object obj) {
        return new zzgzl(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgyt zzgytVar = this.zza;
        if (zzgytVar != null) {
            zzgytVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final void zzc() {
        zzgyt zzgytVar;
        if (zzj() && (zzgytVar = this.zza) != null) {
            zzgytVar.zzh();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final String zzd() {
        zzgyt zzgytVar = this.zza;
        if (zzgytVar == null) {
            return super.zzd();
        }
        String string = zzgytVar.toString();
        return android.support.v4.media.a.s(new StringBuilder(string.length() + 7), "task=[", string, d9.i.f24752e);
    }

    public zzgzl(Callable callable) {
        this.zza = new zzgzk(this, callable);
    }
}

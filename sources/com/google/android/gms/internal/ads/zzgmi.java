package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgmi implements zzglz, zzgcb {
    private final Context zza;
    private final zzgnc zzb;
    private final zzgyw zzc;
    private final zzgad zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private ListenableFuture zzf = zzgym.zza(null);

    public zzgmi(Context context, zzgnc zzgncVar, zzgyw zzgywVar, zzgad zzgadVar) {
        this.zza = context;
        this.zzb = zzgncVar;
        this.zzc = zzgywVar;
        this.zzd = zzgadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final ListenableFuture zza() {
        return (this.zze.getAndSet(true) || !this.zzd.zzc()) ? zzgym.zzb() : this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgmh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzglz
    public final void zzb(Map map) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzglz
    public final void zzc(Map map, Context context, View view) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzglz
    public final void zzd(Map map) {
        map.put("gs", this.zzf);
    }

    public final /* synthetic */ void zze() {
        ListenableFuture listenableFutureSubmit = this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf();
            }
        });
        this.zzb.zze(53, listenableFutureSubmit);
        this.zzf = listenableFutureSubmit;
    }

    public final /* synthetic */ zzawp zzf() {
        Context context = this.zza;
        try {
            return zzfum.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }
}

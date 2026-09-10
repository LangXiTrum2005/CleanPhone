package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class zzgda {
    private final zzija zza;
    private final zzija zzb;
    private final zzija zzc;
    private final ExecutorService zzd;
    private final zzgnc zze;

    public zzgda(zzija zzijaVar, zzija zzijaVar2, zzija zzijaVar3, ExecutorService executorService, zzgnc zzgncVar) {
        this.zza = zzijaVar;
        this.zzb = zzijaVar2;
        this.zzc = zzijaVar3;
        this.zzd = executorService;
        this.zze = zzgncVar;
    }

    private final ListenableFuture zze(final int i2) {
        return (zzgye) zzgym.zzj(zzgye.zzw(zzgym.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgcw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(i2);
            }
        }, this.zzd)), zzgcx.zza, zzgzd.zza());
    }

    public final /* synthetic */ zzgnc zza() {
        return this.zze;
    }

    public final ListenableFuture zzb(int i2, boolean z2) {
        ListenableFuture listenableFutureZze = zze(i2);
        return (!z2 || i2 == 2) ? listenableFutureZze : (zzgye) zzgym.zzj((zzgye) zzgym.zzg(zzgye.zzw(listenableFutureZze), Throwable.class, zzgcz.zza, zzgzd.zza()), new zzgcv(this), zzgzd.zza());
    }

    public final /* synthetic */ zzgct zzc(int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            return (zzgct) this.zza.zzb();
        }
        if (i3 == 2) {
            return (zzgct) this.zzb.zzb();
        }
        if (i3 == 3) {
            return (zzgct) this.zzc.zzb();
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ ListenableFuture zzd(int i2) {
        return zze(2);
    }
}

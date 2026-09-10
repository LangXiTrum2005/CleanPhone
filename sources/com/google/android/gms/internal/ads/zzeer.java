package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeer {
    private final zzgyw zza;
    private final zzedw zzb;
    private final zzija zzc;

    public zzeer(zzgyw zzgywVar, zzedw zzedwVar, zzija zzijaVar) {
        this.zza = zzgywVar;
        this.zzb = zzedwVar;
        this.zzc = zzijaVar;
    }

    private final ListenableFuture zzg(final zzbza zzbzaVar, zzeeh zzeehVar, final zzeeh zzeehVar2, final zzgxu zzgxuVar) {
        ListenableFuture listenableFutureZzh;
        String str = zzbzaVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(str)) {
            listenableFutureZzh = zzgym.zzc(new zzeef(1));
        } else {
            listenableFutureZzh = zzgym.zzh(zzeehVar.zza(zzbzaVar), ExecutionException.class, zzeeq.zza, this.zza);
        }
        zzgyw zzgywVar = this.zza;
        return (zzgye) zzgym.zzh((zzgye) zzgym.zzj((zzgye) zzgym.zzj(zzgye.zzw(listenableFutureZzh), zzeej.zza, zzgywVar), zzgxuVar, zzgywVar), zzeef.class, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzeek
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzeehVar2, zzbzaVar, zzgxuVar, (zzeef) obj);
            }
        }, zzgywVar);
    }

    public final ListenableFuture zza(final zzbza zzbzaVar) {
        zzgxu zzgxuVar = new zzgxu() { // from class: com.google.android.gms.internal.ads.zzeel
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                String str = new String(zzgwd.zza((InputStream) obj), StandardCharsets.UTF_8);
                zzbza zzbzaVar2 = zzbzaVar;
                zzbzaVar2.zzj = str;
                return zzgym.zza(zzbzaVar2);
            }
        };
        final zzedw zzedwVar = this.zzb;
        Objects.requireNonNull(zzedwVar);
        return zzg(zzbzaVar, new zzeeh() { // from class: com.google.android.gms.internal.ads.zzeei
            @Override // com.google.android.gms.internal.ads.zzeeh
            public final /* synthetic */ ListenableFuture zza(zzbza zzbzaVar2) {
                return zzedwVar.zza(zzbzaVar2);
            }
        }, new zzeeh() { // from class: com.google.android.gms.internal.ads.zzeem
            @Override // com.google.android.gms.internal.ads.zzeeh
            public final /* synthetic */ ListenableFuture zza(zzbza zzbzaVar2) {
                return this.zza.zzd(zzbzaVar2);
            }
        }, zzgxuVar);
    }

    public final ListenableFuture zzb(zzbza zzbzaVar) {
        return zzg(zzbzaVar, new zzeeh() { // from class: com.google.android.gms.internal.ads.zzeeo
            @Override // com.google.android.gms.internal.ads.zzeeh
            public final /* synthetic */ ListenableFuture zza(zzbza zzbzaVar2) {
                return this.zza.zze(zzbzaVar2);
            }
        }, new zzeeh() { // from class: com.google.android.gms.internal.ads.zzeep
            @Override // com.google.android.gms.internal.ads.zzeeh
            public final /* synthetic */ ListenableFuture zza(zzbza zzbzaVar2) {
                return this.zza.zzf(zzbzaVar2);
            }
        }, zzeen.zza);
    }

    public final /* synthetic */ ListenableFuture zzc(zzeeh zzeehVar, zzbza zzbzaVar, zzgxu zzgxuVar, zzeef zzeefVar) {
        return zzgym.zzj(zzeehVar.zza(zzbzaVar), zzgxuVar, this.zza);
    }

    public final /* synthetic */ ListenableFuture zzd(zzbza zzbzaVar) {
        return ((zzefw) this.zzc.zzb()).zzc(zzbzaVar, Binder.getCallingUid());
    }

    public final /* synthetic */ ListenableFuture zze(zzbza zzbzaVar) {
        return this.zzb.zzd(zzbzaVar.zzh);
    }

    public final /* synthetic */ ListenableFuture zzf(zzbza zzbzaVar) {
        return ((zzefw) this.zzc.zzb()).zzd(zzbzaVar.zzh);
    }
}

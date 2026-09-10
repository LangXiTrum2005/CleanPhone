package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzfff {
    private final zzfjz zza;
    private final zzczr zzb;
    private final Executor zzc;
    private zzffd zzd;

    public zzfff(zzfjz zzfjzVar, zzczr zzczrVar, Executor executor) {
        this.zza = zzfjzVar;
        this.zzb = zzczrVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzfkj zzb() {
        zzfik zzfikVarZzb = this.zzb.zzb();
        return this.zza.zzd(zzfikVarZzb.zzd, zzfikVarZzb.zzg, zzfikVarZzb.zzk);
    }

    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZza;
        zzffd zzffdVar = this.zzd;
        if (zzffdVar != null) {
            return zzgym.zza(zzffdVar);
        }
        if (((Boolean) zzbir.zza.zze()).booleanValue()) {
            zzgye zzgyeVarZzw = zzgye.zzw(this.zzb.zza().zze(this.zza.zze()));
            zzffc zzffcVar = new zzffc(this);
            Executor executor = this.zzc;
            listenableFutureZza = (zzgye) zzgym.zzg((zzgye) zzgym.zzk(zzgyeVarZzw, zzffcVar, executor), zzeef.class, new zzffb(this), executor);
        } else {
            zzffd zzffdVar2 = new zzffd(null, zzb(), null);
            this.zzd = zzffdVar2;
            listenableFutureZza = zzgym.zza(zzffdVar2);
        }
        return zzgym.zzk(listenableFutureZza, zzffe.zza, this.zzc);
    }

    public final /* synthetic */ zzffd zzc() {
        return this.zzd;
    }

    public final /* synthetic */ void zzd(zzffd zzffdVar) {
        this.zzd = zzffdVar;
    }
}

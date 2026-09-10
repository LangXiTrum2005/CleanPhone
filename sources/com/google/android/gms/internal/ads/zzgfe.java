package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
final class zzgfe implements zzgfy {
    private final Map zza;
    private final zzavs zzb;
    private final zzgna zzc;
    private final long zzd;

    public zzgfe(zzavs zzavsVar, Map map, zzgad zzgadVar, zzgnc zzgncVar) {
        this.zza = map;
        this.zzb = zzavsVar;
        this.zzc = zzgncVar.zza(112);
        this.zzd = zzgadVar.zzj();
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zza();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Void zza() throws Exception {
        zzawp zzawpVar;
        try {
            try {
                this.zzc.zza();
                ListenableFuture listenableFuture = (ListenableFuture) this.zza.get("gs");
                if (listenableFuture != null && (zzawpVar = (zzawp) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null) {
                    zzavs zzavsVar = this.zzb;
                    synchronized (zzavsVar) {
                        zzavsVar.zzad(zzawpVar.zzh());
                        zzavsVar.zzN(zzawpVar.zzd());
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e2) {
                this.zzc.zzb(e2);
            }
            this.zzc.zzc();
            return null;
        } catch (Throwable th) {
            this.zzc.zzc();
            throw th;
        }
    }
}

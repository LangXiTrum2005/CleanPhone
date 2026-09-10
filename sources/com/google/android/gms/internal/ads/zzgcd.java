package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgcd {
    private final zzija zza;
    private final zzija zzb;
    private final ExecutorService zzc;
    private final zzija zzd;
    private ListenableFuture zze = null;

    public zzgcd(zzija zzijaVar, zzija zzijaVar2, ExecutorService executorService, zzija zzijaVar3) {
        this.zza = zzijaVar;
        this.zzb = zzijaVar2;
        this.zzc = executorService;
        this.zzd = zzijaVar3;
    }

    public final synchronized ListenableFuture zza() {
        try {
            ListenableFuture listenableFuture = this.zze;
            if (listenableFuture != null) {
                return listenableFuture;
            }
            Set set = (Set) this.zzb.zzb();
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzgcb) it.next()).zza());
            }
            zzgnc zzgncVar = (zzgnc) this.zzd.zzb();
            ListenableFuture listenableFutureZzk = zzgym.zzk(zzgym.zzm(arrayList), zzgcc.zza, this.zzc);
            zzgncVar.zze(2, listenableFutureZzk);
            this.zze = listenableFutureZzk;
            Iterator it2 = ((Set) this.zza.zzb()).iterator();
            while (it2.hasNext()) {
                ((zzgcb) it2.next()).zza();
            }
            ListenableFuture listenableFuture2 = this.zze;
            if (listenableFuture2 != null) {
                return listenableFuture2;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ListenableFuture zzb() {
        ListenableFuture listenableFuture;
        listenableFuture = this.zze;
        if (listenableFuture == null) {
            throw null;
        }
        return listenableFuture;
    }
}

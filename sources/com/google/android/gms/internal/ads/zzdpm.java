package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdpm implements zzdbe {
    private final zzdnm zza;
    private final zzdnr zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdpm(zzdnm zzdnmVar, zzdnr zzdnrVar, Executor executor, Executor executor2) {
        this.zza = zzdnmVar;
        this.zzb = zzdnrVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(final zzcir zzcirVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpl
            @Override // java.lang.Runnable
            public final void run() {
                zzcirVar.zze("onSdkImpression", new ArrayMap(0));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbe
    public final void zzdr() {
        if (this.zzb.zzd()) {
            zzdnm zzdnmVar = this.zza;
            zzejb zzejbVarZzZ = zzdnmVar.zzZ();
            if (zzejbVarZzZ == null && zzdnmVar.zzX() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgl)).booleanValue()) {
                ListenableFuture listenableFutureZzX = zzdnmVar.zzX();
                zzcdt zzcdtVarZzY = zzdnmVar.zzY();
                if (listenableFutureZzX == null || zzcdtVarZzY == null) {
                    return;
                }
                zzgym.zzr(zzgym.zzq(listenableFutureZzX, zzcdtVarZzY), new zzdpk(this), this.zzd);
                return;
            }
            if (zzejbVarZzZ != null) {
                zzcir zzcirVarZzW = zzdnmVar.zzW();
                zzcir zzcirVarZzT = zzdnmVar.zzT();
                if (zzcirVarZzW == null) {
                    zzcirVarZzW = zzcirVarZzT == null ? null : zzcirVarZzT;
                }
                if (zzcirVarZzW != null) {
                    zza(zzcirVarZzW);
                }
            }
        }
    }
}

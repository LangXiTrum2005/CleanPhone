package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeec implements zzeee {
    private final Map zza;
    private final zzgyw zzb;
    private final zzddo zzc;

    public zzeec(Map map, zzgyw zzgywVar, zzddo zzddoVar) {
        this.zza = map;
        this.zzb = zzgywVar;
        this.zzc = zzddoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final ListenableFuture zza(final zzbza zzbzaVar) {
        this.zzc.zzdO(zzbzaVar);
        ListenableFuture listenableFutureZzc = zzgym.zzc(new zzebr(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzju)).split(",")) {
            final zzijv zzijvVar = (zzijv) this.zza.get(str.trim());
            if (zzijvVar != null) {
                listenableFutureZzc = zzgym.zzh(listenableFutureZzc, zzebr.class, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzeeb
                    @Override // com.google.android.gms.internal.ads.zzgxu
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return ((zzeee) zzijvVar.zzb()).zza(zzbzaVar);
                    }
                }, this.zzb);
            }
        }
        zzgym.zzr(listenableFutureZzc, new zzeea(this), zzcdo.zzg);
        return listenableFutureZzc;
    }

    public final /* synthetic */ zzddo zzb() {
        return this.zzc;
    }
}

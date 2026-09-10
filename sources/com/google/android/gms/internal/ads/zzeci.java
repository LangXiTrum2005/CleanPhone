package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeci implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;

    private zzeci(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
    }

    public static zzeci zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5) {
        return new zzeci(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x004f  */
    /* JADX WARN: Code duplicated, block: B:8:0x006d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0077  */
    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        ListenableFuture listenableFutureSubmit;
        final zzayq zzayqVar = (zzayq) this.zza.zzb();
        final Context contextZza = ((zzclp) this.zzb).zza();
        zzfik zzfikVarZza = ((zzdab) this.zzc).zza();
        long jLongValue = ((Long) this.zzd.zzb()).longValue();
        zzgyw zzgywVarZzc = zzflk.zzc();
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzds)).intValue();
        if (iIntValue != -1) {
            if (Integer.toString(iIntValue).equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfikVarZza.zzd)))) {
                if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jLongValue < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdu)).intValue()) {
                    listenableFutureSubmit = zzgywVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzecd
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return zzayqVar.zzb().zzk(contextZza);
                        }
                    });
                } else {
                    listenableFutureSubmit = zzgywVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzecc
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return zzayqVar.zzb().zzl(contextZza);
                        }
                    });
                }
            } else {
                listenableFutureSubmit = zzgywVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzecc
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzayqVar.zzb().zzl(contextZza);
                    }
                });
            }
        } else {
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jLongValue < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdu)).intValue()) {
                listenableFutureSubmit = zzgywVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzecd
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzayqVar.zzb().zzk(contextZza);
                    }
                });
            } else {
                listenableFutureSubmit = zzgywVarZzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzecc
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzayqVar.zzb().zzl(contextZza);
                    }
                });
            }
        }
        zzijo.zzb(listenableFutureSubmit);
        return listenableFutureSubmit;
    }
}

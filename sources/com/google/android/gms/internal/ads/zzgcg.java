package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgcg implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;

    private zzgcg(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
        this.zze = zzijpVar5;
    }

    public static zzgcg zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5) {
        return new zzgcg(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        zzgbj zzgbjVar = (zzgbj) this.zzb.zzb();
        ExecutorService executorService = (ExecutorService) this.zzc.zzb();
        zzgbc zzgbcVar = (zzgbc) this.zzd.zzb();
        zzgad zzgadVar = (zzgad) this.zze.zzb();
        return new zzgco(context, zzgbjVar, executorService, zzgbcVar, new Random(), zzgadVar.zzd().zza(), zzgadVar.zzd().zzc(), zzgadVar.zzd().zzd(), zzgadVar.zzd().zzb(), zzgadVar.zzb(), zzgadVar.zzE() - 1);
    }
}

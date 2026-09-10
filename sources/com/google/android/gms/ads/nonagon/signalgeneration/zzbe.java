package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdij;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.android.gms.internal.ads.zzijg;
import com.google.android.gms.internal.ads.zzijp;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbe implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzbe(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar4;
    }

    public static zzbe zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzbe(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj = (zzw) this.zza.zzb();
        zzbl zzblVar = (zzbl) this.zzb.zzb();
        zzgyw zzgywVarZzc = zzflk.zzc();
        if (((Integer) this.zzc.zzb()).intValue() == 2) {
            obj = zzblVar;
        }
        return new zzdij(obj, zzgywVarZzc);
    }
}

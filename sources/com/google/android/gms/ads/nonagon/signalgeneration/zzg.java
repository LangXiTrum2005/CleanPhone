package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzclp;
import com.google.android.gms.internal.ads.zzcmg;
import com.google.android.gms.internal.ads.zzcoy;
import com.google.android.gms.internal.ads.zzeve;
import com.google.android.gms.internal.ads.zzijg;
import com.google.android.gms.internal.ads.zzijp;

/* JADX INFO: loaded from: classes3.dex */
public final class zzg implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzg(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar4;
    }

    public static zzg zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzg(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzf(((zzclp) this.zza).zza(), zzcoy.zza(), zzeve.zzc(), ((zzcmg) this.zzb).zza());
    }
}

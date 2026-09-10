package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzijg;
import com.google.android.gms.internal.ads.zzijp;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbm implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzbm(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
    }

    public static zzbm zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzbm(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbl((zzb) this.zza.zzb(), ((Integer) this.zzb.zzb()).intValue(), (String) this.zzc.zzb());
    }
}

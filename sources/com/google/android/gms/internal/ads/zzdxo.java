package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder_Factory;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxo implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;

    private zzdxo(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5) {
        this.zza = zzijpVar2;
        this.zzb = zzijpVar3;
        this.zzc = zzijpVar4;
        this.zzd = zzijpVar5;
    }

    public static zzdxo zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5) {
        return new zzdxo(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdxj(zzflk.zzc(), (com.google.android.gms.ads.internal.util.client.zzu) this.zza.zzb(), ((CsiParamDefaults_Factory) this.zzb).zzb(), ((CsiUrlBuilder_Factory) this.zzc).zzb(), ((zzclp) this.zzd).zza());
    }
}

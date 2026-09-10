package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdwd implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzdwd(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar4;
    }

    public static zzdwd zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzdwd(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton;
        final String strZza = ((zzfch) this.zza).zza();
        Context contextZza = ((zzclp) this.zzb).zza();
        zzgyw zzgywVarZzc = zzflk.zzc();
        Map mapZzb = ((zzijk) this.zzc).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfY)).booleanValue()) {
            zzbfj zzbfjVar = new zzbfj(new zzbfo(contextZza));
            zzbfjVar.zzb(new zzbfi() { // from class: com.google.android.gms.internal.ads.zzdwe
                @Override // com.google.android.gms.internal.ads.zzbfi
                public final /* synthetic */ void zza(zzbfp.zzt.zza zzaVar) {
                    zzaVar.zzh(strZza);
                }
            });
            setSingleton = Collections.singleton(new zzdij(new zzdwg(zzbfjVar, mapZzb), zzgywVarZzc));
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        zzijo.zzb(setSingleton);
        return setSingleton;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdvd implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;

    private zzdvd(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
        this.zze = zzijpVar5;
    }

    public static zzdvd zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5) {
        return new zzdvd(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzclp) this.zza).zza();
        final String strZzb = ((zzecm) this.zzb).zzb();
        VersionInfoParcel versionInfoParcelZza = ((zzcmg) this.zzc).zza();
        final zzbfp.zza.EnumC0185zza enumC0185zza = (zzbfp.zza.EnumC0185zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbfj zzbfjVar = new zzbfj(new zzbfo(contextZza));
        zzbfp.zzar.zza zzaVarZzs = zzbfp.zzar.zzs();
        zzaVarZzs.zzc(versionInfoParcelZza.buddyApkVersion);
        zzaVarZzs.zzg(versionInfoParcelZza.clientJarVersion);
        zzaVarZzs.zzk(true != versionInfoParcelZza.isClientJar ? 2 : 0);
        final zzbfp.zzar zzarVarZzbu = zzaVarZzs.zzbu();
        zzbfjVar.zzb(new zzbfi() { // from class: com.google.android.gms.internal.ads.zzdvc
            @Override // com.google.android.gms.internal.ads.zzbfi
            public final /* synthetic */ void zza(zzbfp.zzt.zza zzaVar) {
                zzbfp.zza.zzb zzbVarZzcc = zzaVar.zzY().zzcc();
                zzbVarZzcc.zzc(enumC0185zza);
                zzaVar.zzaa(zzbVarZzcc);
                zzbfp.zzm.zza zzaVarZzcc = zzaVar.zzG().zzcc();
                zzaVarZzcc.zzd(strZzb);
                zzaVarZzcc.zzs(zzarVarZzbu);
                zzaVar.zzI(zzaVarZzcc);
                zzaVar.zzh(str);
            }
        });
        return zzbfjVar;
    }
}

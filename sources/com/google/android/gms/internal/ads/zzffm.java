package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzffm implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzffm(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
    }

    public static zzffm zzc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzffm(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzffj zzb() {
        Context context = (Context) this.zza.zzb();
        zzfjv zzfjvVar = (zzfjv) this.zzb.zzb();
        zzfkn zzfknVar = (zzfkn) this.zzc.zzb();
        zzccv zzccvVarZzi = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhf)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi() : com.google.android.gms.ads.internal.zzt.zzh().zzo().zzj();
        boolean z2 = false;
        if (zzccvVarZzi != null && zzccvVarZzi.zzi()) {
            z2 = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhh)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhe)).booleanValue() || z2) {
                zzfkm zzfkmVarZza = zzfknVar.zza(zzfkd.Rewarded, context, zzfjvVar, new zzfem(new zzfel()));
                zzffa zzffaVar = new zzffa(new zzfez());
                zzfjz zzfjzVar = zzfkmVarZza.zza;
                zzgyw zzgywVar = zzcdo.zza;
                return new zzfeq(zzffaVar, new zzfew(zzfjzVar, zzgywVar), zzfkmVarZza.zzb, zzfjzVar.zze().zzf, zzgywVar);
            }
        }
        return new zzfez();
    }
}

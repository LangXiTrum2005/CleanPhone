package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzelu implements zzejm {
    private final Context zza;
    private final zzdlv zzb;
    private final Executor zzc;

    public zzelu(Context context, zzdlv zzdlvVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdlvVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfic zzficVar, int i2) {
        return zzficVar.zza.zza.zzh.contains(Integer.toString(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final void zza(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir {
        zzfji zzfjiVar = (zzfji) zzejjVar.zzb;
        zzfik zzfikVar = zzficVar.zza.zza;
        String string = zzfhrVar.zzv.toString();
        String strZzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfhrVar.zzs);
        zzfjiVar.zzo(this.zza, zzfikVar.zzd, string, strZzm, (zzbtf) zzejjVar.zzc, zzfikVar.zzj, zzfikVar.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final /* bridge */ /* synthetic */ Object zzb(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir, zzemv {
        zzdnm zzdnmVarZzag;
        zzfji zzfjiVar = (zzfji) zzejjVar.zzb;
        zzbtk zzbtkVarZzD = zzfjiVar.zzD();
        zzbtl zzbtlVarZzE = zzfjiVar.zzE();
        zzbto zzbtoVarZzu = zzfjiVar.zzu();
        if (zzbtoVarZzu != null && zzc(zzficVar, 6)) {
            zzdnmVarZzag = zzdnm.zzaf(zzbtoVarZzu);
        } else if (zzbtkVarZzD != null && zzc(zzficVar, 6)) {
            zzdnmVarZzag = zzdnm.zzai(zzbtkVarZzD);
        } else if (zzbtkVarZzD != null && zzc(zzficVar, 2)) {
            zzdnmVarZzag = zzdnm.zzah(zzbtkVarZzD);
        } else if (zzbtlVarZzE != null && zzc(zzficVar, 6)) {
            zzdnmVarZzag = zzdnm.zzaj(zzbtlVarZzE);
        } else {
            if (zzbtlVarZzE == null || !zzc(zzficVar, 1)) {
                throw new zzemv(1, "No native ad mappers");
            }
            zzdnmVarZzag = zzdnm.zzag(zzbtlVarZzE);
        }
        if (zzdnmVarZzag != null) {
            zzfik zzfikVar = zzficVar.zza.zza;
            if (zzfikVar.zzh.contains(Integer.toString(zzdnmVarZzag.zzx()))) {
                zzdno zzdnoVarZze = this.zzb.zze(new zzcwa(zzficVar, zzfhrVar, zzejjVar.zza), new zzdnx(zzdnmVarZzag), new zzdpq(zzbtlVarZzE, zzbtkVarZzD, zzbtoVarZzu));
                ((zzekv) zzejjVar.zzc).zzc(zzdnoVarZze.zzf());
                zzdnoVarZze.zza().zzq(new zzcqq(zzfjiVar), this.zzc);
                return zzdnoVarZze.zzh();
            }
        }
        throw new zzemv(1, "No corresponding native ad listener");
    }
}

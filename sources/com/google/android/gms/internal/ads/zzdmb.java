package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdmb implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;
    private final zzijp zzf;

    private zzdmb(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
        this.zze = zzijpVar5;
        this.zzf = zzijpVar6;
    }

    public static zzdmb zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6) {
        return new zzdmb(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzclg zzclgVar = (zzclg) this.zza.zzb();
        zzczs zzczsVarZza = ((zzdac) this.zzb).zza();
        zzdgk zzdgkVarZza = ((zzdhf) this.zzc).zza();
        zzdlq zzdlqVarZza = ((zzdls) this.zzd).zza();
        zzddl zzddlVarZzb = ((zzctb) this.zze).zzb();
        zzemr zzemrVar = (zzemr) this.zzf.zzb();
        zzcug zzcugVarZzi = zzclgVar.zzi();
        zzcugVarZzi.zzl(zzczsVarZza.zze());
        zzcugVarZzi.zzm(zzdgkVarZza);
        zzcugVarZzi.zzd(zzdlqVarZza);
        zzcugVarZzi.zzk(new zzeow(null));
        zzcugVarZzi.zzg(new zzcvc(zzddlVarZzb, null));
        zzcugVarZzi.zze(new zzcsz(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzew)).booleanValue()) {
            zzcugVarZzi.zzf(zzena.zza(zzemrVar));
        }
        zzcvn zzcvnVarZzd = zzcugVarZzi.zzh().zzd();
        zzijo.zzb(zzcvnVarZzd);
        return zzcvnVarZzd;
    }
}

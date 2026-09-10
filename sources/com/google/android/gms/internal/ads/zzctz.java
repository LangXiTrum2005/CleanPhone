package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzctz implements zzijg {
    private final zzijp zza;

    private zzctz(zzctj zzctjVar, zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzctz zza(zzctj zzctjVar, zzijp zzijpVar) {
        return new zzctz(zzctjVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzddl zzddlVarZza = ((zzcvf) this.zza).zza();
        return new zzdij(new zzdfh() { // from class: com.google.android.gms.internal.ads.zzcth
            @Override // com.google.android.gms.internal.ads.zzdfh
            public final /* synthetic */ void zza() {
                zzddlVarZza.zzc();
            }
        }, zzcdo.zzg);
    }
}

package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes4.dex */
public final class zzehd implements zzfmv {
    private final zzegr zza;
    private final zzegv zzb;

    public zzehd(zzegr zzegrVar, zzegv zzegvVar) {
        this.zza = zzegrVar;
        this.zzb = zzegvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdK(zzfmo zzfmoVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdL(zzfmo zzfmoVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzha)).booleanValue()) {
            if (zzfmo.RENDERER == zzfmoVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                return;
            }
            if (zzfmo.PRELOADED_LOADER == zzfmoVar || zzfmo.SERVER_TRANSACTION == zzfmoVar) {
                zzegr zzegrVar = this.zza;
                zzegrVar.zza(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                final zzegv zzegvVar = this.zzb;
                final long jZzb = zzegrVar.zzb();
                zzegvVar.zza.zza(new zzflu() { // from class: com.google.android.gms.internal.ads.zzegu
                    @Override // com.google.android.gms.internal.ads.zzflu
                    public final /* synthetic */ Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzegvVar.zzf()) {
                            return null;
                        }
                        long j = jZzb;
                        zzbfp.zzaf.zza.C0187zza c0187zzaZzz = zzbfp.zzaf.zza.zzz();
                        c0187zzaZzz.zzad(j);
                        byte[] bArrZzaN = c0187zzaZzz.zzbu().zzaN();
                        zzehc.zzf(sQLiteDatabase, false, false);
                        zzehc.zze(sQLiteDatabase, j, bArrZzaN);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdM(zzfmo zzfmoVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzha)).booleanValue() && zzfmo.RENDERER == zzfmoVar) {
            zzegr zzegrVar = this.zza;
            if (zzegrVar.zzh() != 0) {
                zzegrVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzegrVar.zzh());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdN(zzfmo zzfmoVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzha)).booleanValue() && zzfmo.RENDERER == zzfmoVar) {
            zzegr zzegrVar = this.zza;
            if (zzegrVar.zzh() != 0) {
                zzegrVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzegrVar.zzh());
            }
        }
    }
}

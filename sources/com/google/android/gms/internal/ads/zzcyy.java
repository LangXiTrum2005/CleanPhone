package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcyy implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzcyy(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
    }

    public static zzcyy zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzcyy(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel versionInfoParcelZza = ((zzcmg) this.zzb).zza();
        final zzfik zzfikVarZza = ((zzdab) this.zzc).zza();
        return new zzgpr() { // from class: com.google.android.gms.internal.ads.zzcyx
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                zzfhr zzfhrVar = (zzfhr) obj;
                com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
                zzatVar.zze(zzfhrVar.zzB);
                zzatVar.zzf(zzfhrVar.zzC.toString());
                zzatVar.zzd(versionInfoParcelZza.afmaVersion);
                zzatVar.zzc(zzfikVarZza.zzg);
                return zzatVar;
            }
        };
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdkd implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;

    private zzdkd(zzdjw zzdjwVar, zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
    }

    public static zzdkd zza(zzdjw zzdjwVar, zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzdkd(zzdjwVar, zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel versionInfoParcelZza = ((zzcmg) this.zzb).zza();
        final zzfhr zzfhrVarZza = ((zzcwb) this.zzc).zza();
        final zzfik zzfikVarZza = ((zzdab) this.zzd).zza();
        return new zzdij(new zzdby() { // from class: com.google.android.gms.internal.ads.zzdjv
            @Override // com.google.android.gms.internal.ads.zzdby
            public final /* synthetic */ void zzg() {
                zzfik zzfikVar = zzfikVarZza;
                JSONObject jSONObject = zzfhrVarZza.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, versionInfoParcelZza.afmaVersion, jSONObject.toString(), zzfikVar.zzg);
            }
        }, zzcdo.zzg);
    }
}

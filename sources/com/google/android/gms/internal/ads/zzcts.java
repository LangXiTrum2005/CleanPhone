package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcts implements zzijg {
    private final zzctj zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;

    private zzcts(zzctj zzctjVar, zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzctjVar;
        this.zzb = zzijpVar;
        this.zzc = zzijpVar2;
        this.zzd = zzijpVar3;
        this.zze = zzijpVar4;
    }

    public static zzcts zza(zzctj zzctjVar, zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzcts(zzctjVar, zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    public static zzdij zzc(zzctj zzctjVar, final Context context, final VersionInfoParcel versionInfoParcel, final zzfhr zzfhrVar, final zzfik zzfikVar) {
        return new zzdij(new zzdby() { // from class: com.google.android.gms.internal.ads.zzcti
            @Override // com.google.android.gms.internal.ads.zzdby
            public final /* synthetic */ void zzg() {
                zzfik zzfikVar2 = zzfikVar;
                JSONObject jSONObject = zzfhrVar.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, versionInfoParcel.afmaVersion, jSONObject.toString(), zzfikVar2.zzg);
            }
        }, zzcdo.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (Context) this.zzb.zzb(), ((zzcmg) this.zzc).zza(), ((zzcwb) this.zzd).zza(), ((zzdab) this.zze).zza());
    }
}

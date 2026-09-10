package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcyp implements zzddq, zzdjd {
    private final Context zza;
    private final zzfik zzb;
    private final VersionInfoParcel zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdzp zze;
    private final zzfnr zzf;
    private final zzeak zzg;

    public zzcyp(Context context, zzfik zzfikVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdzp zzdzpVar, zzfnr zzfnrVar, zzeak zzeakVar) {
        this.zza = context;
        this.zzb = zzfikVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzgVar;
        this.zze = zzdzpVar;
        this.zzf = zzfnrVar;
        this.zzg = zzeakVar;
    }

    private final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeQ)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzc;
            zzfik zzfikVar = this.zzb;
            zzfnr zzfnrVar = this.zzf;
            zzeak zzeakVar = this.zzg;
            com.google.android.gms.ads.internal.zzt.zzl().zzb(context, versionInfoParcel, zzfikVar.zzg, zzgVar.zzi(), zzfnrVar, zzeakVar.zzs());
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeR)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdO(zzbza zzbzaVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdP(zzfic zzficVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final void zze(String str) {
    }
}

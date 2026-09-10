package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzela implements zzdlh {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzfhr zzd;
    private final zzcir zze;
    private final zzfik zzf;
    private final zzbnq zzg;
    private final boolean zzh;
    private final zzeif zzi;
    private final zzdxe zzj;

    public zzela(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfhr zzfhrVar, zzcir zzcirVar, zzfik zzfikVar, boolean z2, zzbnq zzbnqVar, zzeif zzeifVar, zzdxe zzdxeVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfhrVar;
        this.zze = zzcirVar;
        this.zzf = zzfikVar;
        this.zzg = zzbnqVar;
        this.zzh = z2;
        this.zzi = zzeifVar;
        this.zzj = zzdxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final void zza(boolean z2, Context context, zzdax zzdaxVar) {
        zzdjt zzdjtVar = (zzdjt) zzgym.zzt(this.zzc);
        zzcir zzcirVar = this.zze;
        zzcirVar.zzag(true);
        boolean z3 = this.zzh;
        boolean zZzc = z3 ? this.zzg.zzc(false) : false;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzN = com.google.android.gms.ads.internal.util.zzs.zzN(this.zza);
        boolean z4 = z3 && this.zzg.zzd();
        float fZze = z3 ? this.zzg.zze() : 0.0f;
        zzfhr zzfhrVar = this.zzd;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, zZzN, z4, fZze, -1, z2, zzfhrVar.zzO, false);
        if (zzdaxVar != null) {
            zzdaxVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdkw zzdkwVarZzj = zzdjtVar.zzj();
        int i2 = zzfhrVar.zzQ;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String str = zzfhrVar.zzB;
        zzfhw zzfhwVar = zzfhrVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdkwVarZzj, null, zzcirVar, i2, versionInfoParcel, str, zzlVar, zzfhwVar.zzb, zzfhwVar.zza, this.zzf.zzg, zzdaxVar, zzfhrVar.zzb() ? this.zzi : null, zzcirVar.zzn()), true, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final zzfhr zzb() {
        return this.zzd;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzejt implements zzdlh {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfhr zzc;
    private final zzcir zzd;
    private final zzfik zze;
    private final zzbnq zzf;
    private final boolean zzg;
    private final zzeif zzh;
    private final zzdxe zzi;

    public zzejt(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfhr zzfhrVar, zzcir zzcirVar, zzfik zzfikVar, boolean z2, zzbnq zzbnqVar, zzeif zzeifVar, zzdxe zzdxeVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfhrVar;
        this.zzd = zzcirVar;
        this.zze = zzfikVar;
        this.zzg = z2;
        this.zzf = zzbnqVar;
        this.zzh = zzeifVar;
        this.zzi = zzdxeVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    @Override // com.google.android.gms.internal.ads.zzdlh
    public final void zza(boolean z2, Context context, zzdax zzdaxVar) {
        zzcsn zzcsnVar = (zzcsn) zzgym.zzt(this.zzb);
        zzcir zzcirVar = this.zzd;
        zzcirVar.zzag(true);
        boolean z3 = this.zzg;
        boolean zZzc = z3 ? this.zzf.zzc(true) : true;
        boolean z4 = z3 && this.zzf.zzd();
        float fZze = z3 ? this.zzf.zze() : 0.0f;
        zzfhr zzfhrVar = this.zzc;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, true, z4, fZze, -1, z2, zzfhrVar.zzO, false);
        if (zzdaxVar != null) {
            zzdaxVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdkw zzdkwVarZzj = zzcsnVar.zzj();
        int i2 = zzfhrVar.zzQ;
        if (i2 == -1) {
            com.google.android.gms.ads.internal.client.zzx zzxVar = this.zze.zzk;
            if (zzxVar == null) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
            } else {
                int i4 = zzxVar.zza;
                if (i4 == 1) {
                    i2 = 7;
                } else if (i4 == 2) {
                    i2 = 6;
                } else {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
                }
            }
        }
        VersionInfoParcel versionInfoParcel = this.zza;
        String str = zzfhrVar.zzB;
        zzfhw zzfhwVar = zzfhrVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdkwVarZzj, null, zzcirVar, i2, versionInfoParcel, str, zzlVar, zzfhwVar.zzb, zzfhwVar.zza, this.zze.zzg, zzdaxVar, zzfhrVar.zzb() ? this.zzh : null, zzcirVar.zzn()), true, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final zzfhr zzb() {
        return this.zzc;
    }
}

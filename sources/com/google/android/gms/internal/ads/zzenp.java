package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzenp implements zzdlh {
    private final Context zza;
    private final zzdua zzb;
    private final zzfik zzc;
    private final VersionInfoParcel zzd;
    private final zzfhr zze;
    private final ListenableFuture zzf;
    private final zzcir zzg;
    private final zzbnq zzh;
    private final boolean zzi;
    private final zzeif zzj;
    private final zzdwy zzk;
    private final zzdxe zzl;

    public zzenp(Context context, zzdua zzduaVar, zzfik zzfikVar, VersionInfoParcel versionInfoParcel, zzfhr zzfhrVar, ListenableFuture listenableFuture, zzcir zzcirVar, zzbnq zzbnqVar, boolean z2, zzeif zzeifVar, zzdwy zzdwyVar, zzdxe zzdxeVar) {
        this.zza = context;
        this.zzb = zzduaVar;
        this.zzc = zzfikVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfhrVar;
        this.zzf = listenableFuture;
        this.zzg = zzcirVar;
        this.zzh = zzbnqVar;
        this.zzi = z2;
        this.zzj = zzeifVar;
        this.zzk = zzdwyVar;
        this.zzl = zzdxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final void zza(boolean z2, Context context, zzdax zzdaxVar) {
        zzdtf zzdtfVar = (zzdtf) zzgym.zzt(this.zzf);
        try {
            zzfhr zzfhrVar = this.zze;
            final zzcir zzcirVarZza = this.zzg;
            if (zzcirVarZza.zzaB()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbr)).booleanValue()) {
                    zzcirVarZza = this.zzb.zza(this.zzc.zzf, null, null);
                    zzbog.zzb(zzcirVarZza, zzdtfVar.zzk());
                    final zzdue zzdueVar = new zzdue();
                    zzdtfVar.zzl().zzi(zzcirVarZza, true, this.zzi ? this.zzh : null, this.zzk.zze());
                    zzcirVarZza.zzP().zzG(new zzckn(zzdueVar, zzcirVarZza) { // from class: com.google.android.gms.internal.ads.zzeno
                        private final /* synthetic */ zzcir zza;

                        {
                            this.zza = zzcirVarZza;
                        }

                        @Override // com.google.android.gms.internal.ads.zzckn
                        public final /* synthetic */ void zza(boolean z3, int i2, String str, String str2) {
                            zzcir zzcirVar = this.zza;
                            zzcirVar.zzJ();
                            zzcirVar.zzP().zzq();
                        }
                    });
                    zzcirVarZza.zzP().zzH(new zzcko() { // from class: com.google.android.gms.internal.ads.zzenn
                        @Override // com.google.android.gms.internal.ads.zzcko
                        public final /* synthetic */ void zza() {
                            zzcirVarZza.zzI();
                        }
                    });
                    zzfhw zzfhwVar = zzfhrVar.zzs;
                    zzcirVarZza.zzau(zzfhwVar.zzb, zzfhwVar.zza, null);
                }
            }
            zzcir zzcirVar = zzcirVarZza;
            zzcirVar.zzag(true);
            boolean z3 = this.zzi;
            boolean z4 = false;
            boolean zZzc = z3 ? this.zzh.zzc(false) : false;
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean zZzN = com.google.android.gms.ads.internal.util.zzs.zzN(this.zza);
            if (z3 && this.zzh.zzd()) {
                z4 = true;
            }
            float fZze = z3 ? this.zzh.zze() : 0.0f;
            zzfhr zzfhrVar2 = this.zze;
            com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, zZzN, z4, fZze, -1, z2, zzfhrVar2.zzO, zzfhrVar2.zzP);
            if (zzdaxVar != null) {
                zzdaxVar.zzb();
            }
            com.google.android.gms.ads.internal.zzt.zzb();
            zzdkw zzdkwVarZzj = zzdtfVar.zzj();
            int i2 = zzfhrVar2.zzQ;
            VersionInfoParcel versionInfoParcel = this.zzd;
            String str = zzfhrVar2.zzB;
            zzfhw zzfhwVar2 = zzfhrVar2.zzs;
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdkwVarZzj, null, zzcirVar, i2, versionInfoParcel, str, zzlVar, zzfhwVar2.zzb, zzfhwVar2.zza, this.zzc.zzg, zzdaxVar, zzfhrVar2.zzb() ? this.zzj : null, zzcirVar.zzn()), true, this.zzl);
        } catch (zzcjg e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final zzfhr zzb() {
        return this.zze;
    }
}

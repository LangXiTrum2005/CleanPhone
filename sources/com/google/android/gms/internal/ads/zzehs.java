package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
final class zzehs implements zzdgc {
    private final Context zza;
    private final zzdow zzb;
    private final zzfcj zzc;
    private final VersionInfoParcel zzd;
    private final zzfbo zze;
    private final AI zzf;
    private final zzcex zzg;
    private final zzbjs zzh;
    private final boolean zzi;
    private final zzebv zzj;
    private final zzdrq zzk;
    private final zzdrw zzl;

    public zzehs(Context context, zzdow zzdowVar, zzfcj zzfcjVar, VersionInfoParcel versionInfoParcel, zzfbo zzfboVar, AI ai, zzcex zzcexVar, zzbjs zzbjsVar, boolean z, zzebv zzebvVar, zzdrq zzdrqVar, zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = zzdowVar;
        this.zzc = zzfcjVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfboVar;
        this.zzf = ai;
        this.zzg = zzcexVar;
        this.zzh = zzbjsVar;
        this.zzi = z;
        this.zzj = zzebvVar;
        this.zzk = zzdrqVar;
        this.zzl = zzdrwVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00be  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7  */
    @Override // com.google.android.gms.internal.ads.zzdgc
    public final void zza(boolean z, Context context, zzcwg zzcwgVar) {
        zzcex zzcexVar;
        zzcex zzcexVar2;
        boolean zZze;
        boolean z2;
        boolean zZzd;
        float fZza;
        zzdob zzdobVar = (zzdob) zzgch.zzq(this.zzf);
        try {
            zzfbo zzfboVar = this.zze;
            if (this.zzg.zzaG()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaX)).booleanValue()) {
                    final zzcex zzcexVarZza = this.zzb.zza(this.zzc.zze, null, null);
                    zzbkh.zzb(zzcexVarZza, zzdobVar.zzg());
                    final zzdpa zzdpaVar = new zzdpa();
                    zzdpaVar.zza(this.zza, zzcexVarZza.zzF());
                    zzdobVar.zzl().zzi(zzcexVarZza, true, this.zzi ? this.zzh : null, this.zzk.zza());
                    zzcexVarZza.zzN().zzC(new zzcgn() { // from class: com.google.android.gms.internal.ads.zzehq
                        @Override // com.google.android.gms.internal.ads.zzcgn
                        public final void zza(boolean z3, int i, String str, String str2) {
                            zzdpaVar.zzb();
                            zzcex zzcexVar3 = zzcexVarZza;
                            zzcexVar3.zzab();
                            zzcexVar3.zzN().zzs();
                        }
                    });
                    zzcexVarZza.zzN().zzJ(new zzcgo() { // from class: com.google.android.gms.internal.ads.zzehr
                        @Override // com.google.android.gms.internal.ads.zzcgo
                        public final void zza() {
                            zzcexVarZza.zzaa();
                        }
                    });
                    zzfbt zzfbtVar = zzfboVar.zzs;
                    zzcexVarZza.zzae(zzfbtVar.zzb, zzfbtVar.zza, null);
                    zzcexVar = zzcexVarZza;
                } else {
                    zzcexVar2 = this.zzg;
                }
                zzcexVar.zzaq(true);
                if (this.zzi) {
                    zZze = this.zzh.zze(false);
                } else {
                    zZze = false;
                }
                com.google.android.gms.ads.internal.zzv.zzq();
                Context context2 = this.zza;
                z2 = this.zzi;
                boolean zZzJ = com.google.android.gms.ads.internal.util.zzs.zzJ(context2);
                if (z2) {
                    zZzd = this.zzh.zzd();
                } else {
                    zZzd = false;
                }
                if (this.zzi) {
                    fZza = this.zzh.zza();
                } else {
                    fZza = 0.0f;
                }
                zzfbo zzfboVar2 = this.zze;
                com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZze, zZzJ, zZzd, fZza, -1, z, zzfboVar2.zzO, zzfboVar2.zzP);
                if (zzcwgVar != null) {
                    zzcwgVar.zzf();
                }
                com.google.android.gms.ads.internal.zzv.zzj();
                zzdfr zzdfrVarZzh = zzdobVar.zzh();
                zzfbo zzfboVar3 = this.zze;
                VersionInfoParcel versionInfoParcel = this.zzd;
                int i = zzfboVar3.zzQ;
                String str = zzfboVar3.zzB;
                zzfbt zzfbtVar2 = zzfboVar3.zzs;
                String str2 = zzfbtVar2.zzb;
                String str3 = zzfbtVar2.zza;
                zzfcj zzfcjVar = this.zzc;
                com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdfrVarZzh, null, zzcexVar, i, versionInfoParcel, str, zzlVar, str2, str3, zzfcjVar.zzf, zzcwgVar, zzfboVar3.zzb() ? this.zzj : null, zzcexVar.zzr()), true, this.zzl);
            }
            zzcexVar2 = this.zzg;
            zzcexVar = zzcexVar2;
            zzcexVar.zzaq(true);
            if (this.zzi) {
                zZze = this.zzh.zze(false);
            } else {
                zZze = false;
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            Context context3 = this.zza;
            z2 = this.zzi;
            boolean zZzJ2 = com.google.android.gms.ads.internal.util.zzs.zzJ(context3);
            if (z2) {
                zZzd = this.zzh.zzd();
            } else {
                zZzd = false;
            }
            if (this.zzi) {
                fZza = this.zzh.zza();
            } else {
                fZza = 0.0f;
            }
            zzfbo zzfboVar4 = this.zze;
            com.google.android.gms.ads.internal.zzl zzlVar2 = new com.google.android.gms.ads.internal.zzl(zZze, zZzJ2, zZzd, fZza, -1, z, zzfboVar4.zzO, zzfboVar4.zzP);
            if (zzcwgVar != null) {
                zzcwgVar.zzf();
            }
            com.google.android.gms.ads.internal.zzv.zzj();
            zzdfr zzdfrVarZzh2 = zzdobVar.zzh();
            zzfbo zzfboVar5 = this.zze;
            VersionInfoParcel versionInfoParcel2 = this.zzd;
            int i2 = zzfboVar5.zzQ;
            String str4 = zzfboVar5.zzB;
            zzfbt zzfbtVar3 = zzfboVar5.zzs;
            String str5 = zzfbtVar3.zzb;
            String str6 = zzfbtVar3.zza;
            zzfcj zzfcjVar2 = this.zzc;
            if (zzfboVar5.zzb()) {
            }
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdfrVarZzh2, null, zzcexVar, i2, versionInfoParcel2, str4, zzlVar2, str5, str6, zzfcjVar2.zzf, zzcwgVar, zzfboVar5.zzb() ? this.zzj : null, zzcexVar.zzr()), true, this.zzl);
        } catch (zzcfj e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }
}

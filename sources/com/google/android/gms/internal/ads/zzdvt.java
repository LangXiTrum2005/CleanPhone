package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdvt implements zzddq, zzdby, zzdan, zzdbe, com.google.android.gms.ads.internal.client.zza, zzdgb {
    private final zzbfj zza;
    private boolean zzb = false;

    public zzdvt(zzbfj zzbfjVar, @Nullable zzffn zzffnVar) {
        this.zza = zzbfjVar;
        zzbfjVar.zzc(2);
        if (zzffnVar != null) {
            zzbfjVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(105);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdO(zzbza zzbzaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdP(final zzfic zzficVar) {
        this.zza.zzb(new zzbfi() { // from class: com.google.android.gms.internal.ads.zzdvs
            @Override // com.google.android.gms.internal.ads.zzbfi
            public final /* synthetic */ void zza(zzbfp.zzt.zza zzaVar) {
                zzbfp.zza.zzb zzbVarZzcc = zzaVar.zzY().zzcc();
                zzbfp.zzi.zza zzaVarZzcc = zzaVar.zzY().zzp().zzcc();
                zzaVarZzcc.zzd(zzficVar.zzb.zzb.zzb);
                zzbVarZzcc.zzr(zzaVarZzcc);
                zzaVar.zzaa(zzbVarZzcc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbe
    public final synchronized void zzdr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final void zzg() {
        this.zza.zzc(3);
    }

    @Override // com.google.android.gms.internal.ads.zzdgb
    public final void zzj(final zzbfp.zzb zzbVar) {
        zzbfi zzbfiVar = new zzbfi() { // from class: com.google.android.gms.internal.ads.zzdvp
            @Override // com.google.android.gms.internal.ads.zzbfi
            public final /* synthetic */ void zza(zzbfp.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbfj zzbfjVar = this.zza;
        zzbfjVar.zzb(zzbfiVar);
        zzbfjVar.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdgb
    public final void zzk(final zzbfp.zzb zzbVar) {
        zzbfi zzbfiVar = new zzbfi() { // from class: com.google.android.gms.internal.ads.zzdvq
            @Override // com.google.android.gms.internal.ads.zzbfi
            public final /* synthetic */ void zza(zzbfp.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbfj zzbfjVar = this.zza;
        zzbfjVar.zzb(zzbfiVar);
        zzbfjVar.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdgb
    public final void zzl(final zzbfp.zzb zzbVar) {
        zzbfi zzbfiVar = new zzbfi() { // from class: com.google.android.gms.internal.ads.zzdvr
            @Override // com.google.android.gms.internal.ads.zzbfi
            public final /* synthetic */ void zza(zzbfp.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbfj zzbfjVar = this.zza;
        zzbfjVar.zzb(zzbfiVar);
        zzbfjVar.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdgb
    public final void zzm(boolean z2) {
        this.zza.zzc(true != z2 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdgb
    public final void zzn(boolean z2) {
        this.zza.zzc(true != z2 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdgb
    public final void zzo() {
        this.zza.zzc(1109);
    }
}

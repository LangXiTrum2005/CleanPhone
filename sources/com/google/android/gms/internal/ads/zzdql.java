package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdql implements zzcyq, zzcxh, zzcvw, zzcwn, com.google.android.gms.ads.internal.client.zza, zzdbc {
    private final zzbbj zza;
    private boolean zzb = false;

    public zzdql(zzbbj zzbbjVar, @Nullable zzezj zzezjVar) {
        this.zza = zzbbjVar;
        zzbbjVar.zzc(2);
        if (zzezjVar != null) {
            zzbbjVar.zzc(1101);
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

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(final zzfca zzfcaVar) {
        this.zza.zzb(new zzbbi() { // from class: com.google.android.gms.internal.ads.zzdqh
            @Override // com.google.android.gms.internal.ads.zzbbi
            public final void zza(zzbbq.zzt.zza zzaVar) {
                zzbbq.zza.zzb zzbVarZzbM = zzaVar.zze().zzbM();
                zzbbq.zzi.zza zzaVarZzbM = zzaVar.zze().zzad().zzbM();
                zzaVarZzbM.zzo(zzfcaVar.zzb.zzb.zzb);
                zzbVarZzbM.zzT(zzaVarZzbM);
                zzaVar.zzG(zzbVarZzbM);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzh() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzi(final zzbbq.zzb zzbVar) {
        this.zza.zzb(new zzbbi() { // from class: com.google.android.gms.internal.ads.zzdqk
            @Override // com.google.android.gms.internal.ads.zzbbi
            public final void zza(zzbbq.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzj(final zzbbq.zzb zzbVar) {
        this.zza.zzb(new zzbbi() { // from class: com.google.android.gms.internal.ads.zzdqi
            @Override // com.google.android.gms.internal.ads.zzbbi
            public final void zza(zzbbq.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzl(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzm(final zzbbq.zzb zzbVar) {
        this.zza.zzb(new zzbbi() { // from class: com.google.android.gms.internal.ads.zzdqj
            @Override // com.google.android.gms.internal.ads.zzbbi
            public final void zza(zzbbq.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzn(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final synchronized void zzr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        this.zza.zzc(3);
    }
}

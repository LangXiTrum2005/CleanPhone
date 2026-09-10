package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbso {
    private final zzbrr zza;
    private ListenableFuture zzb;

    public zzbso(zzbrr zzbrrVar) {
        this.zza = zzbrrVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzcdt zzcdtVar = new zzcdt();
            this.zzb = zzcdtVar;
            this.zza.zzb(null).zze(new zzcdx() { // from class: com.google.android.gms.internal.ads.zzbsn
                @Override // com.google.android.gms.internal.ads.zzcdx
                public final /* synthetic */ void zza(Object obj) {
                    zzcdtVar.zzc((zzbrs) obj);
                }
            }, new zzcdv() { // from class: com.google.android.gms.internal.ads.zzbsk
                @Override // com.google.android.gms.internal.ads.zzcdv
                public final /* synthetic */ void zza() {
                    zzcdtVar.zzd(new zzbru("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbsr zza(String str, zzbry zzbryVar, zzbrx zzbrxVar) {
        zzd();
        return new zzbsr(this.zzb, "google.afma.activeView.handleUpdate", zzbryVar, zzbrxVar);
    }

    public final void zzb(final String str, final zzbnn zzbnnVar) {
        zzd();
        this.zzb = zzgym.zzj(this.zzb, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzbsl
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                zzbrs zzbrsVar = (zzbrs) obj;
                zzbrsVar.zzm(str, zzbnnVar);
                return zzgym.zza(zzbrsVar);
            }
        }, zzcdo.zzg);
    }

    public final void zzc(final String str, final zzbnn zzbnnVar) {
        this.zzb = zzgym.zzk(this.zzb, new zzgpr() { // from class: com.google.android.gms.internal.ads.zzbsm
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                zzbrs zzbrsVar = (zzbrs) obj;
                zzbrsVar.zzn(str, zzbnnVar);
                return zzbrsVar;
            }
        }, zzcdo.zzg);
    }
}

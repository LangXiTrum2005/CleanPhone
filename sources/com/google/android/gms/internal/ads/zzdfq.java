package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdfq implements zzddq {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbL)).intValue();
    private int zzb = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzol)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdO(zzbza zzbzaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final synchronized void zzdP(zzfic zzficVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbM)).booleanValue()) {
            try {
                zzfhu zzfhuVar = zzficVar.zzb.zzb;
                this.zza = zzfhuVar.zzc;
                this.zzb = zzfhuVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }
}

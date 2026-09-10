package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeof implements zzdbt {
    boolean zza;
    final /* synthetic */ zzejj zzb;
    final /* synthetic */ zzcdt zzc;

    public zzeof(zzeoi zzeoiVar, zzejj zzejjVar, zzcdt zzcdtVar) {
        this.zzb = zzejjVar;
        this.zzc = zzcdtVar;
        Objects.requireNonNull(zzeoiVar);
        this.zza = false;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i2 = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgt)).booleanValue()) {
            i2 = 3;
        }
        this.zzc.zzd(new zzejk(i2, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final synchronized void zza() {
        this.zzc.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final synchronized void zzb(int i2) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i2, zzeoi.zze(this.zzb.zza, i2), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final synchronized void zzc(int i2, String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzeoi.zze(this.zzb.zza, i2);
            }
            zze(new com.google.android.gms.ads.internal.client.zze(i2, str, AdError.UNDEFINED_DOMAIN, null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }
}

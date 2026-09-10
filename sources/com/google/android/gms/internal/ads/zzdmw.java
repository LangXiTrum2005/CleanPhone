package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdmw implements zzbck {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdnh zzb;

    public zzdmw(zzdnh zzdnhVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzdnhVar);
        this.zzb = zzdnhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbck
    public final void zzdj(zzbcj zzbcjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcn)).booleanValue()) {
            synchronized (this) {
                try {
                    if (zzbcjVar.zzj) {
                        zzdnh zzdnhVar = this.zzb;
                        if (zzdnhVar.zzaa() != null) {
                            zzdnhVar.zzab().put(this.zza, Boolean.TRUE);
                            if (zzdnhVar.zzaa() == null) {
                                return;
                            } else {
                                zzdnhVar.zzu(zzdnhVar.zzaa().zzdE(), zzdnhVar.zzaa().zzj(), zzdnhVar.zzaa().zzk(), true);
                            }
                        }
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zzbcjVar.zzj) {
            zzdnh zzdnhVar2 = this.zzb;
            if (zzdnhVar2.zzaa() != null) {
                zzdnhVar2.zzab().put(this.zza, Boolean.TRUE);
                if (zzdnhVar2.zzaa() == null) {
                    return;
                }
                zzdnhVar2.zzu(zzdnhVar2.zzaa().zzdE(), zzdnhVar2.zzaa().zzj(), zzdnhVar2.zzaa().zzk(), true);
            }
        }
    }
}

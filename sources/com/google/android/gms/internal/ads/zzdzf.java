package com.google.android.gms.internal.ads;

import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzdzf implements zzgyj {
    final /* synthetic */ zzdzp zza;

    public zzdzf(zzdzp zzdzpVar) {
        Objects.requireNonNull(zzdzpVar);
        this.zza = zzdzpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        synchronized (this) {
            zzdzp zzdzpVar = this.zza;
            zzdzpVar.zzn(true);
            zzdzpVar.zzm("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzdzpVar.zzo()));
            zzdzpVar.zzp().zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            zzdzp zzdzpVar = this.zza;
            zzdzpVar.zzn(true);
            zzdzpVar.zzm("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzdzpVar.zzo()));
            zzdzpVar.zzq().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdze
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzl(str);
                }
            });
        }
    }
}

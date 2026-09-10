package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzept implements zzere {
    final /* synthetic */ zzepu zza;

    public zzept(zzepu zzepuVar) {
        Objects.requireNonNull(zzepuVar);
        this.zza = zzepuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzere
    public final void zza() {
        zzepu zzepuVar = this.zza;
        synchronized (zzepuVar) {
            zzepuVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzere
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzepu zzepuVar = this.zza;
        zzctc zzctcVar = (zzctc) obj;
        synchronized (zzepuVar) {
            try {
                if (zzepuVar.zzM() != null) {
                    if (zzctcVar.zzo() != null && zzepuVar.zzM().zzo() != null) {
                        zzctcVar.zzo().zzb(zzepuVar.zzM().zzo().zza());
                    }
                    zzepuVar.zzM().zzd();
                }
                zzepuVar.zzN(zzctcVar);
                zzepuVar.zzM().zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

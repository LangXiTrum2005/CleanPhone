package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeqz implements zzere {
    final /* synthetic */ zzera zza;

    public zzeqz(zzera zzeraVar) {
        Objects.requireNonNull(zzeraVar);
        this.zza = zzeraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzere
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzere
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcvk zzcvkVar = (zzcvk) obj;
        zzera zzeraVar = this.zza;
        synchronized (zzeraVar) {
            zzeraVar.zze(zzcvkVar.zzn());
            zzcvkVar.zzj();
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeqw implements zzere {
    final /* synthetic */ zzeqx zza;

    public zzeqw(zzeqx zzeqxVar) {
        Objects.requireNonNull(zzeqxVar);
        this.zza = zzeqxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzere
    public final void zza() {
        zzeqx zzeqxVar = this.zza;
        synchronized (zzeqxVar) {
            zzeqxVar.zzM(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzere
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeqx zzeqxVar = this.zza;
        zzdjs zzdjsVar = (zzdjs) obj;
        synchronized (zzeqxVar) {
            zzeqxVar.zzM(zzdjsVar);
            zzeqxVar.zzL().zzj();
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcej implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzceo zzc;

    public zzcej(zzceo zzceoVar, int i2, int i3) {
        this.zza = i2;
        this.zzb = i3;
        Objects.requireNonNull(zzceoVar);
        this.zzc = zzceoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzceo zzceoVar = this.zzc;
        if (zzceoVar.zzt() != null) {
            zzceoVar.zzt().zzj(this.zza, this.zzb);
        }
    }
}

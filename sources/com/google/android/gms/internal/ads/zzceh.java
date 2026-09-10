package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzceh implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzceo zzc;

    public zzceh(zzceo zzceoVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(zzceoVar);
        this.zzc = zzceoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzceo zzceoVar = this.zzc;
        if (zzceoVar.zzt() != null) {
            zzceoVar.zzt().zzf(this.zza, this.zzb);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcei implements Runnable {
    final /* synthetic */ zzceo zza;

    public zzcei(zzceo zzceoVar) {
        Objects.requireNonNull(zzceoVar);
        this.zza = zzceoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzceo zzceoVar = this.zza;
        if (zzceoVar.zzt() != null) {
            zzceoVar.zzt().zza();
        }
    }
}

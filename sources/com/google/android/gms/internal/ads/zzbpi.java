package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbpi implements Runnable {
    final /* synthetic */ zzbpl zza;

    public zzbpi(zzbpl zzbplVar) {
        Objects.requireNonNull(zzbplVar);
        this.zza = zzbplVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}

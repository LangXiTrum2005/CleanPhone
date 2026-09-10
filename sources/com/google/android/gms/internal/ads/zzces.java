package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzces implements Runnable {
    final /* synthetic */ zzcey zza;

    public zzces(zzcey zzceyVar) {
        Objects.requireNonNull(zzceyVar);
        this.zza = zzceyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceCreated", new String[0]);
    }
}

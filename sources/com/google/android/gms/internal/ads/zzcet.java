package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcet implements Runnable {
    final /* synthetic */ zzcey zza;

    public zzcet(zzcey zzceyVar) {
        Objects.requireNonNull(zzceyVar);
        this.zza = zzceyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceDestroyed", new String[0]);
    }
}

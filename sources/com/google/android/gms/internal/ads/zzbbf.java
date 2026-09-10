package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbbf implements Runnable {
    final /* synthetic */ zzbbg zza;

    public zzbbf(zzbbg zzbbgVar) {
        Objects.requireNonNull(zzbbgVar);
        this.zza = zzbbgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzben implements Runnable {
    final /* synthetic */ zzber zza;

    public zzben(zzber zzberVar) {
        Objects.requireNonNull(zzberVar);
        this.zza = zzberVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}

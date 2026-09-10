package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzaqv implements Runnable {
    final /* synthetic */ zzark zza;
    final /* synthetic */ zzaqw zzb;

    public zzaqv(zzaqw zzaqwVar, zzark zzarkVar) {
        this.zza = zzarkVar;
        Objects.requireNonNull(zzaqwVar);
        this.zzb = zzaqwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzb().put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}

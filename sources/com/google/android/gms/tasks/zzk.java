package com.google.android.gms.tasks;

import java.util.Objects;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class zzk implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzl zzb;

    public zzk(zzl zzlVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzlVar);
        this.zzb = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzl zzlVar = this.zzb;
        synchronized (zzlVar.zzc()) {
            try {
                if (zzlVar.zzd() != null) {
                    OnFailureListener onFailureListenerZzd = zzlVar.zzd();
                    Exception exception = this.zza.getException();
                    c0.h(exception);
                    onFailureListenerZzd.onFailure(exception);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

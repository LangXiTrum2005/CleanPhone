package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
final class zzfsa implements Runnable {
    final /* synthetic */ zzfsb zza;

    public zzfsa(zzfsb zzfsbVar) {
        Objects.requireNonNull(zzfsbVar);
        this.zza = zzfsbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfsb zzfsbVar = this.zza;
        AtomicBoolean atomicBooleanZzf = zzfsbVar.zzf();
        float fZzc = zzfsbVar.zzc();
        atomicBooleanZzf.set(false);
        if (((Float) zzfsbVar.zze().getAndSet(Float.valueOf(fZzc))).floatValue() != fZzc) {
            zzfsbVar.zzd().post(new zzfrz(this, fZzc));
        }
    }
}

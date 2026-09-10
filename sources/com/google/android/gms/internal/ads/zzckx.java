package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzckx extends Thread {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzcky zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzckx(zzcky zzckyVar, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.zza = runnable2;
        Objects.requireNonNull(zzckyVar);
        this.zzb = zzckyVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.zzb.zza());
        this.zza.run();
    }
}

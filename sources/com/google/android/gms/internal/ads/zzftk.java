package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzftk implements Runnable {
    final /* synthetic */ zzftp zza;

    public zzftk(zzftp zzftpVar) {
        Objects.requireNonNull(zzftpVar);
        this.zza = zzftpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzh().zzc();
    }
}

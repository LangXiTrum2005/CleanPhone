package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfqo implements Runnable {
    final /* synthetic */ zzfqy zza;

    public zzfqo(zzfqy zzfqyVar) {
        Objects.requireNonNull(zzfqyVar);
        this.zza = zzfqyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzt();
    }
}

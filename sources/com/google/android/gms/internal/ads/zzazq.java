package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzazq implements Runnable {
    final /* synthetic */ zzazt zza;

    public zzazq(zzazt zzaztVar) {
        Objects.requireNonNull(zzaztVar);
        this.zza = zzaztVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzr();
    }
}

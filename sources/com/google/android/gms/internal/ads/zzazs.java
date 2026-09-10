package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzazs implements Runnable {
    final /* synthetic */ zzazt zza;

    public zzazs(zzazt zzaztVar) {
        Objects.requireNonNull(zzaztVar);
        this.zza = zzaztVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbgk.zza(this.zza.zza);
    }
}

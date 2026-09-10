package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzazy implements Runnable {
    final /* synthetic */ zzbaa zza;

    public zzazy(zzbaa zzbaaVar) {
        Objects.requireNonNull(zzbaaVar);
        this.zza = zzbaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
    }
}

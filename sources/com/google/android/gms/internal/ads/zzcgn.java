package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcgn implements Runnable {
    final /* synthetic */ zzcgp zza;

    public zzcgn(zzcgp zzcgpVar) {
        Objects.requireNonNull(zzcgpVar);
        this.zza = zzcgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzB().zzd(this.zza);
    }
}

package com.google.android.gms.internal.ads;

import com.p004ironsource.ch;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzceu implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcey zzb;

    public zzceu(zzcey zzceyVar, boolean z2) {
        this.zza = z2;
        Objects.requireNonNull(zzceyVar);
        this.zzb = zzceyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{ch.k, String.valueOf(this.zza)});
    }
}

package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbdg implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbdk zzb;

    public zzbdg(zzbdk zzbdkVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzbdkVar);
        this.zzb = zzbdkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}

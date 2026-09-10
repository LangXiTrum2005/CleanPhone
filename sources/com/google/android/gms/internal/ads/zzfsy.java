package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfsy implements Runnable {
    final /* synthetic */ zzfsz zza;
    private final WebView zzb;

    public zzfsy(zzfsz zzfszVar) {
        Objects.requireNonNull(zzfszVar);
        this.zza = zzfszVar;
        this.zzb = zzfszVar.zzq();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}

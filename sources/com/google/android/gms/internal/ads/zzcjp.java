package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcjp implements Runnable {
    final /* synthetic */ zzcju zza;

    public zzcjp(zzcju zzcjuVar) {
        Objects.requireNonNull(zzcjuVar);
        this.zza = zzcjuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}

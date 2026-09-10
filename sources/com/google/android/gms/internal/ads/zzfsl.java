package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfsl implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    public zzfsl(zzfsm zzfsmVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
        Objects.requireNonNull(zzfsmVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfsm.zzk(this.zza, this.zzb);
    }
}

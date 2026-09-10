package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbdi implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzbda zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbdk zze;

    public zzbdi(zzbdk zzbdkVar, final zzbda zzbdaVar, final WebView webView, final boolean z2) {
        this.zzb = zzbdaVar;
        this.zzc = webView;
        this.zzd = z2;
        Objects.requireNonNull(zzbdkVar);
        this.zze = zzbdkVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbdh
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Object obj) {
                this.zza.zze.zzd(zzbdaVar, webView, (String) obj, z2);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfsx extends WebViewClient {
    final /* synthetic */ zzfsz zza;

    public zzfsx(zzfsz zzfszVar) {
        Objects.requireNonNull(zzfszVar);
        this.zza = zzfszVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String string = renderProcessGoneDetail.toString();
        String strValueOf = String.valueOf(webView);
        Log.w("NativeBridge", androidx.media3.extractor.text.ttml.a.q(new StringBuilder(String.valueOf(string).length() + 36 + strValueOf.length()), "WebView renderer gone: ", string, "for WebView: ", strValueOf));
        zzfsz zzfszVar = this.zza;
        if (zzfszVar.zzd() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            zzfszVar.zzc(null);
        }
        webView.destroy();
        return true;
    }
}

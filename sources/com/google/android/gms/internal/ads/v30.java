package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class v30 extends g30 {
    public v30(b30 b30Var, pj pjVar, boolean z10, zl0 zl0Var) {
        super(b30Var, pjVar, z10, new nv(b30Var, b30Var.d(), new sl(b30Var.getContext())), zl0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        String string = webResourceRequest.getUrl().toString();
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (!(webView instanceof b30)) {
            int i10 = zze.zza;
            zzo.zzi("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        b30 b30Var = (b30) webView;
        bz bzVar = this.f14717y;
        if (bzVar != null) {
            ((zy) bzVar).b(1, string, requestHeaders);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(string).getName())) {
            if (requestHeaders == null) {
                requestHeaders = Collections.EMPTY_MAP;
            }
            return k(string, requestHeaders);
        }
        if (b30Var.zzP() != null) {
            g30 g30VarZzP = b30Var.zzP();
            synchronized (g30VarZzP.f14697d) {
                g30VarZzP.l = false;
                g30VarZzP.f14709q = true;
                l00.f16613f.execute(new d(g30VarZzP, 23));
            }
        }
        if (b30Var.zzN().b()) {
            str = (String) zzba.zzc().a(am.G0);
        } else if (b30Var.i()) {
            str = (String) zzba.zzc().a(am.F0);
        } else {
            str = (String) zzba.zzc().a(am.E0);
        }
        zzt.zzc();
        return zzs.zzz(b30Var.getContext(), b30Var.zzs().afmaVersion, str);
    }
}

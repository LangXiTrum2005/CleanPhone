package com.google.android.gms.internal.ads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public final class zzckg extends zzckf {
    public zzckg(zzcir zzcirVar, zzbfj zzbfjVar, boolean z2, zzeif zzeifVar) {
        super(zzcirVar, zzbfjVar, z2, zzeifVar);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zza.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}

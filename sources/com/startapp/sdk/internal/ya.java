package com.startapp.sdk.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class ya extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za f41705a;

    public ya(za zaVar) {
        this.f41705a = zaVar;
    }

    @Override // com.startapp.sdk.internal.y0
    public final boolean a(String str) {
        return !this.f41705a.D && str.contains("index=");
    }

    @Override // com.startapp.sdk.internal.y0
    public final boolean b(WebView webView, String str) {
        za zaVar = this.f41705a;
        zaVar.getClass();
        if (vi.c(webView.getContext(), str)) {
            return true;
        }
        if (!zaVar.f41767A) {
            g9 g9Var = new g9(h9.f41040e);
            g9Var.d = "fake_click";
            g9Var.g = zaVar.a();
            g9Var.f41002e = "jsTag=" + zaVar.D;
            g9Var.a();
        }
        if (!zaVar.D || zaVar.f41767A) {
            return zaVar.a(str, false);
        }
        return false;
    }

    @Override // com.startapp.sdk.internal.y0
    public final void a(WebView webView, String str) {
        za zaVar = this.f41705a;
        vi.a(zaVar.v, true, "gClientInterface.onPageFinished", Boolean.FALSE);
        vi.a(zaVar.v, true, "gClientInterface.setMode", zaVar.g);
        vi.a(zaVar.v, true, "enableScheme", "externalLinks");
        zaVar.q();
    }
}

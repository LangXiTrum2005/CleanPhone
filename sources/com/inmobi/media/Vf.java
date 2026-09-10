package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N9 f24063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3187q2 f24064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public uf f24065c;

    public vf(N9 mNetworkRequest, C3187q2 mWebViewClient) {
        Intrinsics.f(mNetworkRequest, "mNetworkRequest");
        Intrinsics.f(mWebViewClient, "mWebViewClient");
        this.f24063a = mNetworkRequest;
        this.f24064b = mWebViewClient;
    }

    public final void a() {
        try {
            Context contextD = Uc.d();
            if (contextD != null) {
                uf ufVar = new uf(contextD);
                ufVar.setWebViewClient(this.f24064b);
                ufVar.getSettings().setJavaScriptEnabled(true);
                ufVar.getSettings().setCacheMode(2);
                this.f24065c = ufVar;
            }
            uf ufVar2 = this.f24065c;
            if (ufVar2 != null) {
                String strD = this.f24063a.d();
                N9 n9 = this.f24063a;
                boolean z2 = T9.f23231a;
                T9.a(n9.f23010i);
                ufVar2.loadUrl(strD, n9.f23010i);
            }
        } catch (Exception unused) {
        }
    }
}

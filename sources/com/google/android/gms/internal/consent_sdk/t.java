package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends WebView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f23197d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f23198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f23199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23200c;

    public t(u uVar, Handler handler, w wVar) {
        super(uVar);
        this.f23200c = false;
        this.f23198a = handler;
        this.f23199b = wVar;
    }

    public final void a(String str, String str2) {
        this.f23198a.post(new n(1, this, q4.a.i(str, "(", str2, ");")));
    }
}

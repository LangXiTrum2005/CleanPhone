package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fm f18405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f18406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oz0 f18407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f18408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zy0 f18409e;

    /* JADX WARN: Multi-variable type inference failed */
    public oy0(fm fmVar, WebView webView) {
        HashMap map = new HashMap();
        this.f18408d = map;
        this.f18409e = new zy0();
        if (!pi1.L.f17679b) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        this.f18405a = fmVar;
        this.f18406b = webView;
        oz0 oz0Var = this.f18407c;
        if ((oz0Var == null ? null : (View) oz0Var.get()) != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((ky0) it.next()).b(webView);
            }
            this.f18407c = new oz0(webView);
        }
        if (!a.a.x("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        r4.g.d(this.f18406b, "omidJsSessionService");
        r4.g.a(this.f18406b, "omidJsSessionService", new HashSet(Arrays.asList("*")), new at0(this, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        py0 py0Var = py0.JAVASCRIPT;
        ky0 ky0Var = new ky0(m01.a(ly0.DEFINED_BY_JAVASCRIPT, ny0.DEFINED_BY_JAVASCRIPT, py0Var, py0Var, false), new a8(this.f18405a, this.f18406b, null, null, jy0.HTML), str);
        this.f18408d.put(str, ky0Var);
        oz0 oz0Var = this.f18407c;
        ky0Var.b(oz0Var == null ? null : (View) oz0Var.get());
        for (yy0 yy0Var : this.f18409e.f22774a) {
            View view = (View) yy0Var.f22409a.get();
            my0 my0Var = yy0Var.f22411c;
            if (!ky0Var.f16562f) {
                ky0Var.f16558b.a(view, my0Var);
            }
        }
        ky0Var.a();
    }
}

package com.smartdigimkt.g6;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.smartdigimkt.sdk.basead.webtemplet.WTWebView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class g implements com.smartdigimkt.h6.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Pattern f35481b;
    protected Context d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected WTWebView f35483e;
    protected Handler f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35480a = com.smartdigimkt.y4.g.f40227p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f35482c = 1;

    public class a implements Runnable {
        final /* synthetic */ e X;

        public a(e eVar) {
            this.X = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = this.X;
                Object obj = eVar.f35473c;
                com.smartdigimkt.l6.a.f fVar = eVar.d;
                if (fVar == null || obj == null) {
                    return;
                }
                fVar.a(obj, eVar, TextUtils.isEmpty(eVar.g) ? JsonUtils.EMPTY_JSON : this.X.g);
            } catch (Throwable unused) {
            }
        }
    }

    public g(WTWebView wTWebView) {
        this.d = wTWebView != null ? wTWebView.getContext().getApplicationContext() : com.smartdigimkt.m6.b.p().k();
        this.f35483e = wTWebView;
    }

    @Override // com.smartdigimkt.h6.c
    public WebView a() {
        return this.f35483e;
    }

    @Override // com.smartdigimkt.h6.c
    public e b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = this.f35481b.matcher(str);
        if (matcher.matches()) {
            e eVar = new e();
            int iGroupCount = matcher.groupCount();
            if (iGroupCount >= 5) {
                eVar.g = matcher.group(5);
            }
            if (iGroupCount >= 3) {
                eVar.f35474e = matcher.group(1);
                eVar.f35475h = matcher.group(2);
                eVar.f = matcher.group(3);
                eVar.f35472b = this.f35483e;
                return eVar;
            }
        }
        return null;
    }

    @Override // com.smartdigimkt.h6.c
    public boolean c(String str) {
        if (!h.h(str)) {
            return false;
        }
        a(h.e(str));
        return true;
    }

    @Override // com.smartdigimkt.h6.c
    public void a(WTWebView wTWebView) {
        this.f35483e = wTWebView;
    }

    @Override // com.smartdigimkt.h6.c
    public void a(String str) {
        e eVarB;
        if (TextUtils.isEmpty(str) || (eVarB = b(str)) == null) {
            return;
        }
        eVarB.a();
        b(eVarB);
    }

    @Override // com.smartdigimkt.h6.c
    public void a(Pattern pattern) {
        this.f35481b = pattern;
    }

    private void a(e eVar) {
        com.smartdigimkt.l7.b.a().e(new a(eVar));
    }

    public void b(e eVar) {
        WTWebView wTWebView = eVar.f35472b;
        Object jsObject = wTWebView == null ? null : wTWebView.getJsObject(eVar.f35474e);
        if (jsObject == null) {
            return;
        }
        try {
            com.smartdigimkt.l6.a.f fVarA = com.smartdigimkt.l6.a.a(this.d.getClassLoader(), jsObject.getClass().getName()).a(eVar.f, Object.class, String.class);
            fVarA.a();
            if (jsObject instanceof d) {
                eVar.d = fVarA;
                eVar.f35473c = jsObject;
                a(eVar);
            }
        } catch (Throwable unused) {
        }
    }
}

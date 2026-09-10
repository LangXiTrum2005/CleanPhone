package com.smartdigimkt.k5;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.sdk.api.business.omsdk.IOmsdkHandler;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile e f36214b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOmsdkHandler f36215a;

    private e() {
    }

    public static e a() {
        if (f36214b == null) {
            synchronized (e.class) {
                try {
                    if (f36214b == null) {
                        f36214b = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36214b;
    }

    public boolean b(f fVar, com.smartdigimkt.v6.a aVar) {
        return c() && !TextUtils.isEmpty(fVar.S()) && a(fVar, aVar);
    }

    public boolean c() {
        IOmsdkHandler iOmsdkHandler = this.f36215a;
        if (iOmsdkHandler != null) {
            return iOmsdkHandler.supportOmsdk();
        }
        return false;
    }

    public String b() {
        if (c()) {
            return this.f36215a.getOmsdkVersion();
        }
        return "";
    }

    public void a(IOmsdkHandler iOmsdkHandler) {
        this.f36215a = iOmsdkHandler;
    }

    public String a(String str, f fVar, com.smartdigimkt.v6.a aVar) {
        return (c() && a(fVar, aVar)) ? this.f36215a.injectScriptContentIntoHtml(str, fVar, aVar) : str;
    }

    public b a(Context context, boolean z2, f fVar, com.smartdigimkt.v6.a aVar) {
        if (c()) {
            return this.f36215a.createNativeAdSession(context, z2, fVar, aVar);
        }
        return null;
    }

    public b a(Context context, WebView webView, f fVar, com.smartdigimkt.v6.a aVar) {
        if (c()) {
            return this.f36215a.createWebViewAdSession(context, webView, fVar, aVar);
        }
        return null;
    }

    private boolean a(f fVar, com.smartdigimkt.v6.a aVar) {
        return !i.g(fVar, aVar) && fVar.v0();
    }
}

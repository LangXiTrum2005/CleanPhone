package com.smartdigimkt.g6;

import com.smartdigimkt.sdk.basead.webtemplet.WTWebView;
import com.smartdigimkt.sdk.basead.webtemplet.adformat.WTCommonJSBridgePlugin;
import com.smartdigimkt.sdk.basead.webtemplet.adformat.intestitial.WTScreenJSBridgePlugin;
import com.smartdigimkt.sdk.basead.webtemplet.adformat.splash.WTSplashJSBridgePlugin;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashMap<String, Class> f35477c = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f35478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WTWebView f35479b;

    public f(WTWebView wTWebView) {
        this.f35479b = wTWebView;
        a();
    }

    public void a(Object obj) {
        this.f35478a = obj;
    }

    public void b(String str) {
        if (f35477c == null) {
            f35477c = new HashMap<>();
        }
        f35477c.remove(str);
    }

    private Object a(String str, WTWebView wTWebView) {
        Class cls = f35477c.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!d.class.isAssignableFrom(cls)) {
                return null;
            }
            d dVar = (d) cls.newInstance();
            dVar.initialize(wTWebView);
            return dVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void a(String str, Class cls) {
        if (f35477c == null) {
            f35477c = new HashMap<>();
        }
        f35477c.put(str, cls);
    }

    public Object a(String str) {
        if (f35477c == null) {
            f35477c = new HashMap<>();
        }
        return a(str, this.f35479b);
    }

    public void a() {
        try {
            a("common", WTCommonJSBridgePlugin.class);
            a("splash", WTSplashJSBridgePlugin.class);
            a(com.smartdigimkt.m6.a.r.r, WTScreenJSBridgePlugin.class);
            a("reward", WTScreenJSBridgePlugin.class);
        } catch (ClassNotFoundException unused) {
        }
    }
}

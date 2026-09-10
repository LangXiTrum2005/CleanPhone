package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import b2.o;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static String f32076d = "UserAgentProvider";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile e f32077e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f32078a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f32079b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicBoolean f32080c = new AtomicBoolean(false);

    private e() {
    }

    private String c() {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        String str3 = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
        }
        StringBuilder sbV = defpackage.e.v("Mozilla/5.0 (Linux; Android ", str, "; ", str2, " Build/");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return defpackage.e.q(str3, ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19", sbV);
    }

    public static e d() {
        if (f32077e == null) {
            synchronized (e.class) {
                try {
                    if (f32077e == null) {
                        f32077e = new e();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f32077e;
    }

    private String f() {
        try {
            return WebSettings.getDefaultUserAgent(com.mbridge.msdk.foundation.controller.c.n().d());
        } catch (Throwable th2) {
            q0.b(f32076d, th2.getMessage(), th2);
            return "";
        }
    }

    public String e() {
        if (TextUtils.isEmpty(this.f32078a) && TextUtils.isEmpty(this.f32079b)) {
            return c();
        }
        if (TextUtils.isEmpty(this.f32078a)) {
            return TextUtils.isEmpty(this.f32079b) ? "" : this.f32079b;
        }
        return this.f32078a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        this.f32078a = f();
        b();
        if (!TextUtils.isEmpty(this.f32078a)) {
            a(this.f32078a);
        }
        if (TextUtils.isEmpty(this.f32078a)) {
            this.f32078a = c();
            a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        if (aVar != null) {
            HashMap map = new HashMap();
            map.put("userAgent", this.f32078a);
            aVar.a(map);
        }
        this.f32080c.set(true);
    }

    public void a(com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new o(20, this, aVar));
        } catch (Throwable th2) {
            q0.b(f32076d, th2.getMessage(), th2);
        }
    }

    public String a() {
        try {
            String strF = f();
            this.f32078a = strF;
            if (!TextUtils.isEmpty(strF)) {
                a(this.f32078a);
            } else {
                b();
            }
            if (TextUtils.isEmpty(this.f32078a)) {
                this.f32078a = c();
            }
            this.f32080c.set(true);
        } catch (Throwable th2) {
            q0.b(f32076d, th2.getMessage(), th2);
        }
        return c();
    }

    private void a(Context context) {
        if (TextUtils.isEmpty(this.f32078a)) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new o(21, this, context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context) {
        try {
            this.f32078a = new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th2) {
            q0.b(f32076d, th2.getMessage(), th2);
        }
        if (TextUtils.isEmpty(this.f32078a)) {
            this.f32078a = c();
        } else {
            a(this.f32078a);
        }
    }

    private void a(String str) {
        Context contextD;
        if (TextUtils.isEmpty(str) || (contextD = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(contextD).b("userAgent", str);
    }

    private void b() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        this.f32079b = com.mbridge.msdk.config.component.common.util.b.a(contextD).a("userAgent", c());
    }
}

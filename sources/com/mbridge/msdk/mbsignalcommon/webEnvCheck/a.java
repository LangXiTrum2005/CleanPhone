package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f34888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f34889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f34890c;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class RunnableC0153a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f34891a;

        public RunnableC0153a(Context context) {
            this.f34891a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.f34888a == null) {
                try {
                    Boolean unused = a.f34888a = Boolean.valueOf(a.a(this.f34891a));
                } catch (Exception unused2) {
                    Boolean unused3 = a.f34888a = Boolean.FALSE;
                }
            }
        }
    }

    public static boolean b(Context context) {
        g gVarD;
        try {
            gVarD = i.b().d(c.n().b());
        } catch (Exception unused) {
            gVarD = null;
        }
        if (gVarD != null) {
            f34890c = Boolean.valueOf(gVarD.I0());
        } else {
            f34890c = Boolean.FALSE;
        }
        Boolean bool = f34890c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f34888a == null) {
                try {
                    f34888a = Boolean.valueOf(a(context));
                } catch (Exception unused2) {
                    f34888a = Boolean.FALSE;
                }
            }
            if (f34888a == null) {
                f34888a = new Boolean(false);
            }
            return f34888a.booleanValue();
        }
        if (f34888a == null && f34889b == null) {
            f34889b = new Handler(Looper.getMainLooper());
            f34889b.post(new RunnableC0153a(context));
        }
        if (f34888a == null) {
            return true;
        }
        return f34888a.booleanValue();
    }

    public static boolean a(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView == null) {
            return false;
        }
        a(webView);
        return true;
    }

    private static void a(WebView webView) {
        try {
            webView.destroy();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBWebViewChecker", "destroy webview error", e10);
            }
        }
    }
}

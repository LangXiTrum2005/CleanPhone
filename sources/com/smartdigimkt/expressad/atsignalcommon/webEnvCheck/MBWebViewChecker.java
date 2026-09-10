package com.smartdigimkt.expressad.atsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.smartdigimkt.u4.b;

/* JADX INFO: loaded from: classes5.dex */
public final class MBWebViewChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f34695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f34696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f34697c;

    /* JADX INFO: renamed from: com.smartdigimkt.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ Context X;

        public AnonymousClass1(Context context) {
            this.X = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBWebViewChecker.f34695a == null) {
                try {
                    Boolean unused = MBWebViewChecker.f34695a = Boolean.valueOf(MBWebViewChecker.b(this.X));
                } catch (Exception unused2) {
                    Boolean unused3 = MBWebViewChecker.f34695a = Boolean.FALSE;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context) {
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

    public static boolean isWebViewAvailable(Context context) {
        f34697c = Boolean.FALSE;
        return true;
    }

    private static void a(WebView webView) {
        try {
            webView.destroy();
        } catch (Exception unused) {
        }
    }
}

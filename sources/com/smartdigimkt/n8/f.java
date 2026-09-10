package com.smartdigimkt.n8;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.p004ironsource.d9;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f37183a = "CommonSDKUtil";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f37184a = "com.android.vending";
    }

    public static String a() {
        return TextUtils.isEmpty("UA_6.5.45") ? "UA_0.0.0" : "UA_6.5.45";
    }

    public static boolean b() {
        try {
            return com.smartdigimkt.m6.b.p().e();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c(Context context) {
        return q.a().b(context);
    }

    public static String b(com.smartdigimkt.w6.f fVar) {
        return fVar instanceof com.smartdigimkt.w6.l ? ((com.smartdigimkt.w6.l) fVar).I0() : "";
    }

    public static boolean c() {
        return q.a().b();
    }

    public static void a(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.removeJavascriptInterface("searchBoxjavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowFileAccessFromFileURLs(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.getSettings().setSavePassword(false);
    }

    public static boolean b(Context context) {
        return q.a().a(context);
    }

    public static String a(com.smartdigimkt.w6.f fVar) {
        String packageName;
        com.smartdigimkt.w6.g gVarI;
        String str = fVar.X() + fVar.L();
        if ((fVar instanceof com.smartdigimkt.w6.l) && (gVarI = fVar.i()) != null) {
            if (gVarI.l() != 2) {
                str = b(fVar) + fVar.X() + fVar.L();
            } else {
                str = b(fVar) + fVar.X();
            }
        }
        if (com.smartdigimkt.m6.b.p().k() != null) {
            packageName = com.smartdigimkt.m6.b.p().k().getPackageName();
        } else {
            packageName = "";
        }
        return e.b(str + packageName);
    }

    public static double a(com.smartdigimkt.l8.f fVar) {
        if (fVar != null) {
            return fVar.R0();
        }
        return 0.0d;
    }

    public static String a(Context context) {
        String strT = com.smartdigimkt.m6.b.p().t();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(c.a(context));
        stringBuffer.append(d9.i.f24749c);
        stringBuffer.append(c.y());
        stringBuffer.append(d9.i.f24749c);
        stringBuffer.append(strT);
        stringBuffer.append(d9.i.f24749c);
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append(d9.i.f24749c);
        stringBuffer.append(new Random().nextInt(10000));
        return e.b(stringBuffer.toString());
    }

    public static String a(String str) {
        str.getClass();
        switch (str) {
            case "0":
                return "Native";
            case "1":
                return "RewardedVideo";
            case "2":
                return "Banner";
            case "3":
                return "Interstitial";
            case "4":
                return "Splash";
            default:
                return "";
        }
    }
}

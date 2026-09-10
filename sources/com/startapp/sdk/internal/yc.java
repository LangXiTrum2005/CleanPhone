package com.startapp.sdk.internal;

import android.content.Context;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class yc {
    public static void a(Context context, WebView webView, zc zcVar) {
        if (zcVar == null) {
            zcVar = new zc(context);
        }
        vi.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.CALENDAR", Boolean.valueOf(zcVar.f41780b.contains("calendar") && q0.a(zcVar.f41779a, "android.permission.WRITE_CALENDAR")));
        vi.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.INLINEVIDEO", Boolean.valueOf(zcVar.f41780b.contains("inlineVideo")));
        vi.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.SMS", Boolean.valueOf(zcVar.f41780b.contains("sms") && q0.a(zcVar.f41779a, "android.permission.SEND_SMS")));
        vi.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.STOREPICTURE", Boolean.valueOf(zcVar.f41780b.contains("storePicture")));
        vi.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.TEL", Boolean.valueOf(zcVar.f41780b.contains("tel") && q0.a(zcVar.f41779a, "android.permission.CALL_PHONE")));
    }
}

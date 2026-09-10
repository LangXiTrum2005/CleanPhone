package com.smartdigimkt.g5;

import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.ads.AdError;
import com.p004ironsource.d9;
import com.smartdigimkt.sdk.basead.express.web.BaseWebView;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f35448a = "FormatViewCallJS";

    public static void a(WebView webView) {
        f.a().a(webView);
    }

    public static void a(WebView webView, float f, float f2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startX", f);
            jSONObject.put("startY", f2);
            jSONObject.put("scale", com.smartdigimkt.n8.h.b(com.smartdigimkt.m6.b.p().k()));
            f.a().a(webView, "webviewshow", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable unused) {
        }
    }

    public static void a(WebView webView, int i2, int i3) {
        try {
            com.smartdigimkt.s4.a.a().c(webView, i2, i3);
        } catch (Throwable unused) {
        }
    }

    public static void a(BaseWebView baseWebView, boolean z2) {
        try {
            com.smartdigimkt.s4.a.a().c(baseWebView, z2 ? com.p004ironsource.mediationsdk.metadata.a.g : "false");
        } catch (Throwable unused) {
        }
    }

    public static void a(WebView webView, int i2, int i3, int i4, int i5) {
        String str;
        try {
            int i6 = com.smartdigimkt.m6.b.p().k().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i6 == 2) {
                str = d9.h.C;
            } else {
                str = i6 == 1 ? d9.h.D : AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", com.p004ironsource.mediationsdk.metadata.a.g);
            float fD = com.smartdigimkt.n8.h.d(com.smartdigimkt.m6.b.p().k());
            float fC = com.smartdigimkt.n8.h.c(com.smartdigimkt.m6.b.p().k());
            HashMap mapE = com.smartdigimkt.n8.h.e(com.smartdigimkt.m6.b.p().k());
            int iIntValue = ((Integer) mapE.get("width")).intValue();
            int iIntValue2 = ((Integer) mapE.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "inline");
            map.put("state", "default");
            map.put("viewable", com.p004ironsource.mediationsdk.metadata.a.g);
            map.put("currentAppOrientation", jSONObject);
            float f = i2;
            float f2 = i3;
            float f3 = i4;
            float f4 = i5;
            com.smartdigimkt.s4.a.a().b(webView, f, f2, f3, f4);
            com.smartdigimkt.s4.a.a().a(webView, f, f2, f3, f4);
            com.smartdigimkt.s4.a.a().b(webView, fD, fC);
            com.smartdigimkt.s4.a.a().a(webView, iIntValue, iIntValue2);
            com.smartdigimkt.s4.a.a().a(webView, map);
            com.smartdigimkt.s4.a.a().a(webView);
        } catch (Throwable unused) {
        }
    }
}

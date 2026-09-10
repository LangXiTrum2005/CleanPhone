package com.smartdigimkt.y0;

import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.ads.AdError;
import com.p004ironsource.d9;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.n.h;
import com.smartdigimkt.v0.n;
import com.smartdigimkt.v0.v;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f40014a = "BannerCallJS";

    public static void a(WebView webView) {
        h.a().a(webView);
    }

    public static void b(WebView webView) {
        h.a().a(webView);
    }

    public static void a(WebView webView, float f, float f2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startX", f);
            jSONObject.put("startY", f2);
            jSONObject.put("scale", v.d(com.smartdigimkt.m6.b.p().k()));
            h.a().a(webView, "webviewshow", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable unused) {
        }
    }

    public static void a(WebView webView, int i2, int i3) {
        try {
            com.smartdigimkt.s4.a.a().c(webView, i2, i3);
        } catch (Throwable unused) {
        }
    }

    public static void a(WindVaneWebView windVaneWebView, boolean z2) {
        try {
            com.smartdigimkt.s4.a.a().c(windVaneWebView, z2 ? com.p004ironsource.mediationsdk.metadata.a.g : "false");
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
            float fG = n.g(com.smartdigimkt.m6.b.p().k());
            float f = n.f(com.smartdigimkt.m6.b.p().k());
            HashMap mapJ = n.j(com.smartdigimkt.m6.b.p().k());
            int iIntValue = ((Integer) mapJ.get("width")).intValue();
            int iIntValue2 = ((Integer) mapJ.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "inline");
            map.put("state", "default");
            map.put("viewable", com.p004ironsource.mediationsdk.metadata.a.g);
            map.put("currentAppOrientation", jSONObject);
            float f2 = i2;
            float f3 = i3;
            float f4 = i4;
            float f5 = i5;
            com.smartdigimkt.s4.a.a().b(webView, f2, f3, f4, f5);
            com.smartdigimkt.s4.a.a().a(webView, f2, f3, f4, f5);
            com.smartdigimkt.s4.a.a().b(webView, fG, f);
            com.smartdigimkt.s4.a.a().a(webView, iIntValue, iIntValue2);
            com.smartdigimkt.s4.a.a().a(webView, map);
            com.smartdigimkt.s4.a.a().a(webView);
        } catch (Throwable unused) {
        }
    }
}

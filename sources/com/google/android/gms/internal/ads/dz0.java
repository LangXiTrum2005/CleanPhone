package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.os.Build;
import android.webkit.WebView;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13770a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13772c = System.nanoTime();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13773d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public oz0 f13771b = new oz0(null);

    public dz0(String str) {
        this.f13770a = str;
    }

    public void b() {
        this.f13771b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView c() {
        return (WebView) this.f13771b.get();
    }

    public void d(ky0 ky0Var, a8 a8Var) {
        e(ky0Var, a8Var, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x006b  */
    public final void e(ky0 ky0Var, a8 a8Var, JSONObject jSONObject) {
        String str;
        String str2 = ky0Var.f16563g;
        JSONObject jSONObject2 = new JSONObject();
        hz0.b(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        hz0.b(jSONObject2, "adSessionType", (jy0) a8Var.f11931g);
        JSONObject jSONObject3 = new JSONObject();
        String str3 = Build.MANUFACTURER;
        String str4 = Build.MODEL;
        char c4 = 2;
        hz0.b(jSONObject3, "deviceType", q4.a.j(new StringBuilder(String.valueOf(str3).length() + 2 + String.valueOf(str4).length()), str3, "; ", str4));
        hz0.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        hz0.b(jSONObject3, O6.F, X3.f27645d);
        hz0.b(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = x10.A;
        if (uiModeManager == null) {
            c4 = 3;
        } else {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType != 1) {
                if (currentModeType != 4) {
                    c4 = 3;
                } else {
                    c4 = 1;
                }
            }
        }
        if (c4 == 1) {
            str = "ctv";
        } else if (c4 == 2) {
            str = "mobile";
        } else {
            if (c4 != 3) {
                throw null;
            }
            str = "other";
        }
        hz0.b(jSONObject2, "deviceCategory", str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        hz0.b(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        fm fmVar = (fm) a8Var.f11925a;
        hz0.b(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, fmVar.f14458a);
        hz0.b(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, fmVar.f14459b);
        hz0.b(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        hz0.b(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        hz0.b(jSONObject5, "appId", az0.f12552b.f12553a.getApplicationContext().getPackageName());
        hz0.b(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject5);
        String str5 = (String) a8Var.f11930f;
        if (str5 != null) {
            hz0.b(jSONObject2, "contentUrl", str5);
        }
        String str6 = (String) a8Var.f11929e;
        if (str6 != null) {
            hz0.b(jSONObject2, "customReferenceData", str6);
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = Collections.unmodifiableList((ArrayList) a8Var.f11927c).iterator();
        if (it.hasNext()) {
            throw com.google.android.gms.internal.measurement.f2.j(it);
        }
        s6.f19863g.w(c(), "startSession", str2, jSONObject2, jSONObject6, jSONObject);
    }

    public final void f(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        hz0.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        s6.f19863g.w(c(), "setLastActivity", jSONObject);
    }

    public void a() {
    }
}

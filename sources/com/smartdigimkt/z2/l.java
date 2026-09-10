package com.smartdigimkt.z2;

import android.util.Base64;
import android.webkit.WebView;
import com.smartdigimkt.expressad.video.module.AnythinkVideoView;
import com.smartdigimkt.v0.v;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class l extends e {
    private static final String o = "onVideoStatusNotify";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f40330p = "onJSClick";
    private static final String q = "onVideoProgressNotify";
    private static final String r = "webviewshow";
    private static final String s = "showDataInfo";
    private static final String t = "portrait";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f40331u = "landscape";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WebView f40332n;

    public l(WebView webView) {
        this.f40332n = webView;
    }

    @Override // com.smartdigimkt.z2.e, com.smartdigimkt.x2.g
    public void a() {
        super.a();
        com.smartdigimkt.n.h.a().a(this.f40332n);
    }

    @Override // com.smartdigimkt.z2.e, com.smartdigimkt.x2.g
    public void a(int i2) {
        super.a(i2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i2);
            com.smartdigimkt.n.h.a().a(this.f40332n, o, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.e, com.smartdigimkt.x2.g
    public void a(int i2, String str) {
        super.a(i2, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i2);
            jSONObject.put("pt", str);
            com.smartdigimkt.n.h.a().a(this.f40332n, f40330p, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.e, com.smartdigimkt.x2.g
    public void a(AnythinkVideoView.t tVar) {
        super.a(tVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", a(tVar.f34819a, tVar.f34820b));
            jSONObject.put("time", String.valueOf(tVar.f34819a));
            jSONObject.put("duration", String.valueOf(tVar.f34820b));
            com.smartdigimkt.n.h.a().a(this.f40332n, q, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private String a(int i2, int i3) {
        if (i3 != 0) {
            try {
                return v.a(Double.valueOf(i2 / i3)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return androidx.datastore.preferences.protobuf.a.f(i3, "");
    }

    @Override // com.smartdigimkt.z2.e, com.smartdigimkt.x2.g
    public void a(Object obj) {
        String strEncodeToString;
        super.a(obj);
        if (obj != null && (obj instanceof String)) {
            strEncodeToString = Base64.encodeToString(obj.toString().getBytes(), 2);
        } else {
            strEncodeToString = "";
        }
        com.smartdigimkt.n.h.a().a(this.f40332n, r, strEncodeToString);
    }

    @Override // com.smartdigimkt.z2.e, com.smartdigimkt.x2.g
    public void a(int i2, int i3, int i4, int i5) {
        super.a(i2, i3, i4, i5);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = "landscape";
            if (i2 != 2 ? i3 != 2 : i3 == 1) {
                str = "portrait";
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i4);
            jSONObject2.put("screen_height", i5);
            jSONObject.put("data", jSONObject2);
            com.smartdigimkt.n.h.a().a(this.f40332n, s, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        }
    }
}

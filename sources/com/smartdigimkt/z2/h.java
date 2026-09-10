package com.smartdigimkt.z2;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class h extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f40324i = "orientation";
    private static final String j = "onSystemPause";
    private static final String k = "onSystemResume";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f40325l = "onSystemDestory";
    private static final String m = "onSystemBackPressed";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f40326n = "portrait";
    private static final String o = "landscape";
    private WebView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f40327h = 0;

    public h(WebView webView) {
        this.g = webView;
    }

    @Override // com.smartdigimkt.z2.a, com.smartdigimkt.x2.a
    public void a(Configuration configuration) {
        super.a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            com.smartdigimkt.n.h.a().a(this.g, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.a, com.smartdigimkt.x2.a
    public void b() {
        super.b();
        com.smartdigimkt.n.h.a().a(this.g, "onSystemDestory", "");
    }

    @Override // com.smartdigimkt.z2.a, com.smartdigimkt.x2.a
    public void d() {
        super.d();
        this.f40327h = 0;
        com.smartdigimkt.n.h.a().a(this.g, "onSystemResume", "");
    }

    @Override // com.smartdigimkt.z2.a, com.smartdigimkt.x2.a
    public void e() {
        super.e();
        com.smartdigimkt.n.h.a().a(this.g, m, "");
    }

    @Override // com.smartdigimkt.z2.a, com.smartdigimkt.x2.a
    public void g() {
        super.g();
        this.f40327h = 1;
        com.smartdigimkt.n.h.a().a(this.g, "onSystemPause", "");
    }

    @Override // com.smartdigimkt.z2.a, com.smartdigimkt.x2.a
    public void a(int i2) {
        super.a(i2);
        this.f40327h = i2;
    }

    @Override // com.smartdigimkt.z2.a, com.smartdigimkt.x2.a
    public int a() {
        return this.f40327h;
    }
}

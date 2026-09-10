package com.smartdigimkt.expressad.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import com.p004ironsource.d9;
import com.smartdigimkt.n.h;
import com.smartdigimkt.x.d;
import com.smartdigimkt.z1.c;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkBTLayout extends BTBaseView {
    private static final String v0 = "portrait";
    private static final String w0 = "landscape";
    private WebView u0;

    public AnythinkBTLayout(Context context) {
        super(context);
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.u0 != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.s0);
                jSONObject2.put("id", getInstanceId());
                jSONObject2.put(d9.h.j0, str);
                jSONObject2.put("data", jSONObject);
                h.a().a(this.u0, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                c.c().a(this.u0, "broadcast", getInstanceId());
            }
        }
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
    }

    public void notifyEvent(String str) {
        WebView webView = this.u0;
        if (webView != null) {
            BTBaseView.a(webView, str, this.h0);
        }
    }

    public void onBackPressed() {
        if (this.u0 != null) {
            c.c().a(this.u0, "onSystemBackPressed", this.h0);
        }
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.u0 != null) {
            try {
                d dVar = this.f0;
                if (dVar == null || !dVar.H2()) {
                    JSONObject jSONObject = new JSONObject();
                    if (configuration.orientation == 2) {
                        jSONObject.put("orientation", "landscape");
                    } else {
                        jSONObject.put("orientation", "portrait");
                    }
                    jSONObject.put("instanceId", this.h0);
                    h.a().a(this.u0, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView
    public void onDestory() {
    }

    public void setWebView(WebView webView) {
        this.u0 = webView;
    }

    public AnythinkBTLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

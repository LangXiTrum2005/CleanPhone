package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.video.bt.component.d;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MBridgeBTLayout extends BTBaseView {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private WebView f37226p;

    public MBridgeBTLayout(Context context) {
        super(context);
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f37226p != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f37152n);
                jSONObject2.put("id", getInstanceId());
                jSONObject2.put(X3.i.f27798j0, str);
                jSONObject2.put("data", jSONObject);
                f.a().a(this.f37226p, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                d.c().a(this.f37226p, "broadcast", getInstanceId());
            }
        }
    }

    public WebView getBtWebView() {
        return this.f37226p;
    }

    public void notifyEvent(String str) {
        WebView webView = this.f37226p;
        if (webView != null) {
            BTBaseView.a(webView, str, this.f37157d);
        }
    }

    public void onBackPressed() {
        if (this.f37226p != null) {
            d.c().a(this.f37226p, "onSystemBackPressed", this.f37157d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f37226p != null) {
            try {
                CampaignEx campaignEx = this.f37155b;
                if (campaignEx == null || !campaignEx.isDynamicView()) {
                    JSONObject jSONObject = new JSONObject();
                    if (configuration.orientation == 2) {
                        jSONObject.put("orientation", X3.i.C);
                    } else {
                        jSONObject.put("orientation", X3.i.D);
                    }
                    jSONObject.put("instanceId", this.f37157d);
                    f.a().a(this.f37226p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void setWebView(WebView webView) {
        this.f37226p = webView;
    }

    public MBridgeBTLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
    }
}

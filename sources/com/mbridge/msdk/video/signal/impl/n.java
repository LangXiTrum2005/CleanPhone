package com.mbridge.msdk.video.signal.impl;

import android.util.Base64;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import d5.u;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class n extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f38178a;

    public n(WebView webView) {
        this.f38178a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(int i10) {
        super.a(i10);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i10);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f38178a, "onVideoStatusNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(int i10, String str) {
        super.a(i10, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i10);
            jSONObject.put("pt", str);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f38178a, "onJSClick", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(MBridgeVideoView.v vVar) {
        super.a(vVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, a(vVar.f37759a, vVar.f37760b));
            jSONObject.put("time", String.valueOf(vVar.f37759a));
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, String.valueOf(vVar.f37760b));
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f38178a, "onVideoProgressNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private String a(int i10, int i11) {
        if (i11 != 0) {
            try {
                return v0.a(Double.valueOf(i10 / i11)) + "";
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return u.f(i11, "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(Object obj) {
        String strEncodeToString;
        super.a(obj);
        if (obj != null && (obj instanceof String)) {
            strEncodeToString = Base64.encodeToString(obj.toString().getBytes(), 2);
        } else {
            strEncodeToString = "";
        }
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f38178a, "webviewshow", strEncodeToString);
    }

    @Override // com.mbridge.msdk.video.signal.impl.f, com.mbridge.msdk.video.signal.g
    public void a(int i10, int i11, int i12, int i13) {
        super.a(i10, i11, i12, i13);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = X3.i.C;
            if (i10 != 2 ? i11 != 2 : i11 == 1) {
                str = X3.i.D;
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i12);
            jSONObject2.put("screen_height", i13);
            jSONObject.put("data", jSONObject2);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f38178a, "showDataInfo", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}

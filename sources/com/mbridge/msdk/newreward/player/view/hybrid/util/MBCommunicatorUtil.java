package com.mbridge.msdk.newreward.player.view.hybrid.util;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.player.view.hybrid.MBWebView;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MBCommunicatorUtil {
    public static final String TAG = "MBCommunicatorUtil";

    public static void callException(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str2);
            jSONObject.put("data", new JSONObject());
            callSuccess(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage());
        }
    }

    public static void callFailure(WebView webView, String str, String str2) {
        String strB = TextUtils.isEmpty(str2) ? DM.B("javascript:window.WindVane.onFailure(", str, ",'');") : AbstractC5044xl.n("javascript:window.WindVane.onFailure(", str, ",'", MBHybridUtil.convert2Unicode(str2), "');");
        if (webView != null) {
            evaluateJavascript(webView, strB);
        }
    }

    public static void callSuccess(WebView webView, String str, String str2) {
        String strB = TextUtils.isEmpty(str2) ? DM.B("javascript:window.WindVane.onSuccess(", str, ",'');") : AbstractC5044xl.n("javascript:window.WindVane.onSuccess(", str, ",'", MBHybridUtil.convert2Unicode(str2), "');");
        if (webView != null) {
            evaluateJavascript(webView, strB);
        }
    }

    public static void evaluateJavascript(WebView webView, String str) {
        if (webView == null) {
            return;
        }
        try {
            if ((webView instanceof MBWebView) && ((MBWebView) webView).isDestroyed()) {
                return;
            }
            webView.evaluateJavascript(str, new ValueCallback<String>() { // from class: com.mbridge.msdk.newreward.player.view.hybrid.util.MBCommunicatorUtil.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str2) {
                }
            });
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage());
        }
    }

    public static void fireEvent(WebView webView, String str, String str2) {
        String strB = TextUtils.isEmpty(str2) ? DM.B("javascript:window.WindVane.fireEvent('", str, "', '');") : AbstractC5044xl.n("javascript:window.WindVane.fireEvent('", str, "','", MBHybridUtil.convert2Unicode(str2), "');");
        if (webView != null) {
            evaluateJavascript(webView, strB);
        }
    }

    public static void notifyClick(WebView webView, int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            jSONObject.put("pt", str);
            fireEvent(webView, "onJSClick", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage());
        }
    }

    public static void notifyNotchData(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str) || webView == null) {
                return;
            }
            fireEvent(webView, "oncutoutfetched", Base64.encodeToString(str.getBytes(), 2));
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage());
        }
    }

    public static void notifyShowDataInfo(WebView webView, int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = "landscape";
            if (i == 2) {
                jSONObject2.put(AdUnitActivity.EXTRA_ORIENTATION, i2 == 1 ? "portrait" : "landscape");
            } else {
                if (i2 != 2) {
                    str = "portrait";
                }
                jSONObject2.put(AdUnitActivity.EXTRA_ORIENTATION, str);
            }
            jSONObject2.put("screen_width", t0.k(webView.getContext()));
            jSONObject2.put("screen_height", t0.j(webView.getContext()));
            jSONObject.put("data", jSONObject2);
            fireEvent(webView, "showDataInfo", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage());
        }
    }

    public static void notifyVideoProgress(WebView webView, int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", (int) (i / i2));
            jSONObject.put("time", String.valueOf(i));
            jSONObject.put("duration", String.valueOf(i2));
            fireEvent(webView, "onVideoProgressNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage());
        }
    }

    public static void notifyVideoStatus(WebView webView, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, i);
            fireEvent(webView, "onVideoStatusNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage());
        }
    }

    public static void notifyWebViewShowed(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, str);
            fireEvent(webView, AdUnitActivity.EXTRA_ORIENTATION, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            o0.b(TAG, e.getMessage());
        }
        try {
            int[] iArr = new int[2];
            webView.getLocationOnScreen(iArr);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("startX", t0.b(webView.getContext(), iArr[0]));
            jSONObject2.put("startY", t0.b(webView.getContext(), iArr[1]));
            jSONObject2.put(a.l, t0.d(webView.getContext()));
            if (TextUtils.isEmpty(str2)) {
                JSONObject jSONObject3 = new JSONObject(str2);
                if (jSONObject3.length() > 0) {
                    Iterator<String> itKeys = jSONObject3.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObject3.get(next));
                    }
                }
            }
            fireEvent(webView, "webviewshow", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage());
        }
        MRAIDCommunicatorUtil.notifyMRAIDEnvironmentChange(webView, str);
    }
}

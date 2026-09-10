package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class SplashSignal extends AbsFeedBackForH5 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f35953h = "SplashSignal";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f35954i = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f35955g;

    public void getFileInfo(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c.a(obj, new JSONObject(str));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        if (obj != null) {
            try {
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().onReceivedError(windVaneWebView, 0, str.toString(), windVaneWebView.getUrl());
            } catch (Throwable th2) {
                q0.b(f35953h, "handlerH5Exception", th2);
            }
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            c.b(obj, new JSONObject(str));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void init(Object obj, String str) {
        f2.s(MobileAdsBridgeBase.initializeMethodName, str, f35953h);
        b bVar = this.f35955g;
        if (bVar != null) {
            bVar.init(obj, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof b)) {
                return;
            }
            this.f35955g = (b) windVaneWebView.getObject();
        } catch (Throwable th2) {
            q0.b(f35953h, MobileAdsBridgeBase.initializeMethodName, th2);
        }
    }

    public void install(Object obj, String str) {
        b bVar = this.f35955g;
        if (bVar != null) {
            bVar.install(obj, str);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            q0.b(f35953h, "onSignalCommunication");
            b bVar = this.f35955g;
            if (bVar != null) {
                bVar.c(obj, str);
            }
        } catch (Throwable th2) {
            q0.b(f35953h, "onSignalCommunication", th2);
        }
    }

    public void openURL(Object obj, String str) {
        f2.s("openURL", str, f35953h);
        b bVar = this.f35955g;
        if (bVar != null) {
            bVar.openURL(obj, str);
        }
    }

    public void pauseCountDown(Object obj, String str) {
        try {
            q0.b(f35953h, "pauseCountDown");
            b bVar = this.f35955g;
            if (bVar != null) {
                bVar.e(obj, str);
            }
        } catch (Throwable th2) {
            q0.b(f35953h, "pauseCountDown", th2);
        }
    }

    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().a(windVaneWebView, iOptInt);
            } catch (Throwable th2) {
                q0.b(f35953h, "readyStatus", th2);
            }
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            q0.b(f35953h, "reportUrls");
            b bVar = this.f35955g;
            if (bVar != null) {
                bVar.reportUrls(obj, str);
            }
        } catch (Throwable th2) {
            q0.b(f35953h, "reportUrls", th2);
        }
    }

    public void resetCountdown(Object obj, String str) {
        f2.s("resetCountdown", str, f35953h);
        b bVar = this.f35955g;
        if (bVar != null) {
            bVar.a(obj, str);
        }
    }

    public void resumeCountDown(Object obj, String str) {
        try {
            q0.b(f35953h, "resumeCountDown");
            b bVar = this.f35955g;
            if (bVar != null) {
                bVar.f(obj, str);
            }
        } catch (Throwable th2) {
            q0.b(f35953h, "resumeCountDown", th2);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            q0.b(f35953h, "sendImpressions");
            b bVar = this.f35955g;
            if (bVar != null) {
                bVar.d(obj, str);
            }
        } catch (Throwable th2) {
            q0.b(f35953h, "sendImpressions", th2);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        f2.s("toggleCloseBtn", str, f35953h);
        b bVar = this.f35955g;
        if (bVar != null) {
            bVar.toggleCloseBtn(obj, str);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        f2.s("triggerCloseBtn", str, f35953h);
        b bVar = this.f35955g;
        if (bVar != null) {
            bVar.triggerCloseBtn(obj, str);
        }
    }
}

package com.smartdigimkt.expressad.atsignalcommon.bridge;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJsUtils;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.n.h;
import com.smartdigimkt.o8.c;
import com.smartdigimkt.v0.n;
import com.smartdigimkt.v0.v;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CommonBannerJSBridgeImp implements IBannerJSBridge {
    public static final String X = "CommonBannerJSBridgeImp";

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void cai(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                String strOptString = new JSONObject(str).optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                if (TextUtils.isEmpty(strOptString)) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, "packageName is empty");
                }
                int i2 = v.a(b.p().k(), strOptString) ? 1 : 2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", CommonJSBridgeImpUtils.f34674b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i2);
                    jSONObject.put("data", jSONObject2);
                    h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e2) {
                    CommonJSBridgeImpUtils.callbackExcep(obj, e2.getMessage());
                    e2.getMessage();
                }
            } catch (JSONException e3) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e3.getLocalizedMessage());
            }
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void click(Object obj, String str) {
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void getFileInfo(Object obj, String str) {
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void getNetstat(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        Context contextK = b.p().k();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextK == null) {
            try {
                if ((obj instanceof com.smartdigimkt.n.b) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                    contextK = windVaneWebView.getContext();
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        if (contextK == null) {
            h.a().b(obj, CommonJSBridgeImpUtils.codeToJsonString(1));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NativeAdvancedJsUtils.f34668n, n.h(contextK));
            String string = jSONObject.toString();
            if (!TextUtils.isEmpty(string)) {
                string = Base64.encodeToString(string.getBytes(), 2);
            }
            h.a().b(obj, string);
        } catch (Throwable th) {
            th.getMessage();
            h.a().b(obj, CommonJSBridgeImpUtils.codeToJsonString(1));
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void gial(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f34674b);
            jSONObject.put("data", new JSONObject());
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e2.getMessage());
            e2.getMessage();
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void handlerH5Exception(Object obj, String str) {
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void increaseOfferFrequence(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                CommonJSBridgeImpUtils.increaseOfferFrequence(obj, new JSONObject(str));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void init(Object obj, String str) {
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void install(Object obj, String str) {
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void onJSBridgeConnect(Object obj, String str) {
        try {
            if (obj instanceof com.smartdigimkt.n.b) {
                h.a().a(((com.smartdigimkt.n.b) obj).f36886a);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        Context contextK = b.p().k();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextK == null) {
            try {
                if ((obj instanceof com.smartdigimkt.n.b) && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null) {
                    contextK = windVaneWebView.getContext();
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        if (contextK == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                c.a(strOptString);
            } else if (iOptInt == 2) {
                c.a(contextK, strOptString);
            }
        } catch (JSONException e3) {
            e3.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void readyStatus(Object obj, String str) {
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void reportData(Object obj, String str) {
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void reportUrls(Object obj, String str) {
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void resetCountdown(Object obj, String str) {
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void sendImpressions(Object obj, String str) {
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void toggleCloseBtn(Object obj, String str) {
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void triggerCloseBtn(Object obj, String str) {
    }
}

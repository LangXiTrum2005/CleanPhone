package com.smartdigimkt.expressad.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.smartdigimkt.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.smartdigimkt.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.expressad.video.signal.factory.IJSFactory;
import com.smartdigimkt.k.a;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.n.h;
import com.smartdigimkt.o8.c;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.z2.j;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class BaseRewardJs extends AbsFeedBackForH5 implements IRewardBridge {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final String f34830n = "JS-Reward-Brigde";
    protected IRewardBridge m;

    private String a(int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i2);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
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

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void getEndScreenInfo(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            IRewardBridge iRewardBridge = this.m;
            if (iRewardBridge != null) {
                iRewardBridge.getEndScreenInfo(obj, str);
            } else {
                if (obj == null || (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                ((a) windVaneWebView.getWebViewListener()).a(obj);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void gial(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f34674b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageNameList", "[]");
            jSONObject.put("data", jSONObject2);
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            CommonJSBridgeImpUtils.callbackExcep(obj, e2.getMessage());
            e2.getMessage();
        } catch (Throwable th) {
            CommonJSBridgeImpUtils.callbackExcep(obj, th.getMessage());
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.m.handlerPlayableException(obj, str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.n.j
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            try {
                if (IJSFactory.class.isInstance(context)) {
                    this.m = (IRewardBridge) BaseRewardJsH5.class.newInstance();
                    BaseRewardJsH5.class.getMethod(MobileAdsBridgeBase.initializeMethodName, Context.class, WindVaneWebView.class).invoke(this.m, context, windVaneWebView);
                    return;
                }
            } catch (ClassNotFoundException e2) {
                e2.printStackTrace();
            }
            if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof IRewardBridge)) {
                return;
            }
            this.m = (IRewardBridge) windVaneWebView.getObject();
        } catch (Exception e3) {
            if (com.smartdigimkt.b.b.f33800a) {
                e3.printStackTrace();
            }
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void install(Object obj, String str) {
        try {
            IRewardBridge iRewardBridge = this.m;
            if (iRewardBridge != null) {
                iRewardBridge.install(obj, str);
                return;
            }
            if (TextUtils.isEmpty(str) || obj == null) {
                return;
            }
            com.smartdigimkt.n.b bVar = (com.smartdigimkt.n.b) obj;
            if (bVar.f36886a.getObject() instanceof j) {
                j jVar = (j) bVar.f36886a.getObject();
                Context context = bVar.f36886a.getContext();
                if (context != null && context != context.getApplicationContext()) {
                    jVar.a(context);
                }
                jVar.click(1, str);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.m.notifyCloseBtn(obj, str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void openURL(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                c.a(strOptString);
            } else if (iOptInt == 2) {
                c.a(this.f36897c, strOptString);
            }
        } catch (JSONException e2) {
            e2.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void setOrientation(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.m.setOrientation(obj, str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.m.toggleCloseBtn(obj, str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.m.triggerCloseBtn(obj, str);
        } catch (Throwable unused) {
            h.a().b(obj, a(-1));
        }
    }

    @Override // com.smartdigimkt.n.j
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        super.initialize(obj, windVaneWebView);
        try {
            try {
                if (IJSFactory.class.isInstance(obj)) {
                    this.m = (IRewardBridge) BaseRewardJsH5.class.newInstance();
                    BaseRewardJsH5.class.getMethod(MobileAdsBridgeBase.initializeMethodName, Object.class, WindVaneWebView.class).invoke(this.m, obj, windVaneWebView);
                    return;
                }
            } catch (ClassNotFoundException e2) {
                e2.printStackTrace();
            }
            if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof IRewardBridge)) {
                return;
            }
            this.m = (IRewardBridge) windVaneWebView.getObject();
        } catch (Exception e3) {
            if (com.smartdigimkt.b.b.f33800a) {
                e3.printStackTrace();
            }
        }
    }
}

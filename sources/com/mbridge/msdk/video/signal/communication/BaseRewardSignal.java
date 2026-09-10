package com.mbridge.msdk.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.communication.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.impl.k;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class BaseRewardSignal extends BaseRewardSignalDiff {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected BaseIRewardCommunication f37827g;

    private String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            q0.b("JS-Reward-Brigde", "code to string is error");
            return "";
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                String strOptString = new JSONObject(str).optString("packageName");
                if (TextUtils.isEmpty(strOptString)) {
                    d.a(obj, "packageName is empty");
                }
                int i10 = v0.c(c.n().d(), strOptString) ? 1 : 2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", d.f34868b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i10);
                    jSONObject.put("data", jSONObject2);
                    f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    d.a(obj, e10.getMessage());
                    q0.a("JS-Reward-Brigde", e10.getMessage());
                }
            } catch (Throwable th2) {
                d.a(obj, "exception: " + th2.getLocalizedMessage());
                q0.b("JS-Reward-Brigde", "cai", th2);
            }
        } catch (JSONException e11) {
            d.a(obj, "exception: " + e11.getLocalizedMessage());
            q0.b("JS-Reward-Brigde", "cai", e11);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            BaseIRewardCommunication baseIRewardCommunication = this.f37827g;
            if (baseIRewardCommunication != null) {
                baseIRewardCommunication.getEndScreenInfo(obj, str);
                q0.b("JS-Reward-Brigde", "getEndScreenInfo factory is true");
                return;
            }
            q0.b("JS-Reward-Brigde", "getEndScreenInfo factory is null");
            if (obj == null || (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) == null || windVaneWebView.getWebViewListener() == null) {
                return;
            }
            ((com.mbridge.msdk.mbsignalcommon.listener.a) windVaneWebView.getWebViewListener()).a(obj);
        } catch (Throwable th2) {
            q0.b("JS-Reward-Brigde", "getEndScreenInfo", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f37827g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f37827g.handlerPlayableException(obj, str);
        } catch (Throwable th2) {
            q0.b("JS-Reward-Brigde", "handlerPlayableException", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        boolean zIsInstance;
        super.initialize(context, windVaneWebView);
        try {
            zIsInstance = IJSFactory.class.isInstance(context);
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            zIsInstance = false;
        }
        try {
            if (zIsInstance) {
                this.f37827g = (BaseIRewardCommunication) BaseRewardSignalH5.class.newInstance();
                BaseRewardSignalH5.class.getMethod(MobileAdsBridgeBase.initializeMethodName, Context.class, WindVaneWebView.class).invoke(this.f37827g, context, windVaneWebView);
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof BaseIRewardCommunication)) {
                this.f37827g = (BaseIRewardCommunication) windVaneWebView.getObject();
            }
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        try {
            BaseIRewardCommunication baseIRewardCommunication = this.f37827g;
            if (baseIRewardCommunication != null) {
                baseIRewardCommunication.install(obj, str);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (obj != null) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.f34912b.getObject() instanceof k) {
                    ((k) aVar.f34912b.getObject()).click(1, str);
                    q0.b("JS-Reward-Brigde", "JSCommon install jump success");
                }
            }
            q0.b("JS-Reward-Brigde", "JSCommon install failed");
        } catch (Throwable th2) {
            q0.b("JS-Reward-Brigde", "install", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f37827g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f37827g.notifyCloseBtn(obj, str);
        } catch (Throwable th2) {
            q0.b("JS-Reward-Brigde", "notifyCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        q0.b("JS-Reward-Brigde", "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
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
                com.mbridge.msdk.click.c.c(this.f34934a, strOptString);
            } else if (iOptInt == 2) {
                com.mbridge.msdk.click.c.e(this.f34934a, strOptString);
            }
        } catch (JSONException e10) {
            q0.b("JS-Reward-Brigde", e10.getMessage());
        } catch (Throwable th2) {
            q0.b("JS-Reward-Brigde", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        try {
            if (this.f37827g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f37827g.setOrientation(obj, str);
        } catch (Throwable th2) {
            q0.b("JS-Reward-Brigde", "setOrientation", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f37827g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f37827g.toggleCloseBtn(obj, str);
        } catch (Throwable th2) {
            q0.b("JS-Reward-Brigde", "toggleCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f37827g == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f37827g.triggerCloseBtn(obj, str);
        } catch (Throwable th2) {
            q0.b("JS-Reward-Brigde", "triggerCloseBtn", th2);
            f.a().b(obj, a(-1));
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.g
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        boolean zIsInstance;
        super.initialize(obj, windVaneWebView);
        try {
            zIsInstance = IJSFactory.class.isInstance(obj);
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            zIsInstance = false;
        }
        try {
            if (zIsInstance) {
                this.f37827g = (BaseIRewardCommunication) BaseRewardSignalH5.class.newInstance();
                BaseRewardSignalH5.class.getMethod(MobileAdsBridgeBase.initializeMethodName, Object.class, WindVaneWebView.class).invoke(this.f37827g, obj, windVaneWebView);
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof BaseIRewardCommunication)) {
                this.f37827g = (BaseIRewardCommunication) windVaneWebView.getObject();
            }
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
        }
    }
}

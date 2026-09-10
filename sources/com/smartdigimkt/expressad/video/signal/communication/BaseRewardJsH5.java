package com.smartdigimkt.expressad.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.smartdigimkt.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.expressad.video.signal.factory.IJSFactory;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.n.h;
import com.smartdigimkt.o8.c;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.z2.j;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class BaseRewardJsH5 implements IRewardBridge {
    protected static final String d = "JS-Reward-Brigde";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected IJSFactory f34831c;

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
            } catch (Throwable th) {
                CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + th.getLocalizedMessage());
            }
        } catch (JSONException e3) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "exception: " + e3.getLocalizedMessage());
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void getEndScreenInfo(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.f34831c;
            if (iJSFactory != null) {
                String strA = iJSFactory.getIJSRewardVideoV1().a();
                h.a().b(obj, !TextUtils.isEmpty(strA) ? Base64.encodeToString(strA.getBytes(), 2) : "");
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
            if (this.f34831c == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f34831c.getIJSRewardVideoV1().handlerPlayableException(new JSONObject(str).optString("msg"));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        if (context instanceof IJSFactory) {
            this.f34831c = (IJSFactory) context;
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void install(Object obj, String str) {
        j jVar;
        Context context;
        try {
            if (this.f34831c != null) {
                if (obj != null) {
                    com.smartdigimkt.n.b bVar = (com.smartdigimkt.n.b) obj;
                    if ((bVar.f36886a.getObject() instanceof j) && (jVar = (j) bVar.f36886a.getObject()) != null && (context = bVar.f36886a.getContext()) != null && context != context.getApplicationContext()) {
                        jVar.a(context);
                    }
                }
                if (this.f34831c.getJSContainerModule().endCardShowing()) {
                    this.f34831c.getJSCommon().click(3, str);
                } else {
                    this.f34831c.getJSCommon().click(1, str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f34831c == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f34831c.getIJSRewardVideoV1().notifyCloseBtn(new JSONObject(str).optInt("state"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
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

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void setOrientation(Object obj, String str) {
        try {
            if (this.f34831c == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f34831c.getIJSRewardVideoV1().a(new JSONObject(str).optString("state"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f34831c == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f34831c.getIJSRewardVideoV1().toggleCloseBtn(new JSONObject(str).optInt("state"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f34831c == null || TextUtils.isEmpty(str)) {
                return;
            }
            h.a().b(obj, a(0));
            this.f34831c.getIJSRewardVideoV1().triggerCloseBtn(new JSONObject(str).optString("state"));
        } catch (Throwable unused) {
            h.a().b(obj, a(-1));
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        if (obj instanceof IJSFactory) {
            this.f34831c = (IJSFactory) obj;
        }
    }
}

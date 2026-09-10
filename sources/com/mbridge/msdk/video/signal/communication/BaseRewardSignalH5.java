package com.mbridge.msdk.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.communication.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class BaseRewardSignalH5 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected IJSFactory f37828a;

    private String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            q0.b("JS-Reward-Communication", "code to string is error");
            return "";
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) {
        q0.a("JS-Reward-Communication", "cai:" + str);
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
                    q0.a("JS-Reward-Communication", e10.getMessage());
                }
            } catch (JSONException e11) {
                d.a(obj, "exception: " + e11.getLocalizedMessage());
                q0.b("JS-Reward-Communication", "cai", e11);
            }
        } catch (Throwable th2) {
            d.a(obj, "exception: " + th2.getLocalizedMessage());
            q0.b("JS-Reward-Communication", "cai", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        String strEncodeToString;
        try {
            IJSFactory iJSFactory = this.f37828a;
            if (iJSFactory != null) {
                String strB = iJSFactory.getIJSRewardVideoV1().b();
                if (TextUtils.isEmpty(strB)) {
                    strEncodeToString = "";
                    q0.a("JS-Reward-Communication", "getEndScreenInfo failed");
                } else {
                    strEncodeToString = Base64.encodeToString(strB.getBytes(), 2);
                    q0.a("JS-Reward-Communication", "getEndScreenInfo success");
                }
                f.a().b(obj, strEncodeToString);
            }
        } catch (Throwable th2) {
            q0.b("JS-Reward-Communication", "getEndScreenInfo", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f37828a == null || TextUtils.isEmpty(str)) {
                return;
            }
            String strOptString = new JSONObject(str).optString(NotificationCompat.CATEGORY_MESSAGE);
            q0.a("JS-Reward-Communication", "handlerPlayableException,msg:" + str);
            this.f37828a.getIJSRewardVideoV1().handlerPlayableException(strOptString);
        } catch (Throwable th2) {
            q0.b("JS-Reward-Communication", "setOrientation", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        if (context instanceof IJSFactory) {
            this.f37828a = (IJSFactory) context;
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        try {
            if (this.f37828a != null) {
                q0.a("JS-Reward-Communication", "install:" + str);
                if (this.f37828a.getJSContainerModule().endCardShowing()) {
                    this.f37828a.getJSCommon().click(3, str);
                } else {
                    this.f37828a.getJSCommon().click(1, str);
                }
            }
        } catch (Throwable th2) {
            q0.b("JS-Reward-Communication", "install", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f37828a == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            q0.a("JS-Reward-Communication", "notifyCloseBtn,state:" + str);
            this.f37828a.getIJSRewardVideoV1().notifyCloseBtn(iOptInt);
        } catch (Throwable th2) {
            q0.b("JS-Reward-Communication", "notifyCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        q0.b("JS-Reward-Communication", "openURL:" + str);
        Context contextD = c.n().d();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextD == null) {
            try {
                if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f34912b) != null) {
                    contextD = windVaneWebView.getContext();
                }
            } catch (Exception e10) {
                q0.b("JS-Reward-Communication", e10.getMessage());
            }
        }
        if (contextD == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                com.mbridge.msdk.click.c.c(contextD, strOptString);
            } else if (iOptInt == 2) {
                com.mbridge.msdk.click.c.e(contextD, strOptString);
            }
        } catch (JSONException e11) {
            q0.b("JS-Reward-Communication", e11.getMessage());
        } catch (Throwable th2) {
            q0.b("JS-Reward-Communication", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        try {
            if (this.f37828a == null || TextUtils.isEmpty(str)) {
                return;
            }
            String strOptString = new JSONObject(str).optString("state");
            q0.a("JS-Reward-Communication", "setOrientation,state:" + str);
            this.f37828a.getIJSRewardVideoV1().a(strOptString);
        } catch (Throwable th2) {
            q0.b("JS-Reward-Communication", "setOrientation", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f37828a == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            q0.a("JS-Reward-Communication", "toggleCloseBtn,state:" + str);
            this.f37828a.getIJSRewardVideoV1().toggleCloseBtn(iOptInt);
        } catch (Throwable th2) {
            q0.b("JS-Reward-Communication", "toggleCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f37828a == null || TextUtils.isEmpty(str)) {
                return;
            }
            f.a().b(obj, a(0));
            this.f37828a.getIJSRewardVideoV1().triggerCloseBtn(new JSONObject(str).optString("state"));
            q0.a("JS-Reward-Communication", "triggerCloseBtn,state:" + str);
        } catch (Throwable th2) {
            q0.b("JS-Reward-Communication", "triggerCloseBtn", th2);
            f.a().b(obj, a(-1));
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        if (obj instanceof IJSFactory) {
            this.f37828a = (IJSFactory) obj;
        }
    }
}

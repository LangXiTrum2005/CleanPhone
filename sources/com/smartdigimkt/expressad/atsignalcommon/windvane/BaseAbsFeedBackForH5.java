package com.smartdigimkt.expressad.atsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.smartdigimkt.n.h;
import com.smartdigimkt.n.j;
import com.smartdigimkt.z.b;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseAbsFeedBackForH5 extends j {
    public static final String g = "onFeedbackAlertStatusNotify";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f34698h = "status";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f34699i = 1;
    public static final int j = 2;
    private static int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f34700l = 1;
    private String f = "AbsFeedBackForH5";

    public void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f34700l);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void callbackSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", k);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "");
            jSONObject.put("data", new JSONObject());
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            callbackExcep(obj, e2.getMessage());
            e2.getMessage();
        }
    }

    public void callbackSuccessWithData(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", k);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
            jSONObject2.put("data", jSONObject);
            h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e2) {
            callbackExcep(obj, e2.getMessage());
            e2.getMessage();
        }
    }

    public void feedbackLayoutOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("width", -1);
                int iOptInt2 = jSONObject.optInt("height", -1);
                int iOptInt3 = jSONObject.optInt("radius", 20);
                int iOptInt4 = jSONObject.optInt(TtmlNode.LEFT, -1);
                int iOptInt5 = jSONObject.optInt("top", -1);
                double dOptDouble = jSONObject.optDouble("opacity", 1.0d);
                b.b().a(jSONObject.optString("key", ""), iOptInt, iOptInt2, iOptInt3, iOptInt4, iOptInt5, (float) dOptDouble, jSONObject.optString("fontColor", ""), jSONObject.optString("bgColor", ""), ((com.smartdigimkt.n.b) obj).f36886a);
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                com.smartdigimkt.n.b bVar = (com.smartdigimkt.n.b) obj;
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("view_visible", 1);
                b.b().a(jSONObject.optString("key", ""), iOptInt == 1 ? 8 : 0, bVar.f36886a);
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackPopupOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("view_visible", 1);
                b.b().a(jSONObject.optString("key", ""), iOptInt, new a(((com.smartdigimkt.n.b) obj).f36886a));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void getCacheKey(Object obj, String str) {
        try {
            com.smartdigimkt.m.a.a().a(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void startShake(Object obj, String str) {
        Object obj2;
        try {
            if (TextUtils.isEmpty(str)) {
                obj2 = obj;
            } else {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("deviceMotionUpdateInterval", 1);
                obj2 = obj;
                try {
                    com.smartdigimkt.m.a.a().a(obj2, ((com.smartdigimkt.n.b) obj).f36886a, jSONObject.optString("oldCache", ""), jSONObject.optString(com.smartdigimkt.q0.b.O, ""), iOptInt);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    callbackExcep(obj2, th2.getMessage());
                    th2.printStackTrace();
                    return;
                }
            }
            callbackSuccess(obj2);
        } catch (Throwable th3) {
            th = th3;
            obj2 = obj;
        }
    }

    public void stopShake(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                com.smartdigimkt.m.a.a().a(obj, ((com.smartdigimkt.n.b) obj).f36886a, new JSONObject(str).optString(com.smartdigimkt.q0.b.O, ""));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public class a implements com.smartdigimkt.z.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WindVaneWebView f34701a;

        public a(WindVaneWebView windVaneWebView) {
            this.f34701a = windVaneWebView;
        }

        @Override // com.smartdigimkt.z.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = BaseAbsFeedBackForH5.this.f;
                th.getMessage();
                string = "";
            }
            h.a().a((WebView) this.f34701a, BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.smartdigimkt.z.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = BaseAbsFeedBackForH5.this.f;
                th.getMessage();
                string = "";
            }
            h.a().a((WebView) this.f34701a, BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.smartdigimkt.z.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = BaseAbsFeedBackForH5.this.f;
                th.getMessage();
                string = "";
            }
            h.a().a((WebView) this.f34701a, BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }
    }
}

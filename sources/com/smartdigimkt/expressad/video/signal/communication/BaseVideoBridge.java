package com.smartdigimkt.expressad.video.signal.communication;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.unification.sdk.InitializationStatus;
import com.p004ironsource.d9;
import com.smartdigimkt.b0.a;
import com.smartdigimkt.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.smartdigimkt.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.expressad.video.signal.factory.IJSFactory;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.n.h;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.g;
import com.smartdigimkt.z1.c;
import com.smartdigimkt.z2.j;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class BaseVideoBridge extends AbsFeedBackForH5 implements IVideoBridge {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final String f34832n = "JS-Video-Brigde";
    private static final int o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f34833p = 2;
    private static final String q = "showTransparent";
    private static final String r = "mute";
    private static final String s = "closeType";
    private static final String t = "orientationType";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f34834u = "type";
    private static final String v = "h5cbp";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f34835w = "webfront";
    private static final String x = "showAlertRole";
    protected IJSFactory m;

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

    private String b(int i2) {
        switch (i2) {
            case 1:
                return "sdk_info";
            case 2:
                return "unit_id";
            case 3:
                return "appSetting";
            case 4:
                return "unitSetting";
            case 5:
                return d9.h.G;
            case 6:
                return "sdkSetting";
            default:
                return "";
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void appendSubView(Object obj, String str) {
        a(obj, str);
        try {
            c.c().a(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void appendViewTo(Object obj, String str) {
        a(obj, str);
        try {
            c.c().b(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void bringViewToFront(Object obj, String str) {
        a(obj, str);
        try {
            c.c().c(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void broadcast(Object obj, String str) {
        a(obj, str);
        try {
            c.c().d(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
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

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void clearAllCache(Object obj, String str) {
        try {
            b.p().k().getSharedPreferences(a.t, 0).edit().clear().apply();
            if (obj != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 0);
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, InitializationStatus.SUCCESS);
                h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void click(Object obj, String str) {
        String strOptString;
        int iOptInt;
        j jVar;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                iOptInt = jSONObject.optInt("type");
                strOptString = jSONObject.optString("pt");
            } catch (JSONException e2) {
                strOptString = "";
                e2.printStackTrace();
                iOptInt = 1;
            }
            IJSFactory iJSFactory = this.m;
            if (iJSFactory != null) {
                iJSFactory.getJSCommon().click(iOptInt, strOptString);
                return;
            }
            if (obj != null) {
                com.smartdigimkt.n.b bVar = (com.smartdigimkt.n.b) obj;
                if (!(bVar.f36886a.getObject() instanceof j) || (jVar = (j) bVar.f36886a.getObject()) == null) {
                    return;
                }
                jVar.click(iOptInt, strOptString);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void closeAd(Object obj, String str) {
        a(obj, str);
        try {
            c.c().e(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void closeVideoOperte(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.m.getJSVideoModule().closeVideoOperate(jSONObject.optInt("close"), jSONObject.optInt("view_visible"));
            h.a().b(obj, a(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void closeWeb(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str) || this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("status");
            this.m.getJSContainerModule().hideAlertWebview();
            this.m.getJSVideoModule().hideAlertView(iOptInt);
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void createNativeEC(Object obj, String str) {
        a(obj, str);
        try {
            c.c().f(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void createPlayerView(Object obj, String str) {
        a(obj, str);
        try {
            c.c().g(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void createSubPlayTemplateView(Object obj, String str) {
        a(obj, str);
        try {
            c.c().h(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void createView(Object obj, String str) {
        a(obj, str);
        try {
            c.c().i(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void createWebview(Object obj, String str) {
        a(obj, str);
        try {
            c.c().j(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void destroyComponent(Object obj, String str) {
        a(obj, str);
        try {
            c.c().k(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void getAllCache(Object obj, String str) {
        JSONObject jSONObject;
        String strO;
        try {
            SharedPreferences sharedPreferences = b.p().k().getSharedPreferences(a.t, 0);
            jSONObject = new JSONObject();
            try {
                for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                strO = "getAllCache Success";
            } catch (Throwable th) {
                th = th;
                th.toString();
                strO = androidx.datastore.preferences.protobuf.a.o(th, new StringBuilder("getAllCache Error, reason is : "));
            }
        } catch (Throwable th2) {
            th = th2;
            jSONObject = null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 0);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, strO);
            if (jSONObject != null) {
                jSONObject2.put("data", jSONObject);
            } else {
                jSONObject2.put("data", JsonUtils.EMPTY_JSON);
            }
            if (obj != null) {
                h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            }
        } catch (Throwable th3) {
            th3.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void getAppSetting(Object obj, String str) {
        JSONObject jSONObject;
        try {
            String strOptString = new JSONObject(str).optString("appid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "Get App Setting error, because must give a appId.");
            } else {
                String strD = com.smartdigimkt.n1.b.b().d(strOptString);
                if (TextUtils.isEmpty(strD)) {
                    jSONObject = new JSONObject(com.smartdigimkt.n1.b.b().a().x1());
                } else {
                    jSONObject = new JSONObject(strD);
                    jSONObject.put("isDefault", 0);
                }
                if (obj != null) {
                    jSONObject2.put("code", 0);
                    jSONObject2.put(PglCryptUtils.KEY_MESSAGE, InitializationStatus.SUCCESS);
                    jSONObject2.put("data", jSONObject);
                } else {
                    jSONObject2.put("code", 1);
                    jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "Get App Setting error, plz try again later.");
                }
            }
            h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void getComponentOptions(Object obj, String str) {
        a(obj, str);
        try {
            c.c().l(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void getCurrentProgress(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.m;
            if (iJSFactory != null) {
                String currentProgress = iJSFactory.getJSVideoModule().getCurrentProgress();
                if (!TextUtils.isEmpty(currentProgress)) {
                    currentProgress = Base64.encodeToString(currentProgress.getBytes(), 2);
                }
                h.a().b(obj, currentProgress);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void getCutout(Object obj, String str) {
        try {
            String strG = this.m.getJSCommon().g();
            if (obj != null && !TextUtils.isEmpty(strG)) {
                h.a().b(obj, Base64.encodeToString(strG.getBytes(), 2));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "No notch data, plz try again later.");
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void getEncryptPrice(Object obj, String str) {
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void getFileInfo(Object obj, String str) {
        a(obj, str);
        try {
            c.c().m(obj, new JSONObject(str));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void getRewardSetting(Object obj, String str) {
        try {
            JSONObject jSONObjectJ = com.smartdigimkt.f3.c.b().c().j();
            JSONObject jSONObject = new JSONObject();
            if (obj == null || jSONObjectJ == null) {
                jSONObject.put("code", 1);
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, "Get Reward Setting error, plz try again later.");
            } else {
                jSONObject.put("code", 0);
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, InitializationStatus.SUCCESS);
                jSONObject.put("data", jSONObjectJ);
            }
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void getRewardUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("appid", "");
            String strOptString2 = jSONObject.optString("unitid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "Get reward unit Setting error, because must give appId and unitId.");
            } else {
                JSONObject jSONObjectB0 = com.smartdigimkt.f3.c.b().b(strOptString, strOptString2).b0();
                if (obj == null || jSONObjectB0 == null) {
                    jSONObject2.put("code", 1);
                    jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "Get Reward Unit Setting error, plz try again later.");
                } else {
                    jSONObject2.put("code", 0);
                    jSONObject2.put(PglCryptUtils.KEY_MESSAGE, InitializationStatus.SUCCESS);
                    jSONObject2.put("data", jSONObjectB0);
                }
            }
            h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void getSDKInfo(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                h.a().a(obj, "params is null");
                return;
            }
            JSONArray jSONArray = new JSONObject(str).getJSONArray("type");
            JSONObject jSONObject = new JSONObject();
            int i2 = 0;
            if (this.m != null) {
                while (i2 < jSONArray.length()) {
                    int i3 = jSONArray.getInt(i2);
                    jSONObject.put(b(i3), this.m.getJSCommon().f(i3));
                    i2++;
                }
            } else if (obj != null) {
                while (i2 < jSONArray.length()) {
                    int i4 = jSONArray.getInt(i2);
                    com.smartdigimkt.n.b bVar = (com.smartdigimkt.n.b) obj;
                    if (bVar.f36886a.getObject() instanceof j) {
                        jSONObject.put(b(i4), ((j) bVar.f36886a.getObject()).f(i4));
                    }
                    i2++;
                }
            }
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable unused) {
            h.a().a(obj, g.f39715A);
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void getUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "Get Unit Setting error, RV/IV can not support this method.");
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
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

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void handleNativeObject(Object obj, String str) {
        a(obj, str);
        try {
            com.smartdigimkt.z1.b.a().a(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void handlerH5Exception(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.m.getJSCommon().handlerH5Exception(jSONObject.optInt("code", -999), jSONObject.optString(PglCryptUtils.KEY_MESSAGE, "h5 error"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void hideView(Object obj, String str) {
        a(obj, str);
        try {
            c.c().n(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void increaseOfferFrequence(Object obj, String str) {
        a(obj, str);
        try {
            c.c().o(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void init(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.m;
            int i2 = 1;
            if (iJSFactory != null) {
                String strD = iJSFactory.getJSCommon().d();
                if (!TextUtils.isEmpty(strD)) {
                    strD = Base64.encodeToString(strD.getBytes(), 2);
                }
                h.a().b(obj, strD);
                this.m.getJSCommon().b(true);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt(q);
                int iOptInt2 = jSONObject.optInt("mute");
                int iOptInt3 = jSONObject.optInt(s);
                int iOptInt4 = jSONObject.optInt(t);
                int iOptInt5 = jSONObject.optInt(v);
                int iOptInt6 = jSONObject.optInt(f34835w);
                int iOptInt7 = jSONObject.optInt(x);
                this.m.getJSCommon().a(iOptInt == 1);
                this.m.getJSCommon().e(iOptInt2);
                this.m.getJSCommon().b(iOptInt3);
                this.m.getJSCommon().c(iOptInt4);
                this.m.getJSCommon().setH5Cbp(iOptInt5);
                this.m.getJSCommon().setWebViewFront(iOptInt6);
                com.smartdigimkt.x2.c jSCommon = this.m.getJSCommon();
                if (iOptInt7 != 0) {
                    i2 = iOptInt7;
                }
                jSCommon.d(i2);
                return;
            }
            if (obj != null) {
                com.smartdigimkt.n.b bVar = (com.smartdigimkt.n.b) obj;
                if (bVar.f36886a.getObject() instanceof j) {
                    j jVar = (j) bVar.f36886a.getObject();
                    String strD2 = jVar.d();
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject2 = new JSONObject(str);
                        int iOptInt8 = jSONObject2.optInt(q);
                        int iOptInt9 = jSONObject2.optInt("mute");
                        int iOptInt10 = jSONObject2.optInt(s);
                        int iOptInt11 = jSONObject2.optInt(t);
                        int iOptInt12 = jSONObject2.optInt(v);
                        int iOptInt13 = jSONObject2.optInt(f34835w);
                        int iOptInt14 = jSONObject2.optInt(x);
                        jVar.a(iOptInt8 == 1);
                        jVar.e(iOptInt9);
                        jVar.b(iOptInt10);
                        jVar.c(iOptInt11);
                        jVar.setH5Cbp(iOptInt12);
                        jVar.setWebViewFront(iOptInt13);
                        if (iOptInt14 != 0) {
                            i2 = iOptInt14;
                        }
                        jVar.d(i2);
                    }
                    h.a().b(obj, Base64.encodeToString(strD2.getBytes(), 2));
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.n.j
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        super.initialize(obj, windVaneWebView);
        if (obj instanceof IJSFactory) {
            this.m = (IJSFactory) obj;
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void insertViewAbove(Object obj, String str) {
        a(obj, str);
        try {
            c.c().a(obj, new JSONObject(str), true);
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void insertViewBelow(Object obj, String str) {
        a(obj, str);
        try {
            c.c().b(obj, new JSONObject(str), true);
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void isSystemResume(Object obj, String str) {
        try {
            IJSFactory iJSFactory = this.m;
            if (iJSFactory != null) {
                h.a().b(obj, a(iJSFactory.getActivityProxy().a()));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str) || this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.m.getJSContainerModule().ivRewardAdsWithoutVideo(str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void loadads(Object obj, String str) {
        String strOptString;
        int i2;
        int iOptInt;
        WindVaneWebView windVaneWebView;
        try {
            if (TextUtils.isEmpty(str)) {
                strOptString = "";
                i2 = 1;
                iOptInt = 1;
            } else {
                JSONObject jSONObject = new JSONObject(str);
                strOptString = jSONObject.optString("unitId");
                int iOptInt2 = jSONObject.optInt("type", 1);
                if (iOptInt2 > 2) {
                    iOptInt2 = 1;
                }
                iOptInt = jSONObject.optInt("adtype", 1);
                i2 = iOptInt2;
            }
            String str2 = strOptString;
            if (TextUtils.isEmpty(str2)) {
                h.a().b(obj, a(1));
                return;
            }
            if (obj != null && (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) != null && windVaneWebView.getWebViewListener() != null) {
                ((com.smartdigimkt.k.a) windVaneWebView.getWebViewListener()).a(windVaneWebView, "", str2, i2, iOptInt);
            }
            h.a().b(obj, a(0));
        } catch (Throwable unused) {
            h.a().b(obj, a(1));
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void loadingResourceStatus(Object obj, String str) {
        a(obj, str);
        if (obj != null) {
            try {
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().loadingResourceStatus(windVaneWebView, iOptInt);
            } catch (Throwable th) {
                th.toString();
            }
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.m.getJSVideoModule().notifyCloseBtn(new JSONObject(str).optInt("state"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void onlyAppendSubView(Object obj, String str) {
        a(obj, str);
        try {
            c.c().p(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void onlyAppendViewTo(Object obj, String str) {
        a(obj, str);
        try {
            c.c().q(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void onlyInsertViewAbove(Object obj, String str) {
        a(obj, str);
        try {
            c.c().r(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void onlyInsertViewBelow(Object obj, String str) {
        a(obj, str);
        try {
            c.c().s(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void openURL(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                com.smartdigimkt.o8.c.a(strOptString);
            } else if (iOptInt == 2) {
                com.smartdigimkt.o8.c.a(this.f36897c, strOptString);
            }
        } catch (JSONException e2) {
            e2.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void playVideoFinishOperate(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str) || this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.m.getJSCommon().a(new JSONObject(str).optInt("type"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void playerGetMuteState(Object obj, String str) {
        a(obj, str);
        try {
            c.c().t(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void playerMute(Object obj, String str) {
        a(obj, str);
        try {
            c.c().u(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void playerPause(Object obj, String str) {
        a(obj, str);
        try {
            c.c().v(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void playerPlay(Object obj, String str) {
        a(obj, str);
        try {
            c.c().w(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void playerResume(Object obj, String str) {
        a(obj, str);
        try {
            c.c().x(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void playerSetRenderType(Object obj, String str) {
        a(obj, str);
        try {
            c.c().y(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void playerSetSource(Object obj, String str) {
        a(obj, str);
        try {
            c.c().z(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void playerStop(Object obj, String str) {
        a(obj, str);
        try {
            c.c().A(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void playerUnmute(Object obj, String str) {
        a(obj, str);
        try {
            c.c().B(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void playerUpdateFrame(Object obj, String str) {
        a(obj, str);
        try {
            c.c().C(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void preloadSubPlayTemplateView(Object obj, String str) {
        a(obj, str);
        try {
            if (this.m != null) {
                c.c().D(obj, new JSONObject(str));
                return;
            }
            WindVaneWebView windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a;
            if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                return;
            }
            ((com.smartdigimkt.k.a) windVaneWebView.getWebViewListener()).preloadSubPlayTemplateView(obj, str);
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void progressBarOperate(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.m.getJSVideoModule().progressBarOperate(new JSONObject(str).optInt("view_visible"));
            h.a().b(obj, a(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void progressOperate(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.m.getJSVideoModule().progressOperate(jSONObject.optInt("progress"), jSONObject.optInt("view_visible"));
            h.a().b(obj, a(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void reactDeveloper(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                h.a().a(obj, a(1));
            } else {
                this.m.getJSBTModule().reactDeveloper(obj, str);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                com.smartdigimkt.n.b bVar = (com.smartdigimkt.n.b) obj;
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                if (bVar.f36886a.getObject() instanceof j) {
                    ((j) bVar.f36886a.getObject()).h(iOptInt);
                }
                WindVaneWebView windVaneWebView = bVar.f36886a;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().readyState(windVaneWebView, iOptInt);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void removeCacheItem(Object obj, String str) {
        String strO;
        int i2 = 0;
        try {
            SharedPreferences sharedPreferences = b.p().k().getSharedPreferences(a.t, 0);
            if (TextUtils.isEmpty(str)) {
                strO = "";
            } else {
                String string = new JSONObject(str).getString("key");
                if (!TextUtils.isEmpty(string)) {
                    sharedPreferences.edit().remove(string).apply();
                }
                strO = "Delete Success";
                i2 = 1;
            }
        } catch (Throwable th) {
            th.toString();
            strO = androidx.datastore.preferences.protobuf.a.o(th, new StringBuilder("Delete Error, reason is : "));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i2 ^ 1);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, strO);
            if (obj == null || i2 == 0) {
                h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } else {
                h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void removeFromSuperView(Object obj, String str) {
        a(obj, str);
        try {
            c.c().E(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void reportData(Object obj, String str) {
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void reportUrls(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                h.a().a(obj, a(1));
                return;
            }
            IJSFactory iJSFactory = this.m;
            if (iJSFactory == null || iJSFactory.getJSBTModule() == null) {
                c.c().c(obj, str);
            } else {
                this.m.getJSBTModule().reportUrls(obj, str);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void setCacheItem(Object obj, String str) {
        String strO;
        int i2 = 0;
        try {
            SharedPreferences sharedPreferences = b.p().k().getSharedPreferences(a.t, 0);
            if (TextUtils.isEmpty(str)) {
                strO = "";
            } else {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("key");
                String string2 = jSONObject.getString("value");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    sharedPreferences.edit().putString(string, string2).apply();
                }
                strO = "Save Success";
                i2 = 1;
            }
        } catch (Throwable th) {
            th.toString();
            strO = androidx.datastore.preferences.protobuf.a.o(th, new StringBuilder("Save Error, reason is : "));
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", i2 ^ 1);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, strO);
            if (obj == null || i2 == 0) {
                h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } else {
                h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void setScaleFitXY(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.m.getJSVideoModule().setScaleFitXY(new JSONObject(str).optInt("fitxy"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void setSubPlayTemplateInfo(Object obj, String str) {
        a(obj, str);
        try {
            c.c().F(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void setViewAlpha(Object obj, String str) {
        a(obj, str);
        try {
            c.c().G(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void setViewBgColor(Object obj, String str) {
        a(obj, str);
        try {
            c.c().H(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void setViewRect(Object obj, String str) {
        a(obj, str);
        try {
            c.c().I(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void setViewScale(Object obj, String str) {
        a(obj, str);
        try {
            c.c().J(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void showAlertView(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.m.getJSVideoModule().showIVRewardAlertView(str);
            h.a().a(obj, "showAlertView", "");
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void showVideoClickView(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.m.getJSContainerModule().showVideoClickView(new JSONObject(str).optInt("type"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void showVideoLocation(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.m.getJSVideoModule().showVideoLocation(jSONObject.optInt("margin_top", 0), jSONObject.optInt("margin_left", 0), jSONObject.optInt("view_width", 0), jSONObject.optInt("view_height", 0), jSONObject.optInt("radius", 0), jSONObject.optInt("border_top", 0), jSONObject.optInt("border_left", 0), jSONObject.optInt("border_width", 0), jSONObject.optInt("border_height", 0));
            this.m.getJSCommon().h();
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void showView(Object obj, String str) {
        a(obj, str);
        try {
            c.c().K(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void soundOperate(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("mute");
            int iOptInt2 = jSONObject.optInt("view_visible");
            String strOptString = jSONObject.optString("pt", "");
            if (TextUtils.isEmpty(strOptString)) {
                this.m.getJSVideoModule().soundOperate(iOptInt, iOptInt2);
            } else {
                this.m.getJSVideoModule().soundOperate(iOptInt, iOptInt2, strOptString);
            }
            h.a().b(obj, a(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void statistics(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.m.getJSCommon().a(jSONObject.optInt("type"), jSONObject.optString("data"));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            int i2 = 2;
            if (iOptInt != 1) {
                i2 = iOptInt == 2 ? 1 : 0;
            }
            this.m.getJSVideoModule().closeVideoOperate(0, i2);
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str) || !new JSONObject(str).optString("state").equals("click")) {
                return;
            }
            this.m.getJSVideoModule().closeVideoOperate(1, -1);
            h.a().b(obj, a(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void videoOperate(Object obj, String str) {
        try {
            if (this.m == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.m.getJSVideoModule().videoOperate(new JSONObject(str).optInt("pause_or_resume"));
            h.a().b(obj, a(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void webviewFireEvent(Object obj, String str) {
        a(obj, str);
        try {
            c.c().L(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void webviewGoBack(Object obj, String str) {
        a(obj, str);
        try {
            c.c().M(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void webviewGoForward(Object obj, String str) {
        a(obj, str);
        try {
            c.c().N(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void webviewLoad(Object obj, String str) {
        a(obj, str);
        try {
            c.c().O(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.IVideoBridge
    public void webviewReload(Object obj, String str) {
        a(obj, str);
        try {
            c.c().P(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.toString();
        }
    }

    private void a(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, "params is null");
                h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }
}

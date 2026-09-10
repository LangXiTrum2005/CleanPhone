package com.smartdigimkt.expressad.splash.js;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.c0.f;
import com.smartdigimkt.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.n.h;
import com.smartdigimkt.n1.c;
import com.smartdigimkt.u1.a;
import com.smartdigimkt.v0.n;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.d;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class SplashJSBridgeImpl implements ISplashBridge {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private WeakReference<Context> f34723Y;
    private List<d> Z;
    private String e0;
    private String f0;
    private int g0;
    private int h0;
    private int j0;
    private a k0;
    private SplashExpandDialog l0;
    private String X = "SplashJSBridgeImpl";
    private int i0 = 5;

    public SplashJSBridgeImpl(Context context, String str, String str2) {
        this.f0 = str;
        this.e0 = str2;
        this.f34723Y = new WeakReference<>(context);
    }

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
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

    @Override // com.smartdigimkt.s4.b
    public void close() {
        try {
            a aVar = this.k0;
            if (aVar != null) {
                aVar.close();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.s4.b
    public void expand(String str, boolean z2) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z2);
            WeakReference<Context> weakReference = this.f34723Y;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            SplashExpandDialog splashExpandDialog = this.l0;
            if (splashExpandDialog == null || !splashExpandDialog.isShowing()) {
                SplashExpandDialog splashExpandDialog2 = new SplashExpandDialog(this.f34723Y.get(), bundle, this.k0);
                this.l0 = splashExpandDialog2;
                splashExpandDialog2.setCampaignList(this.e0, this.Z);
                this.l0.show();
                a aVar = this.k0;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.mraid.IMraidJSBridge
    public d getMraidCampaign() {
        List<d> list = this.Z;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.Z.get(0);
    }

    public a getSplashBridgeListener() {
        return this.k0;
    }

    public List<d> getmCampaignList() {
        return this.Z;
    }

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
    public void gial(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f34674b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageNameList", new JSONArray());
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

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
    public void handlerH5Exception(Object obj, String str) {
    }

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.smartdigimkt.q1.a aVar = new com.smartdigimkt.q1.a(b.p().k());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.g0);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(d9.h.G, aVar.a());
            jSONObject.put("campaignList", d.a(this.Z));
            c cVarE = com.smartdigimkt.n1.b.b().e(com.smartdigimkt.u.a.f().a(), this.e0);
            if (cVarE == null) {
                cVarE = c.a(this.e0);
            }
            if (!TextUtils.isEmpty(this.f0)) {
                cVarE.g(this.f0);
            }
            cVarE.h(this.e0);
            cVarE.j(this.i0);
            cVarE.a(this.h0);
            jSONObject.put("unitSetting", cVarE.N());
            String strD = com.smartdigimkt.n1.b.b().d(com.smartdigimkt.u.a.f().a());
            if (!TextUtils.isEmpty(strD)) {
                jSONObject.put("appSetting", new JSONObject(strD));
            }
            jSONObject.put("sdk_info", com.smartdigimkt.h.a.f35551a);
            jSONObject.toString();
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
    public void install(Object obj, String str) {
        try {
            List<d> list = this.Z;
            if (list == null) {
                return;
            }
            d dVar = list.size() > 0 ? this.Z.get(0) : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectB = d.b(dVar);
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectB.put(next, jSONObject.getString(next));
                }
                d dVarB = d.b(jSONObjectB);
                String strOptString = jSONObjectB.optString("unitId");
                if (!TextUtils.isEmpty(strOptString)) {
                    dVarB.G(strOptString);
                }
                dVar = dVarB;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            a aVar = this.k0;
            if (aVar != null) {
                aVar.install(dVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
    public void onJSBridgeConnect(Object obj, String str) {
        try {
            if (obj instanceof com.smartdigimkt.n.b) {
                h.a().a(((com.smartdigimkt.n.b) obj).f36886a);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.s4.b
    public void open(String str) {
        a aVar = this.k0;
        if (aVar != null) {
            aVar.a(true, str);
        }
    }

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
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
                com.smartdigimkt.o8.c.a(strOptString);
            } else if (iOptInt == 2) {
                com.smartdigimkt.o8.c.a(contextK, strOptString);
            }
        } catch (JSONException e3) {
            e3.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
    public void pauseCountDown(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "Call pause count down success.");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.smartdigimkt.o1.b.l3, this.j0);
            jSONObject.put("data", jSONObject2);
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.getMessage();
        }
        a aVar = this.k0;
        if (aVar != null) {
            aVar.a(1, -1);
        }
    }

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
    public void readyStatus(Object obj, String str) {
    }

    public void release() {
        if (this.k0 != null) {
            this.k0 = null;
        }
    }

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
    public void reportData(Object obj, String str) {
    }

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
    public void reportUrls(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                int iOptInt = jSONObject.optInt("type");
                String strA = v.a(jSONObject.optString("url"), "&tun=", n.q() + "");
                int iOptInt2 = jSONObject.optInt("report");
                if (iOptInt2 == 0) {
                    com.smartdigimkt.o.a.a(b.p().k(), (d) null, "", strA, false, iOptInt != 0);
                } else {
                    com.smartdigimkt.o.a.a(b.p().k(), null, "", strA, false, iOptInt != 0, iOptInt2);
                }
            }
            h.a().b(obj, SplashJsUtils.codeToJsonString(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
    public void resetCountdown(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i2 = new JSONObject(str).getInt(com.smartdigimkt.o1.b.l3);
            a aVar = this.k0;
            if (aVar != null) {
                aVar.a(i2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
    public void resumeCountDown(Object obj, String str) {
        int i2 = 0;
        if (!TextUtils.isEmpty(str)) {
            try {
                int iOptInt = new JSONObject(str).optInt(com.smartdigimkt.o1.b.l3);
                try {
                    h.a().b(obj, SplashJsUtils.codeToJsonString(0));
                    i2 = iOptInt;
                } catch (Exception e2) {
                    e = e2;
                    i2 = iOptInt;
                    e.getMessage();
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        a aVar = this.k0;
        if (aVar != null) {
            aVar.a(2, i2);
        }
    }

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
    public void sendImpressions(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string = jSONArray.getString(i2);
                for (d dVar : this.Z) {
                    if (dVar.j().equals(string)) {
                        f.a(this.e0, dVar, "splash");
                        arrayList.add(string);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setAllowSkip(int i2) {
        this.h0 = i2;
    }

    public void setCampaignList(List<d> list) {
        this.Z = list;
    }

    public void setCountdownS(int i2) {
        this.i0 = i2;
    }

    public void setDevCloseBtnStatus(int i2) {
        this.g0 = i2;
    }

    public void setSplashBridgeListener(a aVar) {
        if (aVar != null) {
            this.k0 = aVar;
        }
    }

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            a aVar = this.k0;
            if (aVar != null) {
                aVar.toggleCloseBtn(iOptInt);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.splash.js.ISplashBridge
    public void triggerCloseBtn(Object obj, String str) {
        a aVar = this.k0;
        if (aVar != null) {
            aVar.triggerCloseBtn(obj, str);
        }
    }

    @Override // com.smartdigimkt.s4.b
    public void unload() {
        close();
    }

    public void updateContext(Context context) {
        this.f34723Y = new WeakReference<>(context);
    }

    public void updateCountDown(int i2) {
        this.j0 = i2;
    }

    @Override // com.smartdigimkt.s4.b
    public void useCustomClose(boolean z2) {
        int i2 = z2 ? 2 : 1;
        try {
            a aVar = this.k0;
            if (aVar != null) {
                aVar.toggleCloseBtn(i2);
            }
        } catch (Throwable unused) {
        }
    }
}

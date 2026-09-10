package com.smartdigimkt.expressad.advanced.js;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.p004ironsource.d9;
import com.smartdigimkt.c.c;
import com.smartdigimkt.c0.f;
import com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp;
import com.smartdigimkt.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.f.a;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.n.h;
import com.smartdigimkt.v0.n;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class NativeAdvancedJSBridgeImpl extends CommonBannerJSBridgeImp {
    private WeakReference<Context> Z;
    private List<d> e0;
    private String f0;
    private String g0;
    private int h0;
    private int i0;
    private a k0;
    private NativeAdvancedExpandDialog l0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f34660Y = "NativeAdvancedJSBridgeImpl";
    private int j0 = 5;

    public NativeAdvancedJSBridgeImpl(Context context, String str, String str2) {
        this.g0 = str;
        this.f0 = str2;
        this.Z = new WeakReference<>(context);
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void click(Object obj, String str) {
        try {
            List<d> list = this.e0;
            d dVar = (list == null || list.size() <= 0) ? null : this.e0.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectB = d.b(dVar);
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
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
            WeakReference<Context> weakReference = this.Z;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            NativeAdvancedExpandDialog nativeAdvancedExpandDialog = this.l0;
            if (nativeAdvancedExpandDialog == null || !nativeAdvancedExpandDialog.isShowing()) {
                NativeAdvancedExpandDialog nativeAdvancedExpandDialog2 = new NativeAdvancedExpandDialog(this.Z.get(), bundle, this.k0);
                this.l0 = nativeAdvancedExpandDialog2;
                nativeAdvancedExpandDialog2.setCampaignList(this.f0, this.e0);
                this.l0.show();
                a aVar = this.k0;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void getFileInfo(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            CommonJSBridgeImpUtils.callbackExcep(obj, "params is empty");
            return;
        }
        try {
            NativeAdvancedJsUtils.getFileInfo(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.mraid.IMraidJSBridge
    public d getMraidCampaign() {
        List<d> list = this.e0;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.e0.get(0);
    }

    public List<d> getmCampaignList() {
        return this.e0;
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            c cVar = new c(b.p().k());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.h0);
            jSONObject2.put("customURLScheme", 1);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(d9.h.G, cVar.b());
            jSONObject.put("campaignList", d.a(this.e0));
            com.smartdigimkt.n1.c cVarA = com.smartdigimkt.n1.b.b().a(com.smartdigimkt.u.a.f().a(), this.f0);
            if (cVarA == null) {
                cVarA = com.smartdigimkt.n1.c.c(this.f0);
            }
            if (!TextUtils.isEmpty(this.g0)) {
                cVarA.g(this.g0);
            }
            cVarA.h(this.f0);
            cVarA.j(this.j0);
            cVarA.a(this.i0);
            jSONObject.put("unitSetting", cVarA.N());
            jSONObject.put("appSetting", new JSONObject());
            jSONObject.put("sdk_info", com.smartdigimkt.h.a.f35551a);
            jSONObject.toString();
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void install(Object obj, String str) {
        try {
            List<d> list = this.e0;
            d dVar = (list == null || list.size() <= 0) ? null : this.e0.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectB = d.b(dVar);
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
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

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
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

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void readyStatus(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            if (!(obj instanceof com.smartdigimkt.n.b) || (windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a) == null) {
                return;
            }
            try {
                windVaneWebView.getWebViewListener().readyState(windVaneWebView, new JSONObject(str).getInt("isReady"));
            } catch (Exception unused) {
                windVaneWebView.getWebViewListener().readyState(windVaneWebView, 2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void release() {
        if (this.k0 != null) {
            this.k0 = null;
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
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
                    Context contextK = b.p().k();
                    List<d> list = this.e0;
                    com.smartdigimkt.o.a.a(contextK, list != null ? list.get(0) : null, "", strA, false, iOptInt != 0);
                } else {
                    Context contextK2 = b.p().k();
                    List<d> list2 = this.e0;
                    com.smartdigimkt.o.a.a(contextK2, list2 != null ? list2.get(0) : null, "", strA, false, iOptInt != 0, iOptInt2);
                }
            }
            h.a().b(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
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

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void sendImpressions(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string = jSONArray.getString(i2);
                for (d dVar : this.e0) {
                    if (dVar.j().equals(string)) {
                        f.a(this.f0, dVar, f.f34028h);
                        arrayList.add(string);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setAllowSkip(int i2) {
        this.i0 = i2;
    }

    public void setCampaignList(List<d> list) {
        this.e0 = list;
    }

    public void setCountdownS(int i2) {
        this.j0 = i2;
    }

    public void setDevCloseBtnStatus(int i2) {
        this.h0 = i2;
    }

    public void setNativeAdvancedBridgeListener(a aVar) {
        if (aVar != null) {
            this.k0 = aVar;
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
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

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void triggerCloseBtn(Object obj, String str) {
        if (this.k0 != null) {
            NativeAdvancedJsUtils.callbackSuccess(obj);
            this.k0.triggerCloseBtn(obj, str);
        }
    }

    @Override // com.smartdigimkt.s4.b
    public void unload() {
        close();
    }

    public void updateContext(Context context) {
        this.Z = new WeakReference<>(context);
    }

    @Override // com.smartdigimkt.s4.b
    public void useCustomClose(boolean z2) {
        try {
            if (this.i0 == -1) {
                int i2 = z2 ? 2 : 1;
                a aVar = this.k0;
                if (aVar != null) {
                    aVar.toggleCloseBtn(i2);
                }
            }
        } catch (Throwable unused) {
        }
    }
}

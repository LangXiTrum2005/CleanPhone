package com.smartdigimkt.y0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.c0.f;
import com.smartdigimkt.c3.i;
import com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp;
import com.smartdigimkt.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.smartdigimkt.n.h;
import com.smartdigimkt.p6.o;
import com.smartdigimkt.v0.n;
import com.smartdigimkt.v0.u;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class c extends CommonBannerJSBridgeImp {
    private static final String k0 = "BannerJSBridgeImpl";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private WeakReference<Context> f40019Y;
    private List<d> Z;
    private String e0;
    private String f0;
    private int g0;
    private com.smartdigimkt.a1.a h0;
    private b i0;
    private boolean j0 = false;

    public c(Context context, String str, String str2) {
        this.e0 = str;
        this.f0 = str2;
        this.f40019Y = new WeakReference<>(context);
    }

    public void a(com.smartdigimkt.a1.a aVar) {
        if (aVar != null) {
            this.h0 = aVar;
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void click(Object obj, String str) {
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
            com.smartdigimkt.a1.a aVar = this.h0;
            if (aVar != null) {
                aVar.a(dVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.s4.b
    public void close() {
        try {
            com.smartdigimkt.a1.a aVar = this.h0;
            if (aVar != null) {
                aVar.close();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.s4.b
    public void expand(String str, boolean z2) {
        Context context;
        String strD0;
        try {
            String str2 = "";
            if (getMraidCampaign() != null) {
                if (TextUtils.isEmpty(getMraidCampaign().c0())) {
                    strD0 = getMraidCampaign().d0();
                } else {
                    strD0 = "file:////" + getMraidCampaign().c0();
                }
                str2 = strD0;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str = str2;
            }
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z2);
            WeakReference<Context> weakReference = this.f40019Y;
            if (weakReference != null && (context = weakReference.get()) != null) {
                b bVar = this.i0;
                if (bVar != null && bVar.isShowing()) {
                    return;
                }
                b bVar2 = new b(context, bundle, this.h0);
                this.i0 = bVar2;
                bVar2.a(this.f0, this.Z);
                this.i0.show();
            }
            com.smartdigimkt.a1.a aVar = this.h0;
            if (aVar != null) {
                aVar.a(true);
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
            a(obj, new JSONObject(str));
        } catch (Throwable th) {
            th.getMessage();
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

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.smartdigimkt.v0.c cVar = new com.smartdigimkt.v0.c(com.smartdigimkt.m6.b.p().k());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.g0);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(d9.h.G, cVar.a());
            jSONObject.put("campaignList", d.a(this.Z));
            com.smartdigimkt.n1.c cVarE = com.smartdigimkt.n1.b.b().e(com.smartdigimkt.u.a.f().a(), this.f0);
            if (cVarE == null) {
                cVarE = com.smartdigimkt.n1.c.a(this.f0);
            }
            if (!TextUtils.isEmpty(this.e0)) {
                cVarE.g(this.e0);
            }
            jSONObject.put("unitSetting", cVarE.N());
            jSONObject.put("appSetting", new JSONObject());
            jSONObject.put("sdk_info", com.smartdigimkt.h.a.f35551a);
            jSONObject.toString();
            h.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.s4.b
    public void open(String str) {
        try {
            if (this.Z.size() > 1) {
                com.smartdigimkt.m6.b.p().k().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.smartdigimkt.a1.a aVar = this.h0;
            if (aVar != null) {
                aVar.a(true, str);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                h.a().b(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
                com.smartdigimkt.a1.a aVar = this.h0;
                if (aVar != null) {
                    aVar.readyStatus(iOptInt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void release() {
        if (this.h0 != null) {
            this.h0 = null;
        }
        if (this.i0 != null) {
            this.i0 = null;
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void reportUrls(Object obj, String str) {
        super.reportUrls(obj, str);
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
                    com.smartdigimkt.o.a.a(com.smartdigimkt.m6.b.p().k(), (d) null, "", strA, false, iOptInt != 0);
                } else {
                    com.smartdigimkt.o.a.a(com.smartdigimkt.m6.b.p().k(), null, "", strA, false, iOptInt != 0, iOptInt2);
                }
            }
            h.a().b(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
        } catch (Throwable unused) {
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
                for (d dVar : this.Z) {
                    if (dVar.j().equals(string)) {
                        f.a(this.f0, dVar, "banner");
                        arrayList.add(string);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setCampaignList(List<d> list) {
        this.Z = list;
    }

    public void setDevCloseBtnStatus(int i2) {
        this.g0 = i2;
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            com.smartdigimkt.a1.a aVar = this.h0;
            if (aVar != null) {
                aVar.toggleCloseBtn(iOptInt);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.bridge.CommonBannerJSBridgeImp, com.smartdigimkt.expressad.atsignalcommon.bridge.IBannerJSBridge
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String strOptString = new JSONObject(str).optString("state");
            com.smartdigimkt.a1.a aVar = this.h0;
            if (aVar != null) {
                aVar.triggerCloseBtn(strOptString);
            }
            h.a().b(obj, CommonJSBridgeImpUtils.codeToJsonString(0));
        } catch (Throwable unused) {
            h.a().b(obj, CommonJSBridgeImpUtils.codeToJsonString(-1));
        }
    }

    @Override // com.smartdigimkt.s4.b
    public void unload() {
        close();
    }

    @Override // com.smartdigimkt.s4.b
    public void useCustomClose(boolean z2) {
        int i2 = z2 ? 2 : 1;
        try {
            com.smartdigimkt.a1.a aVar = this.h0;
            if (aVar != null) {
                aVar.toggleCloseBtn(i2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Object obj, JSONObject jSONObject) {
        int i2;
        int i3;
        boolean z2;
        String str;
        JSONObject jSONObject2 = new JSONObject();
        int i4 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "params is null");
                h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e2) {
                e2.getMessage();
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray == null || jSONArray.length() <= 0) {
                try {
                    jSONObject2.put("code", 1);
                    jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "resource is null");
                    h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                } catch (JSONException e3) {
                    e3.getMessage();
                    return;
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            int i5 = 0;
            while (i5 < length) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i5);
                String strOptString = jSONObject3.optString("ref", "");
                int i6 = jSONObject3.getInt("type");
                JSONObject jSONObject4 = new JSONObject();
                if (i6 != i4 || TextUtils.isEmpty(strOptString)) {
                    i2 = length;
                    i3 = i5;
                    z2 = false;
                    if (i6 == 2 && !TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("type", 2);
                        jSONObject5.put("path", i.a().f(strOptString) == null ? "" : i.a().c(strOptString));
                        jSONObject4.put(strOptString, jSONObject5);
                        jSONArray2.put(jSONObject4);
                    } else if (i6 == 3 && !TextUtils.isEmpty(strOptString)) {
                        try {
                            File file = new File(strOptString);
                            if (file.exists() && file.isFile() && file.canRead()) {
                                str = "file:////" + strOptString;
                            } else {
                                str = "";
                            }
                        } catch (Throwable th) {
                            if (com.smartdigimkt.b.b.f33800a) {
                                th.printStackTrace();
                            }
                        }
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("type", 3);
                        jSONObject6.put("path", str);
                        jSONObject4.put(strOptString, jSONObject6);
                        jSONArray2.put(jSONObject4);
                    } else if (i6 == 4 && !TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put("type", 4);
                        jSONObject7.put("path", u.a(strOptString) == null ? "" : u.a(strOptString));
                        jSONObject4.put(strOptString, jSONObject7);
                        jSONArray2.put(jSONObject4);
                    }
                } else {
                    JSONObject jSONObject8 = new JSONObject();
                    o oVarB = com.smartdigimkt.c3.a.a().b(strOptString);
                    if (oVarB != null) {
                        jSONObject8.put("type", 1);
                        i2 = length;
                        i3 = i5;
                        jSONObject8.put("videoDataLength", oVarB.d());
                        String strE = oVarB.e();
                        if (TextUtils.isEmpty(strE)) {
                            jSONObject8.put("path", "");
                            jSONObject8.put("path4Web", "");
                        } else {
                            jSONObject8.put("path", strE);
                            jSONObject8.put("path4Web", strE);
                        }
                        if (oVarB.c() == 100) {
                            jSONObject8.put("downloaded", 1);
                            z2 = false;
                        } else {
                            z2 = false;
                            jSONObject8.put("downloaded", 0);
                        }
                        jSONObject4.put(strOptString, jSONObject8);
                        jSONArray2.put(jSONObject4);
                    } else {
                        i2 = length;
                        i3 = i5;
                        z2 = false;
                    }
                }
                i5 = i3 + 1;
                length = i2;
                i4 = 1;
            }
            jSONObject2.put("resource", jSONArray2);
            h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            return;
        } catch (Throwable th2) {
            jSONObject2.put("code", 1);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th2.getLocalizedMessage());
            h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
        try {
            jSONObject2.put("code", 1);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th2.getLocalizedMessage());
            h.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (JSONException e4) {
            e4.getMessage();
        }
    }
}

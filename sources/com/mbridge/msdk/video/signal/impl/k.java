package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.ironsource.C0239a2;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class k extends l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Activity f38163t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f38164u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f38165v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CampaignEx f38167x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<CampaignEx> f38168y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f38169z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f38166w = 0;
    private String A = "";
    private String B = "";
    private boolean C = false;
    private boolean D = false;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f38173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f38174e;

        public a(String str, String str2, String str3, String str4, int i10) {
            this.f38170a = str;
            this.f38171b = str2;
            this.f38172c = str3;
            this.f38173d = str4;
            this.f38174e = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(k.this.f38163t.getApplication())).a(new com.mbridge.msdk.foundation.entity.n("2000039", this.f38170a, this.f38171b, this.f38172c, this.f38173d, k.this.f38167x.getId(), this.f38174e, m0.a(k.this.f38163t.getApplication(), this.f38174e)));
        }
    }

    public k(Activity activity, CampaignEx campaignEx) {
        this.f38163t = activity;
        this.f38167x = campaignEx;
    }

    private String A() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f38148j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", this.A);
            jSONObject2.put("rootViewInstanceId", this.B);
            jSONObject2.put("isRootTemplateWebView", this.C);
            jSONObject.put("sdk_info", "MAL_17.1.61,3.0.1");
            jSONObject2.put("playVideoMute", this.f38151n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<CampaignEx> list = this.f38168y;
            if (list == null || list.size() <= 0) {
                jSONArray.put(CampaignEx.campaignToJsonObject(this.f38167x));
            } else {
                for (CampaignEx campaignEx : this.f38168y) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(campaignEx, campaignEx.isReady(), b(campaignEx)));
                }
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", x());
            String strG = com.mbridge.msdk.setting.i.b().g(com.mbridge.msdk.foundation.controller.c.n().b());
            if (!TextUtils.isEmpty(strG)) {
                JSONObject jSONObject3 = new JSONObject(strG);
                c(jSONObject3);
                String strE = com.mbridge.msdk.setting.i.b().e(this.f38148j);
                if (!TextUtils.isEmpty(strE)) {
                    jSONObject3.put("ivreward", new JSONObject(strE));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", w());
            if (!TextUtils.isEmpty(this.f38148j)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f38148j);
            }
            jSONObject.put("rw_plus", this.D ? "1" : "0");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return jSONObject.toString();
    }

    private JSONObject B() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(this.f38148j)) {
                return jSONObject;
            }
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f38148j);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject C() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.mbridge.msdk.videocommon.setting.c cVar = this.f38149k;
            if (cVar == null) {
                return jSONObject;
            }
            jSONObject.put("unitSetting", cVar.H());
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject s() {
        JSONObject jSONObject = new JSONObject();
        try {
            String strG = com.mbridge.msdk.setting.i.b().g(com.mbridge.msdk.foundation.controller.c.n().b());
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put("appSetting", new JSONObject(strG));
                return jSONObject;
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONObject t() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f38151n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(CampaignEx.campaignToJsonObject(this.f38167x));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", x());
            String strG = com.mbridge.msdk.setting.i.b().g(com.mbridge.msdk.foundation.controller.c.n().b());
            if (!TextUtils.isEmpty(strG)) {
                JSONObject jSONObject3 = new JSONObject(strG);
                c(jSONObject3);
                String strE = com.mbridge.msdk.setting.i.b().e(this.f38148j);
                if (!TextUtils.isEmpty(strE)) {
                    jSONObject3.put("ivreward", strE);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", w());
            return jSONObject;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject u() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
        return aVarC != null ? aVarC.k() : jSONObject;
    }

    private JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        com.mbridge.msdk.videocommon.setting.c cVar = this.f38149k;
        return cVar != null ? cVar.H() : jSONObject;
    }

    private JSONObject y() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_info", "MAL_17.1.61,3.0.1");
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f38151n);
            jSONObject2.put("instanceId", this.A);
            jSONObject.put("sdkSetting", jSONObject2);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public void c(CampaignEx campaignEx) {
        this.f38167x = campaignEx;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.e
    public void click(int i10, String str) {
        AppletsModel appletsModel;
        List<CampaignEx> list;
        int i11;
        super.click(i10, str);
        CampaignEx campaignEx = this.f38167x;
        if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
            b(str);
        }
        try {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                    this.f38150m.a(true);
                    return;
                }
                CampaignEx campaignEx2 = this.f38167x;
                if (campaignEx2 == null || campaignEx2.getCbd() <= -2) {
                    com.mbridge.msdk.videocommon.setting.c cVar = this.f38149k;
                    i11 = cVar != null ? cVar.i() : 1;
                } else {
                    i11 = this.f38167x.getCbd();
                }
                if (i11 == -1) {
                    a(new com.mbridge.msdk.video.signal.impl.a.b(this, this.f38150m));
                }
                this.f38166w = i10;
                click(1, str);
                return;
            }
            if (this.f38167x == null && (list = this.f38168y) != null && list.size() > 0) {
                this.f38167x = this.f38168y.get(0);
            }
            CampaignEx campaignEx3 = this.f38167x;
            if (campaignEx3 == null) {
                return;
            }
            CampaignEx campaignExA = a(str, campaignEx3);
            if (this.f38166w != 3) {
                this.f38166w = i10;
            }
            a(campaignExA);
            if (campaignExA != null && (appletsModel = AppletModelManager.getInstance().get(campaignExA)) != null) {
                appletsModel.setUserClick(true);
                AppletModelManager.getInstance().replace(appletsModel, campaignExA);
            }
            a(campaignExA, this.f38163t);
        } catch (Throwable th2) {
            q0.b("DefaultJSCommon", th2.getMessage(), th2);
        }
    }

    public void d(String str) {
        this.B = str;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String e() {
        q0.a("DefaultJSCommon", "getNotchArea");
        return this.f38165v;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void f() {
        super.f();
        try {
            Activity activity = this.f38163t;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th2) {
            q0.b("DefaultJSCommon", th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playVideoMute", this.f38151n);
            jSONObject.put("userVideoMute", this.f38152o);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    public void h(int i10) {
        this.f38169z = i10;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i10, String str) {
        super.handlerH5Exception(i10, str);
        try {
            this.f38150m.a(i10, str);
        } catch (Throwable th2) {
            q0.b("DefaultJSCommon", th2.getMessage(), th2);
        }
    }

    public void r() {
        this.f38164u = "";
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void setActivity(Activity activity) {
        this.f38163t = activity;
    }

    public int v() {
        return this.f38169z;
    }

    private void b(String str) {
        List<CampaignEx> list;
        if (this.f38167x == null || (list = this.f38168y) == null || list.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.f38167x = this.f38168y.get(jSONObject.getInt("camp_position"));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void a(List<CampaignEx> list) {
        this.f38168y = list;
    }

    public void c(boolean z10) {
        this.C = z10;
    }

    public void d(boolean z10) {
        this.D = z10;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void h() {
        super.h();
        com.mbridge.msdk.video.signal.a.InterfaceC0207a interfaceC0207a = this.f38150m;
        if (interfaceC0207a != null) {
            interfaceC0207a.a();
        }
    }

    private CampaignEx a(String str, CampaignEx campaignEx) {
        String strValueOf;
        String strValueOf2;
        if (TextUtils.isEmpty(str)) {
            return campaignEx;
        }
        if (TextUtils.isEmpty(str) && campaignEx == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject);
                if (campaignWithBackData == null) {
                    campaignWithBackData = campaignEx;
                }
                if (!TextUtils.isEmpty(str)) {
                    a(jSONObjectCampaignToJsonObject, campaignWithBackData);
                    JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(com.mbridge.msdk.foundation.same.a.f33724j);
                    if (jSONObjectOptJSONObject != null) {
                        strValueOf = String.valueOf(v0.a(this.f38163t, Integer.valueOf(jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.f33722h)).intValue()));
                        strValueOf2 = String.valueOf(v0.a(this.f38163t, Integer.valueOf(jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.f33723i)).intValue()));
                    } else {
                        strValueOf = "-999";
                        strValueOf2 = "-999";
                    }
                    campaignWithBackData.setClickURL(com.mbridge.msdk.click.c.a(campaignWithBackData.getClickURL(), strValueOf, strValueOf2));
                    String noticeUrl = campaignWithBackData.getNoticeUrl();
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        StringBuilder sb2 = new StringBuilder();
                        while (itKeys.hasNext()) {
                            sb2.append(X3.j.f27832c);
                            String next = itKeys.next();
                            String strOptString = jSONObjectOptJSONObject.optString(next);
                            if (com.mbridge.msdk.foundation.same.a.f33722h.equals(next) || com.mbridge.msdk.foundation.same.a.f33723i.equals(next)) {
                                strOptString = String.valueOf(v0.a(this.f38163t, Integer.valueOf(strOptString).intValue()));
                            }
                            sb2.append(next);
                            sb2.append(X3.j.f27830b);
                            sb2.append(strOptString);
                        }
                        campaignWithBackData.setNoticeUrl(noticeUrl + ((Object) sb2));
                    }
                }
                return campaignWithBackData;
            } catch (JSONException e10) {
                e10.printStackTrace();
                return campaignEx;
            } catch (Throwable th2) {
                th2.printStackTrace();
                return campaignEx;
            }
        }
        try {
            JSONObject jSONObjectCampaignToJsonObject2 = CampaignEx.campaignToJsonObject(campaignEx);
            JSONObject jSONObject = new JSONObject(str);
            b(jSONObject);
            try {
                if (!jSONObject.has(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                    jSONObjectCampaignToJsonObject2.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, "");
                }
            } catch (Exception unused) {
            }
            Iterator<String> itKeys2 = jSONObject.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                jSONObjectCampaignToJsonObject2.put(next2, jSONObject.getString(next2));
            }
            CampaignEx campaignWithBackData2 = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject2);
            a(jSONObjectCampaignToJsonObject2, campaignWithBackData2);
            return campaignWithBackData2;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return campaignEx;
        }
    }

    public void c(String str) {
        this.A = str;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String c() {
        this.f38150m.onInitSuccess();
        this.f38139a = true;
        if (TextUtils.isEmpty(this.f38164u)) {
            this.f38164u = A();
        } else {
            this.f38164u = v0.b(this.f38164u, "tun", m0.A() + "");
        }
        return this.f38164u;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String f(int i10) {
        switch (i10) {
            case 1:
                return y().toString();
            case 2:
                return B().toString();
            case 3:
                return s().toString();
            case 4:
                return C().toString();
            case 5:
                return u().toString();
            case 6:
                return z().toString();
            default:
                return t().toString();
        }
    }

    public k(Activity activity, CampaignEx campaignEx, List<CampaignEx> list) {
        this.f38163t = activity;
        this.f38167x = campaignEx;
        this.f38168y = list;
    }

    private boolean b(CampaignEx campaignEx) {
        com.mbridge.msdk.setting.g gVarF;
        try {
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            long jD0 = (TextUtils.isEmpty(strB) || (gVarF = com.mbridge.msdk.setting.i.b().f(strB)) == null) ? 0L : gVarF.d0() * 1000;
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            long jE = aVarC != null ? aVarC.e() : 0L;
            if (campaignEx != null) {
                return campaignEx.isSpareOffer(jE, jD0);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private void c(JSONObject jSONObject) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            String string = y0.a(contextD, "MBridge_ConfirmTitle" + this.f38148j, "").toString();
            String string2 = y0.a(contextD, "MBridge_ConfirmContent" + this.f38148j, "").toString();
            String string3 = y0.a(contextD, "MBridge_CancelText" + this.f38148j, "").toString();
            String string4 = y0.a(contextD, "MBridge_ConfirmText" + this.f38148j, "").toString();
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put("confirm_title", string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject.put("confirm_description", string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                jSONObject.put("confirm_t", string3);
            }
            if (!TextUtils.isEmpty(string4)) {
                jSONObject.put("confirm_c_play", string4);
            }
            if (TextUtils.isEmpty(string4)) {
                return;
            }
            jSONObject.put("confirm_c_rv", string4);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject, CampaignEx campaignEx) {
        try {
            String strOptString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            campaignEx.setCampaignUnitId(strOptString);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void a(int i10, String str) {
        super.a(i10, str);
        if (i10 != 2) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = new a(jSONObject.optString(NotificationCompat.CATEGORY_EVENT, NotificationCompat.CATEGORY_EVENT), jSONObject.optString("template", C0239a2.f28156f), jSONObject.optString(TtmlNode.TAG_LAYOUT, C0239a2.f28156f), jSONObject.optString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f38148j), m0.s(this.f38163t.getApplication()));
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
            } else {
                aVar.run();
            }
        } catch (Throwable th2) {
            q0.b("DefaultJSCommon", th2.getMessage(), th2);
        }
    }

    private void a(CampaignEx campaignEx) {
        try {
            int i10 = this.f38166w;
            if (i10 == 3) {
                campaignEx.setClickTempSource(2);
                if (campaignEx.getTriggerClickSource() == 0) {
                    campaignEx.setTriggerClickSource(2);
                    return;
                }
                return;
            }
            if (i10 != 1 || campaignEx.getClickTempSource() == 2) {
                return;
            }
            campaignEx.setClickTempSource(1);
        } catch (Exception e10) {
            q0.b("DefaultJSCommon", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f38165v = str;
    }
}

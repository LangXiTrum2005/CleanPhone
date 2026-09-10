package com.mbridge.msdk.mbsignalcommon.communication;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f34867a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f34868b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f34869c = 1;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34870a;

        public a(CampaignEx campaignEx) {
            this.f34870a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j jVarA = j.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                if (jVarA != null) {
                    if (jVarA.a(this.f34870a.getId())) {
                        jVarA.b(this.f34870a.getId());
                    } else {
                        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                        gVar.a(this.f34870a.getId());
                        gVar.b(this.f34870a.getFca());
                        gVar.c(this.f34870a.getFcb());
                        gVar.a(0);
                        gVar.d(1);
                        gVar.a(System.currentTimeMillis());
                        jVarA.b(gVar);
                    }
                }
                d.b(this.f34870a.getCampaignUnitId(), this.f34870a);
            } catch (Throwable th2) {
                q0.b(d.f34867a, th2.getMessage(), th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.buffer.b.f33747c == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.buffer.b.a(str, campaignEx, "banner");
    }

    public static void a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject);
            if (campaignWithBackData == null) {
                a(obj, "data camapign is empty");
            } else {
                a(campaignWithBackData);
                b(obj, "");
            }
        } catch (Throwable th2) {
            a(obj, th2.getMessage());
        }
    }

    public static void b(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f34868b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            a(obj, e10.getMessage());
            q0.a(f34867a, e10.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx) {
        new Thread(new a(campaignEx)).start();
    }

    public static String a(float f10, float f11) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f33722h, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), f10));
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f33723i, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), f11));
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f33726m, 0);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f33725k, com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.l, v0.d(com.mbridge.msdk.foundation.controller.c.n().d()));
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f33724j, jSONObject2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            q0.b(f34867a, "code to string is error");
            return "";
        }
    }

    public static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f34869c);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            q0.a(f34867a, e10.getMessage());
        }
    }
}

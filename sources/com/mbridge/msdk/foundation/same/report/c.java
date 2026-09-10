package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f33903a = "c";

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements com.mbridge.msdk.tracker.h {
        @Override // com.mbridge.msdk.tracker.h
        public JSONObject a(com.mbridge.msdk.tracker.e eVar) {
            if (eVar == null) {
                return null;
            }
            JSONObject jSONObjectI = eVar.i();
            if (jSONObjectI == null) {
                jSONObjectI = new JSONObject();
            }
            try {
                jSONObjectI.put(X3.i.W, eVar.g());
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                int iS = m0.s(contextD);
                if (!jSONObjectI.has("network_type")) {
                    jSONObjectI.put("network_type", iS);
                    jSONObjectI.put("network_str", m0.a(contextD, iS));
                }
                if (!jSONObjectI.has(UserDataStore.STATE)) {
                    jSONObjectI.put(UserDataStore.STATE, System.currentTimeMillis());
                }
                String strOptString = jSONObjectI.optString(MBridgeConstans.PROPERTIES_UNIT_ID, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    String str = com.mbridge.msdk.foundation.controller.a.f33385r.get(strOptString);
                    jSONObjectI.put("u_stid", str != null ? str : "");
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && !jSONObjectI.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                    jSONObjectI.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f33721g) && !jSONObjectI.has("c")) {
                    jSONObjectI.put("c", com.mbridge.msdk.foundation.same.a.f33721g);
                }
                return jSONObjectI;
            } catch (Exception e10) {
                q0.b(c.f33903a, e10.getMessage());
                return jSONObjectI;
            }
        }
    }

    public static JSONObject b() {
        return com.mbridge.msdk.foundation.same.report.a.a();
    }

    public static com.mbridge.msdk.tracker.f c() {
        return new com.mbridge.msdk.tracker.n();
    }

    public static com.mbridge.msdk.tracker.h d() {
        return new a();
    }

    public static boolean a(String str) {
        com.mbridge.msdk.setting.g gVarI = f2.i(com.mbridge.msdk.setting.i.b());
        if (gVarI == null) {
            return true;
        }
        return b.a(gVarI, str);
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            jSONObject.remove(O6.B);
            jSONObject.remove("brand");
            jSONObject.remove("screen_size");
            jSONObject.remove("sub_ip");
            jSONObject.remove("network_type");
            jSONObject.remove("useragent");
            jSONObject.remove(O6.f26706d0);
            jSONObject.remove("language");
            jSONObject.remove("network_str");
            jSONObject.remove("mnc");
            jSONObject.remove("mcc");
            jSONObject.remove("os_version");
            jSONObject.remove("gp_version");
            jSONObject.remove("country_code");
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.wrapper.e.f33879d);
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.wrapper.e.f33880e);
            jSONObject.remove("power_rate");
            jSONObject.remove("charging");
            jSONObject.remove("timezone");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return;
        }
        jSONObject.remove(O6.X0);
        jSONObject.remove("gaid2");
        jSONObject.remove("oaid");
        jSONObject.remove("az_aid_info");
    }
}

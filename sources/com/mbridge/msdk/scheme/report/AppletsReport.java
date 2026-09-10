package com.mbridge.msdk.scheme.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class AppletsReport {
    public static final String APPLETS_API_VALUE = "2000118";
    private static final String TAG = "com.mbridge.msdk.scheme.report.AppletsReport";

    public static void reportAppletsLoadState(Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(X3.i.W, APPLETS_API_VALUE);
                jSONObject.put("network_type", m0.s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                if (!TextUtils.isEmpty(a.V)) {
                    jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, a.V);
                }
                if (!TextUtils.isEmpty(a.f33721g)) {
                    jSONObject.put("c", a.f33721g);
                }
                jSONObject.put(CampaignEx.JSON_KEY_HB, 0);
                jSONObject.put("rid_n", str3);
                jSONObject.put("reason", str);
                d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b(TAG, th2.getMessage());
            }
        }
    }
}

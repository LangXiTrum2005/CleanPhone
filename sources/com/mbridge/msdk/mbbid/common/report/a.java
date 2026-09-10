package com.mbridge.msdk.mbbid.common.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static void a(Context context, String str, String str2, String str3, String str4) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            e eVar = new e();
            eVar.a("result", 1);
            eVar.a("bidid", str2);
            eVar.a("bid_tk", str4);
            eVar.a("lrid", str3);
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            d.b().b("2000064", eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            e eVar = new e();
            eVar.a("result", 2);
            eVar.a("lrid", str3);
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            eVar.a("reason", str2);
            d.b().b("2000064", eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}

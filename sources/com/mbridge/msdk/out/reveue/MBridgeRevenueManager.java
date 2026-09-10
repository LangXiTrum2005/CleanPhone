package com.mbridge.msdk.out.reveue;

import android.content.Context;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBridgeRevenueManager {
    public static void track(Context context, MBridgeRevenueParamsEntity mBridgeRevenueParamsEntity) {
        if (c.n().d() == null) {
            c.n().b(context);
        }
        try {
            e eVar = new e();
            eVar.a("name", mBridgeRevenueParamsEntity.getMediationName());
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.a("m_start_ad_rev", eVar);
            d.b().a("m_start_ad_rev", cVar);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        com.mbridge.msdk.foundation.same.report.e.c().b(mBridgeRevenueParamsEntity.getReportData());
    }
}

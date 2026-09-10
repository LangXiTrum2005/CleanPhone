package com.mbridge.msdk.video.module.report;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.c1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static void a(String str, CampaignEx campaignEx, e eVar) {
        String strA;
        String strA2;
        if (TextUtils.isEmpty(str) || campaignEx == null || eVar == null) {
            return;
        }
        try {
            String mof_template_url = campaignEx.getMof_template_url();
            String strA3 = "";
            if (TextUtils.isEmpty(mof_template_url)) {
                strA = "";
                strA2 = strA;
            } else {
                strA2 = c1.a(mof_template_url, "cltp");
                strA = c1.a(mof_template_url, "xt");
            }
            if (!TextUtils.isEmpty(strA2)) {
                eVar.a("cltp", strA2);
            }
            if (!TextUtils.isEmpty(strA)) {
                eVar.a("xt", strA);
            }
            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            if (rewardTemplateMode != null) {
                String strJ = rewardTemplateMode.j();
                if (!TextUtils.isEmpty(strJ)) {
                    strA3 = c1.a(strJ, "alecfc");
                }
            }
            if (!TextUtils.isEmpty(strA3)) {
                eVar.a("alecfc", strA3);
            }
            d.b().a(str, campaignEx, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}

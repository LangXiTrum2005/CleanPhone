package com.mbridge.msdk.video.dynview.wrapper;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.z;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class c {
    public com.mbridge.msdk.video.dynview.c a(Context context, List<CampaignEx> list) throws Throwable {
        String mof_template_url;
        int iA;
        int mof_tplid;
        int dynamicTempCode;
        if (list == null) {
            return null;
        }
        try {
            float fG = v0.g(com.mbridge.msdk.foundation.controller.c.n().d());
            float f10 = v0.f(com.mbridge.msdk.foundation.controller.c.n().d());
            List<String> arrayList = new ArrayList<>();
            if (list.size() <= 0 || list.get(0) == null) {
                mof_template_url = "";
                iA = 1;
                mof_tplid = 0;
                dynamicTempCode = 0;
            } else {
                iA = com.mbridge.msdk.video.dynview.util.a.a(list.get(0));
                mof_tplid = list.get(0).getMof_tplid();
                mof_template_url = list.get(0).getMof_template_url();
                dynamicTempCode = list.get(0).getDynamicTempCode();
            }
            if (mof_tplid != 0 && !TextUtils.isEmpty(mof_template_url)) {
                arrayList = o0.a(z.a(0, mof_tplid + "", mof_template_url), "template_" + mof_tplid + "_" + iA);
            }
            String str = "mbridge_same_choice_one_layout_portrait";
            if (iA != 1) {
                if (iA == 2) {
                    str = "mbridge_same_choice_one_layout_landscape";
                } else if (com.mbridge.msdk.video.dynview.util.a.a(context)) {
                    str = "mbridge_same_choice_one_layout_landscape";
                    iA = 2;
                } else {
                    iA = 1;
                }
            }
            return com.mbridge.msdk.video.dynview.c.a().a(context).c(str).b(1).b(f10).a(fG).a(list).orientation(iA).fileDirs(arrayList).d(dynamicTempCode).a(mof_tplid).build();
        } catch (Exception e10) {
            q0.b("ViewOptionWrapper", e10.getMessage());
            return null;
        }
    }

    public com.mbridge.msdk.video.dynview.c b(View view, CampaignEx campaignEx) {
        String strJ;
        int iK;
        String str;
        if (campaignEx == null) {
            return null;
        }
        try {
            List<String> arrayList = new ArrayList<>();
            String campaignUnitId = campaignEx.getCampaignUnitId();
            if (campaignEx.getRewardTemplateMode() != null) {
                iK = campaignEx.getRewardTemplateMode().k();
                strJ = campaignEx.getRewardTemplateMode().j();
            } else {
                strJ = "";
                iK = 0;
            }
            int iA = v0.a(strJ, "ia_tp", -5);
            if (iK == 0 || iK == 102 || iK == 202) {
                str = "mbridge_reward_layer_floor";
            } else {
                str = "mbridge_reward_layer_floor_" + iK;
            }
            if (!TextUtils.isEmpty(strJ)) {
                String strA = z.a(1, iK + "", strJ);
                StringBuilder sb2 = new StringBuilder("template_");
                sb2.append(iK);
                arrayList = o0.a(strA, sb2.toString());
            }
            boolean zA = com.mbridge.msdk.video.dynview.util.a.a(strJ);
            String strA2 = com.mbridge.msdk.video.dynview.util.a.a(strJ, "whs_chn");
            com.mbridge.msdk.videocommon.setting.c cVarA = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), campaignUnitId, false);
            int iD = cVarA != null ? cVarA.D() : 0;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(campaignEx);
            return com.mbridge.msdk.video.dynview.c.a().c(str).b(2).a(arrayList2).a(view.getContext()).a(view).c(iD).f(iA).orientation(m0.G(view.getContext())).a(iK).a(zA).b(strA2).fileDirs(arrayList).d(campaignEx.getDynamicTempCode()).build();
        } catch (Exception e10) {
            q0.b("ViewOptionWrapper", e10.getMessage());
            return null;
        }
    }

    public com.mbridge.msdk.video.dynview.c a(View view, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            com.mbridge.msdk.videocommon.setting.c cVarA = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId(), false);
            int iD = cVarA != null ? cVarA.D() : 0;
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            return com.mbridge.msdk.video.dynview.c.a().c("mbridge_reward_layer_floor_bottom").b(3).a(arrayList).a(view.getContext()).a(view).c(iD).orientation(m0.G(view.getContext())).build();
        } catch (Exception e10) {
            q0.b("ViewOptionWrapper", e10.getMessage());
            return null;
        }
    }

    public com.mbridge.msdk.video.dynview.c b(Context context, List<CampaignEx> list) throws Throwable {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    float fG = v0.g(com.mbridge.msdk.foundation.controller.c.n().d());
                    float f10 = v0.f(com.mbridge.msdk.foundation.controller.c.n().d());
                    List<String> arrayList = new ArrayList<>();
                    int dynamicTempCode = list.get(0).getDynamicTempCode();
                    int mof_tplid = list.get(0).getMof_tplid();
                    String mof_template_url = list.get(0).getMof_template_url();
                    int iG = m0.G(context);
                    if (mof_tplid != 0 && !TextUtils.isEmpty(mof_template_url)) {
                        arrayList = o0.a(z.a(0, mof_tplid + "", mof_template_url), "template_" + mof_tplid + "_" + iG);
                    }
                    return com.mbridge.msdk.video.dynview.c.a().c(iG == 1 ? "mbridge_order_layout_list_portrait" : "mbridge_order_layout_list_landscape").b(5).a(context).b(f10).a(fG).a(list).orientation(iG).fileDirs(arrayList).d(dynamicTempCode).a(mof_tplid).build();
                }
            } catch (Exception e10) {
                q0.b("ViewOptionWrapper", e10.getMessage());
            }
        }
        return null;
    }

    public com.mbridge.msdk.video.dynview.c a(Context context, CampaignEx campaignEx, int i10, String str) throws Throwable {
        String string;
        String str2;
        StringBuilder sb2;
        String str3;
        if (campaignEx == null) {
            return null;
        }
        try {
            long ecTemplateId = campaignEx.getEcTemplateId();
            int iG = m0.G(context);
            int iA = v0.a(campaignEx.getendcard_url(), "n_logo", 1);
            if (ecTemplateId == 1302) {
                if (iG == 1) {
                    sb2 = new StringBuilder();
                    str3 = "mbridge_reward_end_card_layout_portrait_";
                } else {
                    sb2 = new StringBuilder();
                    str3 = "mbridge_reward_end_card_layout_landscape_";
                }
                sb2.append(str3);
                sb2.append(ecTemplateId);
                string = sb2.toString();
                str2 = "template_" + str + iG + "_" + ecTemplateId;
            } else {
                string = iG == 1 ? "mbridge_reward_end_card_layout_portrait" : "mbridge_reward_end_card_layout_landscape";
                str2 = "template_" + str + iG;
            }
            List<String> arrayList = new ArrayList<>();
            if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                arrayList = o0.a(z.a(2, i10 + "", campaignEx.getendcard_url()), str2);
            }
            return com.mbridge.msdk.video.dynview.c.a().c(string).b(4).a(context).orientation(m0.G(context)).fileDirs(arrayList).d(campaignEx.getDynamicTempCode()).a(i10).a(str).e(iA).build();
        } catch (Exception e10) {
            q0.b("ViewOptionWrapper", e10.getMessage());
            return null;
        }
    }
}

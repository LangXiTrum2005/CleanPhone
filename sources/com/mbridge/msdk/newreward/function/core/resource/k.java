package com.mbridge.msdk.newreward.function.core.resource;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class k extends c {
    private final v i;

    public k(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        super(bVar, aVar);
        this.i = new v(f(), e(), this);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public int a() {
        return 2;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a, com.mbridge.msdk.newreward.function.core.resource.o
    public String c() {
        CampaignEx campaignExA;
        return (e() == null || (campaignExA = e().a()) == null || campaignExA.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignExA.getRewardTemplateMode().e())) ? "" : campaignExA.getRewardTemplateMode().e();
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a
    public q g() {
        return this.i;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.c
    public boolean p() {
        if (e() == null) {
            return false;
        }
        CampaignEx campaignExA = e().a();
        if (campaignExA == null || campaignExA.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignExA.getRewardTemplateMode().e())) {
            return true;
        }
        ArrayList<Integer> rsIgnoreCheckRule = campaignExA.getRsIgnoreCheckRule();
        if (rsIgnoreCheckRule != null && !rsIgnoreCheckRule.isEmpty()) {
            try {
                return rsIgnoreCheckRule.contains(1);
            } catch (Exception unused) {
            }
        }
        return false;
    }
}

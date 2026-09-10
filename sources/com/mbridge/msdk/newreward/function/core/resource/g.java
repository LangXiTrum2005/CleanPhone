package com.mbridge.msdk.newreward.function.core.resource;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes2.dex */
public class g extends b {
    private final u h;

    public g(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        super(bVar, aVar);
        this.h = new u(f(), e(), this);
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
        return this.h;
    }
}

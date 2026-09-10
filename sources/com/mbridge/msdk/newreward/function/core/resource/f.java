package com.mbridge.msdk.newreward.function.core.resource;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes2.dex */
public class f extends b {
    private final t h;

    public f(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        super(bVar, aVar);
        this.h = new t(f(), e(), this);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public int a() {
        return 4;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a, com.mbridge.msdk.newreward.function.core.resource.o
    public String c() {
        CampaignEx campaignExA;
        return (e() == null || (campaignExA = e().a()) == null || TextUtils.isEmpty(campaignExA.getendcard_url())) ? "" : campaignExA.getendcard_url();
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a
    public q g() {
        return this.h;
    }
}

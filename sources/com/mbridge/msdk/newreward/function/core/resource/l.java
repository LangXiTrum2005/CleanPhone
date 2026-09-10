package com.mbridge.msdk.newreward.function.core.resource;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes2.dex */
public class l extends a<String> {
    public l(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        super(bVar, aVar);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public int a() {
        return 5;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public boolean b() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a, com.mbridge.msdk.newreward.function.core.resource.o
    public String c() {
        return "";
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.o
    public boolean d() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.a
    public q g() {
        return new w(f(), e(), this);
    }

    public String n() {
        CampaignEx campaignExA;
        return (e() == null || (campaignExA = e().a()) == null || TextUtils.isEmpty(campaignExA.getMraid())) ? "" : campaignExA.getMraid();
    }
}

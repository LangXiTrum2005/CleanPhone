package com.mbridge.msdk.newreward.adapter.req;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class h implements com.mbridge.msdk.newreward.adapter.req.a {

    public static final class a implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.core.campaign.a f1588a;
        private final b b;

        public a(com.mbridge.msdk.newreward.function.core.campaign.a aVar, b bVar) {
            this.f1588a = aVar;
            this.b = bVar;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            if (this.b != null && this.f1588a.h().I()) {
                this.b.reqSuccessful(this.f1588a);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (this.b != null && this.f1588a.h().I()) {
                this.b.reqSuccessful(this.f1588a);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.adapter.req.a
    public void a(Object obj, b bVar) throws IOException {
        List<CampaignEx.c.a> listA;
        com.mbridge.msdk.newreward.function.core.campaign.a aVar = (com.mbridge.msdk.newreward.function.core.campaign.a) obj;
        CampaignEx campaignExA = aVar.a();
        String imageUrl = campaignExA.getImageUrl();
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        com.mbridge.msdk.foundation.same.image.b.a(contextD).a(imageUrl, new a(aVar, bVar));
        com.mbridge.msdk.foundation.same.image.b.a(contextD).a(campaignExA.getIconUrl(), new a(aVar, bVar));
        CampaignEx.c rewardTemplateMode = campaignExA.getRewardTemplateMode();
        if (rewardTemplateMode == null || (listA = rewardTemplateMode.a()) == null) {
            return;
        }
        Iterator<CampaignEx.c.a> it = listA.iterator();
        while (it.hasNext()) {
            List<String> list = it.next().f1151a;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    com.mbridge.msdk.foundation.same.image.b.a(contextD).a(it2.next(), new a(aVar, bVar));
                }
            }
        }
    }
}

package com.mbridge.msdk.newreward.function.model;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.adapter.req.i;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.core.campaign.b f1707a;
    private com.mbridge.msdk.newreward.function.core.campaign.b b;
    public List<Integer> c = new ArrayList();

    public static final class a implements com.mbridge.msdk.newreward.adapter.req.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.newreward.adapter.e f1708a;
        private d b;
        private com.mbridge.msdk.newreward.adapter.req.b c;
        private int d;

        public a(com.mbridge.msdk.newreward.adapter.e eVar, d dVar, com.mbridge.msdk.newreward.adapter.req.b bVar, int i) {
            this.f1708a = eVar;
            this.b = dVar;
            this.c = bVar;
            this.d = i;
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            com.mbridge.msdk.newreward.adapter.req.b bVar2 = this.c;
            if (bVar2 == null) {
                return;
            }
            try {
                bVar2.reqFailed(bVar);
            } catch (Exception e) {
                o0.b("MoreOfferCampaignModel", "reqFailed: ", e);
            }
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            try {
                com.mbridge.msdk.newreward.function.core.campaign.b bVar = (com.mbridge.msdk.newreward.function.core.campaign.b) obj;
                bVar.d(this.f1708a.A());
                int iZ = (int) (((double) this.f1708a.z()) * 1.2d);
                bVar.b(iZ);
                bVar.d(iZ);
                bVar.a(Math.max(this.f1708a.o(), bVar.m()));
                int i = this.d;
                if (i == 1) {
                    this.b.b(bVar);
                } else if (i == 2) {
                    this.b.a(bVar);
                }
                if (!TextUtils.isEmpty(bVar.x())) {
                    MBridgeGlobalCommon.SESSION_ID = bVar.x();
                }
                com.mbridge.msdk.newreward.adapter.req.b bVar2 = this.c;
                if (bVar2 == null) {
                    return;
                }
                bVar2.reqSuccessful(obj);
            } catch (Exception e) {
                o0.b("MoreOfferCampaignModel", "reqSuccessful: ", e);
                com.mbridge.msdk.newreward.adapter.req.b bVar3 = this.c;
                if (bVar3 != null) {
                    bVar3.reqFailed(new com.mbridge.msdk.foundation.error.b(880020, e.getMessage()));
                }
            }
        }
    }

    public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        this.b = bVar;
    }

    public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        this.f1707a = bVar;
    }

    public List<Integer> c() {
        return this.c;
    }

    public void a(int i, com.mbridge.msdk.newreward.adapter.e eVar, CampaignEx campaignEx, com.mbridge.msdk.newreward.function.paramter.a aVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        if (campaignEx == null) {
            if (bVar != null) {
                bVar.reqFailed(new com.mbridge.msdk.foundation.error.b(880020, "more_offer MainCampaign is null"));
                return;
            }
            return;
        }
        try {
            try {
                new i(eVar).a(aVar, new a(eVar, this, bVar, i));
            } catch (IOException e) {
                if (bVar == null) {
                } else {
                    bVar.reqFailed(new com.mbridge.msdk.foundation.error.b(880020, e.getMessage()));
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public com.mbridge.msdk.newreward.function.core.campaign.b b() {
        return this.f1707a;
    }

    public com.mbridge.msdk.newreward.function.core.campaign.b a() {
        return this.b;
    }
}

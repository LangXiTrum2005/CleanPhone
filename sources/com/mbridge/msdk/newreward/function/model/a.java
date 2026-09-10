package com.mbridge.msdk.newreward.function.model;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.newreward.adapter.h;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.core.campaign.b f1697a;
    private com.mbridge.msdk.newreward.adapter.e b;

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.function.model.a$a, reason: collision with other inner class name */
    public class C0214a extends com.mbridge.msdk.foundation.same.c.a {
        public C0214a() {
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(str, cVar);
        }
    }

    public static final class b implements com.mbridge.msdk.newreward.adapter.req.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.adapter.e f1699a;
        private final a b;
        private final com.mbridge.msdk.newreward.adapter.req.b c;

        public b(com.mbridge.msdk.newreward.adapter.e eVar, a aVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
            this.f1699a = eVar;
            this.b = aVar;
            this.c = bVar;
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
                o0.b("CampaignModel", "reqFailed: ", e);
            }
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            try {
                com.mbridge.msdk.newreward.function.core.campaign.b bVar = (com.mbridge.msdk.newreward.function.core.campaign.b) obj;
                bVar.d(this.f1699a.A());
                int iZ = (int) (((double) this.f1699a.z()) * 1.2d);
                bVar.b(iZ);
                bVar.d(iZ);
                bVar.a(Math.max(this.f1699a.o(), bVar.m()));
                if (bVar.w() == 0) {
                    this.b.b(bVar);
                    com.mbridge.msdk.newreward.function.database.c.c().a().b(bVar);
                }
                if (!TextUtils.isEmpty(bVar.x())) {
                    MBridgeGlobalCommon.SESSION_ID = bVar.x();
                }
                MBridgeSharedPreferenceModel.getInstance().putInteger("vcn_" + bVar.E(), bVar.G());
                com.mbridge.msdk.newreward.adapter.req.b bVar2 = this.c;
                if (bVar2 == null) {
                    return;
                }
                bVar2.reqSuccessful(obj);
            } catch (Exception e) {
                o0.b("CampaignModel", "reqSuccessful: ", e);
                com.mbridge.msdk.newreward.adapter.req.b bVar3 = this.c;
                if (bVar3 != null) {
                    bVar3.reqFailed(new com.mbridge.msdk.foundation.error.b(880020, e.getMessage()));
                }
            }
        }
    }

    public boolean a(com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        CampaignEx campaignExA;
        if (aVar != null && (campaignExA = aVar.a()) != null) {
            try {
                if (campaignExA.getPlayable_ads_without_video() == 2) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public List<CampaignEx> b() {
        com.mbridge.msdk.newreward.function.core.campaign.b bVar = this.f1697a;
        if (bVar == null) {
            return null;
        }
        return bVar.f();
    }

    public boolean c() {
        com.mbridge.msdk.newreward.function.core.campaign.b bVar = this.f1697a;
        return bVar != null && bVar.L();
    }

    public void a(com.mbridge.msdk.newreward.adapter.e eVar, com.mbridge.msdk.newreward.function.paramter.a aVar, com.mbridge.msdk.newreward.adapter.req.b bVar) {
        this.b = eVar;
        try {
            new com.mbridge.msdk.newreward.adapter.req.c(eVar).a(aVar, new b(eVar, this, bVar));
        } catch (IOException e) {
            if (bVar != null) {
                bVar.reqFailed(new com.mbridge.msdk.foundation.error.b(880020, e.getMessage()));
            }
        }
    }

    public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        this.f1697a = bVar;
    }

    public com.mbridge.msdk.newreward.function.core.campaign.b a() {
        return this.f1697a;
    }

    public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, boolean z) throws MBridgeError {
        boolean z2;
        if (bVar != null && bVar.g() != null) {
            for (com.mbridge.msdk.newreward.function.core.campaign.a aVar : bVar.g()) {
                CampaignEx campaignExA = aVar.a();
                if (campaignExA != null && campaignExA.getOfferType() == 99) {
                    throw new MBridgeError(880021, "APP ALREADY INSTALLED");
                }
                if (campaignExA != null) {
                    if (a(aVar)) {
                        z2 = (y0.a(campaignExA.getendcard_url()) && TextUtils.isEmpty(campaignExA.getMraid())) ? false : true;
                        if (aVar.b() == null && aVar.d() == null) {
                            throw new MBridgeError(880003, "playable offer endcard or mraid is null");
                        }
                    } else {
                        z2 = !y0.a(campaignExA.getVideoUrlEncode());
                        if (aVar.f() == null) {
                            throw new MBridgeError(880003, "No video campaign");
                        }
                    }
                    if (z2) {
                        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                        if (com.mbridge.msdk.util.b.a() && t0.c(campaignExA)) {
                            campaignExA.setRtinsType(t0.c(contextD, campaignExA.getPackageName()) ? 1 : 2);
                        }
                        a(campaignExA);
                        if (z) {
                            continue;
                        } else if (com.mbridge.msdk.foundation.same.c.a(contextD, campaignExA) != 0) {
                            if (com.mbridge.msdk.foundation.same.c.a(contextD, campaignExA) == 1) {
                                aVar.a(false);
                                if (bVar.v() > 0) {
                                    t0.a(bVar.E(), campaignExA, com.mbridge.msdk.foundation.same.a.x);
                                    this.b.a(campaignExA.getId());
                                    throw new MBridgeError(880021, "FILTER BUT CALLBACK SUCCEED");
                                }
                            } else if (com.mbridge.msdk.foundation.same.c.a(contextD, campaignExA) == 2) {
                                aVar.a(false);
                                t0.a(bVar.E(), campaignExA, com.mbridge.msdk.foundation.same.a.x);
                                throw new MBridgeError(880003, "campaign is exception");
                            }
                        } else {
                            aVar.a(true);
                            t0.a(bVar.E(), campaignExA, com.mbridge.msdk.foundation.same.a.x);
                            this.b.a(campaignExA.getId());
                            throw new MBridgeError(880021, "APP ALREADY INSTALLED");
                        }
                    } else {
                        continue;
                    }
                }
            }
            return;
        }
        throw new MBridgeError(880003, "Need show campaign list is NULL!");
    }

    public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        if (bVar == null || bVar.g() == null) {
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        j jVarA = j.a(g.a(contextD));
        Iterator<com.mbridge.msdk.newreward.function.core.campaign.a> it = bVar.g().iterator();
        while (it.hasNext()) {
            CampaignEx campaignExA = it.next().a();
            if (campaignExA != null) {
                if (com.mbridge.msdk.util.b.a()) {
                    if (t0.c(contextD, campaignExA.getPackageName())) {
                        h.a(campaignExA);
                    } else {
                        a(jVarA, campaignExA);
                    }
                } else {
                    a(jVarA, campaignExA);
                }
            }
        }
    }

    private void a(j jVar, CampaignEx campaignEx) {
        if (jVar == null || jVar.a(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
        gVar.a(campaignEx.getId());
        gVar.b(campaignEx.getFca());
        gVar.c(campaignEx.getFcb());
        gVar.a(0);
        gVar.d(0);
        gVar.a(System.currentTimeMillis());
        jVar.b(gVar);
    }

    private void a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            com.mbridge.msdk.newreward.adapter.e eVar = this.b;
            String str = "";
            if (eVar != null && eVar.g() != null && this.b.g().a() != null) {
                str = this.b.g().a().v() + "";
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(campaignEx.getLocalRequestId(), str);
            if (cVarA == null) {
                cVarA = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVarA.h(campaignEx.getLocalRequestId());
                cVarA.a(campaignEx.getAdType());
                cVarA.m(campaignEx.getCampaignUnitId());
                cVarA.g(campaignEx.isBidCampaign() ? "1" : "0");
            }
            cVarA.a(campaignEx);
            com.mbridge.msdk.newreward.adapter.e eVar2 = this.b;
            if (eVar2 != null && eVar2.O() != null) {
                com.mbridge.msdk.videocommon.setting.a aVarB = this.b.O().b();
                if (aVarB != null) {
                    cVarA.k(aVarB.a());
                    cVarA.j(aVarB.f());
                }
                com.mbridge.msdk.videocommon.setting.c cVarC = this.b.O().c();
                if (cVarC != null) {
                    cVarA.l(cVarC.x());
                    cVarA.n(cVarC.a());
                }
            }
            com.mbridge.msdk.foundation.same.c.a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), cVarA, new C0214a());
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}

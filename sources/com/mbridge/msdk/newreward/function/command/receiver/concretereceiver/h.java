package com.mbridge.msdk.newreward.function.command.receiver.concretereceiver;

import android.content.Intent;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.core.resource.n;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class h implements com.mbridge.msdk.newreward.function.command.receiver.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.mbridge.msdk.newreward.adapter.e f1638a;

    public static class a extends com.mbridge.msdk.video.bt.module.orglistener.b {
        private final com.mbridge.msdk.newreward.function.core.campaign.b c;
        private final com.mbridge.msdk.newreward.adapter.e d;

        public a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.adapter.e eVar) {
            this.c = bVar;
            this.d = eVar;
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(int i, String str, String str2) {
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void b(String str, String str2) {
            try {
                com.mbridge.msdk.newreward.adapter.e eVar = this.d;
                RewardVideoListener rewardVideoListenerM = eVar != null ? eVar.M() : null;
                if (rewardVideoListenerM != null) {
                    rewardVideoListenerM.onVideoComplete(new MBridgeIds(this.d.G(), this.d.R()));
                }
            } catch (Exception e) {
                o0.b("DefaultShowRewardListener", "onVideoComplete", e);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            RewardVideoListener rewardVideoListenerM;
            int i;
            int iV;
            try {
                b();
                com.mbridge.msdk.newreward.function.database.c.c().a().b(this.c.a(), this.c.s(), this.c.E(), this.c.p(), 6);
                com.mbridge.msdk.newreward.adapter.e eVar = this.d;
                if (eVar != null) {
                    rewardVideoListenerM = eVar.M();
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    int filterCallBackState = 0;
                    if (this.d.g() == null || this.d.g().a() == null) {
                        i = 0;
                        iV = 0;
                    } else {
                        com.mbridge.msdk.newreward.function.core.campaign.b bVarA = this.d.g().a();
                        iV = bVarA.v();
                        int iW = bVarA.w();
                        if (bVarA.f() != null && !bVarA.f().isEmpty()) {
                            filterCallBackState = bVarA.f().get(0).getFilterCallBackState();
                        }
                        i = filterCallBackState;
                        filterCallBackState = iW;
                    }
                    eVar2.a(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(i));
                    eVar2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX, Integer.valueOf(iV));
                    eVar2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX, Integer.valueOf(filterCallBackState));
                    cVar.a("2000130", eVar2);
                } else {
                    rewardVideoListenerM = null;
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000130", cVar);
                if (rewardVideoListenerM != null) {
                    rewardVideoListenerM.onAdShow(new MBridgeIds(this.d.G(), this.d.R()));
                }
            } catch (Exception e) {
                o0.b("DefaultShowRewardListener", "onAdShow", e);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z, com.mbridge.msdk.videocommon.entity.c cVar2) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", cVar);
                com.mbridge.msdk.newreward.adapter.e eVar = this.d;
                RewardVideoListener rewardVideoListenerM = eVar != null ? eVar.M() : null;
                if (rewardVideoListenerM != null) {
                    rewardVideoListenerM.onAdClose(new MBridgeIds(this.d.G(), this.d.R()), new RewardInfo(z, cVar2.c(), String.valueOf(cVar2.a())));
                }
            } catch (Exception e) {
                o0.b("DefaultShowRewardListener", "onAdClose", e);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
            int i;
            int iV;
            try {
                a();
                com.mbridge.msdk.newreward.function.database.c.c().a().b(this.c.a(), this.c.s(), this.c.E(), this.c.p(), 7);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("reason", str);
                com.mbridge.msdk.newreward.adapter.e eVar2 = this.d;
                if (eVar2 != null) {
                    int filterCallBackState = 0;
                    if (eVar2.g() == null || this.d.g().a() == null) {
                        i = 0;
                        iV = 0;
                    } else {
                        com.mbridge.msdk.newreward.function.core.campaign.b bVarA = this.d.g().a();
                        iV = bVarA.v();
                        int iW = bVarA.w();
                        if (bVarA.f() != null && !bVarA.f().isEmpty()) {
                            filterCallBackState = bVarA.f().get(0).getFilterCallBackState();
                        }
                        i = filterCallBackState;
                        filterCallBackState = iW;
                    }
                    eVar.a(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(i));
                    eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX, Integer.valueOf(iV));
                    eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX, Integer.valueOf(filterCallBackState));
                }
                cVar.a("2000131", eVar);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000131", cVar);
                com.mbridge.msdk.newreward.adapter.e eVar3 = this.d;
                RewardVideoListener rewardVideoListenerM = eVar3 != null ? eVar3.M() : null;
                if (rewardVideoListenerM != null) {
                    rewardVideoListenerM.onShowFail(new MBridgeIds(this.d.G(), this.d.R()), str);
                }
            } catch (Exception e) {
                o0.b("DefaultShowRewardListener", "onShowFail", e);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z, String str, String str2) {
            try {
                com.mbridge.msdk.newreward.adapter.e eVar = this.d;
                RewardVideoListener rewardVideoListenerM = eVar != null ? eVar.M() : null;
                if (rewardVideoListenerM != null) {
                    rewardVideoListenerM.onVideoAdClicked(new MBridgeIds(this.d.G(), this.d.R()));
                }
            } catch (Exception e) {
                o0.b("DefaultShowRewardListener", "onVideoAdClicked", e);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z, int i) {
            try {
                com.mbridge.msdk.newreward.adapter.e eVar = this.d;
                RewardVideoListener rewardVideoListenerM = eVar != null ? eVar.M() : null;
                if (rewardVideoListenerM != null) {
                    rewardVideoListenerM.onAdCloseWithIVReward(new MBridgeIds(this.d.G(), this.d.R()), z, i);
                }
            } catch (Exception e) {
                o0.b("DefaultShowRewardListener", "onAdCloseWithIVReward", e);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(String str, String str2) {
            try {
                com.mbridge.msdk.foundation.feedback.b.b().a(str2 + "_2", 2);
                com.mbridge.msdk.newreward.adapter.e eVar = this.d;
                RewardVideoListener rewardVideoListenerM = eVar != null ? eVar.M() : null;
                if (rewardVideoListenerM != null) {
                    rewardVideoListenerM.onEndcardShow(new MBridgeIds(this.d.G(), this.d.R()));
                }
            } catch (Exception e) {
                o0.b("DefaultShowRewardListener", "onEndcardShow", e);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.function.command.receiver.b
    public void a(Object obj) {
        com.mbridge.msdk.newreward.adapter.e eVar = (com.mbridge.msdk.newreward.adapter.e) ((com.mbridge.msdk.newreward.function.command.b) obj).b();
        this.f1638a = eVar;
        if (eVar != null) {
            a();
        }
    }

    public void a() {
        try {
            com.mbridge.msdk.newreward.function.core.campaign.b bVarA = this.f1638a.g().a();
            a aVar = new a(bVarA, this.f1638a);
            try {
                String str = MBRewardVideoActivity.INTENT_UNITID;
                Intent intent = new Intent(com.mbridge.msdk.foundation.controller.c.n().d(), (Class<?>) MBRewardVideoActivity.class);
                intent.putExtra("unitId", this.f1638a.R());
                intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.f1638a.G());
                intent.putExtra(CampaignEx.JSON_NATIVE_VIDEO_MUTE, this.f1638a.s());
                boolean z = this.f1638a.d() == 287;
                intent.putExtra("isIV", z);
                intent.putExtra("isBid", TextUtils.isEmpty(this.f1638a.f()));
                if (z) {
                    intent.putExtra("ivRewardMode", this.f1638a.u());
                    intent.putExtra("ivRewardValueType", this.f1638a.w());
                    intent.putExtra("ivRewardValue", this.f1638a.v());
                }
                intent.putExtra("isBigOffer", !TextUtils.isEmpty(bVarA.e()));
                intent.putExtra("is_refactor", true);
                List<com.mbridge.msdk.newreward.function.core.campaign.a> listG = bVarA.g();
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.a> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                for (com.mbridge.msdk.newreward.function.core.campaign.a aVar2 : listG) {
                    CampaignEx campaignExA = aVar2.a();
                    campaignExA.setReady_rate(100);
                    copyOnWriteArrayList.add(campaignExA);
                    copyOnWriteArrayList2.add(a(aVar2, campaignExA));
                    a(aVar2);
                }
                com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f1638a.R(), copyOnWriteArrayList);
                com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f1638a.R(), copyOnWriteArrayList2);
                intent.addFlags(268435456);
                MBridgeGlobalCommon.showRewardListenerMap.put(this.f1638a.R(), aVar);
                com.mbridge.msdk.foundation.controller.c.n().d().startActivity(intent);
            } catch (Exception unused) {
                aVar.a(new com.mbridge.msdk.foundation.same.report.metrics.c(), "activity not found");
            }
        } catch (Exception e) {
            o0.b("ShowReceiver", "show", e);
        }
    }

    private static void a(com.mbridge.msdk.newreward.function.core.campaign.a aVar) {
        try {
            n nVarF = aVar.f();
            if (nVarF != null) {
                nVarF.g().a(1, null);
            }
        } catch (Exception e) {
            o0.b("ShowReceiver", "downloadVideoForShow", e);
        }
    }

    private com.mbridge.msdk.videocommon.download.a a(com.mbridge.msdk.newreward.function.core.campaign.a aVar, CampaignEx campaignEx) {
        com.mbridge.msdk.videocommon.download.a aVar2 = new com.mbridge.msdk.videocommon.download.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, this.f1638a.R(), 1);
        aVar2.a(this.f1638a.d());
        aVar2.c(campaignEx.getVideoUrlEncode());
        n nVarF = aVar.f();
        if (nVarF != null) {
            aVar2.d(nVarF.n().getPath());
        }
        return aVar2;
    }
}

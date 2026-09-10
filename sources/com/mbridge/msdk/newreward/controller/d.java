package com.mbridge.msdk.newreward.controller;

import android.text.TextUtils;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.adapter.e;
import com.mbridge.msdk.newreward.adapter.g;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class d extends a implements c, RewardVideoListener {
    RewardVideoListener d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private int i;

    public d(int i, String str, String str2, boolean z) {
        super(i, str, str2, z);
        this.e = 2;
        this.f = false;
        if (i == 287) {
            this.e = com.mbridge.msdk.foundation.same.a.X;
        } else {
            this.e = com.mbridge.msdk.foundation.same.a.W;
        }
    }

    private void e() {
        try {
            ((MBridgeDailyPlayModel) this.f1608a.a((Object) null, f.CREATE_DAILY)).insertDailyCap();
        } catch (Exception e) {
            AbstractC3888ke0.q(e, new StringBuilder("updateDailyShowCap error:"), "RewardVideoController");
        }
    }

    @Override // com.mbridge.msdk.newreward.controller.a
    public void a() {
        this.b.init(this.f1608a, this.c);
    }

    public String b() {
        e eVarA;
        com.mbridge.msdk.newreward.function.model.a aVarG;
        com.mbridge.msdk.newreward.function.core.campaign.b bVarA;
        com.mbridge.msdk.newreward.adapter.c cVar = this.b;
        return (cVar == null || (eVarA = cVar.a()) == null || (aVarG = eVarA.g()) == null || (bVarA = aVarG.a()) == null) ? "" : com.mbridge.msdk.foundation.same.c.b(bVarA.f());
    }

    public String c() {
        e eVarA;
        com.mbridge.msdk.newreward.function.model.a aVarG;
        com.mbridge.msdk.newreward.function.core.campaign.b bVarA;
        com.mbridge.msdk.newreward.adapter.c cVar = this.b;
        if (cVar == null || (eVarA = cVar.a()) == null || (aVarG = eVarA.g()) == null || (bVarA = aVarG.a()) == null) {
            return "";
        }
        String strT = bVarA.t();
        return TextUtils.isEmpty(strT) ? "" : strT;
    }

    public boolean d() {
        return this.d != null;
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdClose(mBridgeIds, rewardInfo);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, boolean z, int i) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdCloseWithIVReward(mBridgeIds, z, i);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdShow(MBridgeIds mBridgeIds) {
        e();
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onEndcardShow(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onEndcardShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onLoadSuccess(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onShowFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoAdClicked(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoAdClicked(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoComplete(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoComplete(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoLoadFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newreward.controller.c
    public void setRewardVideoListener(RewardVideoListener rewardVideoListener) {
        this.d = rewardVideoListener;
        this.b.a(this);
    }

    @Override // com.mbridge.msdk.newreward.controller.c
    public void a(boolean z, String str) {
        g gVar = new g(this.f1608a);
        e eVar = new e(z, this.c.f(), str, this.c.e(), this.c.g());
        eVar.g(this.c.b());
        eVar.d(this.e);
        eVar.c(com.mbridge.msdk.foundation.controller.c.n().b());
        eVar.a(this.c.g() ? 2 : 1);
        eVar.f(com.mbridge.msdk.newreward.function.utils.d.a(str));
        eVar.p(this.f);
        eVar.a(this.g, this.h, this.i);
        this.b.a(eVar, gVar);
    }

    public void b(boolean z) {
        this.f = z;
    }

    @Override // com.mbridge.msdk.newreward.controller.c
    public void a(String str, String str2, String str3) {
        com.mbridge.msdk.newreward.adapter.f fVar = new com.mbridge.msdk.newreward.adapter.f();
        fVar.b(str2);
        fVar.a(str3);
        this.b.a(fVar);
    }

    @Override // com.mbridge.msdk.newreward.controller.c
    public boolean a(boolean z) {
        return this.b.a(z);
    }

    public void a(int i) {
        this.e = i;
        com.mbridge.msdk.newreward.adapter.c cVar = this.b;
        if (cVar != null) {
            Iterator<e> it = cVar.b().iterator();
            while (it.hasNext()) {
                it.next().d(i);
            }
        }
    }

    public void a(int i, int i2, int i3) {
        this.g = i;
        this.h = i2;
        if (i2 == com.mbridge.msdk.foundation.same.a.K) {
            this.i = i3 < 0 ? 5 : i3;
        }
        if (i2 == com.mbridge.msdk.foundation.same.a.J) {
            this.i = i3 < 0 ? 80 : i3;
        }
        com.mbridge.msdk.newreward.function.utils.c.a(this.c.e(), i, i2, i3);
    }
}

package com.mbridge.msdk.newout;

import android.content.Context;
import com.mbridge.msdk.newreward.controller.c;
import com.mbridge.msdk.newreward.controller.d;

/* JADX INFO: loaded from: classes2.dex */
public class MBBidRewardVideoHandler implements IMBRRewardVideoHandler {
    private c controller;

    public MBBidRewardVideoHandler(Context context, String str, String str2) {
        this.controller = null;
        this.controller = new d(94, str, str2, true);
    }

    @Override // com.mbridge.msdk.newout.IMBRRewardVideoHandler
    public boolean isReady() {
        return this.controller.a(true);
    }

    @Override // com.mbridge.msdk.newout.IMBRRewardVideoHandler
    public void load(String str) {
        this.controller.a(true, str);
    }

    @Override // com.mbridge.msdk.newout.IMBRRewardVideoHandler
    public void setRewardVideoListener(RewardVideoListener rewardVideoListener) {
        this.controller.setRewardVideoListener(rewardVideoListener);
    }

    @Override // com.mbridge.msdk.newout.IMBRRewardVideoHandler
    public void show(String str) {
        this.controller.a(str, "", "");
    }

    @Override // com.mbridge.msdk.newout.IMBRRewardVideoHandler
    public void load() {
        this.controller.a(true, "");
    }
}

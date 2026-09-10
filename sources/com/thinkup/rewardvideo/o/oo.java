package com.thinkup.rewardvideo.o;

import com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener;

/* JADX INFO: loaded from: classes6.dex */
public class oo extends o0 implements CustomRewardedVideoEventListener {
    public oo(om omVar, boolean z2, int i2) {
        super(omVar, z2, i2);
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onAgainReward() {
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onAgainReward();
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onAgainRewardFailed() {
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onAgainRewardFailed();
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onReward() {
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onReward();
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardFailed() {
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onRewardFailed();
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdAgainPlayClicked() {
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onRewardedVideoAdAgainPlayClicked();
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdAgainPlayEnd() {
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onRewardedVideoAdAgainPlayEnd();
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdAgainPlayFailed(String str, String str2) {
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onRewardedVideoAdAgainPlayFailed(str, str2);
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdAgainPlayStart() {
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onRewardedVideoAdAgainPlayStart();
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdClosed() {
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onRewardedVideoAdClosed();
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdPlayClicked() {
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onRewardedVideoAdPlayClicked();
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdPlayEnd() {
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onRewardedVideoAdPlayEnd();
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdPlayFailed(String str, String str2) {
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onRewardedVideoAdPlayFailed(str, str2);
        }
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdPlayStart() {
        om omVar = this.f42651n;
        if (omVar != null) {
            omVar.onRewardedVideoAdPlayStart();
        }
    }
}

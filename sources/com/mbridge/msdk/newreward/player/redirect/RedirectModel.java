package com.mbridge.msdk.newreward.player.redirect;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.adapter.f;
import com.mbridge.msdk.videocommon.entity.c;

/* JADX INFO: loaded from: classes2.dex */
public class RedirectModel {
    private CampaignEx campaignEx;
    public int clickSenario = 0;
    public Context context;
    private int currPercentAge;
    public f devExtraData;
    private int endScreenType;
    private int percentRate;
    public RedirectType redirectType;
    public c reward;
    public com.mbridge.msdk.newreward.function.model.f settingModel;
    public String unitId;
    private int videoSourceCompleteTime;
    public float xInScreen;
    public float yInScreen;

    public CampaignEx getCampaignEx() {
        return this.campaignEx;
    }

    public int getClickSenario() {
        return this.clickSenario;
    }

    public Context getContext() {
        return this.context;
    }

    public int getCurrPercentAge() {
        return this.currPercentAge;
    }

    public f getDevExtraData() {
        return this.devExtraData;
    }

    public int getEndScreenType() {
        return this.endScreenType;
    }

    public int getPercentRate() {
        return this.percentRate;
    }

    public RedirectType getRedirectType() {
        return this.redirectType;
    }

    public c getReward() {
        return this.reward;
    }

    public com.mbridge.msdk.newreward.function.model.f getSettingModel() {
        return this.settingModel;
    }

    public String getUnitId() {
        return this.unitId;
    }

    public int getVideoSourceCompleteTime() {
        return this.videoSourceCompleteTime;
    }

    public int getxInScreen() {
        return t0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.xInScreen);
    }

    public int getyInScreen() {
        return t0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.yInScreen);
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.campaignEx = campaignEx;
    }

    public void setClickSenario(int i) {
        this.clickSenario = i;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setCurrPercentAge(int i) {
        this.currPercentAge = i;
    }

    public void setDevExtraData(f fVar) {
        this.devExtraData = fVar;
    }

    public void setEndScreenType(int i) {
        this.endScreenType = i;
    }

    public void setPercentRate(int i) {
        this.percentRate = i;
    }

    public RedirectModel setRedirectType(RedirectType redirectType) {
        this.redirectType = redirectType;
        return this;
    }

    public void setReward(c cVar) {
        this.reward = cVar;
    }

    public void setSettingModel(com.mbridge.msdk.newreward.function.model.f fVar) {
        this.settingModel = fVar;
        if (fVar == null || fVar.c() == null) {
            return;
        }
        setEndScreenType(fVar.c().m());
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void setVideoSourceCompleteTime(int i) {
        this.videoSourceCompleteTime = i;
    }

    public void setxInScreen(float f) {
        this.xInScreen = f;
    }

    public void setyInScreen(float f) {
        this.yInScreen = f;
    }
}

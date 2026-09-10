package com.mbridge.msdk.newreward.player.model;

import com.mbridge.msdk.click.a;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.adapter.e;
import com.mbridge.msdk.newreward.function.command.c;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.function.command.retention.BridgeParameter;
import com.mbridge.msdk.newreward.player.imodel.IPlayModel;
import com.mbridge.msdk.newreward.player.redirect.RedirectModel;
import com.mbridge.msdk.newreward.player.redirect.RedirectType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* JADX INFO: loaded from: classes2.dex */
public class WebTemplateModel extends BaseWebContentModel implements IPlayModel {
    private static final String TAG = "WebTemplateModel";
    RewardVideoListener rewardVideoListener;
    boolean adShownState = false;
    boolean videoCompleteState = false;
    boolean adCloseState = false;
    boolean eventImpression = false;
    boolean eventOnlyImpression = false;
    boolean eventPvUrls = false;
    boolean trackClose = false;
    boolean trackPlayError = false;
    boolean trackPause = false;
    boolean trackResume = false;
    boolean trackClick = false;
    boolean muteState = false;
    boolean addRewardState = false;
    boolean eventTrackingImp = false;
    boolean adUrlList = false;
    boolean advImpList = false;

    public WebTemplateModel(c cVar, e eVar) {
        this.mCommandManager = cVar;
        this.mAdapterModel = eVar;
        this.rewardVideoListener = eVar.M();
        this.mClickControl = new a(com.mbridge.msdk.foundation.controller.c.n().d(), this.mAdapterModel.R());
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void checkOMSdkProgress(int i, int i2) {
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void eventAdUrlList(RedirectModel redirectModel) {
        if (this.adUrlList) {
            return;
        }
        this.adUrlList = true;
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.AD_URL_LIST));
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public boolean eventAddReward(RedirectModel redirectModel) {
        if (this.addRewardState) {
            return true;
        }
        this.addRewardState = true;
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.ADD_REWARD));
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void eventAdvImpList(RedirectModel redirectModel) {
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.ADV_IMP_LIST));
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IModel
    public boolean eventClickUrl(RedirectModel redirectModel) {
        if (this.mCommandManager == null) {
            return false;
        }
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.CLICK_URL));
        return true;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void eventImpression(RedirectModel redirectModel) {
        if (this.eventImpression) {
            return;
        }
        this.eventImpression = true;
        o0.b(TAG, "触发了eventImpression，url为--》" + redirectModel.getCampaignEx().getImpressionURL());
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.IMPRESSION_URL));
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel, com.mbridge.msdk.newreward.player.imodel.IModel
    public void eventNoticeUrl(RedirectModel redirectModel, int i) {
        if (this.mCommandManager != null) {
            redirectModel.setRedirectType(RedirectType.NOTICE_URL);
            c cVar = this.mCommandManager;
            cVar.e(cVar.a("campaign_redirect", redirectModel, "click_scenario", Integer.valueOf(i)), f.CAMPAIGN_REDIRECT);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void eventOnlyImpression(RedirectModel redirectModel) {
        if (this.eventOnlyImpression) {
            return;
        }
        this.eventOnlyImpression = true;
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.ONLY_IMPRESSION_URL));
        o0.b(TAG, "触发了eventOnlyImpression，url为--》" + redirectModel.getCampaignEx().getOnlyImpressionURL());
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void eventPvUrls(RedirectModel redirectModel) {
        if (this.eventPvUrls) {
            return;
        }
        this.eventPvUrls = true;
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.PV_URL));
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public boolean eventTrackingForClick(RedirectModel redirectModel) {
        if (this.trackClick) {
            return true;
        }
        this.trackClick = true;
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.AD_TRACKING_CLICK_URL));
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public boolean eventTrackingForClose(RedirectModel redirectModel) {
        if (this.trackClose) {
            return true;
        }
        this.trackClose = true;
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.AD_TRACKING_CLOSE_URL));
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public boolean eventTrackingForImpression(RedirectModel redirectModel) {
        if (this.eventTrackingImp) {
            return true;
        }
        this.eventTrackingImp = true;
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.AD_TRACKING_IMPRESSION_URL));
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void eventTrackingForMute(RedirectModel redirectModel) {
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.AD_TRACKING_MUTE_URL));
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void eventTrackingForPause(RedirectModel redirectModel) {
        if (this.trackPause) {
            return;
        }
        this.trackPause = true;
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.AD_TRACKING_PAUSE));
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void eventTrackingForPlayError(RedirectModel redirectModel, @BridgeParameter(key = "reason") String str) {
        if (this.trackPlayError) {
            return;
        }
        this.trackPlayError = true;
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.AD_TRACKING_ERROR));
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void eventTrackingForPlayPercentage(RedirectModel redirectModel, @BridgeParameter(key = "percent") int i) {
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.AD_TRACKING_PLAY_PERCENTAGE));
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void eventTrackingForResume(RedirectModel redirectModel) {
        if (this.trackResume) {
            return;
        }
        this.trackResume = true;
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.AD_TRACKING_RESUME));
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void eventTrackingForUnMute(RedirectModel redirectModel) {
        sendDirectEvent(redirectModel.setRedirectType(RedirectType.AD_TRACKING_UN_MUTE_URL));
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void historyShowState() {
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void modelReport(String str) {
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void onAdClick(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.rewardVideoListener;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoAdClicked(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public boolean onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo, @BridgeParameter(key = "type") int i) {
        if (this.adCloseState) {
            return true;
        }
        this.adCloseState = true;
        RewardVideoListener rewardVideoListener = this.rewardVideoListener;
        if (rewardVideoListener == null) {
            return false;
        }
        rewardVideoListener.onAdClose(mBridgeIds, rewardInfo);
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, boolean z, int i) {
        RewardVideoListener rewardVideoListener = this.rewardVideoListener;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdCloseWithIVReward(mBridgeIds, z, i);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public boolean onAdShow(MBridgeIds mBridgeIds) {
        if (this.adShownState) {
            return true;
        }
        this.adShownState = true;
        if (this.rewardVideoListener == null) {
            return false;
        }
        this.mAdapterModel.b(true);
        this.rewardVideoListener.onAdShow(mBridgeIds);
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void onBufferingEnd() {
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void onBufferingStart(String str) {
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public boolean onShowFail(MBridgeIds mBridgeIds, String str, @BridgeParameter(key = "code") int i) {
        if (this.adShownState) {
            return true;
        }
        this.adShownState = true;
        if (this.rewardVideoListener == null) {
            return false;
        }
        this.mAdapterModel.b(true);
        this.rewardVideoListener.onShowFail(mBridgeIds, str);
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void onVideoComplete(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener;
        if (this.videoCompleteState || (rewardVideoListener = this.rewardVideoListener) == null) {
            return;
        }
        this.videoCompleteState = true;
        rewardVideoListener.onVideoComplete(mBridgeIds);
    }

    public void sendDirectEvent(RedirectModel redirectModel) {
        c cVar = this.mCommandManager;
        cVar.e(cVar.a("campaign_redirect", redirectModel), f.CAMPAIGN_REDIRECT);
    }

    public void setRewardVideoListener(RewardVideoListener rewardVideoListener) {
        this.rewardVideoListener = rewardVideoListener;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void skipped() {
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IPlayModel
    public void modelReport(String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
    }
}

package com.mbridge.msdk.newreward.player.presenter;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.newreward.function.command.c;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.player.imodel.IPlayModel;
import com.mbridge.msdk.newreward.player.iview.IBaseView;
import com.mbridge.msdk.newreward.player.iview.IPlayTempleView;
import com.mbridge.msdk.newreward.player.redirect.RedirectModel;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseTemplatePresenter extends AbsPresenter implements VideoPlayerStatusListener {
    private static final int AD_SCAPE_VALUE = 1;
    private static final int VIDEO_ERROR_RULE_VALUE = 1;
    private final String TAG;
    boolean closeBtnVisible;
    int currentPlayProgress;
    boolean dialogCancelClicked;
    boolean dialogContinueClicked;
    boolean hasIteratorPercentage;
    IPlayTempleView iView;
    boolean isAlertShowing;
    boolean isCloseBtnClicked;
    private ConcurrentHashMap<Integer, Integer> omsdkPercentageMap;
    private ConcurrentHashMap<Integer, Integer> percentageMap;
    public boolean playTemplateRanderSuccess;
    IPlayModel playTempleModel;
    private boolean progressHasDoAdSuccess;
    int videoCompleteTime;
    int videoSkipTime;
    int videoTotalLength;

    public BaseTemplatePresenter(IBaseView iBaseView) {
        super(iBaseView);
        this.TAG = "BaseTemplatePresenter";
        this.closeBtnVisible = false;
        this.isCloseBtnClicked = false;
        this.hasIteratorPercentage = false;
        this.percentageMap = new ConcurrentHashMap<>();
        this.omsdkPercentageMap = new ConcurrentHashMap<>();
        this.progressHasDoAdSuccess = false;
        this.playTemplateRanderSuccess = true;
        this.isAlertShowing = false;
        this.dialogContinueClicked = false;
        this.dialogCancelClicked = false;
    }

    private void advImpList(int i) {
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null || campaignEx.getAdvImpList() == null) {
            return;
        }
        try {
            if (this.campaignEx.getAdvImpList().isEmpty()) {
                return;
            }
            this.redirectModel.setCurrPercentAge(i);
            this.playTempleModel.eventAdvImpList(this.redirectModel);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void callbackAdClose() {
        if (isIVRewardEnable()) {
            this.playTempleModel.onAdCloseWithIVReward(this.mBridgeIds, this.adapterModel.m0(), this.ivRewardAlertViewStatus);
        }
        adClosed();
        if (this.isCloseBtnClicked) {
            this.playTempleModel.eventTrackingForClose(this.redirectModel);
        }
        if (!this.isIV && !this.adapterModel.W() && this.adapterModel.m0()) {
            this.adapterModel.c(true);
            this.playTempleModel.eventAddReward(this.redirectModel);
        }
        finish(true);
    }

    private void checkOMSdkProgress(int i, int i2) {
        try {
            if (this.playTempleModel != null) {
                if (this.omsdkPercentageMap.isEmpty()) {
                    for (int i3 = 0; i3 <= 100; i3 += 25) {
                        this.omsdkPercentageMap.put(Integer.valueOf((i2 * i3) / 100), Integer.valueOf(i3));
                    }
                }
                if (i == 1 && this.omsdkPercentageMap.contains(0)) {
                    i = 0;
                }
                if (this.omsdkPercentageMap.containsKey(Integer.valueOf(i))) {
                    int iIntValue = this.omsdkPercentageMap.get(Integer.valueOf(i)).intValue();
                    this.omsdkPercentageMap.remove(Integer.valueOf(i));
                    this.playTempleModel.checkOMSdkProgress(iIntValue, i2);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void checkPlayCloseBtnState(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (i == i2) {
            this.closeBtnVisible = true;
            this.iView.setAdCloseVisibility(true);
        }
        if (!this.adapterModel.m0() && (i5 = this.videoCompleteTime) > 0 && i > i5) {
            this.adapterModel.q(true);
        }
        if ((this.closeBtnVisible || (i4 = this.videoSkipTime) < 0 || i < i4) && ((i3 = this.videoCompleteTime) <= 0 || i <= i3)) {
            return;
        }
        this.closeBtnVisible = true;
        this.iView.setAdCloseVisibility(true);
    }

    private void checkTrackingForPlayPercentage(int i, int i2) {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap;
        ConcurrentHashMap<Integer, Integer> concurrentHashMap2;
        try {
            if (!this.hasIteratorPercentage && (concurrentHashMap2 = this.percentageMap) != null && concurrentHashMap2.isEmpty()) {
                this.hasIteratorPercentage = true;
                Iterator<Map<Integer, String>> it = this.campaignEx.getNativeVideoTracking().o().iterator();
                while (it.hasNext()) {
                    for (Map.Entry<Integer, String> entry : it.next().entrySet()) {
                        this.percentageMap.put(Integer.valueOf((int) ((entry.getKey().intValue() / 100.0f) * i2)), entry.getKey());
                    }
                }
            }
            if (i == 1 && (concurrentHashMap = this.percentageMap) != null && concurrentHashMap.containsKey(0)) {
                i = 0;
            }
            ConcurrentHashMap<Integer, Integer> concurrentHashMap3 = this.percentageMap;
            if (concurrentHashMap3 == null || !concurrentHashMap3.containsKey(Integer.valueOf(i))) {
                return;
            }
            int iIntValue = this.percentageMap.get(Integer.valueOf(i)).intValue();
            this.percentageMap.remove(Integer.valueOf(i));
            this.redirectModel.setPercentRate(iIntValue);
            this.playTempleModel.eventTrackingForPlayPercentage(this.redirectModel, iIntValue);
        } catch (Exception e) {
            o0.b("BaseTemplatePresenter", e.getMessage());
        }
    }

    private void closeOrShowHalfEndCard() {
        c cVar = this.commandManager;
        cVar.c(cVar.a("add_temple", "HALF_TEMPLATE_EC", "adapter_model", this.adapterModel, "parent_temple", this.data.getRootViewGroup()), f.SHOW_ADD_TEMPLE);
        this.iView.removeTempleFromSuperView(this.data.getRootViewGroup());
    }

    private void doVideoEndTypeLogic() {
        try {
            int i = this.videoEndType;
            if (i == 100) {
                showEndCard("404");
                return;
            }
            if (i == 1) {
                callbackAdClose();
                return;
            }
            if (i == 2) {
                if (this.endScreenType <= 1) {
                    showEndCard("404");
                    return;
                } else {
                    showEndCard("");
                    return;
                }
            }
            if (i == 3) {
                showEndCard("VAST");
                return;
            }
            if (i == 4) {
                showEndCard("SHOW_CLICK_URL");
                IPlayModel iPlayModel = this.playTempleModel;
                if (iPlayModel != null) {
                    iPlayModel.eventTrackingForClick(this.redirectModel);
                    this.playTempleModel.eventNoticeUrl(this.redirectModel, 2);
                    this.playTempleModel.onAdClick(this.mBridgeIds);
                    return;
                }
                return;
            }
            if (i != 5) {
                showEndCard("");
                return;
            }
            com.mbridge.msdk.click.c.d(this.context, com.mbridge.msdk.click.c.a(this.campaignEx.getClickURL(), "-999", "-999"));
            IPlayModel iPlayModel2 = this.playTempleModel;
            if (iPlayModel2 != null) {
                iPlayModel2.eventTrackingForClick(this.redirectModel);
                this.playTempleModel.eventNoticeUrl(this.redirectModel, 2);
                this.playTempleModel.onAdClick(this.mBridgeIds);
            }
            callbackAdClose();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            finish(true);
        }
    }

    private void initCountDown() {
        c cVar = this.commandManager;
        Object objH = cVar.h(cVar.a("videoCompleteTime", Integer.valueOf(this.videoCompleteTime)), f.TEMP_PLAY_START_COUNT_DOWN);
        if (this.iView.getCountDownView() != null) {
            try {
                if (objH instanceof Map) {
                    Map map = (Map) objH;
                    int iIntValue = ((Integer) map.get("width")).intValue();
                    int iIntValue2 = ((Integer) map.get("height")).intValue();
                    int iIntValue3 = ((Integer) map.get("background")).intValue();
                    int iIntValue4 = ((Integer) map.get("padding")).intValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.iView.getCountDownView().getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = iIntValue;
                        layoutParams.height = iIntValue2;
                    }
                    this.iView.setCountDown("", iIntValue4, iIntValue3, layoutParams);
                }
            } catch (Throwable th) {
                o0.b("BaseTemplatePresenter", th.getMessage());
            }
        }
    }

    private void setCountDownInfo(int i, int i2) {
        try {
            c cVar = this.commandManager;
            Object objH = cVar.h(cVar.a(MBInterstitialActivity.INTENT_CAMAPIGN, this.campaignEx, "isIV", Boolean.valueOf(this.isIV), "videoCompleteTime", Integer.valueOf(this.videoCompleteTime), "videoSkipTime", Integer.valueOf(this.videoSkipTime), "curPlayPosition", Integer.valueOf(i), "allDuration", Integer.valueOf(i2)), f.TEMP_PLAY_PROGRESS_COUNT_DOWN);
            if ((objH instanceof Map) && ((Integer) ((Map) objH).get("valueVisible")).intValue() == 0) {
                this.iView.setCountDown((String) ((Map) objH).get("countMsg"), 0, 0, null);
            }
            IPlayTempleView iPlayTempleView = this.iView;
            if (iPlayTempleView == null || iPlayTempleView.getPrivacyButton() == null) {
                return;
            }
            this.iView.getPrivacyButton().setTag(String.valueOf(i));
        } catch (Exception e) {
            o0.b("BaseTemplatePresenter", e.getMessage());
        }
    }

    private void setSegmentsProgressBarState() {
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx != null && campaignEx.getProgressBarShow() == 1) {
            this.iView.setSegmentsProgressBar(0);
        }
    }

    private void setSkipAndCompleteTime(int i) {
        if (this.campaignEx.getVst() > -2) {
            this.videoSkipTime = this.campaignEx.getVst();
        } else if (this.adapterModel.O().c() != null) {
            this.videoSkipTime = this.adapterModel.O().c().F();
        }
        int videoCompleteTime = this.campaignEx.getVideoCompleteTime();
        this.videoCompleteTime = videoCompleteTime;
        if (videoCompleteTime <= 0) {
            this.videoCompleteTime = i;
        }
    }

    private void showEndCard(String str) {
        try {
            c cVar = this.commandManager;
            Object[] objArr = new Object[8];
            objArr[0] = "add_temple";
            if (TextUtils.isEmpty(str)) {
                str = this.adapterModel.k();
            }
            objArr[1] = str;
            objArr[2] = "adapter_model";
            objArr[3] = this.adapterModel;
            objArr[4] = "template_type";
            objArr[5] = 18;
            objArr[6] = "parent_temple";
            objArr[7] = this.data.getRootViewGroup();
            cVar.c(cVar.a(objArr), f.SHOW_ADD_TEMPLE);
            this.iView.removeTempleFromSuperView(this.data.getRootViewGroup());
            finish(false);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void showIVRewardDialogOnPlayMode() {
        if (isIVRewardEnable() && this.ivRewardAlertViewStatus == a.F && this.ivRewardMode == a.I) {
            int i = this.ivRewardValueType;
            if (i == a.J && ((int) ((this.currentPlayProgress / this.videoTotalLength) * 100.0f)) >= this.ivRewardValue) {
                onPause();
                this.ivRewardAlertViewStatus = a.G;
                this.iView.setAlertViewType(this.adapterModel.R(), 0, this.ivRewardMode);
                this.iView.alertShow();
                return;
            }
            if (i != a.K || this.currentPlayProgress < this.ivRewardValue) {
                return;
            }
            onPause();
            this.ivRewardAlertViewStatus = a.G;
            this.iView.setAlertViewType(this.adapterModel.R(), 0, this.ivRewardMode);
            this.iView.alertShow();
        }
    }

    private void updatePlayCampaignFrequence() {
        this.commandManager.a(this.adapterModel, "PlayFrequenceReceiver");
    }

    private void updateSegmentsProgressBar(int i, int i2) {
        try {
            if (this.iView.getSegmentsProgressBar() == null || this.iView.getSegmentsProgressBar().getVisibility() != 0) {
                return;
            }
            this.iView.getSegmentsProgressBar().setProgress((i * 100) / i2, 0);
        } catch (Exception e) {
            o0.b("BaseTemplatePresenter", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void adClosed() {
        if (this.adapterModel.U()) {
            return;
        }
        this.adapterModel.a(true);
        if (this.reward != null) {
            this.playTempleModel.onAdClose(this.mBridgeIds, new RewardInfo(this.adapterModel.m0(), this.reward.c(), String.valueOf(this.reward.a())), 1);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void adShowFail(String str, int i) {
        if (this.adapterModel.V()) {
            return;
        }
        this.adapterModel.b(true);
        super.adShowFail(str, i);
        IPlayModel iPlayModel = this.playTempleModel;
        if (iPlayModel != null) {
            iPlayModel.onShowFail(this.mBridgeIds, str, i);
        }
        finish(true);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void adShowSuccess() {
        if (this.adapterModel.V()) {
            return;
        }
        super.adShowSuccess();
        if (!this.adapterModel.g0()) {
            this.playTempleModel.onAdShow(this.mBridgeIds);
            this.playTempleModel.eventOnlyImpression(this.redirectModel);
        }
        this.playTempleModel.eventImpression(this.redirectModel);
        updatePlayCampaignFrequence();
        this.playTempleModel.eventPvUrls(this.redirectModel);
        this.playTempleModel.eventTrackingForImpression(this.redirectModel);
        this.playTempleModel.eventAdUrlList(this.redirectModel);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void click(View view) {
        if (view.getId() != filterFindViewId(false, "mbridge_alertview_close_button")) {
            if (view.getId() == filterFindViewId(false, "mbridge_alertview_continue_button")) {
                if (isIVRewardEnable()) {
                    this.ivRewardAlertViewStatus = a.E;
                    this.dialogContinueClicked = true;
                    this.iView.setAdCloseVisibility(false);
                }
                this.isAlertShowing = false;
                this.iView.alertDismiss();
                return;
            }
            return;
        }
        if (isIVRewardEnable()) {
            this.ivRewardAlertViewStatus = a.D;
            this.dialogCancelClicked = true;
            if (this.ivRewardMode == a.I) {
                this.isAlertShowing = false;
                this.iView.alertDismiss();
                return;
            }
        }
        this.isCloseBtnClicked = true;
        this.isAlertShowing = false;
        closeAdOrShowEndCard();
        this.iView.alertDismiss();
    }

    public void closeAdOrShowEndCard() {
        if (isIVRewardEnable()) {
            this.adapterModel.e(this.ivRewardAlertViewStatus);
        }
        if (this.videoSkipResult == 2) {
            doVideoEndTypeLogic();
        } else {
            callbackAdClose();
        }
        if (this.isCloseBtnClicked) {
            this.playTempleModel.eventTrackingForClose(this.redirectModel);
        }
    }

    public int getBufferTimeout() {
        try {
            com.mbridge.msdk.videocommon.setting.a aVarB = this.adapterModel.O().b();
            if (aVarB != null) {
                return (int) aVarB.i();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return 5;
    }

    public void handleInterceptTouchEvent(MotionEvent motionEvent) {
        RedirectModel redirectModel = this.redirectModel;
        if (redirectModel == null || motionEvent == null) {
            return;
        }
        redirectModel.setxInScreen(motionEvent.getRawX());
        this.redirectModel.setyInScreen(motionEvent.getRawY());
    }

    public boolean isHalfScreenOffer() {
        CampaignEx campaignEx = this.campaignEx;
        return campaignEx != null && campaignEx.getAdSpaceT() == 2;
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
        IPlayModel iPlayModel = this.playTempleModel;
        if (iPlayModel != null) {
            iPlayModel.onBufferingEnd();
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
        IPlayModel iPlayModel = this.playTempleModel;
        if (iPlayModel != null) {
            iPlayModel.onBufferingStart(str);
        }
    }

    public void onCloseButtonClick() {
        if (this.isIV) {
            this.isCloseBtnClicked = true;
            if (this.campaignEx.getAdSpaceT() != 2) {
                int i = this.ivRewardMode;
                if (i == a.I && this.dialogCancelClicked) {
                    closeAdOrShowEndCard();
                    return;
                } else if (i == a.H) {
                    showIVRewardDialogOnCloseMode();
                } else {
                    closeAdOrShowEndCard();
                }
            } else {
                closeAdOrShowEndCard();
            }
        } else if (this.adapterModel.m0()) {
            this.isCloseBtnClicked = true;
            closeAdOrShowEndCard();
            return;
        } else if (this.closeAlert == 1) {
            this.isAlertShowing = true;
            this.iView.setAlertViewType(this.adapterModel.R(), 1, -1);
            this.iView.alertShow();
        } else {
            this.isCloseBtnClicked = true;
            closeAdOrShowEndCard();
        }
        if (this.adapterModel.m0()) {
            return;
        }
        this.playTempleModel.skipped();
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void onDestroy() {
        IPlayModel iPlayModel;
        super.onDestroy();
        if (!this.adapterModel.V()) {
            this.adapterModel.b(true);
            super.adShowFail(com.mbridge.msdk.foundation.error.a.a(890003), 890003);
            IPlayModel iPlayModel2 = this.playTempleModel;
            if (iPlayModel2 != null) {
                iPlayModel2.onShowFail(this.mBridgeIds, com.mbridge.msdk.foundation.error.a.a(890003), 890003);
            }
        }
        if (this.adapterModel.U()) {
            return;
        }
        this.adapterModel.a(true);
        if (this.reward == null || (iPlayModel = this.playTempleModel) == null) {
            return;
        }
        iPlayModel.onAdClose(this.mBridgeIds, new RewardInfo(this.adapterModel.m0(), this.reward.c(), String.valueOf(this.reward.a())), 1);
    }

    public void onPause() {
        this.iView.pause();
        if (this.isCloseBtnClicked || this.adapterModel.m0()) {
            return;
        }
        this.playTempleModel.eventTrackingForPause(this.redirectModel);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        this.adapterModel.q(true);
        this.playTempleModel.onVideoComplete(this.mBridgeIds);
        if (this.campaignEx.getAdSpaceT() != 1) {
            closeOrShowHalfEndCard();
            return;
        }
        if (isIVRewardEnable()) {
            this.adapterModel.e(this.ivRewardAlertViewStatus);
        }
        doVideoEndTypeLogic();
        if (this.isCloseBtnClicked) {
            this.playTempleModel.eventTrackingForClose(this.redirectModel);
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        this.playTempleModel.eventTrackingForPlayError(this.redirectModel, str);
        if (this.adapterModel.O().c().C() != 1) {
            adShowFail(com.mbridge.msdk.foundation.error.a.a(890004), 890004);
            return;
        }
        if (!this.progressHasDoAdSuccess) {
            this.progressHasDoAdSuccess = true;
            adShowSuccess();
        }
        if (this.campaignEx.getAdSpaceT() == 1) {
            closeAdOrShowEndCard();
        } else {
            closeOrShowHalfEndCard();
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i, int i2) {
        if (this.iView == null || this.campaignEx == null) {
            return;
        }
        try {
            this.currentPlayProgress = i;
            this.videoTotalLength = i2 == 0 ? 1 : i2;
            adShowSuccess();
            advImpList(i);
            setCountDownInfo(i, i2);
            if (isIVRewardEnable()) {
                showIVRewardDialogOnPlayMode();
            }
            updateSegmentsProgressBar(i, i2);
            checkOMSdkProgress(i, i2);
            checkPlayCloseBtnState(i, i2);
            checkTrackingForPlayPercentage(this.currentPlayProgress, i2);
        } catch (Exception e) {
            o0.b("BaseTemplatePresenter", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i, int i2) {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i) {
        if (this.iView == null || this.campaignEx == null) {
            return;
        }
        try {
            setSkipAndCompleteTime(i);
            initCountDown();
            this.iView.setMuteState(this.adapterModel.s() == 2);
            setSegmentsProgressBarState();
        } catch (Exception e) {
            o0.b("BaseTemplatePresenter", e.getMessage());
        }
    }

    public void onResume() {
        this.iView.resume();
        this.playTempleModel.eventTrackingForResume(this.redirectModel);
    }

    public void showIVRewardDialogOnCloseMode() {
        if (!isIVRewardEnable()) {
            closeAdOrShowEndCard();
            return;
        }
        if (this.ivRewardMode == a.H) {
            int i = this.ivRewardValueType;
            if (i == a.J && ((int) ((this.currentPlayProgress / this.videoTotalLength) * 100.0f)) >= this.ivRewardValue) {
                closeAdOrShowEndCard();
            } else if (i == a.K && this.currentPlayProgress >= this.ivRewardValue) {
                closeAdOrShowEndCard();
            } else {
                this.iView.setAlertViewType(this.adapterModel.R(), 0, this.ivRewardMode);
                this.iView.alertShow();
            }
        }
    }
}

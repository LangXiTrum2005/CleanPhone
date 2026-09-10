package com.mbridge.msdk.newreward.player.presenter;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.google.ads.mediation.vungle.VungleConstants;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.feedback.a;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.adapter.req.b;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.function.command.receiver.d;
import com.mbridge.msdk.newreward.function.proxy.e;
import com.mbridge.msdk.newreward.player.imodel.IPlayModel;
import com.mbridge.msdk.newreward.player.iview.IWebTemplateView;
import com.mbridge.msdk.newreward.player.model.WebTemplateModel;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MBCommunicatorUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.File;
import java.lang.reflect.Proxy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PlayWebPresenter extends BaseTemplatePresenter implements b {
    final int CLOSE_BUILD_TYPE;
    private final String TAG;
    a feedbackDialogEventListener;
    boolean mCanResponseBackPress;
    Handler mHandler;
    boolean mNativeHandleClick;
    float mTouchX;
    float mTouchY;
    IWebTemplateView mWebTemplateView;
    private boolean muteState;
    public Runnable nativeCloseBtnVisibleRunnable;
    int webCloseViewStatus;

    public PlayWebPresenter(IWebTemplateView iWebTemplateView) {
        super(iWebTemplateView);
        this.TAG = "PlayWebPresenter";
        this.muteState = true;
        this.mNativeHandleClick = false;
        this.mCanResponseBackPress = false;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.webCloseViewStatus = -1;
        this.CLOSE_BUILD_TYPE = 2;
        this.nativeCloseBtnVisibleRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayWebPresenter.2
            @Override // java.lang.Runnable
            public void run() {
                PlayWebPresenter playWebPresenter = PlayWebPresenter.this;
                if (playWebPresenter.webCloseViewStatus != -1) {
                    return;
                }
                playWebPresenter.mWebTemplateView.setNativeCloseButtonVisibility(0);
            }
        };
        this.feedbackDialogEventListener = new a() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayWebPresenter.3
            @Override // com.mbridge.msdk.foundation.feedback.a
            public void close() {
                PlayWebPresenter.this.firePrivacyFeedbackEvent(2);
            }

            @Override // com.mbridge.msdk.foundation.feedback.a
            public void showed() {
                PlayWebPresenter.this.firePrivacyFeedbackEvent(1);
            }

            @Override // com.mbridge.msdk.foundation.feedback.a
            public void summit(String str) {
                PlayWebPresenter.this.firePrivacyFeedbackEvent(2);
            }
        };
        IWebTemplateView iWebTemplateView2 = (IWebTemplateView) Proxy.newProxyInstance(iWebTemplateView.getClass().getClassLoader(), new Class[]{IWebTemplateView.class}, new e(iWebTemplateView, this.adapterModel, this.commandManager));
        this.mWebTemplateView = iWebTemplateView2;
        this.iView = iWebTemplateView2;
        this.TEMPLATE_MARK_TYPE = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void firePrivacyFeedbackEvent(int i) {
        String strEncodeToString;
        try {
            JSONObject jSONObject = new JSONObject();
            if (c.n().d() != null) {
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, i);
            }
            strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (Throwable th) {
            o0.b("PlayWebPresenter", th.getMessage(), th);
            strEncodeToString = "";
        }
        MBCommunicatorUtil.fireEvent(this.mWebTemplateView.getWebView(), "onFeedbackAlertStatusNotify", strEncodeToString);
    }

    private void showCTAOrMiniEndCard(int i) {
        if (i == -1) {
            this.mWebTemplateView.hideCTAView();
        }
        if (i == 1) {
            this.mWebTemplateView.showCTAView(this.adapterModel.R(), this.adapterModel.H());
        }
        if (i == 2) {
            this.mWebTemplateView.showMiniCard();
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void adShowSuccess() {
        super.adShowSuccess();
    }

    public void changeNativeCloseButton() {
        int cbd = this.adapterModel.H().getCbd();
        if (cbd < 0) {
            cbd = this.adapterModel.O().c().i();
        }
        this.mHandler.postDelayed(this.nativeCloseBtnVisibleRunnable, ((long) cbd) * 1000);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void click(View view) {
        if (view.getId() == filterFindViewId(false, "mbridge_alertview_close_button")) {
            onClick(8);
        } else if (view.getId() == filterFindViewId(false, "mbridge_alertview_continue_button")) {
            onClick(6);
        }
        super.click(view);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void finish(boolean z) {
        try {
            releaseSource();
            if (z) {
                ((Activity) this.context).finish();
                d.a().d(f.SHOW_OR_PRELOAD_WEB_EC);
            }
            d.a().a(this.adapterModel.A());
        } catch (Throwable th) {
            o0.b("PlayWebPresenter", th.getMessage());
        }
    }

    public int getCampaignOrientation() {
        try {
            if (this.adapterModel.H() != null) {
                return this.adapterModel.H().getRewardTemplateMode().b();
            }
        } catch (Throwable th) {
            o0.b("PlayWebPresenter", th.getMessage());
        }
        return 0;
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void getView() {
        initDataForView(null);
    }

    public String getWebViewShowExtraData() {
        if (this.reward == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", this.reward.c());
            jSONObject2.put(RewardPlus.AMOUNT, this.reward.a());
            jSONObject2.put("id", "");
            jSONObject.put(VungleConstants.KEY_USER_ID, "");
            jSONObject.put("reward", jSONObject2);
            jSONObject.put("playVideoMute", this.muteState);
            jSONObject.put("extra", this.adapterModel.j());
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter
    public void handleInterceptTouchEvent(MotionEvent motionEvent) {
        this.mTouchX = motionEvent.getRawX();
        this.mTouchY = motionEvent.getRawY();
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void initDataForView(com.mbridge.msdk.video.dynview.a aVar) {
        this.mWebTemplateView.initViews(false);
        if (this.campaignEx.getVideoUrlEncode() != null) {
            File fileB = this.adapterModel.b(this.campaignEx.getRequestIdNotice());
            if (this.campaignEx.getVst() > -2) {
                ((BaseTemplatePresenter) this).videoSkipTime = this.campaignEx.getVst();
            } else {
                ((BaseTemplatePresenter) this).videoSkipTime = this.adapterModel.O().c().F();
            }
            this.videoCompleteTime = this.campaignEx.getVideoCompleteTime();
            if (fileB == null || !fileB.exists()) {
                this.mWebTemplateView.play(this.campaignEx.getVideoUrlEncode(), getBufferTimeout());
            } else {
                this.mWebTemplateView.play(fileB.getAbsolutePath(), getBufferTimeout());
            }
        }
        t0.a(1, this.mWebTemplateView.getPrivacyButton(), this.adapterModel.H(), this.context, false, new a() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayWebPresenter.1
            @Override // com.mbridge.msdk.foundation.feedback.a
            public void close() {
                PlayWebPresenter.this.mWebTemplateView.playOrPauseVideo(1);
            }

            @Override // com.mbridge.msdk.foundation.feedback.a
            public void showed() {
                PlayWebPresenter.this.onPause();
            }

            @Override // com.mbridge.msdk.foundation.feedback.a
            public void summit(String str) {
                PlayWebPresenter.this.mWebTemplateView.playOrPauseVideo(1);
            }
        });
        com.mbridge.msdk.newreward.adapter.e eVar = this.adapterModel;
        if (eVar == null || !eVar.k().equals("WEB_EC")) {
            return;
        }
        com.mbridge.msdk.newreward.function.command.c cVar = this.commandManager;
        cVar.i(cVar.a("web_resource_action", 1, "parent_temple", this.data.getRootViewGroup(), "adapter_model", this.adapterModel, "bridge_ids", this.campaignEx.getRequestIdNotice()), f.SHOW_OR_PRELOAD_WEB_EC);
    }

    public void onBackPressed() {
        if (this.mCanResponseBackPress) {
            onClick(2);
        }
    }

    public void onClick(int i) {
        if (isIVRewardEnable()) {
            this.adapterModel.e(this.ivRewardAlertViewStatus);
        }
        if (i == 2) {
            onCloseButtonClick();
        }
        if (i == 5) {
            if (this.iView.getMuteState()) {
                this.playTempleModel.eventTrackingForUnMute(this.redirectModel);
                this.muteState = false;
            } else {
                this.playTempleModel.eventTrackingForMute(this.redirectModel);
                this.muteState = true;
            }
            this.mWebTemplateView.setMuteState(this.muteState);
        }
        if ((i != 1 && i != 3) || !this.mNativeHandleClick) {
            MBCommunicatorUtil.notifyClick(this.mWebTemplateView.getWebView(), i, com.mbridge.msdk.newreward.function.utils.b.a(this.mTouchX, this.mTouchY, 0));
            return;
        }
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx != null) {
            campaignEx.setClickTempSource(com.mbridge.msdk.foundation.same.report.metrics.a.g);
            if (i == 1) {
                this.campaignEx.setTriggerClickSource(com.mbridge.msdk.foundation.same.report.metrics.a.m);
            } else {
                this.campaignEx.setTriggerClickSource(com.mbridge.msdk.foundation.same.report.metrics.a.l);
            }
        }
        this.playTempleModel.onAdClick(this.mBridgeIds);
        this.playTempleModel.eventClickUrl(this.redirectModel);
        this.playTempleModel.eventTrackingForClick(this.redirectModel);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void onDestroy() {
        super.onDestroy();
        try {
            releaseSource();
            d.a().a(this.adapterModel.A());
            d.a().d(f.SHOW_OR_PRELOAD_WEB_EC);
        } catch (Throwable th) {
            o0.b("PlayWebPresenter", th.getMessage());
        }
    }

    public void onDetachedFromWindow() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.nativeCloseBtnVisibleRunnable);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        super.onPlayCompleted();
        MBCommunicatorUtil.notifyVideoStatus(this.mWebTemplateView.getWebView(), 1);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        super.onPlayError(str);
        MBCommunicatorUtil.notifyVideoStatus(this.mWebTemplateView.getWebView(), 2);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i, int i2) {
        super.onPlayProgress(i, i2);
        try {
            JSONObject jSONObject = new JSONObject();
            if (i2 == 0) {
                i2 = this.campaignEx.getVideoLength();
            }
            if (i2 == 0) {
                i2 = 1;
            }
            jSONObject.put("progress", (int) (i / i2));
            jSONObject.put("time", i);
            jSONObject.put("duration", i2);
            IPlayModel iPlayModel = this.playTempleModel;
            if (iPlayModel instanceof WebTemplateModel) {
                ((WebTemplateModel) iPlayModel).setVideoProgressString(jSONObject.toString());
            }
            MBCommunicatorUtil.notifyVideoProgress(this.mWebTemplateView.getWebView(), i, i2);
        } catch (Throwable th) {
            o0.b("PlayWebPresenter", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i) {
        super.onPlayStarted(i);
        MBCommunicatorUtil.notifyVideoStatus(this.mWebTemplateView.getWebView(), 0);
    }

    public void onWebContentError() {
        this.mWebTemplateView.onDestroyWebContent(this.TEMPLATE_MARK_TYPE);
        if (this.adapterModel.V()) {
            this.webCloseViewStatus = -1;
            this.mNativeHandleClick = true;
            this.mHandler.post(this.nativeCloseBtnVisibleRunnable);
        } else {
            this.mWebTemplateView.removeTempleFromSuperView(this.data.getRootViewGroup());
        }
        d.a().a(this.adapterModel.A());
    }

    public void onWebViewShow() {
        this.mWebTemplateView.onWebViewShow(this.TEMPLATE_MARK_TYPE);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void releaseSource() {
        if (!this.adapterModel.i0()) {
            this.adapterModel.m(true);
            this.playTempleModel.modelReport("2000146");
        }
        this.iView.release();
    }

    @Override // com.mbridge.msdk.newreward.adapter.req.b
    public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    @Override // com.mbridge.msdk.newreward.adapter.req.b
    public void reqSuccessful(Object obj) {
        try {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    int i = 8;
                    switch (jSONObject.getString(com.umeng.ccg.a.w)) {
                        case "readyStatus":
                            if (jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, 1) == 1) {
                                this.mWebTemplateView.onWebViewShow(this.TEMPLATE_MARK_TYPE);
                                break;
                            } else {
                                onWebContentError();
                                break;
                            }
                            break;
                        case "toggleCloseBtn":
                            int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, 1);
                            this.webCloseViewStatus = iOptInt;
                            this.mHandler.removeCallbacks(this.nativeCloseBtnVisibleRunnable);
                            this.mWebTemplateView.setNativeCloseButtonVisibility(iOptInt == 1 ? 0 : 4);
                            break;
                        case "notifyCloseBtn":
                            int iOptInt2 = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, -1);
                            this.webCloseViewStatus = iOptInt2;
                            if (iOptInt2 == 0 || iOptInt2 == 1) {
                                this.mHandler.removeCallbacks(this.nativeCloseBtnVisibleRunnable);
                            }
                            if (iOptInt2 == 1) {
                                this.mCanResponseBackPress = true;
                                break;
                            }
                            break;
                        case "close":
                            this.mWebTemplateView.onCloseViewClick(2);
                            break;
                        case "onReceivedError":
                            onWebContentError();
                            break;
                        case "showVideoLocation":
                            String strOptString = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
                            if (!TextUtils.isEmpty(strOptString)) {
                                this.mWebTemplateView.changeVideoViewPosition(new JSONObject(strOptString));
                                break;
                            }
                            break;
                        case "videoOperate":
                            this.mWebTemplateView.playOrPauseVideo(jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, -999));
                            break;
                        case "soundOperate":
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(NotificationCompat.CATEGORY_STATUS);
                            if (jSONObjectOptJSONObject != null) {
                                int iOptInt3 = jSONObjectOptJSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_MUTE, 2);
                                this.mWebTemplateView.setMuteState(iOptInt3, jSONObjectOptJSONObject.optInt("view_visible", 2));
                                if (iOptInt3 == 1) {
                                    this.playTempleModel.eventTrackingForMute(this.redirectModel);
                                } else if (iOptInt3 == 2) {
                                    this.playTempleModel.eventTrackingForUnMute(this.redirectModel);
                                }
                                break;
                            }
                            break;
                        case "progressOperate":
                            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(NotificationCompat.CATEGORY_STATUS);
                            if (jSONObjectOptJSONObject2 != null) {
                                int iOptInt4 = jSONObjectOptJSONObject2.optInt("progress", -1);
                                int iOptInt5 = jSONObjectOptJSONObject2.optInt("view_visible", 2);
                                if (iOptInt4 != -1) {
                                    this.mWebTemplateView.seekToPlay(iOptInt4);
                                }
                                this.mWebTemplateView.getCountDownView().setVisibility(iOptInt5 == 2 ? 0 : 4);
                                break;
                            }
                            break;
                        case "progressBarOperate":
                            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(NotificationCompat.CATEGORY_STATUS);
                            if (jSONObjectOptJSONObject3 != null) {
                                int iOptInt6 = jSONObjectOptJSONObject3.optInt("view_visible", 2);
                                IWebTemplateView iWebTemplateView = this.mWebTemplateView;
                                if (iOptInt6 != 1) {
                                    i = 0;
                                }
                                iWebTemplateView.setSegmentsProgressBar(i);
                                break;
                            }
                            break;
                        case "click":
                            CampaignEx campaignEx = this.campaignEx;
                            if (campaignEx != null) {
                                campaignEx.setClickTempSource(com.mbridge.msdk.foundation.same.report.metrics.a.g);
                            }
                            this.playTempleModel.onAdClick(this.mBridgeIds);
                            this.playTempleModel.eventTrackingForClick(this.redirectModel);
                            break;
                        case "showVideoClickView":
                            showCTAOrMiniEndCard(jSONObject.optInt("type", -999));
                            break;
                        case "feedbackOperate":
                            String strOptString2 = jSONObject.optString("type", "");
                            String strOptString3 = jSONObject.optString(NotificationCompat.CATEGORY_STATUS, "");
                            if (TextUtils.isEmpty(strOptString2)) {
                                break;
                            } else {
                                JSONObject jSONObject2 = new JSONObject(strOptString3);
                                if (strOptString2.equals("popup")) {
                                    com.mbridge.msdk.foundation.feedback.b.b().a(jSONObject2.optString("key", ""), jSONObject2.optInt("view_visible", 1), this.feedbackDialogEventListener);
                                }
                                if (strOptString2.equals("visibility")) {
                                    int iOptInt7 = jSONObject2.optInt("view_visible", 1);
                                    String strOptString4 = jSONObject2.optString("key", "");
                                    com.mbridge.msdk.foundation.feedback.b bVarB = com.mbridge.msdk.foundation.feedback.b.b();
                                    if (iOptInt7 != 1) {
                                        i = 0;
                                    }
                                    bVarB.a(strOptString4, i, this.mWebTemplateView.getWebView());
                                }
                                if (strOptString2.equals(TtmlNode.TAG_LAYOUT)) {
                                    com.mbridge.msdk.foundation.feedback.b.b().a(jSONObject2.optString("key", ""), jSONObject2.optInt("width", -1), jSONObject2.optInt("height", -1), jSONObject2.optInt("radius", 20), jSONObject2.optInt(TtmlNode.LEFT, -1), jSONObject2.optInt("top", -1), (float) jSONObject2.optDouble("opacity", 1.0d), jSONObject2.optString("fontColor", ""), jSONObject2.optString("bgColor", ""), (float) jSONObject2.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE, -1.0d), jSONObject2.optJSONArray("padding"));
                                }
                                break;
                            }
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            o0.b("PlayWebPresenter", th.getMessage());
        }
    }

    public void setCanResponseBack(boolean z) {
        this.mCanResponseBackPress = z;
    }

    public void setNotchData(String str) {
        MBCommunicatorUtil.notifyNotchData(this.mWebTemplateView.getWebView(), str);
    }

    public void setTemplateModel(IPlayModel iPlayModel) {
        if (iPlayModel == null) {
            WebTemplateModel webTemplateModel = new WebTemplateModel(this.commandManager, this.adapterModel);
            webTemplateModel.setRenderType(this.TEMPLATE_MARK_TYPE);
            this.playTempleModel = (IPlayModel) Proxy.newProxyInstance(WebTemplateModel.class.getClassLoader(), WebTemplateModel.class.getInterfaces(), new e(webTemplateModel, this.adapterModel, this.commandManager));
        } else {
            if (iPlayModel instanceof WebTemplateModel) {
                WebTemplateModel webTemplateModel2 = (WebTemplateModel) iPlayModel;
                webTemplateModel2.setCommandManager(this.commandManager);
                webTemplateModel2.setCallbackListener(this);
                webTemplateModel2.setRewardVideoListener(this.adapterModel.M());
            }
            this.playTempleModel = (IPlayModel) Proxy.newProxyInstance(iPlayModel.getClass().getClassLoader(), iPlayModel.getClass().getInterfaces(), new e(iPlayModel, this.adapterModel, this.commandManager));
        }
    }
}

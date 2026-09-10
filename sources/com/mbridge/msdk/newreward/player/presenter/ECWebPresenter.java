package com.mbridge.msdk.newreward.player.presenter;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
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
import com.mbridge.msdk.newreward.player.imodel.IECModel;
import com.mbridge.msdk.newreward.player.iview.IBaseWebView;
import com.mbridge.msdk.newreward.player.model.WebViewECModel;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MBCommunicatorUtil;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Proxy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ECWebPresenter extends AbsPresenter implements b {
    final int END_CARD_BUILD_TYPE;
    private final String TAG;
    IECModel ecTempleModel;
    a feedbackDialogEventListener;
    boolean isLoadResourceError;
    boolean isPlayableResourceSuccess;
    boolean isShown;
    boolean isWebContentLoadFinish;
    boolean mCanResponseBackPress;
    Handler mHandler;
    int mRenderUrlType;
    float mTouchX;
    float mTouchY;
    IBaseWebView mWebContentView;
    int muteState;
    public Runnable nativeCloseBtnVisibleRunnable;
    int waitReadyDefaultTime;
    public Runnable waitReadyStatusRunnable;
    int webCloseViewStatus;

    public ECWebPresenter(IBaseWebView iBaseWebView) {
        super(iBaseWebView);
        this.TAG = "ECWebPresenter";
        this.webCloseViewStatus = -1;
        this.muteState = -1;
        this.isLoadResourceError = false;
        this.isShown = false;
        this.isWebContentLoadFinish = false;
        this.END_CARD_BUILD_TYPE = 2;
        this.mCanResponseBackPress = false;
        this.isPlayableResourceSuccess = false;
        this.waitReadyDefaultTime = 15000;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mRenderUrlType = 1;
        this.nativeCloseBtnVisibleRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.presenter.ECWebPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                CampaignEx campaignEx;
                ECWebPresenter eCWebPresenter = ECWebPresenter.this;
                if (eCWebPresenter.webCloseViewStatus == -1 || (campaignEx = eCWebPresenter.campaignEx) == null || campaignEx.getVideo_end_type() == 4) {
                    ECWebPresenter.this.mWebContentView.setNativeCloseButtonVisibility(0);
                }
            }
        };
        this.waitReadyStatusRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.presenter.ECWebPresenter.2
            @Override // java.lang.Runnable
            public void run() {
                ECWebPresenter eCWebPresenter = ECWebPresenter.this;
                if (eCWebPresenter.isPlayableResourceSuccess) {
                    return;
                }
                eCWebPresenter.onWebContentError();
            }
        };
        this.feedbackDialogEventListener = new a() { // from class: com.mbridge.msdk.newreward.player.presenter.ECWebPresenter.3
            @Override // com.mbridge.msdk.foundation.feedback.a
            public void close() {
                ECWebPresenter.this.firePrivacyFeedbackEvent(2);
            }

            @Override // com.mbridge.msdk.foundation.feedback.a
            public void showed() {
                ECWebPresenter.this.firePrivacyFeedbackEvent(1);
            }

            @Override // com.mbridge.msdk.foundation.feedback.a
            public void summit(String str) {
                ECWebPresenter.this.firePrivacyFeedbackEvent(2);
            }
        };
        this.mWebContentView = (IBaseWebView) Proxy.newProxyInstance(iBaseWebView.getClass().getClassLoader(), new Class[]{IBaseWebView.class}, new e(iBaseWebView, this.adapterModel, this.commandManager));
        this.TEMPLATE_MARK_TYPE = 3;
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
            o0.b("ECWebPresenter", th.getMessage(), th);
            strEncodeToString = "";
        }
        MBCommunicatorUtil.fireEvent(this.mWebContentView.getWebView(), "onFeedbackAlertStatusNotify", strEncodeToString);
    }

    private void startWaitReadyRunnable() {
        String str = this.adapterModel.H().getendcard_url();
        if (TextUtils.isEmpty(str) || !str.contains("wfl=1")) {
            return;
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("timeout");
            int i = !TextUtils.isEmpty(queryParameter) ? Integer.parseInt(queryParameter) : 0;
            this.mHandler.postDelayed(this.waitReadyStatusRunnable, i > 0 ? ((long) i) * 1000 : this.waitReadyDefaultTime);
        } catch (Throwable th) {
            o0.b("ECWebPresenter", th.getMessage());
            this.mHandler.postDelayed(this.waitReadyStatusRunnable, this.waitReadyDefaultTime);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void adClosed() {
        if (this.adapterModel.U()) {
            return;
        }
        this.adapterModel.a(true);
        if (this.reward != null) {
            this.ecTempleModel.onAdClose(this.mBridgeIds, new RewardInfo(this.adapterModel.m0(), this.reward.c(), String.valueOf(this.reward.a())), 2);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void adShowSuccess() {
        if (this.adapterModel.V()) {
            return;
        }
        this.adapterModel.b(true);
        super.adShowSuccess();
        this.ecTempleModel.onAdShow(this.mBridgeIds);
        this.ecTempleModel.eventImpression(this.redirectModel);
        this.ecTempleModel.eventOnlyImpression(this.redirectModel);
        this.ecTempleModel.eventPvUrls(this.redirectModel);
        this.ecTempleModel.eventTrackingForImpression(this.redirectModel);
    }

    public void addECModel() {
        WebViewECModel webViewECModel = new WebViewECModel(this.commandManager, this.adapterModel);
        webViewECModel.setCallbackListener(this);
        webViewECModel.setRenderType(this.TEMPLATE_MARK_TYPE);
        this.mWebContentView.getWebView().setHybridCommunicator(webViewECModel);
        this.mWebContentView.getWebView().setWebViewEventListener(webViewECModel);
        this.ecTempleModel = (IECModel) Proxy.newProxyInstance(WebViewECModel.class.getClassLoader(), new Class[]{IECModel.class}, new e(webViewECModel, this.adapterModel, this.commandManager));
    }

    public void changeNativeCloseButton() {
        int cbd = this.adapterModel.H().getCbd();
        if (cbd < 0) {
            cbd = this.adapterModel.O().c().i();
        }
        this.mHandler.postDelayed(this.nativeCloseBtnVisibleRunnable, ((long) cbd) * 1000);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void click(View view) {
        this.mWebContentView.removeTempleFromSuperView(this.data.getRootViewGroup());
        if (isIVRewardEnable()) {
            this.ecTempleModel.onAdCloseWithIVReward(this.mBridgeIds, this.adapterModel.m0(), this.adapterModel.t());
        }
        adClosed();
        if (!this.isIV && this.adapterModel.m0()) {
            this.ecTempleModel.eventAddReward(this.redirectModel);
        }
        finish(true);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void finish(boolean z) {
        this.mWebContentView.onDestroyWebContent(this.TEMPLATE_MARK_TYPE);
        d.a().d(f.SHOW_OR_PRELOAD_WEB_EC);
        Context context = this.context;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    public int getCampaignOrientation() {
        try {
            if (this.adapterModel.H() != null) {
                return this.adapterModel.H().getRewardTemplateMode().b();
            }
        } catch (Throwable th) {
            o0.b("ECWebPresenter", th.getMessage());
        }
        return 0;
    }

    public int getRenderStatus() {
        return this.ecTempleModel.getRenderStatus();
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

    public void handleInterceptTouchEvent(MotionEvent motionEvent) {
        this.mTouchX = motionEvent.getRawX();
        this.mTouchY = motionEvent.getRawY();
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void initDataForView(com.mbridge.msdk.video.dynview.a aVar) {
        this.mWebContentView.initViews(false);
        t0.a(2, this.mWebContentView.getPrivacyButton(), this.adapterModel.H(), this.context, false, this.feedbackDialogEventListener);
    }

    public void onActivityLifeCycleCallback(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "onDestroy":
                adClosed();
                finish(false);
                str2 = "onSystemDestory";
                break;
            case "onPause":
                str2 = "onSystemPause";
                break;
            case "onBackPressed":
                str2 = "onSystemBackPressed";
                break;
            case "onResume":
                str2 = "onSystemResume";
                break;
            default:
                str2 = "";
                break;
        }
        if (!TextUtils.isEmpty(str2)) {
            MBCommunicatorUtil.fireEvent(this.mWebContentView.getWebView(), str2, "");
        }
        if (str.equals("onBackPressed") && this.isShown && this.mCanResponseBackPress) {
            click(null);
        }
    }

    public void onAttachedToWindow() {
    }

    public void onDetachedFromWindow() {
        this.mHandler.removeCallbacks(this.nativeCloseBtnVisibleRunnable);
        this.mHandler.removeCallbacks(this.waitReadyStatusRunnable);
    }

    public void onShown() {
        adShowSuccess();
        if (this.ecTempleModel == null || this.adapterModel.a0()) {
            return;
        }
        int i = this.videoEndType;
        if (i != 4 && i != 5) {
            this.ecTempleModel.onEndCardShow(this.mBridgeIds, 2);
            this.ecTempleModel.eventTrackingForEndCardShow(this.redirectModel, 2);
        }
        this.isShown = true;
        if (this.isWebContentLoadFinish) {
            this.mWebContentView.onWebViewShow(this.TEMPLATE_MARK_TYPE);
            startWaitReadyRunnable();
        }
        this.adapterModel.f(true);
        if (this.mRenderUrlType != 1) {
            changeNativeCloseButton();
        }
    }

    public void onWebContentError() {
        if (this.isLoadResourceError) {
            return;
        }
        this.isLoadResourceError = true;
        this.mWebContentView.onDestroyWebContent(this.TEMPLATE_MARK_TYPE);
        if (this.isShown) {
            CampaignEx campaignEx = this.campaignEx;
            long ecTemplateId = campaignEx != null ? campaignEx.getEcTemplateId() : 404L;
            com.mbridge.msdk.newreward.function.command.c cVar = this.commandManager;
            cVar.c(cVar.a("add_temple", Long.valueOf(ecTemplateId), "template_type", 18, "adapter_model", this.adapterModel, "parent_temple", this.data.getRootViewGroup()), f.SHOW_ADD_TEMPLE);
            d.a().d(f.SHOW_OR_PRELOAD_WEB_EC);
        } else {
            this.ecTempleModel.setRenderStatus(1);
        }
        this.mWebContentView.removeTempleFromSuperView(this.data.getRootViewGroup());
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void releaseSource() {
    }

    @Override // com.mbridge.msdk.newreward.adapter.req.b
    public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
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
                                this.isWebContentLoadFinish = true;
                                break;
                            }
                            break;
                        case "loadingResourceStatus":
                            int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, 1);
                            if (iOptInt == 1) {
                                this.isWebContentLoadFinish = true;
                            }
                            this.isPlayableResourceSuccess = iOptInt == 1;
                            this.mHandler.removeCallbacks(this.waitReadyStatusRunnable);
                            if (!this.isPlayableResourceSuccess) {
                                if (!this.isShown) {
                                    setRenderError();
                                } else {
                                    onWebContentError();
                                }
                                break;
                            }
                            break;
                        case "onPageFinished":
                            this.isWebContentLoadFinish = true;
                            if (this.isShown) {
                                this.mWebContentView.onWebViewShow(this.TEMPLATE_MARK_TYPE);
                                break;
                            }
                            break;
                        case "toggleCloseBtn":
                            int iOptInt2 = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, 1);
                            this.webCloseViewStatus = iOptInt2;
                            this.mHandler.removeCallbacks(this.nativeCloseBtnVisibleRunnable);
                            this.mWebContentView.setNativeCloseButtonVisibility(iOptInt2 == 1 ? 0 : 4);
                            break;
                        case "notifyCloseBtn":
                            int iOptInt3 = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, -1);
                            if (iOptInt3 == 0 || iOptInt3 == 1) {
                                this.webCloseViewStatus = iOptInt3;
                            }
                            if (iOptInt3 == 1) {
                                this.mCanResponseBackPress = true;
                                break;
                            }
                            break;
                        case "close":
                            this.mWebContentView.onCloseViewClick(2);
                            break;
                        case "ivRewardAdsWithoutVideo":
                            int iOptInt4 = jSONObject.optInt("type");
                            int iOptInt5 = jSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
                            this.adapterModel.e(iOptInt4 != 2 ? iOptInt4 != 3 ? com.mbridge.msdk.foundation.same.a.F : com.mbridge.msdk.foundation.same.a.E : com.mbridge.msdk.foundation.same.a.D);
                            this.adapterModel.q(iOptInt5 == 1);
                            this.mWebContentView.onCloseViewClick(2);
                            break;
                        case "onReceivedError":
                            onWebContentError();
                            break;
                        case "click":
                            CampaignEx campaignEx = this.campaignEx;
                            if (campaignEx != null) {
                                campaignEx.setClickTempSource(com.mbridge.msdk.foundation.same.report.metrics.a.h);
                            }
                            this.ecTempleModel.eventTrackingForClick(this.redirectModel);
                            this.ecTempleModel.onAdClick(this.mBridgeIds);
                            break;
                        case "expand":
                            String strOptString = jSONObject.optString("url", "");
                            int iOptInt6 = jSONObject.optInt("shouldUseCustomClose", 1);
                            if (!TextUtils.isEmpty(strOptString)) {
                                this.mWebContentView.showMRAIDExpandView(strOptString, iOptInt6);
                                break;
                            }
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
                                    bVarB.a(strOptString4, i, this.mWebContentView.getWebView());
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
            o0.b("ECWebPresenter", th.getMessage());
        }
    }

    public void setCanResponseBack(boolean z) {
        this.mCanResponseBackPress = z;
    }

    public void setNotchData(String str) {
        MBCommunicatorUtil.notifyNotchData(this.mWebContentView.getWebView(), str);
    }

    public void setRenderError() {
        IECModel iECModel = this.ecTempleModel;
        if (iECModel != null) {
            iECModel.setRenderStatus(1);
        }
    }

    public void setRenderUrlType(int i) {
        this.mRenderUrlType = i;
    }
}

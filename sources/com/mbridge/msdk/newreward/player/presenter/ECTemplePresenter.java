package com.mbridge.msdk.newreward.player.presenter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.same.report.metrics.a;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.function.proxy.e;
import com.mbridge.msdk.newreward.player.imodel.IECModel;
import com.mbridge.msdk.newreward.player.iview.IBaseView;
import com.mbridge.msdk.newreward.player.iview.IECTempleView;
import com.mbridge.msdk.newreward.player.model.ECTempleModel;
import com.mbridge.msdk.newreward.player.redirect.RedirectModel;
import com.mbridge.msdk.newreward.player.redirect.UrlReDirectController;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.video.dynview.listener.h;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class ECTemplePresenter extends AbsPresenter {
    public static final int MIN_CLICK_DELAY_TIME = 2000;
    final int END_CARD_BUILD_TYPE;
    private final String TAG;
    Runnable alacRunnable;
    IECModel ecTempleModel;
    IECTempleView iecView;
    private long lastClickTime;
    Handler mHandler;
    Runnable miniCardRunnable;
    int nLogo;

    public ECTemplePresenter(IECTempleView iECTempleView) {
        super(iECTempleView);
        this.TAG = "ECTemplePresenter";
        this.END_CARD_BUILD_TYPE = 1;
        this.nLogo = 1;
        this.lastClickTime = 0L;
        this.iecView = (IECTempleView) Proxy.newProxyInstance(iECTempleView.getClass().getClassLoader(), new Class[]{IECTempleView.class, IBaseView.class}, new e(iECTempleView, this.adapterModel, this.commandManager));
        this.ecTempleModel = (IECModel) Proxy.newProxyInstance(ECTempleModel.class.getClassLoader(), new Class[]{IECModel.class}, new e(new ECTempleModel(this.commandManager, this.rewardVideoListener), this.adapterModel, this.commandManager));
        this.TEMPLATE_MARK_TYPE = 3;
    }

    private void closeViewClick() {
        try {
            this.iecView.removeTempleFromSuperView(this.data.getRootViewGroup());
            if (isIVRewardEnable()) {
                this.rewardVideoListener.onAdCloseWithIVReward(this.mBridgeIds, this.adapterModel.m0(), this.adapterModel.t());
            }
            adClosed();
            this.ecTempleModel.onCloseViewClick(1);
            if (!this.isIV && !this.adapterModel.W() && this.adapterModel.m0()) {
                this.adapterModel.c(true);
                this.ecTempleModel.eventAddReward(this.redirectModel);
            }
        } catch (Exception e) {
            o0.b("ECTemplePresenter", e.getMessage());
        }
        finish(true);
    }

    private void doClickJump() {
        try {
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            if (timeInMillis - this.lastClickTime < 2000) {
                return;
            }
            this.lastClickTime = timeInMillis;
            new UrlReDirectController().setCommandManager(this.commandManager);
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx != null) {
                campaignEx.setClickTempSource(a.h);
                this.campaignEx.setTriggerClickSource(a.l);
            }
            this.ecTempleModel.eventClickUrl(this.redirectModel);
            this.ecTempleModel.eventTrackingForClick(this.redirectModel);
            this.ecTempleModel.onAdClick(this.mBridgeIds);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void initPrivacyButton() {
        t0.a(2, this.iecView.getNoticeIV(), this.campaignEx, this.context, true, new com.mbridge.msdk.foundation.feedback.a() { // from class: com.mbridge.msdk.newreward.player.presenter.ECTemplePresenter.2
            @Override // com.mbridge.msdk.foundation.feedback.a
            public void close() {
            }

            @Override // com.mbridge.msdk.foundation.feedback.a
            public void showed() {
            }

            @Override // com.mbridge.msdk.foundation.feedback.a
            public void summit(String str) {
            }
        });
    }

    private void loadBigImageAndBlurBG() {
        try {
            b.a(this.context.getApplicationContext()).a(this.campaignEx.getImageUrl(), new c() { // from class: com.mbridge.msdk.newreward.player.presenter.ECTemplePresenter.4
                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onFailedLoad(String str, String str2) {
                }

                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onSuccessLoad(Bitmap bitmap, String str) {
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                    try {
                        ECTemplePresenter eCTemplePresenter = ECTemplePresenter.this;
                        ECTemplePresenter.this.iecView.setImageBitMap(eCTemplePresenter.filterFindViewId(eCTemplePresenter.is_dy, "mbridge_iv_adbanner"), bitmap);
                        com.mbridge.msdk.newreward.function.utils.a.a(bitmap, new com.mbridge.msdk.newreward.function.utils.a.b() { // from class: com.mbridge.msdk.newreward.player.presenter.ECTemplePresenter.4.1
                            @Override // com.mbridge.msdk.newreward.function.utils.a.b
                            public void blurFailCallBack() {
                            }

                            @Override // com.mbridge.msdk.newreward.function.utils.a.b
                            public void blurSuccessCallBack(Bitmap bitmap2) {
                                ECTemplePresenter.this.iecView.setBlurBackGround(bitmap2);
                            }
                        });
                    } catch (Exception e) {
                        o0.b("ECTemplePresenter", e.getMessage());
                    }
                }
            });
        } catch (Exception e) {
            o0.b("ECTemplePresenter", e.getMessage());
        }
    }

    private void loadIconImage() {
        try {
            b.a(this.context.getApplicationContext()).a(this.campaignEx.getIconUrl(), new c() { // from class: com.mbridge.msdk.newreward.player.presenter.ECTemplePresenter.3
                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onFailedLoad(String str, String str2) {
                }

                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onSuccessLoad(Bitmap bitmap, String str) {
                    try {
                        ECTemplePresenter eCTemplePresenter = ECTemplePresenter.this;
                        ECTemplePresenter.this.iecView.setImageBitMap(eCTemplePresenter.filterFindViewId(eCTemplePresenter.is_dy, "mbridge_iv_icon"), bitmap);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception e) {
            o0.b("ECTemplePresenter", e.getMessage());
        }
    }

    private void setNLogo() {
        Drawable drawable;
        String str;
        try {
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                drawable = this.context.getResources().getDrawable(this.context.getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().h()));
                str = "AD";
            } else {
                drawable = this.context.getResources().getDrawable(this.context.getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.n().h()));
                str = "广告";
            }
            this.iecView.setNLogo(this.nLogo, str, drawable);
        } catch (Exception e) {
            o0.b("ECTemplePresenter", e.getMessage());
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
    public void adShowFail(String str, int i) {
        if (this.adapterModel.V()) {
            return;
        }
        super.adShowFail(str, i);
        this.ecTempleModel.onShowFail(this.mBridgeIds, str, i);
        finish(true);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void adShowSuccess() {
        if (this.adapterModel.V()) {
            return;
        }
        super.adShowSuccess();
        this.adapterModel.b(true);
        this.ecTempleModel.onAdShow(this.mBridgeIds);
        this.ecTempleModel.eventImpression(this.redirectModel);
        this.ecTempleModel.eventOnlyImpression(this.redirectModel);
        this.ecTempleModel.eventPvUrls(this.redirectModel);
        this.ecTempleModel.eventTrackingForImpression(this.redirectModel);
    }

    public void addBaitClickView() {
        try {
            IECTempleView iECTempleView = this.iecView;
            if (iECTempleView == null || iECTempleView.getBaitClickView() == null) {
                return;
            }
            com.mbridge.msdk.newreward.function.command.c cVar = this.commandManager;
            cVar.f(cVar.a(MBInterstitialActivity.INTENT_CAMAPIGN, this.campaignEx, "template_model", this.ecTempleModel, "template_redirect_model", this.redirectModel, "bait_click_view", this.iecView.getBaitClickView(), "mbridge_ids", this.mBridgeIds), f.ADD_BAIT_CLICK);
        } catch (Exception e) {
            o0.b("ECTemplePresenter", e.getMessage());
        }
    }

    public void addShakeView() {
        try {
            com.mbridge.msdk.newreward.function.command.c cVar = this.commandManager;
            Object objF = cVar.f(cVar.a(MBInterstitialActivity.INTENT_CAMAPIGN, this.campaignEx, "template_model", this.ecTempleModel, "template_redirect_model", this.redirectModel, "mbridge_ids", this.mBridgeIds), f.ADD_SHAKE_VIEW);
            if (objF instanceof View) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                if (this.context.getResources().getConfiguration().orientation != 2) {
                    layoutParams.addRule(2, filterFindViewId(this.is_dy, "mbridge_iv_logo"));
                    layoutParams.addRule(14);
                    ((View) objF).setPadding(0, 0, 0, t0.a(this.context, 20.0f));
                } else {
                    layoutParams.addRule(13);
                }
                ((View) objF).setLayoutParams(layoutParams);
                this.iecView.addShakeView((View) objF);
            }
        } catch (Exception e) {
            o0.b("ECTemplePresenter", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void click(View view) {
        if (view.getId() == filterFindViewId(this.is_dy, "mbridge_iv_close")) {
            closeViewClick();
            return;
        }
        if (view.getId() == filterFindViewId(this.is_dy, "mbridge_tv_cta")) {
            doClickJump();
            return;
        }
        if (view.getId() != filterFindViewId(this.is_dy, "mbridge_native_ec_layout")) {
            if (view.getId() == filterFindViewId(this.is_dy, "mbridge_iv_adbanner")) {
                doClickJump();
                return;
            } else {
                if (view.getId() == filterFindViewId(this.is_dy, "mbridge_iv_icon")) {
                    doClickJump();
                    return;
                }
                return;
            }
        }
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getendcard_url()) || !this.campaignEx.getendcard_url().contains("alecfc=1")) {
            return;
        }
        RedirectModel redirectModel = this.redirectModel;
        if (redirectModel != null) {
            redirectModel.setClickSenario(1);
        }
        doClickJump();
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void finish(boolean z) {
        Handler handler = this.mHandler;
        if (handler != null) {
            Runnable runnable = this.alacRunnable;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            }
            Runnable runnable2 = this.miniCardRunnable;
            if (runnable2 != null) {
                this.mHandler.removeCallbacks(runnable2);
            }
        }
        if (z) {
            ((Activity) this.context).finish();
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void getView() throws Throwable {
        com.mbridge.msdk.video.dynview.c cVarA = new com.mbridge.msdk.video.dynview.wrapper.c().a(this.context, this.campaignEx, -1, com.mbridge.msdk.util.b.a() ? "cn_" : "en_");
        this.nLogo = cVarA.o();
        com.mbridge.msdk.video.dynview.b.a().a(cVarA, new h() { // from class: com.mbridge.msdk.newreward.player.presenter.ECTemplePresenter.1
            @Override // com.mbridge.msdk.video.dynview.listener.h
            public void viewInflaterFail(com.mbridge.msdk.video.dynview.error.a aVar) {
                ECTemplePresenter.this.adShowFail(com.mbridge.msdk.foundation.error.a.a(890008), 890008);
            }

            @Override // com.mbridge.msdk.video.dynview.listener.h
            public void viewInflaterSuccess(com.mbridge.msdk.video.dynview.a aVar) {
                ECTemplePresenter.this.initDataForView(aVar);
            }
        });
    }

    public void handleInterceptTouchEvent(MotionEvent motionEvent) {
        RedirectModel redirectModel = this.redirectModel;
        if (redirectModel == null || motionEvent == null) {
            return;
        }
        redirectModel.setxInScreen(motionEvent.getRawX());
        this.redirectModel.setyInScreen(motionEvent.getRawY());
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void initDataForView(com.mbridge.msdk.video.dynview.a aVar) {
        try {
            if (aVar == null) {
                adShowFail(com.mbridge.msdk.foundation.error.a.a(890008), 890008);
                closeViewClick();
                return;
            }
            this.iecView.addViewToCurrentViewGroup(aVar.b());
            boolean zC = aVar.c();
            this.is_dy = zC;
            this.adapterModel.h(zC);
            this.campaignEx.setECTemplateRenderSucc(this.is_dy);
            this.iecView.initViews(this.is_dy);
            loadBigImageAndBlurBG();
            loadIconImage();
            initPrivacyButton();
            setNLogo();
            double rating = this.campaignEx.getRating();
            if (rating <= 0.0d) {
                rating = 5.0d;
            }
            this.iecView.setRatingAndUser(rating, this.campaignEx.getNumberRating());
            this.iecView.setHeatCount(this.campaignEx.getNumberRating());
            this.iecView.setCTAText(this.campaignEx.getAdCall());
            this.iecView.setTextByID(filterFindViewId(this.is_dy, "mbridge_tv_apptitle"), this.campaignEx.getAppName());
            this.iecView.setTextByID(filterFindViewId(this.is_dy, "mbridge_tv_appdesc"), this.campaignEx.getAppDesc());
            this.iecView.setTextByID(filterFindViewId(this.is_dy, "mbridge_tv_number"), String.valueOf(this.campaignEx.getNumberRating()));
            adShowSuccess();
        } catch (Exception e) {
            adShowFail(e.getMessage(), -1);
            o0.b("ECTemplePresenter", e.getMessage());
        }
    }

    public boolean isHalfScreenOffer() {
        CampaignEx campaignEx = this.campaignEx;
        return campaignEx != null && campaignEx.getAdSpaceT() == 2;
    }

    public void onBackPressed() {
        closeViewClick();
    }

    public void onEndCardShow() {
        if (this.ecTempleModel == null || this.adapterModel.a0()) {
            return;
        }
        this.ecTempleModel.onEndCardShow(this.mBridgeIds, 1);
        this.ecTempleModel.eventTrackingForEndCardShow(this.redirectModel, 1);
        this.adapterModel.f(true);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void releaseSource() {
    }

    public void setAutoRedirect() {
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx == null) {
                return;
            }
            String endScreenUrl = campaignEx.getendcard_url();
            if (TextUtils.isEmpty(endScreenUrl)) {
                endScreenUrl = this.campaignEx.getEndScreenUrl();
            }
            String strA = z0.a(endScreenUrl, "alac");
            if (TextUtils.isEmpty(strA) || !strA.equals("1") || this.campaignEx.getAutoShowStoreMiniCard() == 1) {
                return;
            }
            if (this.alacRunnable == null) {
                this.alacRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.presenter.ECTemplePresenter.5
                    @Override // java.lang.Runnable
                    public void run() {
                        CampaignEx campaignEx2 = ECTemplePresenter.this.campaignEx;
                        if (campaignEx2 != null) {
                            campaignEx2.setClickTempSource(a.h);
                            ECTemplePresenter.this.campaignEx.setTriggerClickSource(a.m);
                            ECTemplePresenter.this.campaignEx.setClickType(a.i);
                        }
                        ECTemplePresenter eCTemplePresenter = ECTemplePresenter.this;
                        eCTemplePresenter.ecTempleModel.eventClickUrl(eCTemplePresenter.redirectModel);
                        ECTemplePresenter eCTemplePresenter2 = ECTemplePresenter.this;
                        eCTemplePresenter2.ecTempleModel.eventTrackingForClick(eCTemplePresenter2.redirectModel);
                        ECTemplePresenter eCTemplePresenter3 = ECTemplePresenter.this;
                        eCTemplePresenter3.ecTempleModel.onAdClick(eCTemplePresenter3.mBridgeIds);
                    }
                };
            }
            if (this.mHandler == null) {
                this.mHandler = new Handler();
            }
            this.mHandler.postDelayed(this.alacRunnable, 1000L);
        } catch (Throwable th) {
            o0.b("ECTemplePresenter", th.getMessage());
        }
    }

    public void setCloseViewShow() {
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null) {
            this.iecView.setCloseViewBtnDelayShow(1000);
            return;
        }
        boolean zA = t0.a(MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE, campaignEx.getendcard_url());
        int iC = t0.c(this.campaignEx.getendcard_url(), MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE);
        if (!zA || iC < 0) {
            if (this.campaignEx.getCbd() > -2) {
                iC = this.campaignEx.getCbd();
            } else {
                iC = (this.adapterModel.O() == null || this.adapterModel.O().c() == null) ? 1 : this.adapterModel.O().c().i();
            }
        }
        this.iecView.setCloseViewBtnDelayShow(iC * 1000);
    }

    public void showStoreMiniCard() {
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx == null || campaignEx.getAutoShowStoreMiniCard() == 0 || TextUtils.isEmpty(this.campaignEx.getDeepLinkURL())) {
                return;
            }
            long showStoreMiniCardDelayTime = this.campaignEx.getShowStoreMiniCardDelayTime();
            if (showStoreMiniCardDelayTime == 0) {
                showStoreMiniCardDelayTime = 1;
            }
            if (this.miniCardRunnable == null) {
                this.miniCardRunnable = new Runnable() { // from class: com.mbridge.msdk.newreward.player.presenter.ECTemplePresenter.6
                    @Override // java.lang.Runnable
                    public void run() {
                        CampaignEx campaignEx2 = ECTemplePresenter.this.campaignEx;
                        if (campaignEx2 != null) {
                            campaignEx2.setClickTempSource(a.h);
                            ECTemplePresenter.this.campaignEx.setTriggerClickSource(a.m);
                            ECTemplePresenter.this.campaignEx.setClickType(a.i);
                        }
                        ECTemplePresenter eCTemplePresenter = ECTemplePresenter.this;
                        eCTemplePresenter.ecTempleModel.eventClickUrl(eCTemplePresenter.redirectModel);
                        ECTemplePresenter eCTemplePresenter2 = ECTemplePresenter.this;
                        eCTemplePresenter2.ecTempleModel.eventTrackingForClick(eCTemplePresenter2.redirectModel);
                        ECTemplePresenter eCTemplePresenter3 = ECTemplePresenter.this;
                        eCTemplePresenter3.ecTempleModel.onAdClick(eCTemplePresenter3.mBridgeIds);
                    }
                };
            }
            if (this.mHandler == null) {
                this.mHandler = new Handler();
            }
            this.mHandler.postDelayed(this.miniCardRunnable, showStoreMiniCardDelayTime * 1000);
        } catch (Throwable th) {
            o0.b("ECTemplePresenter", th.getMessage());
        }
    }
}

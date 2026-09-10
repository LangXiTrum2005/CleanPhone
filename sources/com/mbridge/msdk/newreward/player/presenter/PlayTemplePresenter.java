package com.mbridge.msdk.newreward.player.presenter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.a;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.newreward.adapter.req.b;
import com.mbridge.msdk.newreward.function.command.c;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.function.command.receiver.d;
import com.mbridge.msdk.newreward.function.proxy.e;
import com.mbridge.msdk.newreward.player.imodel.IPlayModel;
import com.mbridge.msdk.newreward.player.iview.IBaseView;
import com.mbridge.msdk.newreward.player.iview.IPlayTempleView;
import com.mbridge.msdk.newreward.player.model.PlayTempleModel;
import com.mbridge.msdk.video.dynview.listener.h;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.File;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PlayTemplePresenter extends BaseTemplatePresenter implements IPresenter {
    private final String TAG;

    public PlayTemplePresenter(IPlayTempleView iPlayTempleView) {
        super(iPlayTempleView);
        this.TAG = "PlayTemplePresenter";
        this.iView = (IPlayTempleView) Proxy.newProxyInstance(iPlayTempleView.getClass().getClassLoader(), new Class[]{IPlayTempleView.class, IBaseView.class}, new e(iPlayTempleView, this.adapterModel, this.commandManager));
        this.playTempleModel = (IPlayModel) Proxy.newProxyInstance(PlayTempleModel.class.getClassLoader(), new Class[]{IPlayModel.class}, new e(new PlayTempleModel(this.commandManager, this.rewardVideoListener), this.adapterModel, this.commandManager));
        this.TEMPLATE_MARK_TYPE = 2;
    }

    private void addPrivacy() {
        t0.a(1, this.iView.getPrivacyButton(), this.campaignEx, this.context, false, new a() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayTemplePresenter.3
            @Override // com.mbridge.msdk.foundation.feedback.a
            public void close() {
                PlayTemplePresenter.this.resume();
            }

            @Override // com.mbridge.msdk.foundation.feedback.a
            public void showed() {
                PlayTemplePresenter.this.onPause();
            }

            @Override // com.mbridge.msdk.foundation.feedback.a
            public void summit(String str) {
                PlayTemplePresenter.this.resume();
            }
        });
    }

    private void initPlayer() {
        try {
            if (this.campaignEx.getVideoUrlEncode() != null) {
                File fileB = this.adapterModel.b(this.campaignEx.getRequestIdNotice());
                c cVar = this.commandManager;
                Object objH = cVar.h(cVar.a("fullScreenWidth", Float.valueOf(t0.k(this.context)), "fullScreenHeight", Float.valueOf(t0.j(this.context)), MBInterstitialActivity.INTENT_CAMAPIGN, this.campaignEx, AdUnitActivity.EXTRA_ORIENTATION, Integer.valueOf(this.context.getResources().getConfiguration().orientation)), f.TEMP_PLAYER_INIT);
                if (objH instanceof Map) {
                    Map map = (Map) objH;
                    this.iView.setPlayerSize(((Integer) map.get("gravity")).intValue(), ((Integer) map.get("width")).intValue(), ((Integer) map.get("height")).intValue());
                }
                if (fileB == null || !fileB.exists()) {
                    this.iView.play(this.campaignEx.getVideoUrlEncode(), getBufferTimeout());
                } else {
                    this.iView.play(fileB.getAbsolutePath(), getBufferTimeout());
                }
            }
        } catch (Exception e) {
            o0.b("PlayTemplePresenter", e.getMessage());
            adShowFail(com.mbridge.msdk.foundation.error.a.a(890004), 890004);
        }
    }

    private boolean parseRemoteViewData(com.mbridge.msdk.video.dynview.a aVar) {
        if (aVar != null) {
            try {
                boolean zC = aVar.c();
                this.is_dy = zC;
                com.mbridge.msdk.newreward.adapter.e eVar = this.adapterModel;
                if (eVar != null) {
                    eVar.h(zC);
                    this.campaignEx.setTemplateRenderSucc(this.is_dy);
                }
                if (aVar.b() != null) {
                    aVar.b().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    try {
                        this.iView.addViewToCurrentViewGroup(aVar.b());
                        if (aVar.a() != null) {
                            Iterator<View> it = aVar.a().iterator();
                            while (it.hasNext()) {
                                it.next().setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayTemplePresenter.2
                                    @Override // com.mbridge.msdk.widget.a
                                    public void onNoDoubleClick(View view) {
                                        CampaignEx campaignEx = PlayTemplePresenter.this.campaignEx;
                                        if (campaignEx != null) {
                                            campaignEx.setClickTempSource(com.mbridge.msdk.foundation.same.report.metrics.a.g);
                                            if (view instanceof TextView) {
                                                PlayTemplePresenter.this.campaignEx.setTriggerClickSource(com.mbridge.msdk.foundation.same.report.metrics.a.l);
                                            } else {
                                                PlayTemplePresenter.this.campaignEx.setTriggerClickSource(com.mbridge.msdk.foundation.same.report.metrics.a.m);
                                            }
                                        }
                                        PlayTemplePresenter playTemplePresenter = PlayTemplePresenter.this;
                                        playTemplePresenter.playTempleModel.onAdClick(playTemplePresenter.mBridgeIds);
                                        PlayTemplePresenter playTemplePresenter2 = PlayTemplePresenter.this;
                                        playTemplePresenter2.playTempleModel.eventClickUrl(playTemplePresenter2.redirectModel);
                                        PlayTemplePresenter playTemplePresenter3 = PlayTemplePresenter.this;
                                        playTemplePresenter3.playTempleModel.eventTrackingForClick(playTemplePresenter3.redirectModel);
                                    }
                                });
                            }
                        }
                        return this.iView.initViews(this.is_dy);
                    } catch (Exception e) {
                        o0.b("PlayTemplePresenter", e.getMessage());
                        return false;
                    }
                }
            } catch (Exception e2) {
                o0.b("PlayTemplePresenter", e2.getMessage());
            }
        }
        return false;
    }

    private void preLoadECMoreOfferData() {
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getendcard_url()) || !com.mbridge.msdk.newreward.function.utils.c.c(this.campaignEx.getendcard_url())) {
            return;
        }
        String strA = z0.a(this.campaignEx.getendcard_url(), "mof");
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            if (Integer.parseInt(strA) == 1) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("retry", "2");
                this.playTempleModel.modelReport("m_mof_initiate", eVar);
                c cVar = this.commandManager;
                cVar.d(cVar.a(MBInterstitialActivity.INTENT_CAMAPIGN, this.campaignEx, "command_type", f.REQ_MORE_OFFER_CAMPAIGN, "more_offer_type", 2, "adapter_model", this.adapterModel), new b() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayTemplePresenter.4
                    @Override // com.mbridge.msdk.newreward.adapter.req.b
                    public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar2.a("result", "2");
                        eVar2.a("code", Integer.valueOf(bVar.b()));
                        eVar2.a("retry", "2");
                        PlayTemplePresenter.this.playTempleModel.modelReport("m_mof_req_result", eVar2);
                    }

                    @Override // com.mbridge.msdk.newreward.adapter.req.b
                    public void reqSuccessful(Object obj) {
                        PlayTemplePresenter playTemplePresenter = PlayTemplePresenter.this;
                        playTemplePresenter.commandManager.a(playTemplePresenter.adapterModel, "MoreOfferPreSendTrackingReceiver");
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar2.a("result", "1");
                        eVar2.a("retry", "2");
                        PlayTemplePresenter.this.playTempleModel.modelReport("m_mof_req_result", eVar2);
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void preRenderEc() {
        try {
            com.mbridge.msdk.newreward.adapter.e eVar = this.adapterModel;
            if (eVar == null || !eVar.k().equals("WEB_EC")) {
                return;
            }
            c cVar = this.commandManager;
            cVar.i(cVar.a("web_resource_action", 1, "parent_temple", this.data.getRootViewGroup(), "adapter_model", this.adapterModel, "bridge_ids", this.campaignEx.getRequestIdNotice()), f.SHOW_OR_PRELOAD_WEB_EC);
        } catch (Exception e) {
            o0.b("PlayTemplePresenter", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resume() {
        this.iView.resume();
        this.playTempleModel.eventTrackingForResume(this.redirectModel);
    }

    public void addBaitClickView() {
        try {
            IPlayTempleView iPlayTempleView = this.iView;
            if (iPlayTempleView == null || iPlayTempleView.getBaitClickView() == null) {
                return;
            }
            c cVar = this.commandManager;
            cVar.f(cVar.a(MBInterstitialActivity.INTENT_CAMAPIGN, this.campaignEx, "template_model", this.playTempleModel, "template_redirect_model", this.redirectModel, "bait_click_view", this.iView.getBaitClickView(), "mbridge_ids", this.mBridgeIds), f.ADD_BAIT_CLICK);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void addMoreOfferView(ViewGroup viewGroup) {
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(this.campaignEx.getRewardTemplateMode().e())) {
            return;
        }
        try {
            String strA = z0.a(this.campaignEx.getRewardTemplateMode().e(), "mof");
            if (TextUtils.isEmpty(strA) || Integer.parseInt(strA) != 1) {
                return;
            }
            c cVar = this.commandManager;
            cVar.b(cVar.a("add_temple", 295, "parent_temple", viewGroup, "more_offer_type", 1, "command_type", f.SHOW_ADD_TEMPLE), new b() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayTemplePresenter.6
                @Override // com.mbridge.msdk.newreward.adapter.req.b
                public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
                }

                @Override // com.mbridge.msdk.newreward.adapter.req.b
                public void reqSuccessful(Object obj) {
                    try {
                        View view = (View) obj;
                        PlayTemplePresenter.this.moreOfferTemp = view;
                        view.setVisibility(0);
                        new com.mbridge.msdk.video.dynview.ui.b().a(PlayTemplePresenter.this.moreOfferTemp, 0, t0.g(com.mbridge.msdk.foundation.controller.c.n().d()), 0, t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f), 500L);
                        PlayTemplePresenter.this.iView.setTemplateWidthAndHeight(t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f));
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void click(View view) {
        super.click(view);
        if (view.getId() == filterFindViewId(this.is_dy, "mbridge_rl_playing_close")) {
            onCloseButtonClick();
            return;
        }
        if (view.getId() == filterFindViewId(this.is_dy, "mbridge_sound_switch")) {
            if (this.iView.getMuteState()) {
                this.iView.setMuteState(false);
                this.adapterModel.d(1);
                this.playTempleModel.eventTrackingForMute(this.redirectModel);
            } else {
                this.iView.setMuteState(true);
                this.adapterModel.d(2);
                this.playTempleModel.eventTrackingForUnMute(this.redirectModel);
            }
        }
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
            o0.b("PlayTemplePresenter", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void getView() {
        com.mbridge.msdk.video.dynview.b.a().a(new com.mbridge.msdk.video.dynview.wrapper.c().b(this.rootParentView, this.campaignEx), new h() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayTemplePresenter.1
            @Override // com.mbridge.msdk.video.dynview.listener.h
            public void viewInflaterFail(com.mbridge.msdk.video.dynview.error.a aVar) {
                PlayTemplePresenter playTemplePresenter = PlayTemplePresenter.this;
                if (playTemplePresenter.playTempleModel == null) {
                    return;
                }
                playTemplePresenter.adShowFail(com.mbridge.msdk.foundation.error.a.a(890008), 890008);
            }

            @Override // com.mbridge.msdk.video.dynview.listener.h
            public void viewInflaterSuccess(com.mbridge.msdk.video.dynview.a aVar) {
                PlayTemplePresenter.this.initDataForView(aVar);
            }
        });
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void initDataForView(com.mbridge.msdk.video.dynview.a aVar) {
        try {
            preRenderEc();
            if (!parseRemoteViewData(aVar)) {
                this.playTemplateRanderSuccess = false;
                closeAdOrShowEndCard();
            } else {
                initPlayer();
                addPrivacy();
                preLoadECMoreOfferData();
            }
        } catch (Exception e) {
            o0.b("PlayTemplePresenter", e.getMessage());
            adShowFail(com.mbridge.msdk.foundation.error.a.a(890009), 890009);
        }
    }

    public void onBackPressed() {
        if (this.isAlertShowing || this.dialogContinueClicked || !this.closeBtnVisible) {
            return;
        }
        onCloseButtonClick();
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void onDestroy() {
        super.onDestroy();
        try {
            releaseSource();
            d.a().d(f.SHOW_OR_PRELOAD_WEB_EC);
            d.a().a(this.adapterModel.A());
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void releaseSource() {
        if (!this.adapterModel.i0()) {
            this.adapterModel.m(true);
            this.playTempleModel.modelReport("2000146");
        }
        this.iView.release();
    }

    public void removeCurrPlayTemplateMoreOfferView(ViewGroup viewGroup) {
        View view;
        if (viewGroup == null || (view = this.moreOfferTemp) == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    public void setBackGrandImage() {
        try {
            com.mbridge.msdk.foundation.same.image.b.a(this.context.getApplicationContext()).a(this.campaignEx.getImageUrl(), new com.mbridge.msdk.foundation.same.image.c() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayTemplePresenter.5
                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onFailedLoad(String str, String str2) {
                }

                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onSuccessLoad(Bitmap bitmap, String str) {
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                    com.mbridge.msdk.newreward.function.utils.a.a(bitmap, new com.mbridge.msdk.newreward.function.utils.a.b() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayTemplePresenter.5.1
                        @Override // com.mbridge.msdk.newreward.function.utils.a.b
                        public void blurFailCallBack() {
                        }

                        @Override // com.mbridge.msdk.newreward.function.utils.a.b
                        public void blurSuccessCallBack(Bitmap bitmap2) {
                            PlayTemplePresenter.this.iView.setBackGroundImage(bitmap2);
                        }
                    });
                }
            });
        } catch (Exception e) {
            o0.b("PlayTemplePresenter", e.getMessage());
        }
    }

    public void windowFocusChanged() {
        int iF;
        int iG;
        try {
            if (!isHalfScreenOffer()) {
                c cVar = this.commandManager;
                Object objH = cVar.h(cVar.a("fullScreenWidth", Float.valueOf(t0.k(this.context)), "fullScreenHeight", Float.valueOf(t0.j(this.context)), MBInterstitialActivity.INTENT_CAMAPIGN, this.campaignEx, AdUnitActivity.EXTRA_ORIENTATION, Integer.valueOf(this.context.getResources().getConfiguration().orientation)), f.TEMP_PLAYER_INIT);
                if (objH instanceof Map) {
                    Map map = (Map) objH;
                    this.iView.setPlayerSize(((Integer) map.get("gravity")).intValue(), ((Integer) map.get("width")).intValue(), ((Integer) map.get("height")).intValue());
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.data.getRootViewGroup().getLayoutParams();
            layoutParams.gravity = 17;
            if ((this.campaignEx.getRewardTemplateMode() != null ? this.campaignEx.getRewardTemplateMode().b() : g0.a(this.context).getConfiguration().orientation) == 1) {
                iF = (int) (t0.f(this.context) * 0.55f);
                iG = (int) (t0.g(this.context) * 0.65f);
            } else {
                iF = (int) (t0.f(this.context) * 0.6f);
                iG = (int) (t0.g(this.context) * 0.6f);
            }
            layoutParams.height = iF;
            layoutParams.width = iG;
            this.iView.setPlayerSize(17, iG, iF);
        } catch (Exception e) {
            o0.b("PlayTemplePresenter", e.getMessage());
        }
    }
}

package com.mbridge.msdk.newreward.player.presenter;

import android.view.View;
import android.widget.FrameLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.a;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.function.command.c;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.function.proxy.e;
import com.mbridge.msdk.newreward.player.iview.ICusTemplateView;
import com.mbridge.msdk.newreward.player.iview.IPlayTempleView;
import com.mbridge.msdk.video.dynview.b;
import com.mbridge.msdk.video.dynview.listener.h;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public class PlayPresenterHalf extends PlayTemplePresenter {
    private ICusTemplateView iTemplateView;
    private MBridgeClickCTAView mClickCTAView;
    private String templateUrl;

    public PlayPresenterHalf(IPlayTempleView iPlayTempleView) {
        super(iPlayTempleView);
        this.iTemplateView = (ICusTemplateView) Proxy.newProxyInstance(iPlayTempleView.getClass().getClassLoader(), new Class[]{ICusTemplateView.class}, new e(iPlayTempleView, this.adapterModel, this.commandManager));
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx != null) {
            this.templateUrl = campaignEx.getRewardTemplateMode().e();
        }
    }

    private void addCTAView() {
        if (this.mClickCTAView == null) {
            MBridgeClickCTAView mBridgeClickCTAView = new MBridgeClickCTAView(this.context);
            this.mClickCTAView = mBridgeClickCTAView;
            mBridgeClickCTAView.setCampaign(this.campaignEx);
            this.mClickCTAView.setUnitId(this.adapterModel.R());
            this.mClickCTAView.preLoadData(null);
            this.mClickCTAView.setCtaClickCallBack(new MBridgeClickCTAView.f() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayPresenterHalf.2
                @Override // com.mbridge.msdk.video.module.MBridgeClickCTAView.f
                public void ctaClick() {
                    CampaignEx campaignEx = PlayPresenterHalf.this.campaignEx;
                    if (campaignEx != null) {
                        campaignEx.setClickTempSource(a.g);
                        PlayPresenterHalf.this.campaignEx.setTriggerClickSource(a.l);
                    }
                    PlayPresenterHalf playPresenterHalf = PlayPresenterHalf.this;
                    playPresenterHalf.playTempleModel.onAdClick(playPresenterHalf.mBridgeIds);
                    PlayPresenterHalf playPresenterHalf2 = PlayPresenterHalf.this;
                    playPresenterHalf2.playTempleModel.eventClickUrl(playPresenterHalf2.redirectModel);
                    PlayPresenterHalf playPresenterHalf3 = PlayPresenterHalf.this;
                    playPresenterHalf3.playTempleModel.eventTrackingForClick(playPresenterHalf3.redirectModel);
                }
            });
        }
        this.iTemplateView.addCTAViewToLayout(this.mClickCTAView, 0);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.PlayTemplePresenter, com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void click(View view) {
        super.click(view);
        try {
            if (view.getId() == filterFindViewId(this.is_dy, "mbridge_rl_playing_close")) {
                if (this.ivRewardMode == com.mbridge.msdk.foundation.same.a.H) {
                    showIVRewardDialogOnCloseMode();
                } else {
                    c cVar = this.commandManager;
                    cVar.c(cVar.a("add_temple", "HALF_TEMPLATE_EC", "adapter_model", this.adapterModel, "parent_temple", this.data.getRootViewGroup()), f.SHOW_ADD_TEMPLE);
                    this.iView.removeTempleFromSuperView(this.data.getRootViewGroup());
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.PlayTemplePresenter, com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void getView() throws Throwable {
        b.a().a(new com.mbridge.msdk.video.dynview.wrapper.c().a(this.rootParentView, this.campaignEx, com.mbridge.msdk.newreward.function.utils.c.c(this.templateUrl)), new h() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayPresenterHalf.1
            @Override // com.mbridge.msdk.video.dynview.listener.h
            public void viewInflaterFail(com.mbridge.msdk.video.dynview.error.a aVar) {
                PlayPresenterHalf playPresenterHalf = PlayPresenterHalf.this;
                if (playPresenterHalf.playTempleModel == null) {
                    return;
                }
                playPresenterHalf.adShowFail(com.mbridge.msdk.foundation.error.a.a(890008), 890008);
            }

            @Override // com.mbridge.msdk.video.dynview.listener.h
            public void viewInflaterSuccess(com.mbridge.msdk.video.dynview.a aVar) {
                PlayPresenterHalf.this.initDataForView(aVar);
            }
        });
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i) {
        super.onPlayStarted(i);
        addCTAView();
    }

    public void setHalfWH() {
        int iF;
        int iG;
        this.data.getRootViewGroup().setBackgroundColor(-1728053248);
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
        this.data.getRootViewGroup().setLayoutParams(layoutParams);
    }
}

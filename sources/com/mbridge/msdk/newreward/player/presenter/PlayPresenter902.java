package com.mbridge.msdk.newreward.player.presenter;

import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.a;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.function.model.f;
import com.mbridge.msdk.newreward.function.proxy.e;
import com.mbridge.msdk.newreward.player.iview.ICusTemplateView;
import com.mbridge.msdk.newreward.player.iview.IPlayTempleView;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public class PlayPresenter902 extends PlayTemplePresenter {
    ICusTemplateView iTemplateView;
    int iaTp;
    int interactiveType;
    MBridgeClickCTAView mClickCTAView;
    f settingModel;
    String templateUrl;

    public PlayPresenter902(IPlayTempleView iPlayTempleView) {
        super(iPlayTempleView);
        this.iTemplateView = (ICusTemplateView) Proxy.newProxyInstance(iPlayTempleView.getClass().getClassLoader(), new Class[]{ICusTemplateView.class}, new e(iPlayTempleView, this.adapterModel, this.commandManager));
        f fVarO = this.adapterModel.O();
        this.settingModel = fVarO;
        this.interactiveType = fVarO.c().D();
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx != null) {
            this.templateUrl = campaignEx.getRewardTemplateMode().e();
        }
        this.iaTp = t0.a(this.templateUrl, "ia_tp", -5);
    }

    private void addCTAView() {
        if (this.mClickCTAView == null) {
            MBridgeClickCTAView mBridgeClickCTAView = new MBridgeClickCTAView(this.context);
            this.mClickCTAView = mBridgeClickCTAView;
            mBridgeClickCTAView.setCampaign(this.campaignEx);
            this.mClickCTAView.setUnitId(this.adapterModel.R());
            this.mClickCTAView.preLoadData(null);
            this.mClickCTAView.setCtaClickCallBack(new MBridgeClickCTAView.f() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayPresenter902.1
                @Override // com.mbridge.msdk.video.module.MBridgeClickCTAView.f
                public void ctaClick() {
                    CampaignEx campaignEx = PlayPresenter902.this.campaignEx;
                    if (campaignEx != null) {
                        campaignEx.setClickTempSource(a.g);
                        PlayPresenter902.this.campaignEx.setTriggerClickSource(a.l);
                    }
                    PlayPresenter902 playPresenter902 = PlayPresenter902.this;
                    playPresenter902.playTempleModel.onAdClick(playPresenter902.mBridgeIds);
                    PlayPresenter902 playPresenter903 = PlayPresenter902.this;
                    playPresenter903.playTempleModel.eventClickUrl(playPresenter903.redirectModel);
                    PlayPresenter902 playPresenter904 = PlayPresenter902.this;
                    playPresenter904.playTempleModel.eventTrackingForClick(playPresenter904.redirectModel);
                }
            });
        }
        int i = this.iaTp;
        if (i == -5) {
            if (this.iTemplateView.getCTAViewState() == 0) {
                this.iTemplateView.addCTAViewToLayout(this.mClickCTAView, 8);
                return;
            } else {
                this.iTemplateView.addCTAViewToLayout(this.mClickCTAView, 0);
                this.rootParentView.postDelayed(new Runnable() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayPresenter902.3
                    @Override // java.lang.Runnable
                    public void run() {
                        PlayPresenter902 playPresenter902 = PlayPresenter902.this;
                        playPresenter902.iTemplateView.addCTAViewToLayout(playPresenter902.mClickCTAView, 8);
                    }
                }, 3000L);
                return;
            }
        }
        if (i == -3) {
            return;
        }
        if (i == -1) {
            if (this.iTemplateView.getCTAViewState() != 0) {
                this.iTemplateView.addCTAViewToLayout(this.mClickCTAView, 0);
                this.rootParentView.postDelayed(new Runnable() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayPresenter902.2
                    @Override // java.lang.Runnable
                    public void run() {
                        PlayPresenter902 playPresenter902 = PlayPresenter902.this;
                        playPresenter902.iTemplateView.addCTAViewToLayout(playPresenter902.mClickCTAView, 8);
                    }
                }, 3000L);
            } else {
                this.iTemplateView.addCTAViewToLayout(this.mClickCTAView, 8);
            }
        }
        if (this.iaTp >= 0) {
            this.iTemplateView.addCTAViewToLayout(this.mClickCTAView, 0);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.PlayTemplePresenter, com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void click(View view) {
        super.click(view);
        addCTAView();
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i, int i2) {
        super.onPlayProgress(i, i2);
        int i3 = this.iaTp;
        if (i3 != -5) {
            this.interactiveType = i3;
        }
        int i4 = this.interactiveType;
        if (i4 == -1 || i != i4) {
            return;
        }
        addCTAView();
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i) {
        super.onPlayStarted(i);
        if (this.iaTp == 0 || this.interactiveType == 0) {
            addCTAView();
        }
    }
}

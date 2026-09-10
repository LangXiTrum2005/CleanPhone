package com.mbridge.msdk.newreward.player.presenter;

import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.a;
import com.mbridge.msdk.newreward.function.model.f;
import com.mbridge.msdk.newreward.function.proxy.e;
import com.mbridge.msdk.newreward.player.iview.ICusTemplateView;
import com.mbridge.msdk.newreward.player.iview.IPlayTempleView;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public class PlayPresenter202 extends PlayTemplePresenter {
    ICusTemplateView iTemplateView;
    int interactiveType;
    MBridgeClickCTAView mClickCTAView;
    f settingModel;

    public PlayPresenter202(IPlayTempleView iPlayTempleView) {
        super(iPlayTempleView);
        this.iTemplateView = (ICusTemplateView) Proxy.newProxyInstance(iPlayTempleView.getClass().getClassLoader(), new Class[]{ICusTemplateView.class}, new e(iPlayTempleView, this.adapterModel, this.commandManager));
        f fVarO = this.adapterModel.O();
        this.settingModel = fVarO;
        this.interactiveType = fVarO.c().D();
    }

    private void addCTAView() {
        if (this.interactiveType < -1) {
            return;
        }
        if (this.mClickCTAView == null) {
            MBridgeClickCTAView mBridgeClickCTAView = new MBridgeClickCTAView(this.context);
            this.mClickCTAView = mBridgeClickCTAView;
            mBridgeClickCTAView.setCampaign(this.campaignEx);
            this.mClickCTAView.setUnitId(this.adapterModel.R());
            this.mClickCTAView.preLoadData(null);
            this.mClickCTAView.setCtaClickCallBack(new MBridgeClickCTAView.f() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayPresenter202.1
                @Override // com.mbridge.msdk.video.module.MBridgeClickCTAView.f
                public void ctaClick() {
                    CampaignEx campaignEx = PlayPresenter202.this.campaignEx;
                    if (campaignEx != null) {
                        campaignEx.setClickTempSource(a.g);
                        PlayPresenter202.this.campaignEx.setTriggerClickSource(a.l);
                    }
                    PlayPresenter202 playPresenter202 = PlayPresenter202.this;
                    playPresenter202.playTempleModel.onAdClick(playPresenter202.mBridgeIds);
                    PlayPresenter202 playPresenter203 = PlayPresenter202.this;
                    playPresenter203.playTempleModel.eventClickUrl(playPresenter203.redirectModel);
                    PlayPresenter202 playPresenter204 = PlayPresenter202.this;
                    playPresenter204.playTempleModel.eventTrackingForClick(playPresenter204.redirectModel);
                }
            });
        }
        int i = this.interactiveType;
        if (i >= 0) {
            this.iTemplateView.addCTAViewToLayout(this.mClickCTAView, 0);
            return;
        }
        if (i == -1) {
            if (this.iTemplateView.getCTAViewState() == 0) {
                this.iTemplateView.addCTAViewToLayout(this.mClickCTAView, 8);
            } else {
                this.iTemplateView.addCTAViewToLayout(this.mClickCTAView, 0);
                this.rootParentView.postDelayed(new Runnable() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayPresenter202.2
                    @Override // java.lang.Runnable
                    public void run() {
                        PlayPresenter202 playPresenter202 = PlayPresenter202.this;
                        playPresenter202.iTemplateView.addCTAViewToLayout(playPresenter202.mClickCTAView, 8);
                    }
                }, 3000L);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.PlayTemplePresenter, com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void click(View view) {
        super.click(view);
        if (view.getId() == filterFindViewId(this.is_dy, "mbridge_vfpv")) {
            addCTAView();
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i, int i2) {
        super.onPlayProgress(i, i2);
        int i3 = this.interactiveType;
        if (i3 == -1 || i != i3) {
            return;
        }
        addCTAView();
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i) {
        super.onPlayStarted(i);
        if (this.interactiveType == 0) {
            addCTAView();
        }
    }
}

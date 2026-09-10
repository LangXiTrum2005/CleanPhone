package com.mbridge.msdk.newreward.player.presenter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.a;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.function.command.receiver.d;
import com.mbridge.msdk.newreward.function.proxy.e;
import com.mbridge.msdk.newreward.player.imodel.IECModel;
import com.mbridge.msdk.newreward.player.iview.IBaseView;
import com.mbridge.msdk.newreward.player.model.ECTempleModel;
import com.mbridge.msdk.newreward.player.redirect.UrlReDirectController;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public class ECVastPresenter extends AbsPresenter {
    private final String TAG;
    IECModel ecTempleModel;
    IBaseView mBaseView;

    public ECVastPresenter(IBaseView iBaseView) {
        super(iBaseView);
        this.TAG = "ECVastPresenter";
        this.mBaseView = (IBaseView) Proxy.newProxyInstance(iBaseView.getClass().getClassLoader(), new Class[]{IBaseView.class}, new e(iBaseView, this.adapterModel, this.commandManager));
        this.ecTempleModel = (IECModel) Proxy.newProxyInstance(ECTempleModel.class.getClassLoader(), new Class[]{IECModel.class}, new e(new ECTempleModel(this.commandManager, this.rewardVideoListener), this.adapterModel, this.commandManager));
        this.TEMPLATE_MARK_TYPE = 3;
    }

    private void closeViewClick() {
        try {
            this.mBaseView.removeTempleFromSuperView(this.data.getRootViewGroup());
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
            o0.b("ECVastPresenter", e.getMessage());
        }
        finish(true);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void click(View view) {
        if (view != null) {
            if (view.getId() == filterFindViewId(this.is_dy, "mbridge_iv_vastclose")) {
                closeViewClick();
            }
            if (view.getId() == filterFindViewId(this.is_dy, "mbridge_iv_vastok")) {
                new UrlReDirectController().setCommandManager(this.commandManager);
                CampaignEx campaignEx = this.campaignEx;
                if (campaignEx != null) {
                    campaignEx.setClickTempSource(a.h);
                }
                this.ecTempleModel.eventClickUrl(this.redirectModel);
                this.ecTempleModel.eventTrackingForClick(this.redirectModel);
                this.ecTempleModel.onAdClick(this.mBridgeIds);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void finish(boolean z) {
        d.a().d(f.SHOW_OR_PRELOAD_WEB_EC);
        Context context = this.context;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void getView() {
        initDataForView(null);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void initDataForView(com.mbridge.msdk.video.dynview.a aVar) {
        this.mBaseView.initViews(false);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void releaseSource() {
    }
}

package com.mbridge.msdk.newreward.player.presenter;

import android.app.Activity;
import android.content.Context;
import android.widget.RelativeLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.command.c;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.function.proxy.e;
import com.mbridge.msdk.newreward.player.imodel.IBigTempModel;
import com.mbridge.msdk.newreward.player.iview.IBaseView;
import com.mbridge.msdk.newreward.player.model.BigTemplateModel;
import com.mbridge.msdk.video.dynview.b;
import com.mbridge.msdk.video.dynview.error.a;
import com.mbridge.msdk.video.dynview.listener.d;
import com.mbridge.msdk.video.dynview.listener.h;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class BigTemplatePresenter extends AbsPresenter implements d {
    BigTemplateModel bigTemplateModel;
    IBigTempModel iBigTempModel;
    IBaseView iView;
    CampaignEx.c rewardTemplateMode;
    int videoTemplateCode;

    public BigTemplatePresenter(IBaseView iBaseView) {
        super(iBaseView);
        this.videoTemplateCode = TypedValues.Custom.TYPE_BOOLEAN;
        this.redirectModel.setCampaignEx(getDefaultCampaign(this.adapterModel));
        this.TEMPLATE_MARK_TYPE = 1;
        this.iView = iBaseView;
        this.bigTemplateModel = new BigTemplateModel(this.commandManager, this.rewardVideoListener);
        this.iBigTempModel = (IBigTempModel) Proxy.newProxyInstance(BigTemplateModel.class.getClassLoader(), new Class[]{IBigTempModel.class}, new e(this.bigTemplateModel, this.adapterModel, this.commandManager));
    }

    private CampaignEx getDefaultCampaign(com.mbridge.msdk.newreward.adapter.e eVar) {
        try {
            if (eVar.g() != null && eVar.g().b() != null && !eVar.g().b().isEmpty()) {
                return eVar.g().b().get(0);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void adShowFail(String str, int i) {
        if (this.adapterModel.V()) {
            return;
        }
        this.adapterModel.b(true);
        super.adShowFail(str, i);
        IBigTempModel iBigTempModel = this.iBigTempModel;
        if (iBigTempModel != null) {
            iBigTempModel.onShowFail(this.mBridgeIds, str, i);
        }
        finish(true);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void adShowSuccess() {
        if (this.adapterModel.g0()) {
            return;
        }
        this.adapterModel.l(true);
        this.iBigTempModel.onAdShow(this.mBridgeIds);
        this.iBigTempModel.eventOnlyImpression(this.redirectModel);
    }

    @Override // com.mbridge.msdk.video.dynview.listener.d
    public void countDownClick() {
        CampaignEx defaultCampaign = getDefaultCampaign(this.adapterModel);
        if (defaultCampaign == null) {
            finish(true);
            return;
        }
        try {
            this.adapterModel.a(defaultCampaign);
            CampaignEx.c cVar = this.rewardTemplateMode;
            if (cVar != null) {
                this.videoTemplateCode = cVar.f();
            }
            c cVar2 = this.commandManager;
            cVar2.c(cVar2.a("add_temple", Integer.valueOf(this.videoTemplateCode), "template_type", 17, "parent_temple", this.data.getRootViewGroup(), "adapter_model", this.adapterModel), f.SHOW_ADD_TEMPLE);
            this.iView.removeTempleFromSuperView(this.data.getRootViewGroup());
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void finish(boolean z) {
        if (z) {
            Context context = this.context;
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void getView() throws Throwable {
        com.mbridge.msdk.video.dynview.c cVarA = new com.mbridge.msdk.video.dynview.wrapper.c().a(this.context, this.adapterModel.g().b());
        HashMap map = new HashMap();
        map.put("choice_one_callback", this);
        b.a().a(cVarA, new h() { // from class: com.mbridge.msdk.newreward.player.presenter.BigTemplatePresenter.1
            @Override // com.mbridge.msdk.video.dynview.listener.h
            public void viewInflaterFail(a aVar) {
                BigTemplatePresenter.this.adShowFail(com.mbridge.msdk.foundation.error.a.a(890008), 890008);
            }

            @Override // com.mbridge.msdk.video.dynview.listener.h
            public void viewInflaterSuccess(com.mbridge.msdk.video.dynview.a aVar) {
                BigTemplatePresenter.this.initDataForView(aVar);
            }
        }, map);
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void initDataForView(com.mbridge.msdk.video.dynview.a aVar) {
        if (aVar != null) {
            try {
                if (aVar.b() != null) {
                    aVar.b().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.iView.addViewToCurrentViewGroup(aVar.b());
                }
                this.is_dy = aVar.c();
                adShowSuccess();
                this.iView.initViews(this.is_dy);
            } catch (Exception e) {
                adShowFail(com.mbridge.msdk.foundation.error.a.a(890008), 890008);
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.dynview.listener.d
    public void itemClick(CampaignEx campaignEx) {
        if (campaignEx == null) {
            finish(true);
            return;
        }
        try {
            campaignEx.setShowType(com.mbridge.msdk.foundation.same.report.metrics.a.d);
            this.campaignEx = campaignEx;
            this.adapterModel.a(campaignEx);
            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            this.rewardTemplateMode = rewardTemplateMode;
            if (rewardTemplateMode != null) {
                this.videoTemplateCode = rewardTemplateMode.f();
            }
            c cVar = this.commandManager;
            cVar.c(cVar.a("add_temple", Integer.valueOf(this.videoTemplateCode), "template_type", 17, "adapter_model", this.adapterModel, "parent_temple", this.data.getRootViewGroup()), f.SHOW_ADD_TEMPLE);
            this.iView.removeTempleFromSuperView(this.data.getRootViewGroup());
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void releaseSource() {
    }
}

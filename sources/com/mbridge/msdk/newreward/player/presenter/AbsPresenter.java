package com.mbridge.msdk.newreward.player.presenter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.adapter.e;
import com.mbridge.msdk.newreward.function.command.c;
import com.mbridge.msdk.newreward.function.command.d;
import com.mbridge.msdk.newreward.player.iview.IBaseView;
import com.mbridge.msdk.newreward.player.iview.IMetaData;
import com.mbridge.msdk.newreward.player.redirect.RedirectModel;
import com.mbridge.msdk.out.MBridgeIds;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbsPresenter {
    int TEMPLATE_MARK_TYPE;
    e adapterModel;
    CampaignEx campaignEx;
    int closeAlert;
    c commandManager;
    Context context;
    IMetaData data;
    int endScreenType;
    boolean isIV;
    boolean is_dy;
    int ivRewardAlertViewStatus = a.F;
    int ivRewardMode;
    int ivRewardValue;
    int ivRewardValueType;
    MBridgeIds mBridgeIds;
    View moreOfferTemp;
    RedirectModel redirectModel;
    com.mbridge.msdk.videocommon.entity.c reward;
    RewardVideoListener rewardVideoListener;
    ViewGroup rootParentView;
    int videoEndType;
    int videoSkipResult;
    int videoSkipTime;

    /* JADX WARN: Multi-variable type inference failed */
    public AbsPresenter(IBaseView iBaseView) {
        ViewGroup viewGroup = (ViewGroup) iBaseView;
        this.rootParentView = viewGroup;
        Context context = viewGroup.getContext();
        this.context = context;
        IMetaData iMetaData = (IMetaData) context;
        this.data = iMetaData;
        this.adapterModel = (e) iMetaData.getDate();
        this.commandManager = d.b().a();
        this.campaignEx = this.adapterModel.H();
        this.mBridgeIds = this.adapterModel.T();
        this.rewardVideoListener = this.adapterModel.M();
        RedirectModel redirectModel = new RedirectModel();
        this.redirectModel = redirectModel;
        redirectModel.setCampaignEx(this.campaignEx);
        this.redirectModel.setContext(this.context);
        this.redirectModel.setSettingModel(this.adapterModel.O());
        this.redirectModel.setUnitId(this.adapterModel.R());
        this.redirectModel.setDevExtraData(this.adapterModel.j());
        prepareShowParameter();
        buildReward("");
    }

    private void buildReward(String str) {
        if (this.campaignEx == null) {
            return;
        }
        this.reward = com.mbridge.msdk.videocommon.entity.c.a(str);
        com.mbridge.msdk.videocommon.setting.c cVarC = this.adapterModel.O().c();
        if (cVarC != null) {
            this.reward.a(cVarC.d());
            this.reward.b(cVarC.s());
        }
        com.mbridge.msdk.videocommon.entity.c cVar = this.reward;
        if (cVar != null && cVar.a() <= 0) {
            this.reward.a(1);
        }
        try {
            if (this.campaignEx.getRewardPlus() != null) {
                RewardPlus rewardPlus = this.campaignEx.getRewardPlus();
                if (!TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
                    com.mbridge.msdk.videocommon.entity.c cVar2 = new com.mbridge.msdk.videocommon.entity.c(rewardPlus.getName(), rewardPlus.getAmount());
                    this.reward = cVar2;
                    if (cVar2.a() < 0) {
                        this.reward.a(1);
                    }
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        RedirectModel redirectModel = this.redirectModel;
        if (redirectModel != null) {
            redirectModel.setReward(this.reward);
        }
    }

    private void prepareShowParameter() {
        if (this.campaignEx == null) {
            return;
        }
        boolean z = (this.adapterModel.d() == 0 ? this.campaignEx.getAdType() : this.adapterModel.d()) == 287;
        this.isIV = z;
        if (z) {
            this.ivRewardMode = this.adapterModel.m();
            this.ivRewardValueType = this.adapterModel.w();
            this.ivRewardValue = this.adapterModel.v();
        }
        this.closeAlert = this.adapterModel.O().c().h();
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null || campaignEx.getVst() <= -2) {
            this.videoSkipTime = this.adapterModel.O().c().F();
        } else {
            this.videoSkipTime = this.campaignEx.getVst();
        }
        this.videoSkipResult = this.adapterModel.O().c().E();
        this.videoEndType = this.campaignEx.getVideo_end_type();
        this.endScreenType = this.adapterModel.O().c().m();
    }

    public void adClosed() {
    }

    public void adShowFail(String str, int i) {
        e eVar = this.adapterModel;
        if (eVar != null) {
            eVar.b(true);
            com.mbridge.msdk.newreward.function.database.c.c().a().b(this.adapterModel.d(), this.adapterModel.G(), this.adapterModel.R(), this.adapterModel.A(), 7);
        }
    }

    public void adShowSuccess() {
        e eVar = this.adapterModel;
        if (eVar != null) {
            eVar.b(true);
            com.mbridge.msdk.newreward.function.database.c.c().a().b(this.adapterModel.d(), this.adapterModel.G(), this.adapterModel.R(), this.adapterModel.A(), 6);
        }
    }

    public void click(View view) {
    }

    public int filterFindViewId(boolean z, String str) {
        return z ? findDyID(str) : findID(str);
    }

    public int findDyID(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    public int findID(String str) {
        return g0.a(this.context.getApplicationContext(), str, "id");
    }

    public abstract void finish(boolean z);

    public abstract void getView();

    public abstract void initDataForView(com.mbridge.msdk.video.dynview.a aVar);

    public boolean isIVRewardEnable() {
        if (!this.isIV) {
            return false;
        }
        int i = this.ivRewardMode;
        return i == a.I || i == a.H;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            if (viewArr[i] == null) {
                return false;
            }
            i++;
            z = true;
        }
        return z;
    }

    public void onDestroy() {
    }

    public abstract void releaseSource();
}

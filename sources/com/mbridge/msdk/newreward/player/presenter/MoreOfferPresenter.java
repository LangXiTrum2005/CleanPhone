package com.mbridge.msdk.newreward.player.presenter;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.newreward.adapter.req.b;
import com.mbridge.msdk.newreward.function.command.c;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.function.proxy.e;
import com.mbridge.msdk.newreward.player.imodel.IMoreOfferModel;
import com.mbridge.msdk.newreward.player.iview.IMoreOfferTemplateView;
import com.mbridge.msdk.newreward.player.model.MoreOfferModel;
import com.mbridge.msdk.newreward.player.redirect.MoreOfferRedirectModel;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.video.dynview.a;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MoreOfferPresenter extends AbsPresenter {
    List<Integer> ImageLoadReadyCountList;
    private final String TAG;
    private int admf;
    private int admftm;
    private b callOutReqCallBack;
    IMoreOfferModel iMoreOfferModel;
    IMoreOfferTemplateView iMoreOfferTemplateView;
    int iconBufferCount;
    private final ImageLoadCountCallBack imageLoadCountCallBack;
    int initCanShowMaxCount;
    boolean isShown;
    LinearLayout linearLayout;
    com.mbridge.msdk.newreward.function.core.campaign.b moreOfferMBridgeCampaigns;
    MoreOfferModel moreOfferModel;
    MoreOfferRedirectModel moreOfferRedirectModel;
    private int moreOfferType;
    private Map<String, Integer> viewIdMaps;

    public interface ImageLoadCountCallBack {
        void loadCountCallback();
    }

    public class MoreOfferBuildCallback implements b {
        private MoreOfferBuildCallback() {
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            if (MoreOfferPresenter.this.callOutReqCallBack == null) {
                return;
            }
            MoreOfferPresenter.this.callOutReqCallBack.reqFailed(bVar);
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            IMoreOfferTemplateView iMoreOfferTemplateView = MoreOfferPresenter.this.iMoreOfferTemplateView;
            if (iMoreOfferTemplateView == null) {
                return;
            }
            try {
                iMoreOfferTemplateView.addViewToObservableScrollView((View) obj);
                MoreOfferPresenter moreOfferPresenter = MoreOfferPresenter.this;
                moreOfferPresenter.linearLayout = (LinearLayout) obj;
                moreOfferPresenter.addMoreOfferLikeText();
                MoreOfferPresenter moreOfferPresenter2 = MoreOfferPresenter.this;
                if (moreOfferPresenter2.rootParentView != null) {
                    moreOfferPresenter2.calculateCanShowCount();
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class MoreOfferCampaignRequestCallback implements b {
        private MoreOfferCampaignRequestCallback() {
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
            IMoreOfferModel iMoreOfferModel = MoreOfferPresenter.this.iMoreOfferModel;
            if (iMoreOfferModel != null) {
                iMoreOfferModel.onMoreOfferRes(bVar.b() + "", "2", "1");
            }
            o0.b("", bVar.h());
        }

        @Override // com.mbridge.msdk.newreward.adapter.req.b
        public void reqSuccessful(Object obj) {
            try {
                if (obj instanceof com.mbridge.msdk.newreward.function.core.campaign.b) {
                    com.mbridge.msdk.newreward.function.core.campaign.b bVar = (com.mbridge.msdk.newreward.function.core.campaign.b) obj;
                    MoreOfferPresenter.this.moreOfferMBridgeCampaigns = bVar;
                    if (bVar.f() == null || MoreOfferPresenter.this.moreOfferMBridgeCampaigns.f().size() < 5) {
                        IMoreOfferModel iMoreOfferModel = MoreOfferPresenter.this.iMoreOfferModel;
                        if (iMoreOfferModel != null) {
                            iMoreOfferModel.onMoreOfferRes("12930014", "2", "1");
                            return;
                        }
                        return;
                    }
                    IMoreOfferModel iMoreOfferModel2 = MoreOfferPresenter.this.iMoreOfferModel;
                    if (iMoreOfferModel2 != null) {
                        iMoreOfferModel2.onMoreOfferRes("1", "1");
                    }
                    MoreOfferPresenter moreOfferPresenter = MoreOfferPresenter.this;
                    c cVar = moreOfferPresenter.commandManager;
                    cVar.d(cVar.a(MBInterstitialActivity.INTENT_CAMAPIGN, moreOfferPresenter.campaignEx, "more_offer_campaign", obj, "command_type", f.BUILD_MORE_OFFER), new MoreOfferBuildCallback());
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    public MoreOfferPresenter(IMoreOfferTemplateView iMoreOfferTemplateView) {
        super(iMoreOfferTemplateView);
        this.TAG = "MoreOfferTemplatePresenter";
        this.iconBufferCount = 2;
        this.ImageLoadReadyCountList = new ArrayList();
        this.isShown = false;
        this.viewIdMaps = new HashMap();
        this.imageLoadCountCallBack = new ImageLoadCountCallBack() { // from class: com.mbridge.msdk.newreward.player.presenter.MoreOfferPresenter.1
            @Override // com.mbridge.msdk.newreward.player.presenter.MoreOfferPresenter.ImageLoadCountCallBack
            public void loadCountCallback() {
                MoreOfferPresenter moreOfferPresenter = MoreOfferPresenter.this;
                if (moreOfferPresenter.isShown) {
                    return;
                }
                int size = moreOfferPresenter.ImageLoadReadyCountList.size();
                MoreOfferPresenter moreOfferPresenter2 = MoreOfferPresenter.this;
                if (size < moreOfferPresenter2.initCanShowMaxCount || moreOfferPresenter2.callOutReqCallBack == null) {
                    return;
                }
                MoreOfferPresenter moreOfferPresenter3 = MoreOfferPresenter.this;
                moreOfferPresenter3.isShown = true;
                if (!moreOfferPresenter3.moreOfferModel.mImpressionId.contains(0)) {
                    MoreOfferPresenter.this.setItemRedirectModel(0);
                    MoreOfferPresenter.this.doMoreOfferOnlyImpression();
                }
                MoreOfferPresenter.this.callOutReqCallBack.reqSuccessful(MoreOfferPresenter.this.rootParentView);
                MoreOfferPresenter.this.linearLayout.postDelayed(new Runnable() { // from class: com.mbridge.msdk.newreward.player.presenter.MoreOfferPresenter.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MoreOfferPresenter.this.checkItemVisibleState();
                        MoreOfferPresenter.this.reportAdmfImpression();
                    }
                }, 500L);
                MoreOfferPresenter.this.iMoreOfferModel.onMoreOfferShow(MoreOfferPresenter.this.moreOfferType + "");
            }
        };
        this.iMoreOfferTemplateView = (IMoreOfferTemplateView) Proxy.newProxyInstance(iMoreOfferTemplateView.getClass().getClassLoader(), new Class[]{IMoreOfferTemplateView.class}, new e(iMoreOfferTemplateView, this.adapterModel, this.commandManager));
        this.moreOfferModel = new MoreOfferModel(this.commandManager);
        if (this.adapterModel.C() != null && this.adapterModel.C().c != null) {
            this.moreOfferModel.mImpressionId.addAll(this.adapterModel.C().c);
        }
        this.iMoreOfferModel = (IMoreOfferModel) Proxy.newProxyInstance(this.moreOfferModel.getClass().getClassLoader(), new Class[]{IMoreOfferModel.class}, new e(this.moreOfferModel, this.adapterModel, this.commandManager));
        MoreOfferRedirectModel moreOfferRedirectModel = new MoreOfferRedirectModel();
        this.moreOfferRedirectModel = moreOfferRedirectModel;
        moreOfferRedirectModel.setContext(this.context);
        this.moreOfferRedirectModel.setSettingModel(this.adapterModel.O());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMoreOfferLikeText() {
        if (this.iMoreOfferTemplateView == null) {
            return;
        }
        try {
            if (k0.p(com.mbridge.msdk.foundation.controller.c.n().d()).contains("zh")) {
                this.iMoreOfferTemplateView.addMoreOfferLikeText("猜你喜欢", t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 30.0f));
            } else {
                this.iMoreOfferTemplateView.addMoreOfferLikeText("Just\nfor\nYou", 0);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calculateCanShowCount() {
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout == null || linearLayout.getChildCount() <= 5) {
            return;
        }
        try {
            double dG = ((double) (t0.g(com.mbridge.msdk.foundation.controller.c.n().d()) - t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 40.0f))) / ((double) t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 70.0f));
            this.initCanShowMaxCount = (int) ((dG - ((double) ((int) dG)) > 0.2d ? Math.ceil(dG) : Math.floor(dG)) + ((double) this.admf));
            if (this.linearLayout.getChildCount() < this.initCanShowMaxCount) {
                this.initCanShowMaxCount = this.linearLayout.getChildCount();
            }
            if (this.linearLayout.getChildCount() >= this.initCanShowMaxCount) {
                for (int i = 0; i < this.initCanShowMaxCount; i++) {
                    View childAt = this.linearLayout.getChildAt(i);
                    if (childAt != null) {
                        loadIconImageUrl(childAt, i);
                    }
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkItemVisibleState() {
        View childAt;
        if (this.linearLayout == null) {
            return;
        }
        for (int i = 0; i < this.linearLayout.getChildCount(); i++) {
            try {
                this.moreOfferRedirectModel.setItemPositionId(i);
                if (!this.moreOfferModel.mImpressionId.contains(Integer.valueOf(i)) && (childAt = this.linearLayout.getChildAt(i)) != null) {
                    setItemRedirectModel(i);
                    setMoreOfferItemClickListener(childAt, i);
                    doMoreOfferImpression(childAt, i);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
    }

    private void doMoreOfferImpression(View view, int i) {
        List<Integer> list;
        if (this.moreOfferModel == null) {
            return;
        }
        try {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            boolean z = rect.width() > view.getMeasuredWidth() / 5;
            if (!globalVisibleRect || !z) {
                if (this.iconBufferCount <= 2 && (list = this.ImageLoadReadyCountList) != null && !list.contains(Integer.valueOf(i))) {
                    loadIconImageUrl(view, i);
                }
                this.iconBufferCount++;
                return;
            }
            this.iconBufferCount = 1;
            List<Integer> list2 = this.ImageLoadReadyCountList;
            if (list2 != null && !list2.contains(Integer.valueOf(i))) {
                loadIconImageUrl(view, i);
            }
            this.moreOfferModel.eventImpression(this.moreOfferRedirectModel);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doMoreOfferOnlyImpression() {
        MoreOfferModel moreOfferModel = this.moreOfferModel;
        if (moreOfferModel == null) {
            return;
        }
        moreOfferModel.eventOnlyImpression(this.moreOfferRedirectModel);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a0 -> B:29:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a2 -> B:29:0x00a5). Please report as a decompilation issue!!! */
    private CampaignEx getCampaignEx(int i) {
        CampaignEx campaignEx;
        try {
            if (this.adapterModel.C() == null) {
                campaignEx = null;
            } else {
                int i2 = this.moreOfferType;
                if (i2 != 1) {
                    if (i2 != 2 || this.adapterModel.C().a() == null || this.adapterModel.C().a().f() == null || this.adapterModel.C().a().f().isEmpty()) {
                        campaignEx = null;
                    } else {
                        campaignEx = this.adapterModel.C().a().f().get(i);
                    }
                } else if (this.adapterModel.C().b() == null || this.adapterModel.C().b().f() == null || this.adapterModel.C().b().f().isEmpty()) {
                    campaignEx = null;
                } else {
                    campaignEx = this.adapterModel.C().b().f().get(i);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return campaignEx;
    }

    private void loadIconImageUrl(View view, final int i) {
        com.mbridge.msdk.newreward.function.core.campaign.b bVar = this.moreOfferMBridgeCampaigns;
        if (bVar == null) {
            return;
        }
        try {
            List<CampaignEx> listF = bVar.f();
            if (listF == null || listF.size() <= i) {
                return;
            }
            final RoundImageView roundImageView = (RoundImageView) view.findViewById(g0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_end_card_item_iv", "id"));
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(listF.get(i).getIconUrl(), new com.mbridge.msdk.foundation.same.image.c() { // from class: com.mbridge.msdk.newreward.player.presenter.MoreOfferPresenter.2
                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onFailedLoad(String str, String str2) {
                }

                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onSuccessLoad(Bitmap bitmap, String str) {
                    if (bitmap != null) {
                        try {
                            List<Integer> list = MoreOfferPresenter.this.ImageLoadReadyCountList;
                            if (list != null) {
                                list.add(Integer.valueOf(i));
                            }
                            roundImageView.setBorderRadius(13);
                            roundImageView.setImageBitmap(bitmap);
                            MoreOfferPresenter.this.imageLoadCountCallBack.loadCountCallback();
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                            }
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

    /* JADX INFO: Access modifiers changed from: private */
    public void reportAdmfImpression() {
        for (int i = 0; i < this.initCanShowMaxCount; i++) {
            try {
                if (!this.moreOfferModel.mImpressionId.contains(Integer.valueOf(i))) {
                    this.moreOfferRedirectModel.setItemPositionId(i);
                    setItemRedirectModel(i);
                    this.moreOfferModel.eventImpression(this.moreOfferRedirectModel);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemRedirectModel(int i) {
        if (this.adapterModel == null || this.moreOfferRedirectModel == null) {
            return;
        }
        try {
            String str = "117361";
            CampaignEx campaignEx = getCampaignEx(i);
            String strA = "";
            if (campaignEx != null) {
                this.moreOfferRedirectModel.setCampaignEx(campaignEx);
                strA = z0.a(campaignEx.getendcard_url(), "mof_testuid");
                if (TextUtils.isEmpty(strA)) {
                    strA = z0.a(campaignEx.getendcard_url(), "mof_uid");
                }
            }
            if (!TextUtils.isEmpty(strA)) {
                str = strA;
            }
            this.moreOfferRedirectModel.setUnitId(str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void setMoreOfferItemClickListener(View view, int i) {
        if (view == null) {
            return;
        }
        if (!this.viewIdMaps.containsKey(view.hashCode() + "")) {
            this.viewIdMaps.put(view.hashCode() + "", Integer.valueOf(i));
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.newreward.player.presenter.MoreOfferPresenter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                MoreOfferPresenter moreOfferPresenter = MoreOfferPresenter.this;
                if (moreOfferPresenter.moreOfferModel == null) {
                    return;
                }
                try {
                    int iIntValue = ((Integer) moreOfferPresenter.viewIdMaps.get(view2.hashCode() + "")).intValue();
                    if (MoreOfferPresenter.this.moreOfferMBridgeCampaigns.f() != null) {
                        MoreOfferPresenter.this.moreOfferRedirectModel.setCampaignEx(MoreOfferPresenter.this.moreOfferMBridgeCampaigns.f().get(iIntValue));
                        MoreOfferPresenter moreOfferPresenter2 = MoreOfferPresenter.this;
                        moreOfferPresenter2.moreOfferModel.eventClickUrl(moreOfferPresenter2.moreOfferRedirectModel);
                    }
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void click(View view) {
        if (this.iMoreOfferTemplateView == null || view == null || view.getId() != filterFindViewId(false, "mbridge_reward_end_card_like_tv")) {
            return;
        }
        this.iMoreOfferTemplateView.setObservableScrollViewVisible();
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void finish(boolean z) {
    }

    public void getAdMFTmValue(int i) {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject(this.campaignEx.getMoreOfferJsonData());
            if (i != 1) {
                jSONObject = i != 2 ? null : jSONObject2.getJSONObject(CampaignEx.ENDCARD_URL);
            } else {
                jSONObject = jSONObject2.getJSONObject("template_url");
            }
            if (jSONObject != null) {
                if (jSONObject.has(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMFTM)) {
                    this.admftm = jSONObject.getInt(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMFTM);
                }
                if (jSONObject.has(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMF)) {
                    this.admf = jSONObject.getInt(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMF);
                }
            }
        } catch (Exception e) {
            o0.b("MoreOfferTemplatePresenter", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void getView() {
        if (this.iMoreOfferTemplateView == null) {
            return;
        }
        try {
            MBridgeRelativeLayout mBridgeRelativeLayout = (MBridgeRelativeLayout) LayoutInflater.from(this.context).inflate(g0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_more_offer_view", TtmlNode.TAG_LAYOUT), (ViewGroup) null, false);
            if (mBridgeRelativeLayout != null) {
                this.iMoreOfferTemplateView.addViewToCurrentViewGroup(mBridgeRelativeLayout);
                mBridgeRelativeLayout.setBackgroundColor(-1);
            }
            this.iMoreOfferTemplateView.initViews(false);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void initDataForView(a aVar) {
    }

    public void onTouch(View view) {
        if (view == null || view.getId() != filterFindViewId(false, "mbridge_moreoffer_hls")) {
            return;
        }
        checkItemVisibleState();
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void releaseSource() {
    }

    public void setIReqCallBack(b bVar) {
        this.callOutReqCallBack = bVar;
    }

    public void syncLoad(int i) {
        this.moreOfferType = i;
        if (this.campaignEx == null) {
            return;
        }
        getAdMFTmValue(i);
        try {
            if (i == 1) {
                this.iMoreOfferModel.onMoreOfferReq("1");
                c cVar = this.commandManager;
                cVar.d(cVar.a(MBInterstitialActivity.INTENT_CAMAPIGN, this.campaignEx, "command_type", f.REQ_MORE_OFFER_CAMPAIGN, "more_offer_type", 1, "adapter_model", this.adapterModel), new MoreOfferCampaignRequestCallback());
            } else {
                if (i != 2) {
                    return;
                }
                if (this.adapterModel.C().a() != null) {
                    this.moreOfferMBridgeCampaigns = this.adapterModel.C().a();
                    if (this.adapterModel.C().a().f().size() >= 5) {
                        c cVar2 = this.commandManager;
                        cVar2.d(cVar2.a(MBInterstitialActivity.INTENT_CAMAPIGN, this.campaignEx, "more_offer_campaign", this.adapterModel.C().a(), "command_type", f.BUILD_MORE_OFFER), new MoreOfferBuildCallback());
                    }
                } else {
                    this.iMoreOfferModel.onMoreOfferReq("1");
                    c cVar3 = this.commandManager;
                    cVar3.d(cVar3.a(MBInterstitialActivity.INTENT_CAMAPIGN, this.campaignEx, "command_type", f.REQ_MORE_OFFER_CAMPAIGN, "more_offer_type", 2, "adapter_model", this.adapterModel), new MoreOfferCampaignRequestCallback());
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}

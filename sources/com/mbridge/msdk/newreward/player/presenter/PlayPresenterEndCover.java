package com.mbridge.msdk.newreward.player.presenter;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.same.report.metrics.a;
import com.mbridge.msdk.foundation.tools.n0;
import com.mbridge.msdk.newreward.player.iview.IECoverTemplateView;
import com.mbridge.msdk.newreward.player.iview.IPlayTempleView;

/* JADX INFO: loaded from: classes2.dex */
public class PlayPresenterEndCover extends PlayTemplePresenter {
    IECoverTemplateView ieCoverTemplateView;

    public PlayPresenterEndCover(IPlayTempleView iPlayTempleView) {
        super(iPlayTempleView);
        if (iPlayTempleView instanceof IECoverTemplateView) {
            this.ieCoverTemplateView = (IECoverTemplateView) iPlayTempleView;
        }
    }

    private void setViewSourceInfo() {
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null) {
            return;
        }
        try {
            IECoverTemplateView iECoverTemplateView = this.ieCoverTemplateView;
            if (iECoverTemplateView instanceof IECoverTemplateView) {
                iECoverTemplateView.setTitle(campaignEx.getAppName());
                this.ieCoverTemplateView.setCtaBtn(this.campaignEx.getAdCall());
                this.ieCoverTemplateView.setDesc(this.campaignEx.getAppDesc());
                if (TextUtils.isEmpty(this.campaignEx.getIconUrl())) {
                    return;
                }
                b.a(this.context.getApplicationContext()).a(this.campaignEx.getIconUrl(), new c() { // from class: com.mbridge.msdk.newreward.player.presenter.PlayPresenterEndCover.1
                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onFailedLoad(String str, String str2) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (bitmap == null) {
                            return;
                        }
                        try {
                            if (bitmap.isRecycled()) {
                                return;
                            }
                            PlayPresenterEndCover.this.ieCoverTemplateView.setIconImageView(n0.a(bitmap, 1, 8));
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                            }
                        }
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.PlayTemplePresenter, com.mbridge.msdk.newreward.player.presenter.BaseTemplatePresenter, com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void click(View view) {
        try {
            if (view.getId() == filterFindViewId(false, "mbridge_vec_iv_close")) {
                finish(true);
                return;
            }
            if (view.getId() == filterFindViewId(false, "mbridge_vec_btn")) {
                CampaignEx campaignEx = this.campaignEx;
                if (campaignEx != null) {
                    campaignEx.setClickTempSource(a.g);
                    this.campaignEx.setTriggerClickSource(a.l);
                }
                this.playTempleModel.onAdClick(this.mBridgeIds);
                this.playTempleModel.eventClickUrl(this.redirectModel);
                this.playTempleModel.eventTrackingForClick(this.redirectModel);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            finish(true);
        }
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.PlayTemplePresenter, com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void getView() {
        this.iView.initViews(false);
        setViewSourceInfo();
    }
}

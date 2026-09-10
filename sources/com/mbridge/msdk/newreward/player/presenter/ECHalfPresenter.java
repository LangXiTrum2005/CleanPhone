package com.mbridge.msdk.newreward.player.presenter;

import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.function.proxy.e;
import com.mbridge.msdk.newreward.player.iview.IECTempleView;
import com.mbridge.msdk.util.b;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.error.a;
import com.mbridge.msdk.video.dynview.listener.h;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public class ECHalfPresenter extends ECTemplePresenter {
    IECTempleView iCusECTemplateView;

    public ECHalfPresenter(IECTempleView iECTempleView) {
        super(iECTempleView);
        this.iCusECTemplateView = (IECTempleView) Proxy.newProxyInstance(iECTempleView.getClass().getClassLoader(), new Class[]{IECTempleView.class}, new e(iECTempleView, this.adapterModel, this.commandManager));
    }

    @Override // com.mbridge.msdk.newreward.player.presenter.ECTemplePresenter, com.mbridge.msdk.newreward.player.presenter.AbsPresenter
    public void getView() throws Throwable {
        c cVarB = new com.mbridge.msdk.video.dynview.wrapper.c().b(this.context, this.campaignEx, -1, b.a() ? "cn_" : "en_");
        this.nLogo = cVarB.o();
        com.mbridge.msdk.video.dynview.b.a().a(cVarB, new h() { // from class: com.mbridge.msdk.newreward.player.presenter.ECHalfPresenter.1
            @Override // com.mbridge.msdk.video.dynview.listener.h
            public void viewInflaterFail(a aVar) {
            }

            @Override // com.mbridge.msdk.video.dynview.listener.h
            public void viewInflaterSuccess(com.mbridge.msdk.video.dynview.a aVar) {
                ECHalfPresenter.this.initDataForView(aVar);
            }
        });
    }

    public void setHalfWH() {
        int iF;
        int iG;
        try {
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
            this.data.getRootViewGroup().setLayoutParams(layoutParams);
        } catch (Throwable th) {
            o0.b("ECHalfPresenter", th.getMessage());
        }
    }
}

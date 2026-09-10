package com.mbridge.msdk.newreward.player.presenter;

import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.newreward.adapter.req.b;
import com.mbridge.msdk.newreward.function.command.c;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.newreward.function.proxy.e;
import com.mbridge.msdk.newreward.player.iview.ICusECTemplateView;
import com.mbridge.msdk.newreward.player.iview.IECTempleView;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public class ECPresenter704 extends ECTemplePresenter {
    ICusECTemplateView iCusECTemplateView;

    public ECPresenter704(IECTempleView iECTempleView) {
        super(iECTempleView);
        this.iCusECTemplateView = (ICusECTemplateView) Proxy.newProxyInstance(iECTempleView.getClass().getClassLoader(), new Class[]{ICusECTemplateView.class}, new e(iECTempleView, this.adapterModel, this.commandManager));
    }

    public void addMoreOfferView(ViewGroup viewGroup) {
        try {
            if (Integer.parseInt(z0.a(this.campaignEx.getendcard_url(), "mof")) == 1) {
                c cVar = this.commandManager;
                cVar.b(cVar.a("add_temple", 295, "parent_temple", viewGroup, "more_offer_type", 2, "command_type", f.SHOW_ADD_TEMPLE), new b() { // from class: com.mbridge.msdk.newreward.player.presenter.ECPresenter704.1
                    @Override // com.mbridge.msdk.newreward.adapter.req.b
                    public void reqFailed(com.mbridge.msdk.foundation.error.b bVar) {
                    }

                    @Override // com.mbridge.msdk.newreward.adapter.req.b
                    public void reqSuccessful(Object obj) {
                        try {
                            if (obj instanceof View) {
                                ((View) obj).setVisibility(0);
                                new com.mbridge.msdk.video.dynview.ui.b().a((View) obj, 0, t0.g(com.mbridge.msdk.foundation.controller.c.n().d()), 0, t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f), 500L);
                            }
                            ICusECTemplateView iCusECTemplateView = ECPresenter704.this.iCusECTemplateView;
                            if (iCusECTemplateView != null) {
                                iCusECTemplateView.reSetEndCardWidthAndHeight(t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f));
                            }
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
}

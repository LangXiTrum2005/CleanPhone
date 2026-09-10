package com.mbridge.msdk.dycreator.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.dycreator.binding.b;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewobserver.c;
import com.mbridge.msdk.dycreator.viewobserver.d;
import com.mbridge.msdk.dycreator.viewobserver.f;
import com.mbridge.msdk.dycreator.viewobserver.h;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBSplashViewVModel implements BaseViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f33306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f33307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f33308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f33309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private DynamicViewBackListener f33310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private DyOption f33311f;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33312a;

        static {
            int[] iArr = new int[EAction.values().length];
            f33312a = iArr;
            try {
                iArr[EAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33312a[EAction.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MBSplashViewVModel(DyOption dyOption) {
        this.f33311f = dyOption;
        String campaignUnitId = (dyOption == null || dyOption.getCampaignEx() == null) ? "" : dyOption.getCampaignEx().getCampaignUnitId();
        if (TextUtils.isEmpty(campaignUnitId)) {
            EventBus.getDefault().register(this);
        } else {
            EventBus.getDefault().register(campaignUnitId, this);
        }
    }

    private void a(Object obj) {
        c cVar = this.f33307b;
        if (cVar != null) {
            cVar.a(obj);
        }
    }

    private void b(Object obj) {
        d dVar = this.f33306a;
        if (dVar != null) {
            dVar.a(obj);
        }
    }

    private void c(Object obj) {
        f fVar = this.f33308c;
        if (fVar != null) {
            fVar.a(obj);
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        a(splashResData);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(c cVar) {
        if (cVar != null) {
            this.f33307b = cVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(d dVar) {
        if (dVar != null) {
            this.f33306a = dVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f33310e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(f fVar) {
        if (fVar != null) {
            this.f33308c = fVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        MBSplashData mBSplashData = new MBSplashData(this.f33311f);
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            DyOption dyOption = this.f33311f;
            if (dyOption != null) {
                CampaignEx campaignEx = dyOption.getCampaignEx();
                if (campaignEx != null) {
                    mBSplashData.setAdClickText(campaignEx.getAdCall());
                }
                mBSplashData.setCountDownText(contextD.getResources().getString(i0.a(contextD, this.f33311f.isCanSkip() ? "mbridge_splash_count_time_can_skip" : "mbridge_splash_count_time_can_skip_not", "string")));
            }
            mBSplashData.setNoticeImage(i0.a(contextD, "mbridge_splash_notice", "drawable"));
            String strP = m0.p(contextD);
            mBSplashData.setLogoText((TextUtils.isEmpty(strP) || !strP.contains("zh")) ? "AD" : "广告");
        }
        b(mBSplashData);
        a(mBSplashData);
        c(mBSplashData);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(h hVar) {
        if (hVar != null) {
            this.f33309d = hVar;
        }
    }

    private void a(SplashResData splashResData) {
        if (this.f33310e == null || splashResData == null) {
            return;
        }
        int i10 = AnonymousClass1.f33312a[splashResData.geteAction().ordinal()];
        if (i10 == 1 || i10 == 2) {
            b(splashResData);
        }
        this.f33310e.viewClicked(splashResData);
    }

    private void b(SplashResData splashResData) {
        try {
            String campaignUnitId = "";
            if (splashResData.getBaseViewData() != null && splashResData.getBaseViewData().getBindData() != null) {
                campaignUnitId = splashResData.getBaseViewData().getBindData().getCampaignUnitId();
            }
            if (!TextUtils.isEmpty(campaignUnitId)) {
                EventBus.getDefault().unregister(campaignUnitId);
                b.a().b();
            } else {
                EventBus.getDefault().unregister(this);
                b.a().b();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            EventBus.getDefault().unregister(this);
            EventBus.getDefault().release();
            b.a().b();
        }
    }
}

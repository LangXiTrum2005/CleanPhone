package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class c extends com.mbridge.msdk.splash.manager.a {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements DyCountDownListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DyOption f35805a;

        public a(DyOption dyOption) {
            this.f35805a = dyOption;
        }

        @Override // com.mbridge.msdk.dycreator.listener.DyCountDownListener
        public void getCountDownValue(int i10) {
            this.f35805a.setDyCountDownListener(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements DynamicViewBackListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.splash.inter.a f35807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBSplashView f35808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.splash.common.c f35809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ DyOption f35810d;

        public b(com.mbridge.msdk.splash.inter.a aVar, MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar, DyOption dyOption) {
            this.f35807a = aVar;
            this.f35808b = mBSplashView;
            this.f35809c = cVar;
            this.f35810d = dyOption;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
        public void viewClicked(BaseRespData baseRespData) {
            com.mbridge.msdk.splash.signal.b splashSignalCommunicationImpl;
            MBSplashView mBSplashView = this.f35808b;
            com.mbridge.msdk.splash.middle.a aVarA = (mBSplashView == null || (splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl()) == null) ? null : splashSignalCommunicationImpl.a();
            DyOption dyOption = this.f35810d;
            CampaignEx campaignEx = dyOption != null ? dyOption.getCampaignEx() : null;
            EAction eAction = baseRespData instanceof SplashResData ? ((SplashResData) baseRespData).geteAction() : null;
            if (eAction != null) {
                int i10 = C0179c.f35812a[eAction.ordinal()];
                if (i10 == 1) {
                    if (aVarA != null) {
                        if (baseRespData == null) {
                            aVarA.a(campaignEx);
                            return;
                        } else {
                            if (baseRespData instanceof SplashResData) {
                                SplashResData splashResData = (SplashResData) baseRespData;
                                if (splashResData.getBaseViewData() != null) {
                                    c.this.a(splashResData.getBaseViewData(), aVarA, campaignEx);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (i10 == 2) {
                    if (aVarA != null) {
                        aVarA.close();
                    }
                } else if (i10 == 3) {
                    if (this.f35810d != null) {
                        com.mbridge.msdk.click.c.e(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35810d.getAdChoiceLink());
                    }
                } else if (i10 == 4 && baseRespData != null && (baseRespData instanceof SplashResData)) {
                    SplashResData splashResData2 = (SplashResData) baseRespData;
                    if (splashResData2.getBaseViewData() != null) {
                        c.this.a(aVarA, campaignEx, splashResData2.getBaseViewData());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
        public void viewCreateFail(com.mbridge.msdk.dycreator.error.a aVar) {
            MBSplashView mBSplashView = this.f35808b;
            if (mBSplashView != null) {
                Context context = mBSplashView.getContext();
                if (context == null) {
                    context = com.mbridge.msdk.foundation.controller.c.n().d();
                }
                c.this.a(context, this.f35808b, this.f35809c, this.f35807a);
            }
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
        public void viewCreatedSuccess(View view) {
            com.mbridge.msdk.splash.inter.a aVar = this.f35807a;
            if (aVar != null) {
                if (view != null) {
                    aVar.a(view);
                } else {
                    aVar.onError("View render error.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class C0179c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35812a;

        static {
            int[] iArr = new int[EAction.values().length];
            f35812a = iArr;
            try {
                iArr[EAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35812a[EAction.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35812a[EAction.NOTICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35812a[EAction.FEEDBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f35813a = new c(null);
    }

    public /* synthetic */ c(a aVar) {
        this();
    }

    public static c a() {
        return d.f35813a;
    }

    private c() {
    }

    @Override // com.mbridge.msdk.splash.manager.a
    public void a(List<String> list, MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar, com.mbridge.msdk.splash.inter.a aVar) {
        i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        DyOption dyOptionBuild = new DyOption.Builder().campaignEx(cVar.b()).fileDirs(list).dyAdType(DyAdType.SPLASH).canSkip(cVar.m()).isScreenClick(cVar.f() == 1).isClickButtonVisible(cVar.c() == 0).isShakeVisible(cVar.i() == 1).isApkInfoVisible(cVar.a() == 0).isLogoVisible(cVar.e() == 1).shakeStrenght(cVar.j()).shakeTime(cVar.k()).orientation(cVar.g()).countDownTime(cVar.d()).adChoiceLink(v0.a(cVar.b())).build();
        mBSplashView.setDyCountDownListener(new a(dyOptionBuild));
        DynamicViewCreator.getInstance().createDynamicView(dyOptionBuild, new b(aVar, mBSplashView, cVar, dyOptionBuild));
    }
}

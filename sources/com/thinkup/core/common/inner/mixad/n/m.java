package com.thinkup.core.common.inner.mixad.n;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUNativeAdInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.common.inner.ui.BaseATActivity;
import com.thinkup.core.common.inner.ui.BaseMediaTUView;
import com.thinkup.core.common.inner.ui.CloseShadeView;
import com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyBannerTUView;
import com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyFullScreenTUView;
import com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyHalfScreenTUView;
import com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyNativeTemplateView;
import com.thinkup.core.common.inner.ui.thirdparty.ThirdPartySelfRenderScreenTUView;
import com.thinkup.core.common.inner.ui.thirdparty.ThirdPartySplashTUView;
import com.thinkup.core.common.mn.oo.o.on;
import com.thinkup.core.common.n.m0;
import com.thinkup.core.common.n.mn;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.oo0.oo;
import com.thinkup.core.common.ooo.o00;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class m implements com.thinkup.core.common.mn.oo.o.o {
    private static final String o = "m";
    private com.thinkup.core.common.inner.mixad.n.o.o m;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.mixad.n.m$2, reason: invalid class name */
    public class AnonymousClass2 extends com.thinkup.core.common.inner.oo.n {
        final /* synthetic */ com.thinkup.core.common.mn.oo.o.m o;

        public AnonymousClass2(com.thinkup.core.common.mn.oo.o.m mVar) {
            this.o = mVar;
        }

        @Override // com.thinkup.core.common.inner.oo.n, com.thinkup.core.common.inner.oo.o
        public final void m() {
            com.thinkup.core.common.mn.oo.o.m mVar = this.o;
            if (mVar != null) {
                mVar.onClose();
            }
        }

        @Override // com.thinkup.core.common.inner.oo.n, com.thinkup.core.common.inner.oo.o
        public final void o(com.thinkup.core.common.inner.m.o oVar) {
            com.thinkup.core.common.mn.oo.o.m mVar = this.o;
            if (mVar != null) {
                if (oVar != null) {
                    mVar.onVideoError(oVar.o(), oVar.m());
                } else {
                    mVar.onVideoError("", "");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.mixad.n.m$3, reason: invalid class name */
    public class AnonymousClass3 extends m0 {
        final /* synthetic */ com.thinkup.core.common.mn.oo.o.m m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ThirdPartySplashTUView f41814n;
        final /* synthetic */ boolean[] o;

        public AnonymousClass3(boolean[] zArr, com.thinkup.core.common.mn.oo.o.m mVar, ThirdPartySplashTUView thirdPartySplashTUView) {
            this.o = zArr;
            this.m = mVar;
            this.f41814n = thirdPartySplashTUView;
        }

        @Override // com.thinkup.core.common.n.m0, com.thinkup.core.common.n.nm
        public final void onAdClicked(View view) {
            if (this.m != null) {
                CloseShadeView closeShadeView = this.f41814n.getCloseShadeView();
                if (closeShadeView != null) {
                    String unused = m.o;
                    closeShadeView.isTouch();
                    if (closeShadeView.isTouch()) {
                        com.thinkup.core.common.mn.oo.o.m mVar = this.m;
                        if (mVar instanceof com.thinkup.core.common.mn.oo.o) {
                            ((com.thinkup.core.common.mn.oo.o) mVar).setClickType(com.thinkup.core.common.inner.mixad.om.m.m0);
                        }
                    }
                    closeShadeView.setVisibility(8);
                }
                this.m.onAdClicked(null);
            }
        }

        @Override // com.thinkup.core.common.n.m0, com.thinkup.core.common.n.nm
        public final void onAdImpressed() {
            boolean[] zArr = this.o;
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            com.thinkup.core.common.mn.oo.o.m mVar = this.m;
            if (mVar != null) {
                mVar.onAdImpressed();
            }
        }

        @Override // com.thinkup.core.common.n.m0, com.thinkup.core.common.n.nm
        public final void onAdVideoStart() {
        }

        @Override // com.thinkup.core.common.n.m0, com.thinkup.core.common.n.nm
        public final void onDeeplinkCallback(boolean z2) {
            com.thinkup.core.common.mn.oo.o.m mVar = this.m;
            if (mVar != null) {
                mVar.onDeeplinkCallback(z2);
            }
        }

        @Override // com.thinkup.core.common.n.m0, com.thinkup.core.common.n.nm
        public final void onDownloadConfirmCallback(Context context, View view, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
            com.thinkup.core.common.mn.oo.o.m mVar = this.m;
            if (mVar != null) {
                mVar.onDownloadConfirmCallback(context, view, tUNetworkConfirmInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.mixad.n.m$4, reason: invalid class name */
    public class AnonymousClass4 extends com.thinkup.core.common.inner.oo.n {
        final /* synthetic */ com.thinkup.core.common.mn.oo.o.m o;

        public AnonymousClass4(com.thinkup.core.common.mn.oo.o.m mVar) {
            this.o = mVar;
        }

        @Override // com.thinkup.core.common.inner.oo.n, com.thinkup.core.common.inner.oo.o
        public final void m() {
            com.thinkup.core.common.mn.oo.o.m mVar = this.o;
            if (mVar != null) {
                mVar.onClose();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.mixad.n.m$5, reason: invalid class name */
    public class AnonymousClass5 extends m0 {
        final /* synthetic */ com.thinkup.core.common.mn.oo.o.m m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ThirdPartyBannerTUView f41815n;
        final /* synthetic */ boolean[] o;

        public AnonymousClass5(boolean[] zArr, com.thinkup.core.common.mn.oo.o.m mVar, ThirdPartyBannerTUView thirdPartyBannerTUView) {
            this.o = zArr;
            this.m = mVar;
            this.f41815n = thirdPartyBannerTUView;
        }

        @Override // com.thinkup.core.common.n.m0, com.thinkup.core.common.n.nm
        public final void onAdClicked(View view) {
            com.thinkup.core.common.mn.oo.o.m mVar = this.m;
            if (mVar != null) {
                if (mVar instanceof com.thinkup.core.common.mn.oo.o) {
                    ((com.thinkup.core.common.mn.oo.o) mVar).setClickedArea(this.f41815n.getClickedArea());
                }
                this.m.onAdClicked(null);
            }
        }

        @Override // com.thinkup.core.common.n.m0, com.thinkup.core.common.n.nm
        public final void onAdDislikeButtonClick() {
            super.onAdDislikeButtonClick();
            com.thinkup.core.common.mn.oo.o.m mVar = this.m;
            if (mVar != null) {
                mVar.onClose();
            }
        }

        @Override // com.thinkup.core.common.n.m0, com.thinkup.core.common.n.nm
        public final void onAdImpressed() {
            boolean[] zArr = this.o;
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            com.thinkup.core.common.mn.oo.o.m mVar = this.m;
            if (mVar != null) {
                mVar.onAdImpressed();
            }
        }

        @Override // com.thinkup.core.common.n.m0, com.thinkup.core.common.n.nm
        public final void onDeeplinkCallback(boolean z2) {
            com.thinkup.core.common.mn.oo.o.m mVar = this.m;
            if (mVar != null) {
                mVar.onDeeplinkCallback(z2);
            }
        }

        @Override // com.thinkup.core.common.n.m0, com.thinkup.core.common.n.nm
        public final void onDownloadConfirmCallback(Context context, View view, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
            com.thinkup.core.common.mn.oo.o.m mVar = this.m;
            if (mVar != null) {
                mVar.onDownloadConfirmCallback(context, view, tUNetworkConfirmInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.mixad.n.m$6, reason: invalid class name */
    public class AnonymousClass6 implements BaseMediaTUView.o {
        final /* synthetic */ com.thinkup.core.common.mn.oo.o.m o;

        public AnonymousClass6(com.thinkup.core.common.mn.oo.o.m mVar) {
            this.o = mVar;
        }

        @Override // com.thinkup.core.common.inner.ui.BaseMediaTUView.o
        public final void o() {
            com.thinkup.core.common.mn.oo.o.m mVar = this.o;
            if (mVar != null) {
                mVar.onAdDislikeButtonClick();
            }
        }
    }

    public m(com.thinkup.core.common.inner.mixad.n.o.o oVar) {
        this.m = oVar;
    }

    private static TUNativeAdInfo o(TUNativeAdCustomRender tUNativeAdCustomRender, BaseAd baseAd) {
        n nVar = new n(baseAd);
        nVar.o(new o(baseAd));
        nVar.o(tUNativeAdCustomRender);
        return nVar;
    }

    private com.thinkup.core.common.mn.oo.o.n m(com.thinkup.core.common.inner.mixad.n.o.o oVar, BaseAd baseAd, Context context, oom oomVar, ooo<?> oooVar) {
        if (oVar == null) {
            return null;
        }
        ThirdPartyNativeTemplateView thirdPartyNativeTemplateView = new ThirdPartyNativeTemplateView(context, oooVar, oomVar, true, new AnonymousClass6(oVar.m0()), baseAd);
        thirdPartyNativeTemplateView.init(oVar.mn(), oVar.n0(), oomVar.oo0.mon());
        int mediaViewWidth = thirdPartyNativeTemplateView.getMediaViewWidth();
        int mediaViewHeight = thirdPartyNativeTemplateView.getMediaViewHeight();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        if (mediaViewWidth > 0) {
            layoutParams.width = mediaViewWidth;
        }
        if (mediaViewHeight > 0) {
            layoutParams.height = mediaViewHeight;
        }
        thirdPartyNativeTemplateView.setLayoutParams(layoutParams);
        return thirdPartyNativeTemplateView;
    }

    public m(com.thinkup.core.common.mn.o0.o oVar) {
        if (oVar == null) {
            return;
        }
        BaseAd baseAdM = oVar.m();
        if (baseAdM instanceof com.thinkup.core.common.mn.on.o0) {
            Context contextO = oVar.o();
            TUNativeAdCustomRender tUNativeAdCustomRenderN = oVar.n();
            com.thinkup.core.common.mn.on.o0 o0Var = (com.thinkup.core.common.mn.on.o0) baseAdM;
            com.thinkup.core.common.inner.mixad.oo.o oVar2 = new com.thinkup.core.common.inner.mixad.oo.o(o0Var);
            com.thinkup.core.common.inner.mixad.oo.m mVar = new com.thinkup.core.common.inner.mixad.oo.m(o0Var, oVar.on(), oVar.oo());
            com.thinkup.core.common.inner.mixad.n.o.o.C0658o c0658oO = new com.thinkup.core.common.inner.mixad.n.o.o.C0658o().o(contextO);
            n nVar = new n(baseAdM);
            nVar.o(new o(baseAdM));
            nVar.o(tUNativeAdCustomRenderN);
            this.m = c0658oO.o(nVar).o(oVar2).o(mVar).m(oVar.m0()).o(oVar.o0()).m(oVar.mm()).n(oVar.mn()).o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:84:0x014e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.thinkup.core.common.mn.oo.o.o
    public final com.thinkup.core.common.mn.oo.o.n o() {
        char c2;
        int i2;
        com.thinkup.core.common.inner.mixad.oo.n nVar;
        int iNn0;
        char c3;
        boolean zNmm;
        int iNmn;
        com.thinkup.core.common.mn.o oVarO;
        byte b2;
        byte b3;
        int iO;
        com.thinkup.core.common.inner.mixad.n.o.o oVar = this.m;
        if (oVar == null) {
            return null;
        }
        try {
            oom oomVarM = oVar.m();
            ooo<?> oooVarN = this.m.n();
            Context contextMm = this.m.mm();
            int iOm = this.m.om();
            String strOo = this.m.oo();
            if (contextMm == null || oomVarM == null || oooVarN == null) {
                return null;
            }
            if (contextMm instanceof Activity) {
                try {
                    contextMm = (Context) new WeakReference(contextMm).get();
                } catch (Throwable th) {
                    th = th;
                    i2 = -1;
                    c2 = 0;
                }
            }
            Context context = contextMm;
            oon oonVar = oomVarM.oo0;
            if (oonVar instanceof com.thinkup.core.common.inner.mixad.oo.n) {
                nVar = (com.thinkup.core.common.inner.mixad.oo.n) oonVar;
                zNmm = nVar.nmm();
                iNmn = nVar.nmn();
                iNn0 = nVar.nn0();
                c3 = 2;
            } else {
                nVar = null;
                iNn0 = 2;
                c3 = 2;
                zNmm = true;
                iNmn = 1;
            }
            int i3 = oomVarM.m;
            c2 = 0;
            try {
                on onVar = (on) this.m.o();
                int i4 = iNmn;
                BaseAd baseAdO = onVar.o();
                com.thinkup.core.common.inner.mixad.shake.o oVar2 = new com.thinkup.core.common.inner.mixad.shake.o(context, baseAdO, nVar);
                onVar.o(oVar2);
                TUNativeAdCustomRender tUNativeAdCustomRenderO0 = onVar.o0();
                if (tUNativeAdCustomRenderO0 != null && !zNmm) {
                    View viewMo = this.m.mo();
                    if (viewMo == null) {
                        viewMo = tUNativeAdCustomRenderO0.getMediationViewFromNativeAd(onVar, mn.o(baseAdO, onVar.m()));
                    }
                    if (viewMo != null) {
                        ThirdPartySelfRenderScreenTUView thirdPartySelfRenderScreenTUView = new ThirdPartySelfRenderScreenTUView(context, oomVarM, oooVarN, strOo, i3, iOm, baseAdO, viewMo, onVar.n());
                        if (String.valueOf(i3).equals("2") || String.valueOf(i3).equals("4")) {
                            thirdPartySelfRenderScreenTUView.setMixNativeAdEventListener(this.m.m0());
                            thirdPartySelfRenderScreenTUView.init();
                        }
                        return thirdPartySelfRenderScreenTUView;
                    }
                }
                String strValueOf = String.valueOf(i3);
                if (iNn0 == 1) {
                    switch (strValueOf.hashCode()) {
                        case 50:
                            if (!strValueOf.equals("2")) {
                                b3 = -1;
                            } else {
                                b3 = c3;
                            }
                            break;
                        case AD_REWARD_USER_VALUE:
                            if (!strValueOf.equals("3")) {
                                b3 = -1;
                            } else {
                                b3 = 0;
                            }
                            break;
                        case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                            if (!strValueOf.equals("4")) {
                                b3 = -1;
                            } else {
                                b3 = 1;
                            }
                            break;
                        default:
                            b3 = -1;
                            break;
                    }
                    if (b3 != 0 && b3 != 1) {
                        iO = b3 != c3 ? 0 : o00.o(context, 50.0f);
                    } else {
                        iO = o00.o(context, 148.0f);
                    }
                    oVarO = oVar2.o(iO, iO, null);
                } else {
                    oVarO = null;
                }
                switch (strValueOf.hashCode()) {
                    case 48:
                        if (!strValueOf.equals("0")) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    case 49:
                        if (!strValueOf.equals("1")) {
                            b2 = -1;
                        } else {
                            b2 = 4;
                        }
                        break;
                    case 50:
                        if (!strValueOf.equals("2")) {
                            b2 = -1;
                        } else {
                            b2 = c3;
                        }
                        break;
                    case AD_REWARD_USER_VALUE:
                        if (!strValueOf.equals("3")) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                        if (!strValueOf.equals("4")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    if (i4 == 1) {
                        try {
                            return new ThirdPartyFullScreenTUView(context, oomVarM, oooVarN, strOo, i3, iOm, baseAdO, oVarO);
                        } catch (Throwable th2) {
                            th = th2;
                            i3 = i3;
                            i2 = i3;
                            oo.m("createView error:".concat(String.valueOf(i2)), th.getMessage() + ", " + o00.o(th.getStackTrace()), o0n.m().o0m());
                            th.getStackTrace()[c2].toString();
                            return null;
                        }
                    }
                    return new ThirdPartyHalfScreenTUView(context, oomVarM, oooVarN, strOo, i3, iOm, baseAdO, oVarO);
                }
                int i5 = 1;
                try {
                    if (b2 == 1) {
                        com.thinkup.core.common.inner.mixad.n.o.o oVar3 = this.m;
                        if (oVar3 == null) {
                            return null;
                        }
                        com.thinkup.core.common.mn.oo.o.m mVarM0 = oVar3.m0();
                        ThirdPartySplashTUView thirdPartySplashTUView = new ThirdPartySplashTUView(context, oomVarM, oooVarN, new AnonymousClass2(mVarM0), "", baseAdO, oVarO);
                        baseAdO.setNativeEventListener(new AnonymousClass3(new boolean[]{false}, mVarM0, thirdPartySplashTUView));
                        thirdPartySplashTUView.setDontCountDown(oVar3.on());
                        return thirdPartySplashTUView;
                    }
                    if (b2 == c3) {
                        com.thinkup.core.common.inner.mixad.n.o.o oVar4 = this.m;
                        if (oVar4 == null) {
                            return null;
                        }
                        com.thinkup.core.common.mn.oo.o.m mVarM1 = oVar4.m0();
                        ThirdPartyBannerTUView thirdPartyBannerTUView = new ThirdPartyBannerTUView(context, baseAdO, oomVarM, oooVarN, new AnonymousClass4(mVarM1));
                        baseAdO.setNativeEventListener(new AnonymousClass5(new boolean[]{false}, mVarM1, thirdPartyBannerTUView));
                        return thirdPartyBannerTUView;
                    }
                    if (b2 != 3) {
                        if (b2 != 4) {
                            return null;
                        }
                        try {
                            return new ThirdPartyFullScreenTUView(context, oomVarM, oooVarN, strOo, i3, iOm, baseAdO, oVarO);
                        } catch (Throwable th3) {
                            th = th3;
                            i5 = i3;
                            i2 = i5;
                            oo.m("createView error:".concat(String.valueOf(i2)), th.getMessage() + ", " + o00.o(th.getStackTrace()), o0n.m().o0m());
                            th.getStackTrace()[c2].toString();
                            return null;
                        }
                    }
                    com.thinkup.core.common.inner.mixad.n.o.o oVar5 = this.m;
                    if (oVar5 == null) {
                        return null;
                    }
                    ThirdPartyNativeTemplateView thirdPartyNativeTemplateView = new ThirdPartyNativeTemplateView(context, oooVarN, oomVarM, true, new AnonymousClass6(oVar5.m0()), baseAdO);
                    thirdPartyNativeTemplateView.init(oVar5.mn(), oVar5.n0(), oomVarM.oo0.mon());
                    int mediaViewWidth = thirdPartyNativeTemplateView.getMediaViewWidth();
                    int mediaViewHeight = thirdPartyNativeTemplateView.getMediaViewHeight();
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                    if (mediaViewWidth > 0) {
                        layoutParams.width = mediaViewWidth;
                    }
                    if (mediaViewHeight > 0) {
                        layoutParams.height = mediaViewHeight;
                    }
                    thirdPartyNativeTemplateView.setLayoutParams(layoutParams);
                    return thirdPartyNativeTemplateView;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            c2 = 0;
            i2 = -1;
        }
        oo.m("createView error:".concat(String.valueOf(i2)), th.getMessage() + ", " + o00.o(th.getStackTrace()), o0n.m().o0m());
        th.getStackTrace()[c2].toString();
        return null;
    }

    @Override // com.thinkup.core.common.mn.oo.o.o
    public final void o(Activity activity, com.thinkup.core.basead.m.o oVar, com.thinkup.core.common.mn.oo.o.o.InterfaceC0666o interfaceC0666o) {
        com.thinkup.core.common.inner.mixad.n.o.o oVar2;
        View mediationViewFromNativeAd;
        if (activity == null || oVar == null || (oVar2 = this.m) == null) {
            return;
        }
        oVar.f41799n = oVar2.n();
        oVar.m0 = this.m.m();
        final String str = oVar.o0;
        final com.thinkup.core.common.mn.oo.o.m mVarM0 = this.m.m0();
        com.thinkup.core.common.inner.oo.m.o().o(str, new com.thinkup.core.common.inner.oo.m.AbstractC0660m() { // from class: com.thinkup.core.common.inner.mixad.n.m.1
            @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
            public final void m() {
                com.thinkup.core.common.mn.oo.o.m mVar = mVarM0;
                if (mVar != null) {
                    mVar.onAdVideoEnd();
                }
            }

            @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
            public final void n() {
            }

            @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
            public final void o(com.thinkup.core.common.inner.oo.oo ooVar) {
                com.thinkup.core.common.mn.oo.o.m mVar = mVarM0;
                if (mVar != null) {
                    mVar.onAdImpressed();
                }
            }

            @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
            public final void o0() {
                com.thinkup.core.common.inner.oo.m.o().m(str);
                com.thinkup.core.common.mn.oo.o.m mVar = mVarM0;
                if (mVar != null) {
                    mVar.onClose();
                }
            }

            @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
            public final void m(com.thinkup.core.common.inner.oo.oo ooVar) {
                com.thinkup.core.common.mn.oo.o.m mVar = mVarM0;
                if ((mVar instanceof com.thinkup.core.common.mn.oo.o) && ooVar != null) {
                    ((com.thinkup.core.common.mn.oo.o) mVar).setClickedArea(ooVar.m);
                    ((com.thinkup.core.common.mn.oo.o) mVarM0).setClickType(ooVar.o);
                }
                com.thinkup.core.common.mn.oo.o.m mVar2 = mVarM0;
                if (mVar2 != null) {
                    mVar2.onAdClicked(null);
                }
            }

            @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
            public final void o(com.thinkup.core.common.inner.m.o oVar3) {
                com.thinkup.core.common.mn.oo.o.m mVar = mVarM0;
                if (mVar != null) {
                    if (oVar3 != null) {
                        mVar.onVideoError(oVar3.o(), oVar3.m());
                    } else {
                        mVar.onVideoError("", "");
                    }
                }
            }

            @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
            public final void o() {
                com.thinkup.core.common.mn.oo.o.m mVar = mVarM0;
                if (mVar != null) {
                    mVar.onAdVideoStart();
                }
            }

            @Override // com.thinkup.core.common.inner.oo.m.AbstractC0660m
            public final void o(boolean z2) {
                com.thinkup.core.common.mn.oo.o.m mVar = mVarM0;
                if (mVar != null) {
                    mVar.onDeeplinkCallback(z2);
                }
            }
        });
        com.thinkup.core.common.inner.mixad.o.o().o(str, interfaceC0666o);
        com.thinkup.core.common.inner.mixad.o.o().o(str, this.m);
        com.thinkup.core.common.inner.mixad.n.o.o oVar3 = this.m;
        if (oVar3 != null) {
            oon oonVar = oVar3.m().oo0;
            if ((oonVar instanceof com.thinkup.core.common.inner.mixad.oo.n) && !((com.thinkup.core.common.inner.mixad.oo.n) oonVar).nmm()) {
                TUNativeAdInfo tUNativeAdInfoO = oVar3.o();
                if (tUNativeAdInfoO instanceof on) {
                    on onVar = (on) tUNativeAdInfoO;
                    BaseAd baseAdO = onVar.o();
                    TUNativeAdCustomRender tUNativeAdCustomRenderO0 = onVar.o0();
                    if (tUNativeAdCustomRenderO0 != null && (mediationViewFromNativeAd = tUNativeAdCustomRenderO0.getMediationViewFromNativeAd(tUNativeAdInfoO, mn.o(baseAdO, onVar.m()))) != null) {
                        oVar3.o(mediationViewFromNativeAd);
                        oVar.mm = true;
                    }
                }
            }
        }
        BaseATActivity.o(activity, oVar);
    }

    private static int o(Context context, String str) {
        str.getClass();
        switch (str) {
            case "2":
                return o00.o(context, 50.0f);
            case "3":
            case "4":
                return o00.o(context, 148.0f);
            default:
                return 0;
        }
    }

    private com.thinkup.core.common.mn.oo.o.n o(com.thinkup.core.common.inner.mixad.n.o.o oVar, BaseAd baseAd, Context context, oom oomVar, ooo oooVar, com.thinkup.core.common.mn.o oVar2) {
        if (oVar == null) {
            return null;
        }
        com.thinkup.core.common.mn.oo.o.m mVarM0 = oVar.m0();
        ThirdPartySplashTUView thirdPartySplashTUView = new ThirdPartySplashTUView(context, oomVar, oooVar, new AnonymousClass2(mVarM0), "", baseAd, oVar2);
        baseAd.setNativeEventListener(new AnonymousClass3(new boolean[]{false}, mVarM0, thirdPartySplashTUView));
        thirdPartySplashTUView.setDontCountDown(oVar.on());
        return thirdPartySplashTUView;
    }

    private com.thinkup.core.common.mn.oo.o.n o(com.thinkup.core.common.inner.mixad.n.o.o oVar, BaseAd baseAd, Context context, oom oomVar, ooo<?> oooVar) {
        if (oVar == null) {
            return null;
        }
        com.thinkup.core.common.mn.oo.o.m mVarM0 = oVar.m0();
        ThirdPartyBannerTUView thirdPartyBannerTUView = new ThirdPartyBannerTUView(context, baseAd, oomVar, oooVar, new AnonymousClass4(mVarM0));
        baseAd.setNativeEventListener(new AnonymousClass5(new boolean[]{false}, mVarM0, thirdPartyBannerTUView));
        return thirdPartyBannerTUView;
    }

    private static boolean o(com.thinkup.core.common.inner.mixad.n.o.o oVar) {
        View mediationViewFromNativeAd;
        if (oVar == null) {
            return false;
        }
        oon oonVar = oVar.m().oo0;
        if ((oonVar instanceof com.thinkup.core.common.inner.mixad.oo.n) && !((com.thinkup.core.common.inner.mixad.oo.n) oonVar).nmm()) {
            TUNativeAdInfo tUNativeAdInfoO = oVar.o();
            if (tUNativeAdInfoO instanceof on) {
                on onVar = (on) tUNativeAdInfoO;
                BaseAd baseAdO = onVar.o();
                TUNativeAdCustomRender tUNativeAdCustomRenderO0 = onVar.o0();
                if (tUNativeAdCustomRenderO0 != null && (mediationViewFromNativeAd = tUNativeAdCustomRenderO0.getMediationViewFromNativeAd(tUNativeAdInfoO, mn.o(baseAdO, onVar.m()))) != null) {
                    oVar.o(mediationViewFromNativeAd);
                    return true;
                }
            }
        }
        return false;
    }
}

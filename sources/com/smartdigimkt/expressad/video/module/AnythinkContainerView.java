package com.smartdigimkt.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.impl.Z;
import com.smartdigimkt.expressad.video.dynview.widget.AnyThinkOrderCampView;
import com.smartdigimkt.u2.g;
import com.smartdigimkt.u2.i;
import com.smartdigimkt.u2.k;
import com.smartdigimkt.u2.l;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.v0.z;
import com.smartdigimkt.x2.e;
import com.smartdigimkt.x2.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkContainerView extends AnythinkBaseView implements e, h {
    private AnythinkAlertWebview A0;
    private String B0;
    private int C0;
    private int D0;
    private int E0;
    private int F0;
    private boolean G0;
    private boolean H0;
    private boolean I0;
    private boolean J0;
    private boolean K0;
    private boolean L0;
    private int M0;
    private boolean N0;
    private boolean O0;
    private int P0;
    private int Q0;
    private int R0;
    private int S0;
    private int T0;
    private String U0;
    private com.smartdigimkt.y2.b V0;
    private AnyThinkOrderCampView W0;
    private boolean X0;
    private boolean Y0;
    private List<com.smartdigimkt.x.d> Z0;
    private AnythinkPlayableView s0;
    private AnythinkClickCTAView t0;
    private AnythinkClickMiniCardView u0;
    private AnythinkNativeEndCardView v0;
    private AnythinkH5EndCardView w0;
    private AnythinkVideoEndCoverView x0;
    private AnythinkVastEndCardView y0;
    private AnythinkLandingPageView z0;

    public class a implements Runnable {
        final /* synthetic */ com.smartdigimkt.y2.b X;

        public a(com.smartdigimkt.y2.b bVar) {
            this.X = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
            anythinkContainerView.a(this.X, Integer.valueOf(anythinkContainerView.f0.v2()));
        }
    }

    public class b implements Runnable {
        final /* synthetic */ com.smartdigimkt.y2.b X;

        public b(com.smartdigimkt.y2.b bVar) {
            this.X = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
            anythinkContainerView.a(this.X, Integer.valueOf(anythinkContainerView.f0.v2()));
        }
    }

    public class c implements com.smartdigimkt.i2.b {
        public c() {
        }

        @Override // com.smartdigimkt.i2.b
        public void a() {
            com.smartdigimkt.t2.a aVar = AnythinkContainerView.this.i0;
            if (aVar != null) {
                aVar.a(117, "");
            }
        }

        @Override // com.smartdigimkt.i2.b
        public void b() {
            if (AnythinkContainerView.this.f0.R() == 2) {
                AnythinkContainerView.this.showVideoEndCover();
            } else {
                AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                anythinkContainerView.showEndcard(anythinkContainerView.f0.v2());
            }
        }
    }

    public class d extends i {
        public d(com.smartdigimkt.t2.a aVar) {
            super(aVar);
        }

        @Override // com.smartdigimkt.u2.i, com.smartdigimkt.u2.f, com.smartdigimkt.t2.a
        public void a(int i2, Object obj) {
            super.a(i2, obj);
            if (i2 == 100) {
                AnythinkContainerView.this.webviewshow();
                AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                anythinkContainerView.onConfigurationChanged(anythinkContainerView.getResources().getConfiguration());
            }
        }
    }

    public AnythinkContainerView(Context context) {
        super(context);
        this.D0 = 1;
        this.E0 = 1;
        this.F0 = 1;
        this.G0 = false;
        this.H0 = false;
        this.I0 = false;
        this.J0 = false;
        this.K0 = true;
        this.L0 = false;
        this.N0 = false;
        this.O0 = false;
        this.X0 = false;
        this.Y0 = false;
        this.Z0 = new ArrayList();
    }

    private void b(com.smartdigimkt.y2.b bVar) {
        this.V0 = bVar;
        if (this.x0 == null) {
            AnythinkVideoEndCoverView anythinkVideoEndCoverView = new AnythinkVideoEndCoverView(this.e0);
            this.x0 = anythinkVideoEndCoverView;
            anythinkVideoEndCoverView.setCampaign(this.f0);
            this.x0.setNotifyListener(new i(this.i0));
            this.x0.preLoadData(bVar);
        }
    }

    private void d() {
        if (this.A0 == null) {
            q();
        }
        AnythinkAlertWebview anythinkAlertWebview = this.A0;
        if (anythinkAlertWebview != null && anythinkAlertWebview.getParent() != null) {
            removeView(this.A0);
        }
        addView(this.A0);
    }

    private void e() {
        if (this.t0 == null) {
            b(-1);
        }
        if (this.t0 != null) {
            com.smartdigimkt.x.d dVar = this.f0;
            if (dVar == null || !dVar.H2()) {
                addView(this.t0, 0, Z.g(-2, -2, 12, -1));
            }
        }
    }

    private void f() {
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar != null) {
            boolean zH2 = dVar.H2();
            boolean zH = v.h(this.f0.B2());
            if (zH2 && !zH) {
                j();
                return;
            }
        }
        if (this.D0 != 2 || this.N0) {
            j();
        } else {
            g();
        }
    }

    private void g() {
        if (this.w0 == null) {
            a(this.V0, (Integer) 2);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.w0;
        if (anythinkH5EndCardView == null || !anythinkH5EndCardView.isLoadSuccess()) {
            j();
            AnythinkH5EndCardView anythinkH5EndCardView2 = this.w0;
            if (anythinkH5EndCardView2 != null) {
                anythinkH5EndCardView2.reportRenderResult("timeout", 3);
                this.w0.setError(true);
            }
        } else {
            this.N0 = true;
            addView(this.w0);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.w0.excuteTask();
            this.w0.setNotchValue(this.U0, this.P0, this.Q0, this.R0, this.S0);
        }
        AnythinkH5EndCardView anythinkH5EndCardView3 = this.w0;
        if (anythinkH5EndCardView3 != null) {
            anythinkH5EndCardView3.setUnitId(this.B0);
        }
    }

    private void h() {
        if (this.z0 == null) {
            a(this.V0, (Integer) 4);
        }
        this.z0.setUnitId(this.B0);
        this.z0.preLoadData(this.V0);
        addView(this.z0);
    }

    private void i() {
        if (this.u0 == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParamsG = Z.g(-1, -1, 13, -1);
        if (this.I0 && this.K0) {
            this.K0 = false;
            layoutParamsG.width = 1;
            layoutParamsG.height = 1;
        }
        addView(this.u0, layoutParamsG);
    }

    private void j() {
        this.D0 = 1;
        if (this.v0 == null) {
            a(this.V0, (Integer) 2);
        }
        addView(this.v0);
        onConfigurationChanged(getResources().getConfiguration());
        this.v0.notifyShowListener();
        this.Y0 = true;
        bringToFront();
    }

    private void k() {
        if (this.s0 == null) {
            preLoadData(this.V0);
        }
        addView(this.s0);
        AnythinkPlayableView anythinkPlayableView = this.s0;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.setUnitId(this.B0);
            com.smartdigimkt.x.d dVar = this.f0;
            if (dVar != null && dVar.K2() && this.f0.B1() == 2) {
                this.s0.setCloseVisible(0);
            }
            this.s0.setNotchValue(this.U0, this.P0, this.Q0, this.R0, this.S0);
        }
    }

    private void l() {
        if (this.y0 == null) {
            a(this.V0, (Integer) 3);
        }
        addView(this.y0, Z.g(-1, -1, 13, -1));
        this.y0.notifyShowListener();
    }

    private void m() {
        if (this.x0 == null) {
            b(this.V0);
        }
        addView(this.x0);
        onConfigurationChanged(getResources().getConfiguration());
        this.Y0 = true;
        bringToFront();
    }

    private boolean n() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1;
    }

    private void o() {
        this.H0 = false;
        this.Y0 = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof AnythinkContainerView) {
                    i2++;
                } else {
                    viewGroup.bringChildToFront(childAt);
                }
            }
        }
    }

    private void p() {
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null) {
            return;
        }
        String strB2 = dVar.B2();
        int i2 = 404;
        if (!TextUtils.isEmpty(strB2)) {
            try {
                i2 = Integer.parseInt(z.a(strB2, "ecid"));
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        this.v0 = new AnythinkNativeEndCardView(this.e0, null, true, i2, this.f0.R() == 2, this.p0, this.f0.l1());
        if (this.f0.t0() != 5) {
            this.v0.setCampaign(this.f0);
            return;
        }
        com.smartdigimkt.t2.a aVar = this.i0;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f0);
        }
        this.v0.setCampaign(this.f0);
    }

    private void q() {
        if (this.A0 == null) {
            AnythinkAlertWebview anythinkAlertWebview = new AnythinkAlertWebview(this.e0);
            this.A0 = anythinkAlertWebview;
            anythinkAlertWebview.setUnitId(this.B0);
            this.A0.setCampaign(this.f0);
        }
        this.A0.preLoadData(this.V0);
    }

    private void r() {
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    public void addOrderViewData(List<com.smartdigimkt.x.d> list) {
        if (list == null) {
            return;
        }
        this.Z0 = list;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view != null) {
            a(view);
            super.addView(view);
        }
    }

    public boolean canBackPress() {
        if (this.v0 != null) {
            return false;
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.w0;
        if (anythinkH5EndCardView != null) {
            return anythinkH5EndCardView.canBackPress();
        }
        AnythinkLandingPageView anythinkLandingPageView = this.z0;
        if (anythinkLandingPageView != null) {
            return anythinkLandingPageView.canBackPress();
        }
        AnythinkPlayableView anythinkPlayableView = this.s0;
        if (anythinkPlayableView != null) {
            return anythinkPlayableView.canBackPress();
        }
        return false;
    }

    @Override // com.smartdigimkt.x2.e
    public void configurationChanged(int i2, int i3, int i4) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.u0;
        if (anythinkClickMiniCardView == null || anythinkClickMiniCardView.getVisibility() != 0) {
            return;
        }
        this.u0.resizeMiniCard(i2, i3);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.smartdigimkt.x2.e
    public boolean endCardShowing() {
        return this.G0;
    }

    public boolean endcardIsPlayable() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.w0;
        return anythinkH5EndCardView != null && anythinkH5EndCardView.isPlayable();
    }

    public AnythinkH5EndCardView getH5EndCardView() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.w0;
        return anythinkH5EndCardView == null ? this.s0 : anythinkH5EndCardView;
    }

    public com.smartdigimkt.x.d getReSetCampaign() {
        if (!this.f0.H2() || !TextUtils.isEmpty(this.f0.B2())) {
            return null;
        }
        int size = this.Z0.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (this.Z0.get(i3) != null && this.Z0.get(i3).j() == this.f0.j()) {
                i2 = i3 - 1;
                break;
            }
        }
        if (i2 < 0 || i2 >= size || this.Z0.get(i2) == null) {
            return null;
        }
        return this.Z0.get(i2);
    }

    public boolean getShowingTransparent() {
        return this.I0;
    }

    public String getUnitID() {
        return this.B0;
    }

    public int getVideoInteractiveType() {
        return this.C0;
    }

    public int getVideoSkipTime() {
        return this.M0;
    }

    @Override // com.smartdigimkt.x2.e, com.smartdigimkt.x2.h
    public void handlerPlayableException(String str) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.w0;
        if (anythinkH5EndCardView == null) {
            f();
            return;
        }
        anythinkH5EndCardView.handlerPlayableException(str);
        if (this.N0) {
            f();
        }
    }

    @Override // com.smartdigimkt.x2.e
    public void hideAlertWebview() {
        if (isLast()) {
            return;
        }
        if (this.X0 && !this.Y0) {
            o();
            this.X0 = false;
        }
        AnythinkAlertWebview anythinkAlertWebview = this.A0;
        if (anythinkAlertWebview == null || anythinkAlertWebview.getParent() == null) {
            return;
        }
        removeView(this.A0);
        AnythinkClickCTAView anythinkClickCTAView = this.t0;
        if (anythinkClickCTAView == null || anythinkClickCTAView.getParent() == null) {
            return;
        }
        r();
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    @Override // com.smartdigimkt.x2.h
    public void install(com.smartdigimkt.x.d dVar) {
        this.i0.a(105, dVar);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup != null && viewGroup.indexOfChild(this) == 0;
    }

    @Override // com.smartdigimkt.x2.e
    public void ivRewardAdsWithoutVideo(String str) {
        this.i0.a(103, str);
    }

    @Override // com.smartdigimkt.x2.e
    public boolean miniCardLoaded() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.u0;
        return anythinkClickMiniCardView != null && anythinkClickMiniCardView.isLoadSuccess();
    }

    @Override // com.smartdigimkt.x2.e
    public boolean miniCardShowing() {
        return this.H0;
    }

    @Override // com.smartdigimkt.x2.h
    public void notifyCloseBtn(int i2) {
        AnythinkPlayableView anythinkPlayableView = this.s0;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.notifyCloseBtn(i2);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.w0;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.notifyCloseBtn(i2);
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(configuration, this.s0, this.t0, this.u0, this.v0, this.w0, this.y0, this.z0, this.x0);
    }

    public void onEndcardBackPress() {
        if (this.v0 != null || this.y0 != null) {
            this.i0.a(104, "");
            return;
        }
        if (this.z0 != null) {
            this.i0.a(103, "");
            return;
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.w0;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.onBackPress();
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.H0) {
            this.i0.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        AnythinkPlayableView anythinkPlayableView = this.s0;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.onBackPress();
        }
    }

    @Override // com.smartdigimkt.x2.h
    public void orientation(Configuration configuration) {
        a(this.s0, this.u0, this.w0, this.A0);
    }

    @Override // com.smartdigimkt.x2.f
    public void preLoadData(com.smartdigimkt.y2.b bVar) {
        this.V0 = bVar;
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar != null) {
            if (dVar.B1() == 2) {
                a(bVar);
            } else {
                b(this.C0);
                if (this.f0.H2()) {
                    try {
                        a(bVar, Integer.valueOf(this.f0.v2()));
                    } catch (Throwable th) {
                        th.getMessage();
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new a(bVar));
                    }
                    v.h(this.f0.B2());
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new b(bVar), getVideoSkipTime());
                }
            }
            q();
        }
    }

    @Override // com.smartdigimkt.x2.e, com.smartdigimkt.x2.h
    public void readyStatus(int i2) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.w0;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.readyStatus(i2);
        }
    }

    public void release() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.w0;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.release();
            this.w0 = null;
        }
        AnythinkPlayableView anythinkPlayableView = this.s0;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.release();
        }
        AnythinkLandingPageView anythinkLandingPageView = this.z0;
        if (anythinkLandingPageView != null) {
            anythinkLandingPageView.release();
        }
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.v0;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.clearMoreOfferBitmap();
            this.v0.release();
        }
        if (this.i0 != null) {
            this.i0 = null;
        }
    }

    @Override // com.smartdigimkt.x2.e
    public void resizeMiniCard(int i2, int i3, int i4) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.u0;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.resizeMiniCard(i2, i3);
            this.u0.setRadius(i4);
            removeAllViews();
            setMatchParent();
            this.Y0 = true;
            bringToFront();
            i();
        }
    }

    public void setAnythinkClickMiniCardViewTransparent() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.u0;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setAnythinkClickMiniCardViewTransparent();
            this.u0.setAnythinkClickMiniCardViewClickable(false);
        }
    }

    public void setCloseDelayTime(int i2) {
        this.E0 = i2;
    }

    public void setEndscreenType(int i2) {
        this.D0 = i2;
    }

    public void setJSFactory(com.smartdigimkt.y2.b bVar) {
        this.V0 = bVar;
    }

    public void setNotchPadding(int i2, int i3, int i4, int i5, int i6) {
        String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i2));
        this.T0 = i2;
        this.P0 = i3;
        this.Q0 = i4;
        this.R0 = i5;
        this.S0 = i6;
        this.U0 = com.smartdigimkt.v0.i.a(i2, i3, i4, i5, i6);
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.v0;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setNotchPadding(i3, i4, i5, i6);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.w0;
        if (anythinkH5EndCardView != null && anythinkH5EndCardView.v0 != null) {
            anythinkH5EndCardView.setNotchValue(this.U0, i3, i4, i5, i6);
            com.smartdigimkt.n.h.a().a((WebView) this.w0.v0, "oncutoutfetched", Base64.encodeToString(this.U0.getBytes(), 0));
        }
        AnythinkPlayableView anythinkPlayableView = this.s0;
        if (anythinkPlayableView != null && anythinkPlayableView.v0 != null) {
            anythinkPlayableView.setNotchValue(this.U0, i3, i4, i5, i6);
            com.smartdigimkt.n.h.a().a((WebView) this.s0.v0, "oncutoutfetched", Base64.encodeToString(this.U0.getBytes(), 0));
        }
        AnyThinkOrderCampView anyThinkOrderCampView = this.W0;
        if (anyThinkOrderCampView != null) {
            anyThinkOrderCampView.setNotchPadding(i3, i4, i5, i6);
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void setNotifyListener(com.smartdigimkt.t2.a aVar) {
        super.setNotifyListener(aVar);
        a(aVar, this.s0, this.t0, this.u0, this.v0, this.w0, this.y0, this.z0, this.x0);
    }

    public void setOnPause() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.v0;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.v0;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i2) {
        this.F0 = i2;
    }

    public void setRewardStatus(boolean z2) {
        this.O0 = z2;
    }

    public void setShowingTransparent(boolean z2) {
        this.I0 = z2;
    }

    public void setUnitID(String str) {
        this.B0 = str;
    }

    public void setVideoInteractiveType(int i2) {
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null || !dVar.H2()) {
            this.C0 = i2;
            return;
        }
        int iB = com.smartdigimkt.m2.c.b(this.f0);
        if (iB == 100) {
            this.C0 = i2;
        } else {
            this.C0 = iB;
        }
    }

    public void setVideoSkipTime(int i2) {
        this.M0 = i2;
    }

    @Override // com.smartdigimkt.x2.e
    public boolean showAlertWebView() {
        AnythinkAlertWebview anythinkAlertWebview = this.A0;
        if (anythinkAlertWebview == null || !anythinkAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        if (!n() && !this.Y0) {
            removeAllViews();
            bringToFront();
            this.X0 = true;
        }
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.u0;
        if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.getParent() != null) {
            return false;
        }
        d();
        setBackgroundColor(0);
        this.A0.webviewshow();
        return true;
    }

    @Override // com.smartdigimkt.x2.e
    public void showEndcard(int i2) {
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar != null) {
            if (i2 == 1) {
                com.smartdigimkt.t2.a aVar = this.i0;
                if (aVar != null) {
                    aVar.a(104, "");
                }
            } else if (i2 == 100) {
                if (dVar.B1() == 2) {
                    this.J0 = true;
                }
                a(this.s0);
                setMatchParent();
                j();
            } else if (i2 == 3) {
                removeAllViews();
                setMatchParent();
                l();
                this.Y0 = true;
                bringToFront();
            } else if (i2 == 4) {
                com.smartdigimkt.t2.a aVar2 = this.i0;
                if (aVar2 != null) {
                    aVar2.a(113, "");
                }
                removeAllViews();
                setMatchParent();
                h();
                this.Y0 = true;
                bringToFront();
            } else if (i2 != 5) {
                removeAllViews();
                setMatchParent();
                this.Y0 = true;
                bringToFront();
                f();
                com.smartdigimkt.t2.a aVar3 = this.i0;
                if (aVar3 != null) {
                    aVar3.a(117, "");
                }
            } else {
                com.smartdigimkt.t2.a aVar4 = this.i0;
                if (aVar4 != null) {
                    aVar4.a(106, "");
                }
            }
        }
        this.G0 = true;
    }

    @Override // com.smartdigimkt.x2.e
    public void showMiniCard(int i2, int i3, int i4, int i5, int i6) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.u0;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setMiniCardLocation(i2, i3, i4, i5);
            this.u0.setRadius(i6);
            this.u0.setCloseVisible(8);
            this.u0.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.Y0 = true;
            bringToFront();
            i();
            if (this.L0) {
                return;
            }
            this.L0 = true;
            this.i0.a(109, "");
            this.i0.a(117, "");
        }
    }

    public void showOrderCampView() {
        AnyThinkOrderCampView anyThinkOrderCampView = new AnyThinkOrderCampView(this.e0);
        this.W0 = anyThinkOrderCampView;
        anyThinkOrderCampView.setCampaignExes(this.Z0);
        com.smartdigimkt.t2.a aVar = this.i0;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.Z0);
        }
        this.W0.setNotifyListener(new i(this.i0));
        this.W0.setRewarded(this.O0);
        this.W0.setNotchPadding(this.P0, this.Q0, this.R0, this.S0);
        this.W0.setCampOrderViewBuildCallback(new c());
        this.W0.createView(this);
    }

    @Override // com.smartdigimkt.x2.e
    public void showPlayableView() {
        if (this.f0 == null || this.J0) {
            return;
        }
        removeAllViews();
        setMatchParent();
        k();
        this.Y0 = true;
        bringToFront();
    }

    @Override // com.smartdigimkt.x2.e
    public void showVideoClickView(int i2) {
        if (this.f0 != null) {
            if (i2 == -1) {
                if (isLast() || endCardShowing()) {
                    return;
                }
                o();
                return;
            }
            if (i2 == 1) {
                if (this.G0) {
                    return;
                }
                AnythinkH5EndCardView anythinkH5EndCardView = this.w0;
                if (anythinkH5EndCardView != null && anythinkH5EndCardView.getParent() != null) {
                    removeView(this.w0);
                }
                AnythinkClickMiniCardView anythinkClickMiniCardView = this.u0;
                if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.getParent() != null) {
                    removeView(this.u0);
                }
                AnythinkClickCTAView anythinkClickCTAView = this.t0;
                if (anythinkClickCTAView == null || anythinkClickCTAView.getParent() == null) {
                    try {
                        com.smartdigimkt.x.d dVar = this.f0;
                        if (dVar != null && dVar.B1() == 1) {
                            this.Y0 = true;
                            e();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (i2 != 2) {
                return;
            }
            AnythinkClickCTAView anythinkClickCTAView2 = this.t0;
            if (anythinkClickCTAView2 != null && anythinkClickCTAView2.getParent() != null) {
                removeView(this.t0);
            }
            AnythinkAlertWebview anythinkAlertWebview = this.A0;
            if (anythinkAlertWebview == null || anythinkAlertWebview.getParent() == null) {
                AnythinkClickMiniCardView anythinkClickMiniCardView2 = this.u0;
                if (anythinkClickMiniCardView2 == null || anythinkClickMiniCardView2.getParent() == null) {
                    try {
                        com.smartdigimkt.x.d dVar2 = this.f0;
                        if (dVar2 != null && dVar2.B1() == 1) {
                            setMatchParent();
                            i();
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                if (!miniCardLoaded()) {
                    o();
                    return;
                }
                AnythinkH5EndCardView anythinkH5EndCardView2 = this.w0;
                if (anythinkH5EndCardView2 != null && anythinkH5EndCardView2.getParent() != null) {
                    removeView(this.w0);
                }
                com.smartdigimkt.t2.a aVar = this.i0;
                if (aVar != null) {
                    aVar.a(112, "");
                }
                com.smartdigimkt.x.d dVar3 = this.f0;
                if (dVar3 != null && !dVar3.J2()) {
                    this.f0.i(true);
                    com.smartdigimkt.v2.a.f(this.e0, this.f0);
                }
                if (this.I0) {
                    com.smartdigimkt.t2.a aVar2 = this.i0;
                    if (aVar2 != null) {
                        aVar2.a(115, "");
                    }
                } else {
                    this.Y0 = true;
                    bringToFront();
                    webviewshow();
                    onConfigurationChanged(getResources().getConfiguration());
                }
                this.H0 = true;
            }
        }
    }

    @Override // com.smartdigimkt.x2.e
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        m();
    }

    @Override // com.smartdigimkt.x2.h
    public void toggleCloseBtn(int i2) {
        AnythinkPlayableView anythinkPlayableView = this.s0;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.toggleCloseBtn(i2);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.w0;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.toggleCloseBtn(i2);
        }
    }

    public void triggerCloseBtn(String str) {
        com.smartdigimkt.t2.a aVar;
        if (this.f0 == null || (aVar = this.i0) == null) {
            return;
        }
        aVar.a(122, "");
        this.i0.a(104, "");
    }

    @Override // com.smartdigimkt.x2.h
    public void webviewshow() {
        b(this.s0, this.u0, this.w0, this.A0);
    }

    private void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super.addView(view, layoutParams);
        }
    }

    private void a(com.smartdigimkt.y2.b bVar) {
        if (this.s0 == null) {
            this.s0 = new AnythinkPlayableView(this.e0);
        }
        this.s0.setCloseDelayShowTime(this.E0);
        this.s0.setPlayCloseBtnTm(this.F0);
        this.s0.setCampaign(this.f0);
        this.s0.setNotifyListener(new d(this.i0));
        this.s0.preLoadData(bVar);
    }

    private void b(int i2) {
        if (i2 != -3) {
            if (i2 != -2) {
                if (this.t0 == null) {
                    AnythinkClickCTAView anythinkClickCTAView = new AnythinkClickCTAView(this.e0);
                    this.t0 = anythinkClickCTAView;
                    anythinkClickCTAView.setCampaign(this.f0);
                    this.t0.setUnitId(this.B0);
                    this.t0.setNotifyListener(new i(this.i0));
                    this.t0.preLoadData(this.V0);
                    return;
                }
                return;
            }
            com.smartdigimkt.x.d dVar = this.f0;
            if (dVar == null || dVar.v2() != 2) {
                return;
            }
            if (this.u0 == null) {
                this.u0 = new AnythinkClickMiniCardView(this.e0);
            }
            this.u0.setCampaign(this.f0);
            AnythinkClickMiniCardView anythinkClickMiniCardView = this.u0;
            anythinkClickMiniCardView.setNotifyListener(new g(anythinkClickMiniCardView, this.i0));
            this.u0.preLoadData(this.V0);
            setMatchParent();
            i();
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.y2.b bVar, Integer num) {
        com.smartdigimkt.t2.a aVar;
        com.smartdigimkt.x.d dVar;
        this.V0 = bVar;
        com.smartdigimkt.x.d dVar2 = this.f0;
        if (dVar2 != null) {
            if (num == null) {
                num = Integer.valueOf(dVar2.v2());
            }
            if (!isLast()) {
                o();
            }
            int iIntValue = num.intValue();
            if (iIntValue != 1) {
                if (iIntValue == 3) {
                    if (this.y0 == null) {
                        this.y0 = new AnythinkVastEndCardView(this.e0);
                    }
                    this.y0.setCampaign(this.f0);
                    this.y0.setNotifyListener(new l(this.i0));
                    this.y0.preLoadData(bVar);
                    return;
                }
                if (iIntValue == 4) {
                    if (this.z0 == null) {
                        this.z0 = new AnythinkLandingPageView(this.e0);
                    }
                    this.z0.setCampaign(this.f0);
                    this.z0.setNotifyListener(new i(this.i0));
                    return;
                }
                if (iIntValue != 5) {
                    if (this.D0 == 2) {
                        boolean zH2 = this.f0.H2();
                        boolean zH = v.h(this.f0.B2());
                        if ((!zH2 || zH || (dVar = this.f0) == null || dVar.K2()) && this.f0.R() != 2) {
                            if (this.w0 == null) {
                                this.w0 = new AnythinkH5EndCardView(this.e0);
                            }
                            if (this.f0.t0() == 5 && (aVar = this.i0) != null && (aVar instanceof k)) {
                                ((k) aVar).a(this.f0);
                            }
                            this.w0.setCampaign(this.f0);
                            this.w0.setCloseDelayShowTime(this.E0);
                            this.w0.setNotifyListener(new i(this.i0));
                            this.w0.setUnitId(this.B0);
                            this.w0.setNotchValue(this.U0, this.P0, this.Q0, this.R0, this.S0);
                            this.w0.preLoadData(bVar);
                            if (this.I0) {
                                return;
                            }
                            addView(this.w0);
                            return;
                        }
                        return;
                    }
                    com.smartdigimkt.x.d dVar3 = this.f0;
                    int iC = (dVar3 == null || dVar3.U1() == null) ? 0 : this.f0.U1().c();
                    AnythinkNativeEndCardView anythinkNativeEndCardView = this.v0;
                    if (anythinkNativeEndCardView == null && anythinkNativeEndCardView == null) {
                        if (this.f0.H2()) {
                            p();
                        } else {
                            AnythinkNativeEndCardView anythinkNativeEndCardView2 = new AnythinkNativeEndCardView(this.e0, null, false, -1, this.f0.R() == 2, iC, this.f0.l1());
                            this.v0 = anythinkNativeEndCardView2;
                            anythinkNativeEndCardView2.setCampaign(this.f0);
                        }
                    }
                    this.v0.setLayout();
                    this.v0.setCampaign(this.f0);
                    this.v0.setUnitId(this.B0);
                    this.v0.setCloseBtnDelay(this.E0);
                    this.v0.setNotifyListener(new i(this.i0));
                    this.v0.preLoadData(bVar);
                    this.v0.setNotchPadding(this.P0, this.Q0, this.R0, this.S0);
                }
            }
        }
    }

    public AnythinkContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D0 = 1;
        this.E0 = 1;
        this.F0 = 1;
        this.G0 = false;
        this.H0 = false;
        this.I0 = false;
        this.J0 = false;
        this.K0 = true;
        this.L0 = false;
        this.N0 = false;
        this.O0 = false;
        this.X0 = false;
        this.Y0 = false;
        this.Z0 = new ArrayList();
    }

    private void b(AnythinkH5EndCardView... anythinkH5EndCardViewArr) {
        for (AnythinkH5EndCardView anythinkH5EndCardView : anythinkH5EndCardViewArr) {
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0 && anythinkH5EndCardView.getParent() != null && !isLast()) {
                anythinkH5EndCardView.webviewshow();
            }
        }
    }

    private void a(com.smartdigimkt.t2.a aVar, AnythinkBaseView... anythinkBaseViewArr) {
        for (AnythinkBaseView anythinkBaseView : anythinkBaseViewArr) {
            if (anythinkBaseView != null) {
                if (anythinkBaseView instanceof AnythinkClickMiniCardView) {
                    anythinkBaseView.setNotifyListener(new g(this.u0, aVar));
                } else {
                    anythinkBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    private void a(Configuration configuration, AnythinkBaseView... anythinkBaseViewArr) {
        for (AnythinkBaseView anythinkBaseView : anythinkBaseViewArr) {
            if (anythinkBaseView != null && (anythinkBaseView instanceof AnythinkClickMiniCardView)) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            } else if (anythinkBaseView != null && anythinkBaseView.getVisibility() == 0 && anythinkBaseView.getParent() != null && !isLast()) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    private void a(AnythinkH5EndCardView... anythinkH5EndCardViewArr) {
        for (AnythinkH5EndCardView anythinkH5EndCardView : anythinkH5EndCardViewArr) {
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0) {
                anythinkH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }
}

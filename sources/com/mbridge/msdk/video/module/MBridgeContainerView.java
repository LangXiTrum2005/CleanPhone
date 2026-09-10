package com.mbridge.msdk.video.module;

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
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.g;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView;
import com.mbridge.msdk.video.module.listener.impl.i;
import com.mbridge.msdk.video.module.listener.impl.k;
import com.mbridge.msdk.video.module.listener.impl.l;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MBridgeContainerView extends MBridgeBaseView implements f, h {
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private boolean I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private String P;
    private com.mbridge.msdk.video.signal.factory.b Q;
    private boolean R;
    private boolean S;
    private List<CampaignEx> T;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MBridgePlayableView f37586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MBridgeClickCTAView f37587n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MBridgeClickMiniCardView f37588o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private MBridgeNativeEndCardView f37589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MBridgeH5EndCardView f37590q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MBridgeVastEndCardView f37591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MBridgeLandingPageView f37592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private MBridgeVideoEndCoverView f37593t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private MBridgeAlertWebview f37594u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private MBridgeOrderCampView f37595v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f37596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f37597x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f37598y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f37599z;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.video.signal.factory.b f37600a;

        public a(com.mbridge.msdk.video.signal.factory.b bVar) {
            this.f37600a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
            mBridgeContainerView.a(this.f37600a, Integer.valueOf(mBridgeContainerView.f37560b.getVideo_end_type()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.video.signal.factory.b f37602a;

        public b(com.mbridge.msdk.video.signal.factory.b bVar) {
            this.f37602a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
            mBridgeContainerView.a(this.f37602a, Integer.valueOf(mBridgeContainerView.f37560b.getVideo_end_type()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements com.mbridge.msdk.video.dynview.listener.b {
        public c() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.b
        public void a() {
            com.mbridge.msdk.video.module.listener.a aVar = MBridgeContainerView.this.notifyListener;
            if (aVar != null) {
                aVar.a(117, "");
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.b
        public void b() {
            if (MBridgeContainerView.this.f37560b.getAdSpaceT() == 2) {
                MBridgeContainerView.this.showVideoEndCover();
            } else {
                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                mBridgeContainerView.showEndcard(mBridgeContainerView.f37560b.getVideo_end_type());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d extends i {
        public d(com.mbridge.msdk.video.module.listener.a aVar) {
            super(aVar);
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.i, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
        public void a(int i10, Object obj) {
            super.a(i10, obj);
            if (i10 == 100) {
                MBridgeContainerView.this.webviewshow();
                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                n nVar = new n();
                nVar.n(MBridgeContainerView.this.f37560b.getRequestId());
                nVar.o(MBridgeContainerView.this.f37560b.getRequestIdNotice());
                nVar.b(MBridgeContainerView.this.f37560b.getId());
                nVar.b(MBridgeContainerView.this.f37560b.isMraid() ? n.N : n.O);
                MBridgeContainerView mBridgeContainerView2 = MBridgeContainerView.this;
                g.d(nVar, mBridgeContainerView2.f37559a, mBridgeContainerView2.f37596w);
            }
        }
    }

    public MBridgeContainerView(Context context) {
        super(context);
        this.f37598y = 1;
        this.f37599z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.I = false;
        this.J = false;
        this.R = false;
        this.S = false;
        this.T = new ArrayList();
    }

    private void addCTAView() {
        if (this.f37587n == null) {
            b(-1);
        }
        if (this.f37587n != null) {
            CampaignEx campaignEx = this.f37560b;
            if (campaignEx == null || !campaignEx.isDynamicView()) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                addView(this.f37587n, 0, layoutParams);
            }
        }
    }

    private void b(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.Q = bVar;
        if (this.f37593t == null) {
            MBridgeVideoEndCoverView mBridgeVideoEndCoverView = new MBridgeVideoEndCoverView(this.f37559a);
            this.f37593t = mBridgeVideoEndCoverView;
            mBridgeVideoEndCoverView.setCampaign(this.f37560b);
            this.f37593t.setNotifyListener(new i(this.notifyListener));
            this.f37593t.preLoadData(bVar);
        }
    }

    private void e() {
        if (this.f37594u == null) {
            q();
        }
        MBridgeAlertWebview mBridgeAlertWebview = this.f37594u;
        if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
            removeView(this.f37594u);
        }
        addView(this.f37594u);
    }

    private void f() {
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx != null) {
            boolean zIsDynamicView = campaignEx.isDynamicView();
            boolean zL = v0.l(this.f37560b.getendcard_url());
            if (zIsDynamicView && !zL && !this.f37560b.isMraid()) {
                j();
                return;
            }
        }
        if (this.f37598y != 2 || this.I) {
            j();
        } else {
            g();
        }
    }

    private void g() {
        if (this.f37590q == null) {
            a(this.Q, (Integer) 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f37590q;
        if (mBridgeH5EndCardView == null || !mBridgeH5EndCardView.isLoadSuccess()) {
            j();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f37590q;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.f37590q.setError(true);
            }
        } else {
            this.I = true;
            addView(this.f37590q);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f37590q.excuteTask();
            this.f37590q.setNotchValue(this.P, this.K, this.L, this.M, this.N);
            n nVar = new n();
            nVar.n(this.f37560b.getRequestId());
            nVar.o(this.f37560b.getRequestIdNotice());
            nVar.b(this.f37560b.getId());
            nVar.b(this.f37560b.isMraid() ? n.N : n.O);
            g.d(nVar, this.f37559a, this.f37596w);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.f37590q;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.f37596w);
        }
    }

    private void h() {
        if (this.f37592s == null) {
            a(this.Q, (Integer) 4);
        }
        this.f37592s.setUnitId(this.f37596w);
        this.f37592s.preLoadData(this.Q);
        addView(this.f37592s);
    }

    private void i() {
        if (this.f37588o == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.D && this.E) {
            this.E = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f37588o, layoutParams);
    }

    private void j() {
        this.f37598y = 1;
        if (this.f37589p == null) {
            a(this.Q, (Integer) 2);
        }
        addView(this.f37589p);
        onConfigurationChanged(getResources().getConfiguration());
        this.f37589p.notifyShowListener();
        this.S = true;
        bringToFront();
    }

    private void k() {
        if (this.f37586m == null) {
            preLoadData(this.Q);
        }
        addView(this.f37586m);
        MBridgePlayableView mBridgePlayableView = this.f37586m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.setUnitId(this.f37596w);
            CampaignEx campaignEx = this.f37560b;
            if (campaignEx != null && campaignEx.isMraid() && this.f37560b.getPlayable_ads_without_video() == 2) {
                this.f37586m.setCloseVisible(0);
            }
            this.f37586m.setNotchValue(this.P, this.K, this.L, this.M, this.N);
        }
    }

    private void l() {
        if (this.f37591r == null) {
            a(this.Q, (Integer) 3);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        addView(this.f37591r, layoutParams);
        this.f37591r.notifyShowListener();
    }

    private void m() {
        if (this.f37593t == null) {
            b(this.Q);
        }
        addView(this.f37593t);
        onConfigurationChanged(getResources().getConfiguration());
        this.S = true;
        bringToFront();
    }

    private boolean n() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1;
    }

    private void o() {
        this.C = false;
        this.S = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof MBridgeContainerView) {
                    i10++;
                } else {
                    viewGroup.bringChildToFront(childAt);
                }
            }
        }
    }

    private void p() {
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getendcard_url();
        boolean zIsEmpty = TextUtils.isEmpty(str);
        int i10 = InterfaceC0435l1.a.b.f29084d;
        if (!zIsEmpty) {
            try {
                i10 = Integer.parseInt(c1.a(str, "ecid"));
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage());
            }
        }
        this.f37589p = new MBridgeNativeEndCardView(this.f37559a, null, true, i10, this.f37560b.getAdSpaceT() == 2, this.f37569k, this.f37560b.getMof_tplid());
        if (this.f37560b.getDynamicTempCode() != 5) {
            this.f37589p.setCampaign(this.f37560b);
            return;
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f37560b);
        }
        this.f37589p.setCampaign(this.f37560b);
    }

    private void q() {
        if (this.f37594u == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.f37559a);
            this.f37594u = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.f37596w);
            this.f37594u.setCampaign(this.f37560b);
        }
        this.f37594u.preLoadData(this.Q);
    }

    private void r() {
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    public void addOrderViewData(List<CampaignEx> list) {
        if (list == null) {
            return;
        }
        this.T = list;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view == null) {
            q0.b(MBridgeBaseView.TAG, "view is null");
        } else {
            a(view);
            super.addView(view);
        }
    }

    public boolean canBackPress() {
        if (this.f37589p != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f37590q;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f37592s;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.f37586m;
        if (mBridgePlayableView != null) {
            return mBridgePlayableView.canBackPress();
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i10, int i11, int i12) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f37588o;
        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getVisibility() != 0) {
            return;
        }
        this.f37588o.resizeMiniCard(i10, i11);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        return this.B;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f37590q;
        return mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable();
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f37590q;
        return mBridgeH5EndCardView == null ? this.f37586m : mBridgeH5EndCardView;
    }

    public CampaignEx getReSetCampaign() {
        if (!this.f37560b.isDynamicView() || !TextUtils.isEmpty(this.f37560b.getendcard_url())) {
            return null;
        }
        int size = this.T.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (this.T.get(i11) != null && this.T.get(i11).getId() == this.f37560b.getId()) {
                i10 = i11 - 1;
                break;
            }
        }
        if (i10 < 0 || i10 >= size || this.T.get(i10) == null) {
            return null;
        }
        return this.T.get(i10);
    }

    public boolean getShowingTransparent() {
        return this.D;
    }

    public String getUnitID() {
        return this.f37596w;
    }

    public int getVideoInteractiveType() {
        return this.f37597x;
    }

    public int getVideoSkipTime() {
        return this.H;
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f37590q;
        if (mBridgeH5EndCardView == null) {
            f();
            return;
        }
        mBridgeH5EndCardView.handlerPlayableException(str);
        if (this.I) {
            f();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        if (isLast()) {
            return;
        }
        if (this.R && !this.S) {
            o();
            this.R = false;
        }
        MBridgeAlertWebview mBridgeAlertWebview = this.f37594u;
        if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
            return;
        }
        removeView(this.f37594u);
        MBridgeClickCTAView mBridgeClickCTAView = this.f37587n;
        if (mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null) {
            return;
        }
        r();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    public void install(CampaignEx campaignEx) {
        this.notifyListener.a(InterfaceC0435l1.d.b.f29109f, campaignEx);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup != null && viewGroup.indexOfChild(this) == 0;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        this.notifyListener.a(InterfaceC0435l1.d.b.f29107d, str);
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f37588o;
        return mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        return this.C;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        MBridgePlayableView mBridgePlayableView = this.f37586m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i10);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f37590q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i10);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(configuration, this.f37586m, this.f37587n, this.f37588o, this.f37589p, this.f37590q, this.f37591r, this.f37592s, this.f37593t);
    }

    public void onEndcardBackPress() {
        if (this.f37589p != null || this.f37591r != null) {
            this.notifyListener.a(InterfaceC0435l1.d.b.f29108e, "");
            try {
                com.mbridge.msdk.video.dynview.moffer.a.a().b();
                return;
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
                return;
            }
        }
        if (this.f37592s != null) {
            this.notifyListener.a(InterfaceC0435l1.d.b.f29107d, "");
            return;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f37590q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.onBackPress();
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.C) {
            this.notifyListener.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.f37586m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void orientation(Configuration configuration) {
        a(this.f37586m, this.f37588o, this.f37590q, this.f37594u);
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.Q = bVar;
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx != null) {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                a(bVar);
            } else {
                b(this.f37597x);
                if (this.f37560b.isDynamicView()) {
                    try {
                        a(bVar, Integer.valueOf(this.f37560b.getVideo_end_type()));
                    } catch (Throwable th2) {
                        q0.b(MBridgeBaseView.TAG, th2.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new a(bVar));
                    }
                    if (!v0.l(this.f37560b.getendcard_url())) {
                        try {
                            String strA = c1.a(this.f37560b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(strA) && Integer.parseInt(strA) == 1) {
                                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f37560b, 2);
                            }
                        } catch (Exception e10) {
                            q0.b(MBridgeBaseView.TAG, e10.getMessage());
                        }
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new b(bVar), getVideoSkipTime());
                }
            }
            q();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i10) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f37590q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i10);
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f37590q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.f37590q = null;
        }
        MBridgePlayableView mBridgePlayableView = this.f37586m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f37592s;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f37589p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
            this.f37589p.release();
        }
        if (this.notifyListener != null) {
            this.notifyListener = null;
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i10, int i11, int i12) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f37588o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i10, i11);
            this.f37588o.setRadius(i12);
            removeAllViews();
            setMatchParent();
            this.S = true;
            bringToFront();
            i();
        }
    }

    public void setCloseDelayTime(int i10) {
        this.f37599z = i10;
    }

    public void setEndscreenType(int i10) {
        this.f37598y = i10;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.Q = bVar;
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f37588o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.f37588o.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13, int i14) {
        q0.b(MBridgeBaseView.TAG, "NOTCH ContainerView ".concat(String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i10))));
        this.O = i10;
        this.K = i11;
        this.L = i12;
        this.M = i13;
        this.N = i14;
        this.P = d0.a(i10, i11, i12, i13, i14);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f37589p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i11, i12, i13, i14);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f37590q;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f37609p != null) {
            mBridgeH5EndCardView.setNotchValue(this.P, i11, i12, i13, i14);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f37590q.f37609p, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.f37586m;
        if (mBridgePlayableView != null && mBridgePlayableView.f37609p != null) {
            mBridgePlayableView.setNotchValue(this.P, i11, i12, i13, i14);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f37586m.f37609p, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
        }
        MBridgeOrderCampView mBridgeOrderCampView = this.f37595v;
        if (mBridgeOrderCampView != null) {
            mBridgeOrderCampView.setNotchPadding(i11, i12, i13, i14);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setNotifyListener(com.mbridge.msdk.video.module.listener.a aVar) {
        super.setNotifyListener(aVar);
        a(aVar, this.f37586m, this.f37587n, this.f37588o, this.f37589p, this.f37590q, this.f37591r, this.f37592s, this.f37593t);
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f37589p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f37589p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i10) {
        this.A = i10;
    }

    public void setRewardStatus(boolean z10) {
        this.J = z10;
    }

    public void setShowingTransparent(boolean z10) {
        this.D = z10;
    }

    public void setUnitID(String str) {
        this.f37596w = str;
    }

    public void setVideoInteractiveType(int i10) {
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx == null || !campaignEx.isDynamicView()) {
            this.f37597x = i10;
            return;
        }
        int iB = com.mbridge.msdk.video.dynview.util.a.b(this.f37560b);
        if (iB == 100) {
            this.f37597x = i10;
        } else {
            this.f37597x = iB;
        }
    }

    public void setVideoSkipTime(int i10) {
        this.H = i10;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        MBridgeAlertWebview mBridgeAlertWebview = this.f37594u;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        if (!n() && !this.S) {
            removeAllViews();
            bringToFront();
            this.R = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f37588o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        e();
        setBackgroundColor(0);
        this.f37594u.webviewshow();
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i10) {
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx != null) {
            if (i10 == 1) {
                this.notifyListener.a(InterfaceC0435l1.d.b.f29108e, "");
            } else if (i10 == 100) {
                if (campaignEx.getPlayable_ads_without_video() == 2) {
                    this.G = true;
                }
                a(this.f37586m);
                setMatchParent();
                j();
            } else if (i10 == 3) {
                removeAllViews();
                setMatchParent();
                l();
                this.S = true;
                bringToFront();
            } else if (i10 == 4) {
                this.notifyListener.a(InterfaceC0435l1.d.b.f29114k, "");
                removeAllViews();
                setMatchParent();
                h();
                this.S = true;
                bringToFront();
            } else if (i10 != 5) {
                removeAllViews();
                setMatchParent();
                this.S = true;
                bringToFront();
                f();
                this.notifyListener.a(117, "");
            } else {
                this.notifyListener.a(106, "");
            }
        }
        this.B = true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i10, int i11, int i12, int i13, int i14) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f37588o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i10, i11, i12, i13);
            this.f37588o.setRadius(i14);
            this.f37588o.setCloseVisible(8);
            this.f37588o.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.S = true;
            bringToFront();
            i();
            if (this.F) {
                return;
            }
            this.F = true;
            this.notifyListener.a(InterfaceC0435l1.d.b.f29110g, "");
            this.notifyListener.a(117, "");
        }
    }

    public void showOrderCampView() {
        MBridgeOrderCampView mBridgeOrderCampView = new MBridgeOrderCampView(this.f37559a);
        this.f37595v = mBridgeOrderCampView;
        mBridgeOrderCampView.setCampaignExes(this.T);
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.T);
        }
        this.f37595v.setNotifyListener(new i(this.notifyListener));
        this.f37595v.setRewarded(this.J);
        this.f37595v.setNotchPadding(this.K, this.L, this.M, this.N);
        this.f37595v.setCampOrderViewBuildCallback(new c());
        this.f37595v.createView(this);
    }

    public void showPlayableView() {
        if (this.f37560b == null || this.G) {
            return;
        }
        removeAllViews();
        setMatchParent();
        k();
        this.S = true;
        bringToFront();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i10) {
        if (this.f37560b != null) {
            if (i10 == -1) {
                if (isLast() || endCardShowing()) {
                    return;
                }
                o();
                return;
            }
            if (i10 == 1) {
                if (this.B) {
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView = this.f37590q;
                if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getParent() != null) {
                    removeView(this.f37590q);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f37588o;
                if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
                    removeView(this.f37588o);
                }
                MBridgeClickCTAView mBridgeClickCTAView = this.f37587n;
                if (mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null) {
                    try {
                        CampaignEx campaignEx = this.f37560b;
                        if (campaignEx != null && campaignEx.getPlayable_ads_without_video() == 1) {
                            this.S = true;
                            addCTAView();
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (i10 != 2) {
                return;
            }
            MBridgeClickCTAView mBridgeClickCTAView2 = this.f37587n;
            if (mBridgeClickCTAView2 != null && mBridgeClickCTAView2.getParent() != null) {
                removeView(this.f37587n);
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.f37594u;
            if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f37588o;
                if (mBridgeClickMiniCardView2 == null || mBridgeClickMiniCardView2.getParent() == null) {
                    try {
                        CampaignEx campaignEx2 = this.f37560b;
                        if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 1) {
                            setMatchParent();
                            i();
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                if (!miniCardLoaded()) {
                    o();
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f37590q;
                if (mBridgeH5EndCardView2 != null && mBridgeH5EndCardView2.getParent() != null) {
                    removeView(this.f37590q);
                }
                this.notifyListener.a(InterfaceC0435l1.d.b.f29113j, "");
                CampaignEx campaignEx3 = this.f37560b;
                if (campaignEx3 != null && !campaignEx3.isHasReportAdTrackPause()) {
                    this.f37560b.setHasReportAdTrackPause(true);
                    com.mbridge.msdk.video.module.report.b.c(this.f37559a, this.f37560b);
                }
                if (this.D) {
                    this.notifyListener.a(115, "");
                } else {
                    this.S = true;
                    bringToFront();
                    webviewshow();
                    onConfigurationChanged(getResources().getConfiguration());
                }
                this.C = true;
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        m();
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        MBridgePlayableView mBridgePlayableView = this.f37586m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i10);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f37590q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i10);
        }
    }

    public void triggerCloseBtn(String str) {
        try {
            e eVar = new e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", this.f37560b);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
        if (this.f37560b != null) {
            this.notifyListener.a(122, "");
            this.notifyListener.a(InterfaceC0435l1.d.b.f29108e, "");
        }
    }

    public void webviewshow() {
        try {
            e eVar = new e();
            eVar.a("type", 3);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000133", this.f37560b, eVar);
        } catch (Exception unused) {
        }
        b(this.f37586m, this.f37588o, this.f37590q, this.f37594u);
    }

    private void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super.addView(view, layoutParams);
        } else {
            q0.b(MBridgeBaseView.TAG, "view is null");
        }
    }

    private void a(com.mbridge.msdk.video.signal.factory.b bVar) {
        if (this.f37586m == null) {
            this.f37586m = new MBridgePlayableView(this.f37559a);
        }
        this.f37586m.setCloseDelayShowTime(this.f37599z);
        this.f37586m.setPlayCloseBtnTm(this.A);
        this.f37586m.setCampaign(this.f37560b);
        this.f37586m.setNotifyListener(new d(this.notifyListener));
        this.f37586m.preLoadData(bVar);
    }

    private void b(int i10) {
        if (i10 != -3) {
            if (i10 != -2) {
                if (this.f37587n == null) {
                    this.f37587n = new MBridgeClickCTAView(this.f37559a);
                }
                this.f37587n.setCampaign(this.f37560b);
                this.f37587n.setUnitId(this.f37596w);
                this.f37587n.setNotifyListener(new i(this.notifyListener));
                this.f37587n.preLoadData(this.Q);
                return;
            }
            CampaignEx campaignEx = this.f37560b;
            if (campaignEx == null || campaignEx.getVideo_end_type() != 2) {
                return;
            }
            if (this.f37588o == null) {
                this.f37588o = new MBridgeClickMiniCardView(this.f37559a);
            }
            this.f37588o.setCampaign(this.f37560b);
            MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f37588o;
            mBridgeClickMiniCardView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.g(mBridgeClickMiniCardView, this.notifyListener));
            this.f37588o.preLoadData(this.Q);
            setMatchParent();
            i();
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.video.signal.factory.b bVar, Integer num) {
        CampaignEx campaignEx;
        com.mbridge.msdk.video.module.listener.a aVar;
        CampaignEx campaignEx2;
        this.Q = bVar;
        CampaignEx campaignEx3 = this.f37560b;
        if (campaignEx3 != null) {
            if (num == null) {
                num = Integer.valueOf(campaignEx3.getVideo_end_type());
            }
            if (!isLast()) {
                o();
            }
            int iIntValue = num.intValue();
            if (iIntValue != 1) {
                if (iIntValue == 3) {
                    if (this.f37591r == null) {
                        this.f37591r = new MBridgeVastEndCardView(this.f37559a);
                    }
                    this.f37591r.setCampaign(this.f37560b);
                    this.f37591r.setNotifyListener(new l(this.notifyListener));
                    this.f37591r.preLoadData(bVar);
                    return;
                }
                if (iIntValue == 4) {
                    if (this.f37592s == null) {
                        this.f37592s = new MBridgeLandingPageView(this.f37559a);
                    }
                    this.f37592s.setCampaign(this.f37560b);
                    this.f37592s.setNotifyListener(new i(this.notifyListener));
                    return;
                }
                if (iIntValue != 5) {
                    if (this.f37598y == 2) {
                        boolean zIsDynamicView = this.f37560b.isDynamicView();
                        boolean zL = v0.l(this.f37560b.getendcard_url());
                        if ((zIsDynamicView && !zL && (campaignEx2 = this.f37560b) != null && !campaignEx2.isMraid()) || (campaignEx = this.f37560b) == null || campaignEx.getAdSpaceT() == 2) {
                            return;
                        }
                        if (this.f37590q == null) {
                            this.f37590q = new MBridgeH5EndCardView(this.f37559a);
                            try {
                                e eVar = new e();
                                eVar.a("type", 3);
                                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", this.f37560b, eVar);
                            } catch (Throwable th2) {
                                q0.b(MBridgeBaseView.TAG, th2.getMessage());
                            }
                        }
                        if (this.f37560b.getDynamicTempCode() == 5 && (aVar = this.notifyListener) != null && (aVar instanceof k)) {
                            ((k) aVar).a(this.f37560b);
                        }
                        this.f37590q.setCampaign(this.f37560b);
                        this.f37590q.setCloseDelayShowTime(this.f37599z);
                        this.f37590q.setNotifyListener(new i(this.notifyListener));
                        this.f37590q.setUnitId(this.f37596w);
                        this.f37590q.setNotchValue(this.P, this.K, this.L, this.M, this.N);
                        this.f37590q.preLoadData(bVar);
                        if (this.D) {
                            return;
                        }
                        addView(this.f37590q);
                        return;
                    }
                    CampaignEx campaignEx4 = this.f37560b;
                    int iG = (campaignEx4 == null || campaignEx4.getRewardTemplateMode() == null) ? 0 : this.f37560b.getRewardTemplateMode().g();
                    if (this.f37589p == null) {
                        CampaignEx campaignEx5 = this.f37560b;
                        if (campaignEx5 != null && campaignEx5.isDynamicView()) {
                            p();
                        } else {
                            Context context = this.f37559a;
                            CampaignEx campaignEx6 = this.f37560b;
                            boolean z10 = campaignEx6 != null && campaignEx6.getAdSpaceT() == 2;
                            CampaignEx campaignEx7 = this.f37560b;
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = new MBridgeNativeEndCardView(context, null, false, -1, z10, iG, campaignEx7 != null ? campaignEx7.getMof_tplid() : 0);
                            this.f37589p = mBridgeNativeEndCardView;
                            mBridgeNativeEndCardView.setCampaign(this.f37560b);
                        }
                    }
                    this.f37589p.setLayout();
                    if (this.f37560b.isDynamicView()) {
                        if (com.mbridge.msdk.video.dynview.moffer.a.a().b(this.f37560b.getRequestId() + "_" + this.f37560b.getId())) {
                            try {
                                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f37589p, this.f37560b.getRequestId() + "_" + this.f37560b.getId(), new i(this.notifyListener));
                            } catch (Exception e10) {
                                q0.b(MBridgeBaseView.TAG, e10.getMessage());
                            }
                        } else {
                            try {
                                String strA = c1.a(this.f37560b.getendcard_url(), "mof");
                                if (!TextUtils.isEmpty(strA) && Integer.parseInt(strA) == 1) {
                                    com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f37560b, this.f37589p, new i(this.notifyListener), 2);
                                }
                            } catch (Exception e11) {
                                q0.b(MBridgeBaseView.TAG, e11.getMessage());
                            }
                        }
                    }
                    this.f37589p.setUnitId(this.f37596w);
                    this.f37589p.setCloseBtnDelay(this.f37599z);
                    this.f37589p.setNotifyListener(new i(this.notifyListener));
                    this.f37589p.preLoadData(bVar);
                    this.f37589p.setNotchPadding(this.K, this.L, this.M, this.N);
                }
            }
        }
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37598y = 1;
        this.f37599z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.I = false;
        this.J = false;
        this.R = false;
        this.S = false;
        this.T = new ArrayList();
    }

    private void b(MBridgeH5EndCardView... mBridgeH5EndCardViewArr) {
        for (MBridgeH5EndCardView mBridgeH5EndCardView : mBridgeH5EndCardViewArr) {
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0 && mBridgeH5EndCardView.getParent() != null && !isLast()) {
                mBridgeH5EndCardView.webviewshow();
            }
        }
    }

    private void a(com.mbridge.msdk.video.module.listener.a aVar, MBridgeBaseView... mBridgeBaseViewArr) {
        for (MBridgeBaseView mBridgeBaseView : mBridgeBaseViewArr) {
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.g(this.f37588o, aVar));
                } else {
                    mBridgeBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    private void a(Configuration configuration, MBridgeBaseView... mBridgeBaseViewArr) {
        for (MBridgeBaseView mBridgeBaseView : mBridgeBaseViewArr) {
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    private void a(MBridgeH5EndCardView... mBridgeH5EndCardViewArr) {
        for (MBridgeH5EndCardView mBridgeH5EndCardView : mBridgeH5EndCardViewArr) {
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }
}

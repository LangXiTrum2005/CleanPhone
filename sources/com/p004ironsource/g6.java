package com.p004ironsource;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.AdapterUtils;
import com.p004ironsource.mediationsdk.ISBannerSize;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.IronSourceBannerLayout;
import com.p004ironsource.mediationsdk.IronSourceSegment;
import com.p004ironsource.mediationsdk.LoadWhileShowSupportState;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.i;
import com.p004ironsource.mediationsdk.l;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.n;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class g6 extends p7<k6, AdapterAdViewListener> implements q1, f6 {
    private a7 K;
    private boolean L;
    private IronSourceBannerLayout M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private View f25122N;
    private s7<?> O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private FrameLayout.LayoutParams f25123P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final AtomicBoolean f25124Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final AtomicBoolean f25125R;

    public class a implements d8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s7 f25126a;

        public a(s7 s7Var) {
            this.f25126a = s7Var;
        }

        @Override // com.p004ironsource.d8
        public void a() {
            ((k6) this.f25126a).Q();
        }
    }

    public class b implements d8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s7 f25128a;

        public b(s7 s7Var) {
            this.f25128a = s7Var;
        }

        @Override // com.p004ironsource.d8
        public void a() {
            ((k6) this.f25128a).Q();
            g6 g6Var = g6.this;
            g6Var.s.f24488i.j(g6Var.n());
            g6.this.f25124Q.set(false);
            g6.this.W();
            IronLog.INTERNAL.verbose("start binding timer after impression, expected interval = " + g6.this.o.getLoadingData().b() + ", current timestamp = " + System.currentTimeMillis());
            g6.this.O().h();
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25130a;

        static {
            int[] iArr = new int[m2.a.values().length];
            f25130a = iArr;
            try {
                iArr[m2.a.MANUAL_WITH_AUTOMATIC_RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25130a[m2.a.MANUAL_WITH_LOAD_ON_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g6(List<NetworkSettings> list, u6 u6Var, String str, xk xkVar, IronSourceSegment ironSourceSegment) {
        super(new h6(str, list, u6Var), xkVar, ironSourceSegment);
        this.L = false;
        this.f25124Q = new AtomicBoolean(true);
        this.f25125R = new AtomicBoolean(false);
        this.K = N();
    }

    private void M() {
        int i2 = c.f25130a[this.q.b().a().ordinal()];
        if (i2 == 1) {
            P().a();
        } else {
            if (i2 != 2) {
                return;
            }
            P().l();
            P().m();
            O().a();
            O().b();
        }
    }

    private a7 N() {
        return new a7(this.o.getLoadingData(), this.o.getInteractionData(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a7 O() {
        return this.K;
    }

    private g7 P() {
        return (g7) this.q;
    }

    private ISBannerSize Q() {
        IronSourceBannerLayout ironSourceBannerLayout = this.M;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        if (this.M.getSize().isSmart()) {
            return AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? l.a() : ISBannerSize.BANNER;
        }
        return this.M.getSize();
    }

    private boolean S() {
        IronLog.INTERNAL.verbose(b(this.f25122N + ", " + this.f25123P + ", " + this.O));
        return (this.f25122N == null || this.f25123P == null || this.O == null) ? false : true;
    }

    private void U() {
        int i2 = c.f25130a[this.q.b().a().ordinal()];
        if (i2 == 1) {
            P().k();
        } else {
            if (i2 != 2) {
                return;
            }
            P().r();
        }
    }

    private void V() {
        int i2 = c.f25130a[this.q.b().a().ordinal()];
        if (i2 == 1) {
            P().k();
        } else {
            if (i2 != 2) {
                return;
            }
            P().q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        this.O = null;
        this.f25122N = null;
        this.f25123P = null;
    }

    public boolean R() {
        IronLog ironLog;
        String str;
        if (!this.M.isShown()) {
            ironLog = IronLog.INTERNAL;
            str = "banner or one of its parents are INVISIBLE or GONE";
        } else {
            if (this.M.hasWindowFocus()) {
                boolean globalVisibleRect = this.M.getGlobalVisibleRect(new Rect());
                IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
                return globalVisibleRect;
            }
            ironLog = IronLog.INTERNAL;
            str = "banner has no window focus";
        }
        ironLog.verbose(str);
        return false;
    }

    public void T() {
        IronSourceBannerLayout ironSourceBannerLayout = this.M;
        if (ironSourceBannerLayout != null) {
            a(ironSourceBannerLayout);
        }
    }

    @Override // com.p004ironsource.p7
    public LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return ((AdapterSettingsInterface) adapterBaseInterface).getBannerLoadWhileShowSupportedState(networkSettings);
    }

    public k6 b(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, int i2, String str, m5 m5Var) {
        return new k6(this, new k1(IronSource.AD_UNIT.BANNER, this.o.getUserId(), i2, this.g, str, this.f26462e, this.f, networkSettings, this.o.getSmashLoadTimeout()), baseAdAdapter, this.M, this.f26464i, v(), m5Var, this);
    }

    @Override // com.p004ironsource.s2
    public void d(s7<?> s7Var) {
        IronLog.INTERNAL.verbose(b(s7Var.k()));
        this.t.b(s7Var.f());
    }

    @Override // com.p004ironsource.f6
    public void e() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, binding skipped");
            O().h();
            this.s.f.b(IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE);
        } else {
            if (!S()) {
                IronLog.INTERNAL.verbose("Cannot bind banner view after interval, the next ad is not ready yet");
                this.f25124Q.set(true);
                return;
            }
            IronLog.INTERNAL.verbose("done binding timer, binding view now, current timestamp = " + System.currentTimeMillis());
            c(this.O, this.f25122N, this.f25123P);
        }
    }

    @Override // com.p004ironsource.f6
    public void f() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, starting the impression timeout timer again");
            O().e();
        } else if (this.f25125R.compareAndSet(false, true)) {
            IronLog.INTERNAL.verbose("banner impression timeout reached, reloading banner manually");
            U();
            this.s.j.b("banner impression timeout reached, reloading banner manually");
        }
    }

    @Override // com.p004ironsource.p7
    public j2 g() {
        return new b7();
    }

    @Override // com.p004ironsource.p7
    public o2 h() {
        return new g7(this.o.getLoadingData(), this);
    }

    @Override // com.p004ironsource.p7
    public String l() {
        return "BN";
    }

    @Override // com.p004ironsource.p7
    public String o() {
        return IronSourceConstants.OPW_BN_MANAGER_NAME;
    }

    @Override // com.p004ironsource.p7
    public boolean v() {
        return this.L;
    }

    @Override // com.p004ironsource.p7
    public AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.o.getAdUnit(), str, this.M);
    }

    @Override // com.p004ironsource.p7
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getBannerSettings();
    }

    @Override // com.p004ironsource.s2
    public void c(s7<?> s7Var) {
        IronLog.INTERNAL.verbose(b(s7Var.k()));
        this.t.e(s7Var.f());
    }

    @Override // com.p004ironsource.p7
    public void g(s7<?> s7Var) {
    }

    @Override // com.p004ironsource.p7
    public void h(s7<?> s7Var) {
    }

    private void c(s7<?> s7Var, View view, FrameLayout.LayoutParams layoutParams) {
        if (a(p7.f.READY_TO_SHOW, p7.f.SHOWING)) {
            this.f25125R.set(false);
            O().e();
            ((k6) s7Var).R();
            l.a(this.M, view, layoutParams, new b(s7Var));
            return;
        }
        IronLog.INTERNAL.verbose("wrong state = " + this.f26467p);
    }

    @Override // com.p004ironsource.p7
    public /* bridge */ /* synthetic */ s7 a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i2, String str, m5 m5Var) {
        return b(networkSettings, (BaseAdAdapter<?, AdapterAdViewListener>) baseAdAdapter, i2, str, m5Var);
    }

    @Override // com.p004ironsource.p7, com.p004ironsource.hn
    public void b() {
        boolean z2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        try {
            if (this.M == null) {
                ironLog.error("mIronSourceBanner is null");
                this.s.f.b(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL);
                return;
            }
            if (!R()) {
                if (this.o.getLoadingData().a() == m2.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
                    ironLog.verbose("banner is not visible, reload skipped");
                    this.s.f.b(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE);
                }
                U();
                return;
            }
            synchronized (this.x) {
                try {
                    if (a(p7.f.SHOWING, p7.f.READY_TO_LOAD)) {
                        ironLog.verbose("start reload");
                        z2 = true;
                        this.L = true;
                    } else {
                        ironLog.error("wrong state = " + this.f26467p);
                        z2 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                a(this.M, this.f26464i);
            }
        } catch (Throwable th2) {
            q9.d().a(th2);
            this.s.j.c(th2.getMessage());
        }
    }

    @Override // com.p004ironsource.p7, com.p004ironsource.b2
    public Map<String, Object> a(z1 z1Var) {
        Map<String, Object> mapA = super.a(z1Var);
        if (b(this.M)) {
            l.a(mapA, this.M.getSize());
        }
        if (this.f26464i != null) {
            mapA.put("placement", n());
        }
        return mapA;
    }

    @Override // com.p004ironsource.p7, com.p004ironsource.p2
    public void b(s7<?> s7Var) {
        super.b(s7Var);
        if (P().o()) {
            if (!this.f25125R.compareAndSet(false, true)) {
                IronLog.INTERNAL.verbose("Impression already recorded as receive, it can occur from network onAdOpened or from impression timeout timer - loading next ad already in progress");
            } else {
                O().b();
                U();
            }
        }
    }

    private void b(s7<?> s7Var, View view, FrameLayout.LayoutParams layoutParams) {
        ((k6) s7Var).R();
        l.a(this.M, view, layoutParams, new a(s7Var));
    }

    @Override // com.p004ironsource.p7
    public void a(int i2, String str, boolean z2) {
        if (!v()) {
            super.a(i2, str, z2);
            return;
        }
        if (!z2) {
            this.s.f.a(ib.a(this.f26466n), i2, str);
            n.a().b(this.o.getAdUnit(), new IronSourceError(i2, str));
        }
        if (v()) {
            a(p7.f.SHOWING);
            V();
        }
    }

    @Override // com.p004ironsource.p7
    public void a(Context context, i iVar, r4 r4Var) {
        if (this.f26461c == null) {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        } else {
            iVar.a(Q());
            this.f26461c.a(context, iVar, r4Var);
        }
    }

    public boolean b(IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout) {
        try {
            if (!b(ironSourceBannerLayout)) {
                IronLog.API.error("destroy banner failed - errorMessage = ".concat("can't destroy banner - ".concat(ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed")));
                return;
            }
            IronLog.INTERNAL.verbose("destroying banner");
            M();
            k6 k6Var = (k6) this.f26459a.d();
            if (k6Var != null) {
                this.s.f.a(k6Var.r() != null ? k6Var.r().intValue() : this.C.a(this.o.getAdUnit()));
                k6Var.P();
                this.f26459a.a(null);
                this.f26459a.b(null);
            }
            l.a(ironSourceBannerLayout);
            this.M = null;
            this.f26464i = null;
            this.L = false;
            if (P().o()) {
                this.f25124Q.set(true);
                this.f25125R.set(false);
                W();
            }
            a(p7.f.READY_TO_LOAD);
        } catch (Throwable th) {
            StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("destroyBanner - exception = ", th);
            sbP.append(th.getLocalizedMessage());
            sbP.append(" state = ");
            sbP.append(this.f26467p);
            String string = sbP.toString();
            IronLog.INTERNAL.error(b(string));
            c2 c2Var = this.s;
            if (c2Var != null) {
                c2Var.j.g(string);
            }
        }
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, Placement placement) {
        String strConcat;
        IronLog.INTERNAL.verbose("placement = " + placement);
        int iB = 510;
        if (!b(ironSourceBannerLayout)) {
            strConcat = "can't load banner - ".concat(ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed");
        } else if (placement == null || TextUtils.isEmpty(placement.getPlacementName())) {
            strConcat = "can't load banner - ".concat(placement == null ? "placement is null" : "placement name is empty");
            iB = y1.b(this.o.getAdUnit());
        } else if (this.f26455E.b(ContextProvider.getInstance().getApplicationContext(), placement, this.o.getAdUnit())) {
            strConcat = android.support.v4.media.a.n("placement ", placement.getPlacementName(), " is capped");
            iB = y1.f(this.o.getAdUnit());
        } else {
            strConcat = null;
        }
        if (!TextUtils.isEmpty(strConcat)) {
            IronLog.API.error(b(strConcat));
            a(iB, strConcat, false);
        } else {
            l.b(ironSourceBannerLayout);
            this.M = ironSourceBannerLayout;
            this.f26464i = placement;
            A();
        }
    }

    @Override // com.p004ironsource.s2
    public void a(s7<?> s7Var) {
        IronLog.INTERNAL.verbose(b(s7Var.k()));
        this.t.f(s7Var.f());
    }

    @Override // com.p004ironsource.q1
    public void a(s7<?> s7Var, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("mState = " + this.f26467p);
        super.e(s7Var);
        if (this.o.getLoadingData().a() == m2.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            if (!a(p7.f.READY_TO_SHOW, p7.f.SHOWING)) {
                return;
            }
            this.f26459a.a(s7Var);
            this.f26459a.b(s7Var);
            b(s7Var, view, layoutParams);
            P().k();
        } else {
            if (!P().o()) {
                return;
            }
            this.f26459a.b(s7Var);
            if (this.f25124Q.get()) {
                c(s7Var, view, layoutParams);
            } else {
                this.O = s7Var;
                this.f25122N = view;
                this.f25123P = layoutParams;
            }
        }
        this.t.c(s7Var.f());
    }
}

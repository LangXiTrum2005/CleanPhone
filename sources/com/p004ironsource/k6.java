package com.p004ironsource;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.IronSourceBannerLayout;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.p004ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.l;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.Placement;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class k6 extends s7<q1> implements BannerAdListener, b2 {
    public static final String t = "bannerLayout";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f25513u = "bannerSize";
    private final IronSourceBannerLayout r;
    private final boolean s;

    public class a extends ks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f25514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f25515b;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f25514a = view;
            this.f25515b = layoutParams;
        }

        @Override // com.p004ironsource.ks
        public void a() {
            k6.this.a(this.f25514a, this.f25515b);
        }
    }

    public class b extends ks {
        public b() {
        }

        @Override // com.p004ironsource.ks
        public void a() {
            k6.this.J();
        }
    }

    public k6(vq vqVar, k1 k1Var, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, IronSourceBannerLayout ironSourceBannerLayout, Placement placement, boolean z2, m5 m5Var, q1 q1Var) {
        super(vqVar, k1Var, baseAdAdapter, new a3(k1Var.g(), k1Var.g().getBannerSettings(), IronSource.AD_UNIT.BANNER), m5Var, q1Var);
        this.r = ironSourceBannerLayout;
        this.g = placement;
        this.s = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.f26762e == s7.h.FAILED) {
            return;
        }
        ironLog.error("unexpected onAdOpened for " + k() + ", state - " + this.f26762e);
        if (this.d != null) {
            this.d.j.q("unexpected onAdOpened, state - " + this.f26762e);
        }
    }

    @Override // com.p004ironsource.s7
    public void G() {
        Object obj = this.f26761c;
        if (obj instanceof AdapterBannerInterface) {
            ((AdapterBannerInterface) obj).loadAd(this.k, ContextProvider.getInstance().getCurrentActiveActivity(), this.r.getSize(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
        }
    }

    @Override // com.p004ironsource.s7
    public boolean O() {
        return false;
    }

    public void P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(s7.h.NONE);
        Object obj = this.f26761c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterBannerInterface) {
                ((AdapterBannerInterface) obj).destroyAd(this.k);
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("destroyBanner - exception = ", th);
            sbP.append(th.getLocalizedMessage());
            sbP.append(" state = ");
            sbP.append(this.f26762e);
            String string = sbP.toString();
            IronLog.INTERNAL.error(a(string));
            c2 c2Var = this.d;
            if (c2Var != null) {
                c2Var.j.g(string);
            }
        }
        c2 c2Var2 = this.d;
        if (c2Var2 != null) {
            c2Var2.f.a(r().intValue());
        }
    }

    public void Q() {
        Object obj = this.f26761c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewBound(this.k);
        }
    }

    public void R() {
        Object obj = this.f26761c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewWillBind(this.k);
        }
    }

    @Override // com.p004ironsource.s7
    public AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        c2 c2Var;
        Placement placement = this.g;
        if (placement != null && (c2Var = this.d) != null) {
            c2Var.f24488i.f(placement.getPlacementName());
        }
        Listener listener = this.f26760b;
        if (listener != 0) {
            ((q1) listener).d(this);
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener, com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams) {
        if (u().c()) {
            u().a(new a(view, layoutParams));
        } else {
            a(view, layoutParams);
        }
    }

    @Override // com.p004ironsource.s7, com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new b());
        } else {
            J();
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        c2 c2Var;
        Placement placement = this.g;
        if (placement != null && (c2Var = this.d) != null) {
            c2Var.f24488i.c(placement.getPlacementName());
        }
        Listener listener = this.f26760b;
        if (listener != 0) {
            ((q1) listener).c(this);
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        c2 c2Var;
        Placement placement = this.g;
        if (placement != null && (c2Var = this.d) != null) {
            c2Var.f24488i.h(placement.getPlacementName());
        }
        Listener listener = this.f26760b;
        if (listener != 0) {
            ((q1) listener).a(this);
        }
    }

    @Override // com.p004ironsource.s7
    public boolean v() {
        return this.s;
    }

    @Override // com.p004ironsource.s7, com.p004ironsource.b2
    public Map<String, Object> a(z1 z1Var) {
        Map<String, Object> mapA = super.a(z1Var);
        IronSourceBannerLayout ironSourceBannerLayout = this.r;
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            l.a(mapA, this.r.getSize());
        }
        if (this.g != null) {
            mapA.put("placement", j());
        }
        return mapA;
    }

    @Override // com.p004ironsource.s7
    public Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> mapA = super.a(map);
        k1 k1Var = this.f26759a;
        if (k1Var != null && this.r != null && TextUtils.isEmpty(k1Var.g().getCustomNetwork())) {
            mapA.put("bannerLayout", this.r);
        }
        return mapA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (!y() || (listener = this.f26760b) == 0) {
            return;
        }
        ((q1) listener).a(this, view, layoutParams);
    }
}

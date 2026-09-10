package com.ironsource;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class K2 extends AbstractC0401j3<InterfaceC0577t0> implements BannerAdListener, E0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f26381t = "bannerLayout";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f26382u = "bannerSize";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.ironsource.mediationsdk.o f26383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f26384s;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends AbstractRunnableC0430ke {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f26385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f26386c;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f26385b = view;
            this.f26386c = layoutParams;
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            K2.this.a(this.f26385b, this.f26386c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends AbstractRunnableC0430ke {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC0430ke
        public void a() {
            K2.this.J();
        }
    }

    public K2(InterfaceC0537qd interfaceC0537qd, C0470n0 c0470n0, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, com.ironsource.mediationsdk.o oVar, C0358gd c0358gd, boolean z10, C0526q2 c0526q2, InterfaceC0577t0 interfaceC0577t0) {
        super(interfaceC0537qd, c0470n0, baseAdAdapter, new C0310e1(c0470n0.g(), c0470n0.g().getBannerSettings(), IronSource.a.BANNER), c0526q2, interfaceC0577t0);
        this.f26383r = oVar;
        this.f28934g = c0358gd;
        this.f26384s = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.f28932e == AbstractC0401j3.h.FAILED) {
            return;
        }
        ironLog.error("unexpected onAdOpened for " + k() + ", state - " + this.f28932e);
        if (this.f28931d != null) {
            this.f28931d.f26035j.q("unexpected onAdOpened, state - " + this.f28932e);
        }
    }

    @Override // com.ironsource.AbstractC0401j3
    public void G() {
        Object obj = this.f28930c;
        if (obj instanceof AdapterBannerInterface) {
            ((AdapterBannerInterface) obj).loadAd(this.f28938k, ContextProvider.getInstance().getCurrentActiveActivity(), this.f26383r.getSize(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
        }
    }

    @Override // com.ironsource.AbstractC0401j3
    public boolean O() {
        return false;
    }

    public void R() {
        Object obj = this.f28930c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewWillBind(this.f28938k);
        }
    }

    @Override // com.ironsource.AbstractC0401j3
    public AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        F0 f10;
        C0358gd c0358gd = this.f28934g;
        if (c0358gd != null && (f10 = this.f28931d) != null) {
            f10.f26034i.f(c0358gd.c());
        }
        Listener listener = this.f28929b;
        if (listener != 0) {
            ((InterfaceC0577t0) listener).c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams) {
        if (u().c()) {
            u().a(new a(view, layoutParams));
        } else {
            a(view, layoutParams);
        }
    }

    @Override // com.ironsource.AbstractC0401j3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new b());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        F0 f10;
        C0358gd c0358gd = this.f28934g;
        if (c0358gd != null && (f10 = this.f28931d) != null) {
            f10.f26034i.c(c0358gd.c());
        }
        Listener listener = this.f28929b;
        if (listener != 0) {
            ((InterfaceC0577t0) listener).b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        F0 f10;
        C0358gd c0358gd = this.f28934g;
        if (c0358gd != null && (f10 = this.f28931d) != null) {
            f10.f26034i.h(c0358gd.c());
        }
        Listener listener = this.f28929b;
        if (listener != 0) {
            ((InterfaceC0577t0) listener).f(this);
        }
    }

    @Override // com.ironsource.AbstractC0401j3
    public boolean v() {
        return this.f26384s;
    }

    public void P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC0401j3.h.NONE);
        Object obj = this.f28930c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterBannerInterface) {
                ((AdapterBannerInterface) obj).destroyAd(this.f28938k);
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            String str = "destroyBanner - exception = " + th2.getLocalizedMessage() + " state = " + this.f28932e;
            IronLog.INTERNAL.error(a(str));
            F0 f10 = this.f28931d;
            if (f10 != null) {
                f10.f26035j.g(str);
            }
        }
        F0 f11 = this.f28931d;
        if (f11 != null) {
            f11.f26031f.a(r().intValue());
        }
    }

    public void Q() {
        Object obj = this.f28930c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewBound(this.f28938k);
        }
    }

    @Override // com.ironsource.AbstractC0401j3
    public Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> mapA = super.a(map);
        C0470n0 c0470n0 = this.f28928a;
        if (c0470n0 != null && this.f26383r != null && TextUtils.isEmpty(c0470n0.g().getCustomNetwork())) {
            mapA.put(f26381t, this.f26383r);
        }
        return mapA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (!y() || (listener = this.f28929b) == 0) {
            return;
        }
        ((InterfaceC0577t0) listener).a(this, view, layoutParams);
    }

    @Override // com.ironsource.AbstractC0401j3, com.ironsource.E0
    public Map<String, Object> a(C0 c4) {
        Map<String, Object> mapA = super.a(c4);
        com.ironsource.mediationsdk.o oVar = this.f26383r;
        if (oVar != null && !oVar.b()) {
            com.ironsource.mediationsdk.j.a(mapA, this.f26383r.getSize());
        }
        if (this.f28934g != null) {
            mapA.put("placement", j());
        }
        return mapA;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, String str) {
    }
}

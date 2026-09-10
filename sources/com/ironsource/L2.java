package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class L2 extends AbstractC0524q0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakReference<O2> f26477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f26478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final M2 f26479k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L2(C0506p0 tools, M2 adUnitData, O2 listener) {
        String str;
        int iB;
        super(tools, adUnitData, listener);
        kotlin.jvm.internal.n.f(tools, "tools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(listener, "listener");
        this.f26477i = new WeakReference<>(listener);
        this.f26478j = new a();
        this.f26479k = adUnitData;
        C0358gd c0358gdG = g();
        IronLog.INTERNAL.verbose("placement = " + c0358gdG);
        if (c0358gdG == null || TextUtils.isEmpty(c0358gdG.c())) {
            str = String.format("can't load banner - %s", Arrays.copyOf(new Object[]{c0358gdG == null ? "placement is null" : "placement name is empty"}, 1));
            iB = B0.b(adUnitData.b().a());
        } else {
            str = null;
            iB = 510;
        }
        if (str != null) {
            IronLog.API.error(a(str));
            a(iB, str);
        }
    }

    @Override // com.ironsource.AbstractC0524q0
    public C0559s0 b() {
        return new S2(this.f26479k.b(), a(l()));
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class a extends AbstractC0524q0.a implements D2 {
        public a() {
            super();
        }

        @Override // com.ironsource.D2
        public void a(B2 instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            IronLog.INTERNAL.verbose(L2.this.a(instance.q()));
            O2 o6 = (O2) L2.this.f26477i.get();
            if (o6 != null) {
                o6.g();
            }
        }

        @Override // com.ironsource.AbstractC0524q0.a, com.ironsource.F
        public void b(B instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            super.b(instance);
            InterfaceC0685z0 interfaceC0685z0I = L2.this.i();
            if (interfaceC0685z0I != null) {
                interfaceC0685z0I.a(instance.e());
            }
        }

        @Override // com.ironsource.D2
        public void c(B2 instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            IronLog.INTERNAL.verbose(L2.this.a(instance.q()));
            O2 o6 = (O2) L2.this.f26477i.get();
            if (o6 != null) {
                o6.h();
            }
        }

        @Override // com.ironsource.D2
        public void b(B2 instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            IronLog.INTERNAL.verbose(L2.this.a(instance.q()));
            O2 o6 = (O2) L2.this.f26477i.get();
            if (o6 != null) {
                o6.j();
            }
        }
    }

    private final ISBannerSize l() {
        return f().a(this.f26479k.b().i());
    }

    public final void a(Eg eg2, InterfaceC0685z0 displayListener) {
        kotlin.jvm.internal.n.f(displayListener, "displayListener");
        if (eg2 != null) {
            a(new F2(eg2), displayListener);
        }
    }

    @Override // com.ironsource.AbstractC0524q0
    public E a() {
        return new a4.a(this, 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B a(L2 this$0, C instanceData, I adInstancePayload) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        kotlin.jvm.internal.n.f(adInstancePayload, "adInstancePayload");
        return new B2(new V0(this$0.f(), F0.b.PROVIDER), instanceData, adInstancePayload, this$0.f26478j);
    }

    private final ISBannerSize a(ISBannerSize iSBannerSize) {
        if (!iSBannerSize.isSmart()) {
            return iSBannerSize;
        }
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            return com.ironsource.mediationsdk.j.a();
        }
        return ISBannerSize.BANNER;
    }
}

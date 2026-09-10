package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0524q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0649x0 f30037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V0 f30038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private M0 f30039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0685z0 f30040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Kg f30041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final WeakReference<K0> f30042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0350g5 f30043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C0690z5 f30044h;

    /* JADX INFO: renamed from: com.ironsource.q0$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements Sg {
        public b() {
        }

        @Override // com.ironsource.Sg
        public void a(int i10, String errorReason) {
            kotlin.jvm.internal.n.f(errorReason, "errorReason");
            AbstractC0524q0.this.a(i10, errorReason);
        }

        @Override // com.ironsource.Sg
        public void b(B instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            AbstractC0524q0.this.f30044h.e().a(C0350g5.a(AbstractC0524q0.this.f30043g), AbstractC0524q0.this.e().u());
            M0 m0J = AbstractC0524q0.this.j();
            if (m0J != null) {
                m0J.a(new C0595u0(AbstractC0524q0.this, instance.e()));
            }
        }

        @Override // com.ironsource.Sg
        public void a(B instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            AbstractC0524q0.this.f().d().a().e(AbstractC0524q0.this.h());
            M0 m0J = AbstractC0524q0.this.j();
            if (m0J != null) {
                m0J.b(new C0595u0(AbstractC0524q0.this, instance.e()));
            }
        }
    }

    public AbstractC0524q0(C0506p0 adTools, AbstractC0649x0 adUnitData, K0 listener) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(listener, "listener");
        this.f30037a = adUnitData;
        V0 v4 = new V0(adTools, adUnitData, F0.b.MEDIATION);
        this.f30038b = v4;
        this.f30041e = new Kg(v4, adUnitData, false, c(), null, null, 48, null);
        this.f30042f = new WeakReference<>(listener);
        this.f30044h = v4.d();
        IronLog.INTERNAL.verbose("adFormat = " + adUnitData.b().a() + ", adUnitId = " + adUnitData.b().c());
    }

    public abstract E a();

    public InterfaceC0416k0 d() {
        if (this.f30041e.h()) {
            return InterfaceC0416k0.b.f29014a;
        }
        return new InterfaceC0416k0.a(null, 1, 0 == true ? 1 : 0);
    }

    public final AbstractC0649x0 e() {
        return this.f30037a;
    }

    public final V0 f() {
        return this.f30038b;
    }

    public final C0358gd g() {
        return this.f30037a.b().f();
    }

    public final String h() {
        return this.f30037a.l();
    }

    public final InterfaceC0685z0 i() {
        return this.f30040d;
    }

    public final M0 j() {
        return this.f30039c;
    }

    public final Kg k() {
        return this.f30041e;
    }

    private final b c() {
        return new b();
    }

    public final void a(InterfaceC0685z0 interfaceC0685z0) {
        this.f30040d = interfaceC0685z0;
    }

    public final void b(M0 m7) {
        this.f30039c = m7;
    }

    public void a(M0 loadListener) {
        kotlin.jvm.internal.n.f(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C0506p0.a(this.f30038b, (String) null, (String) null, 3, (Object) null));
        this.f30038b.a(b());
        this.f30039c = loadListener;
        this.f30044h.a(this.f30037a.u());
        this.f30043g = new C0350g5();
        this.f30041e.a(a());
    }

    public C0559s0 b() {
        return new C0559s0(this.f30037a.b());
    }

    /* JADX INFO: renamed from: com.ironsource.q0$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements F {
        public a() {
        }

        @Override // com.ironsource.F
        public void a(B instance, IronSourceError error) {
            kotlin.jvm.internal.n.f(instance, "instance");
            kotlin.jvm.internal.n.f(error, "error");
            IronLog.INTERNAL.verbose(AbstractC0524q0.this.a(instance.q()));
            AbstractC0524q0.this.f30044h.a().a(AbstractC0524q0.this.h(), error.getErrorCode(), error.getErrorMessage(), null);
            InterfaceC0685z0 interfaceC0685z0I = AbstractC0524q0.this.i();
            if (interfaceC0685z0I != null) {
                interfaceC0685z0I.c(error);
            }
        }

        @Override // com.ironsource.F
        public void b(B instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            IronLog.INTERNAL.verbose(AbstractC0524q0.this.a(instance.q()));
            AbstractC0524q0.this.k().d(instance);
            AbstractC0524q0.this.f30044h.a().g(AbstractC0524q0.this.h());
            AbstractC0524q0.this.f().k().b(AbstractC0524q0.this.e().b().a());
        }

        @Override // com.ironsource.F
        public void a(B instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            AbstractC0524q0.this.f30044h.a().a(AbstractC0524q0.this.h());
            K0 k8 = (K0) AbstractC0524q0.this.f30042f.get();
            if (k8 != null) {
                k8.e();
            }
        }
    }

    public final void a(K adInstancePresenter, InterfaceC0685z0 displayListener) {
        kotlin.jvm.internal.n.f(adInstancePresenter, "adInstancePresenter");
        kotlin.jvm.internal.n.f(displayListener, "displayListener");
        this.f30040d = displayListener;
        this.f30041e.a(adInstancePresenter, false);
    }

    public final void a(boolean z10) {
        IronLog.INTERNAL.verbose(C0506p0.a(this.f30038b, (String) null, (String) null, 3, (Object) null));
        this.f30041e.d();
        if (z10) {
            this.f30038b.d().e().a(this.f30038b.e());
        }
    }

    public final void a(int i10, String errorReason) {
        kotlin.jvm.internal.n.f(errorReason, "errorReason");
        IronLog.INTERNAL.verbose(a("errorCode = " + i10 + ", errorReason = " + errorReason));
        this.f30044h.e().a(C0350g5.a(this.f30043g), i10, errorReason, this.f30037a.u());
        M0 m7 = this.f30039c;
        if (m7 != null) {
            m7.a(new IronSourceError(i10, errorReason));
        }
    }

    public final String a(String str) {
        return C0506p0.a(this.f30038b, str, (String) null, 2, (Object) null);
    }
}

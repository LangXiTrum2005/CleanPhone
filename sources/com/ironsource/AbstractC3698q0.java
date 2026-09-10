package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3698q0 {
    private final AbstractC3816x0 a;
    private final R6 b;
    private final V0 c;
    private M0 d;
    private InterfaceC3850z0 e;
    private final rg f;
    private final WeakReference<K0> g;
    private C3507f5 h;
    private final C3838y5 i;

    /* JADX INFO: renamed from: com.ironsource.q0$b */
    public static final class b implements zg {
        public b() {
        }

        @Override // com.ironsource.zg
        public void a(int i, String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            AbstractC3698q0.this.a(i, errorReason);
        }

        @Override // com.ironsource.zg
        public void b(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC3698q0.this.i.e().a(C3507f5.a(AbstractC3698q0.this.h), AbstractC3698q0.this.e().u());
            M0 m0J = AbstractC3698q0.this.j();
            if (m0J != null) {
                m0J.a(new C3765u0(AbstractC3698q0.this, instance.e()));
            }
        }

        @Override // com.ironsource.zg
        public void a(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC3698q0.this.f().e().a().e(AbstractC3698q0.this.h());
            M0 m0J = AbstractC3698q0.this.j();
            if (m0J != null) {
                m0J.b(new C3765u0(AbstractC3698q0.this, instance.e()));
            }
        }
    }

    public AbstractC3698q0(C3681p0 adTools, AbstractC3816x0 adUnitData, K0 listener, R6 taskScheduler) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        this.a = adUnitData;
        this.b = taskScheduler;
        V0 v0 = new V0(adTools, adUnitData, F0.b.MEDIATION);
        this.c = v0;
        this.f = new rg(v0, adUnitData, false, c());
        this.g = new WeakReference<>(listener);
        this.i = v0.e();
        IronLog.INTERNAL.verbose("adFormat = " + adUnitData.b().a() + ", adUnitId = " + adUnitData.b().c());
    }

    public abstract E a();

    public InterfaceC3591k0 d() {
        return this.f.h() ? InterfaceC3591k0.b.a : new InterfaceC3591k0.a(null, 1, null);
    }

    public final AbstractC3816x0 e() {
        return this.a;
    }

    public final V0 f() {
        return this.c;
    }

    public final C3461cd g() {
        return this.a.b().f();
    }

    public final String h() {
        return this.a.l();
    }

    public final InterfaceC3850z0 i() {
        return this.e;
    }

    public final M0 j() {
        return this.d;
    }

    public final rg k() {
        return this.f;
    }

    private final b c() {
        return new b();
    }

    public final void a(InterfaceC3850z0 interfaceC3850z0) {
        this.e = interfaceC3850z0;
    }

    public final void b(M0 m0) {
        this.d = m0;
    }

    public void a(M0 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C3681p0.a(this.c, (String) null, (String) null, 3, (Object) null));
        this.c.a(b());
        this.d = loadListener;
        this.i.a(this.a.u());
        this.h = new C3507f5();
        this.f.a(a());
    }

    public C3731s0 b() {
        return new C3731s0(this.a.b());
    }

    /* JADX INFO: renamed from: com.ironsource.q0$a */
    public class a implements F {
        public a() {
        }

        @Override // com.ironsource.F
        public void a(B instance, IronSourceError error) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.INTERNAL.verbose(AbstractC3698q0.this.a(instance.q()));
            AbstractC3698q0.this.i.a().a(AbstractC3698q0.this.h(), error.getErrorCode(), error.getErrorMessage(), null);
            InterfaceC3850z0 interfaceC3850z0I = AbstractC3698q0.this.i();
            if (interfaceC3850z0I != null) {
                interfaceC3850z0I.c(error);
            }
        }

        @Override // com.ironsource.F
        public void b(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(AbstractC3698q0.this.a(instance.q()));
            AbstractC3698q0.this.k().c(instance);
            AbstractC3698q0.this.i.a().g(AbstractC3698q0.this.h());
            AbstractC3698q0.this.f().l().b(AbstractC3698q0.this.e().b().a());
        }

        @Override // com.ironsource.F
        public void a(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC3698q0.this.i.a().a(AbstractC3698q0.this.h());
            K0 k0 = (K0) AbstractC3698q0.this.g.get();
            if (k0 != null) {
                k0.e();
            }
        }
    }

    public final void a(K adInstancePresenter, InterfaceC3850z0 displayListener) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        this.e = displayListener;
        this.f.a(adInstancePresenter, false);
    }

    public /* synthetic */ AbstractC3698q0(C3681p0 c3681p0, AbstractC3816x0 abstractC3816x0, K0 k0, R6 r6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3681p0, abstractC3816x0, k0, (i & 8) != 0 ? new R6(S6.a(c3681p0.a())) : r6);
    }

    public final void a(boolean z) {
        IronLog.INTERNAL.verbose(C3681p0.a(this.c, (String) null, (String) null, 3, (Object) null));
        this.f.d();
        if (z) {
            this.c.e().e().a(this.c.f());
        }
    }

    public final void a(int i, String errorReason) {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        IronLog.INTERNAL.verbose(a("errorCode = " + i + ", errorReason = " + errorReason));
        this.i.e().a(C3507f5.a(this.h), i, errorReason, this.a.u());
        M0 m0 = this.d;
        if (m0 != null) {
            m0.a(new IronSourceError(i, errorReason));
        }
    }

    public final String a(String str) {
        return C3681p0.a(this.c, str, (String) null, 2, (Object) null);
    }
}

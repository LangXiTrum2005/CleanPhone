package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Kg implements G, Ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V0 f26460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC0649x0 f26461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Sg f26462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0644wd f26463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F f26464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bh f26465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Ng f26466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private H f26467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Vg f26468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<B> f26469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private B f26470k;
    private boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f26471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f26472n;

    public Kg(V0 adTools, AbstractC0649x0 adUnitData, boolean z10, Sg listener, InterfaceC0644wd interfaceC0644wd, F f10) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(listener, "listener");
        this.f26460a = adTools;
        this.f26461b = adUnitData;
        this.f26462c = listener;
        this.f26463d = interfaceC0644wd;
        this.f26464e = f10;
        this.f26465f = bh.a.f28314a.a(z10, this);
        this.f26466g = Ng.f26665d.a(adTools, adUnitData);
        this.f26469j = new ArrayList();
    }

    private final void c(B b10) {
        if (this.l || i()) {
            if (!b10.A()) {
                b10.c();
                return;
            }
            InterfaceC0644wd interfaceC0644wd = this.f26463d;
            if (interfaceC0644wd != null) {
                interfaceC0644wd.a(this.f26461b.b().c(), false);
                return;
            }
            return;
        }
        F f10 = this.f26464e;
        if (f10 != null) {
            b10.a(f10);
        }
        Vg vg2 = this.f26468i;
        if (vg2 != null) {
            vg2.a(b10);
        }
        this.f26469j.add(b10);
        if (this.f26469j.size() == 1) {
            Vg vg3 = this.f26468i;
            if (vg3 != null) {
                vg3.b(b10);
            }
            this.f26462c.b(b10);
            return;
        }
        H h7 = this.f26467h;
        if (h7 == null || !h7.a(b10)) {
            return;
        }
        this.f26462c.a(b10);
    }

    private final List<B> f() {
        H.c cVarC;
        List<B> listD;
        H h7 = this.f26467h;
        return (h7 == null || (cVarC = h7.c()) == null || (listD = cVarC.d()) == null) ? xj.v.f53866a : listD;
    }

    private final boolean i() {
        return this.f26470k != null;
    }

    private final void j() {
        H h7 = this.f26467h;
        H.b bVarD = h7 != null ? h7.d() : null;
        if (bVarD == null || bVarD.e()) {
            this.f26462c.a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
            return;
        }
        if (bVarD.f()) {
            Vg vg2 = this.f26468i;
            if (vg2 != null) {
                vg2.a();
                return;
            }
            return;
        }
        for (B b10 : bVarD.a()) {
            this.f26472n++;
            if (b10.A()) {
                this.f26471m = false;
                b(b10);
            } else {
                b10.a(this);
            }
        }
    }

    public final void d() {
        this.l = true;
        B b10 = this.f26470k;
        if (b10 != null) {
            b10.b();
        }
    }

    public final B e() {
        H.c cVarC;
        H h7 = this.f26467h;
        if (h7 == null || (cVarC = h7.c()) == null) {
            return null;
        }
        return cVarC.c();
    }

    public final Nd g() {
        return this.f26465f.b();
    }

    public final boolean h() {
        Iterator<B> it = this.f26469j.iterator();
        while (it.hasNext()) {
            if (it.next().B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.G
    public void b(B instance) {
        InterfaceC0644wd interfaceC0644wd;
        kotlin.jvm.internal.n.f(instance, "instance");
        this.f26472n--;
        c(instance);
        if (this.f26472n > 0 || !this.f26471m || (interfaceC0644wd = this.f26463d) == null) {
            return;
        }
        interfaceC0644wd.a(this.f26461b.b().c(), false);
    }

    public final void d(B instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        Vg vg2 = this.f26468i;
        if (vg2 != null) {
            vg2.a(instance, this.f26461b.l(), this.f26461b.o());
        }
    }

    public final void a(E adInstanceFactory) {
        kotlin.jvm.internal.n.f(adInstanceFactory, "adInstanceFactory");
        this.f26466g.a(adInstanceFactory, new a());
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements Og {
        public a() {
        }

        @Override // com.ironsource.Og
        public void a(Pg waterfallInstances) {
            boolean z10;
            kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
            if (Kg.this.l) {
                return;
            }
            Kg kg2 = Kg.this;
            List<B> listB = waterfallInstances.b();
            if ((listB instanceof Collection) && listB.isEmpty()) {
                z10 = false;
            } else {
                Iterator<T> it = listB.iterator();
                while (it.hasNext()) {
                    if (((B) it.next()).A()) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            kg2.f26471m = z10;
            Kg.this.a(waterfallInstances);
        }

        @Override // com.ironsource.Og
        public void a(int i10, String errorReason) {
            kotlin.jvm.internal.n.f(errorReason, "errorReason");
            if (Kg.this.l) {
                return;
            }
            Kg.this.f26462c.a(i10, errorReason);
        }
    }

    @Override // com.ironsource.Ug
    public boolean b() {
        return !this.f26469j.isEmpty();
    }

    public final void a(K adInstancePresenter, boolean z10) {
        Vg vg2;
        kotlin.jvm.internal.n.f(adInstancePresenter, "adInstancePresenter");
        B bC = this.f26465f.c();
        if (bC != null) {
            this.f26465f.a(bC);
            if (!z10 && (vg2 = this.f26468i) != null) {
                vg2.a(bC, f());
            }
            bC.a(adInstancePresenter);
        }
    }

    public /* synthetic */ Kg(V0 v4, AbstractC0649x0 abstractC0649x0, boolean z10, Sg sg2, InterfaceC0644wd interfaceC0644wd, F f10, int i10, kotlin.jvm.internal.g gVar) {
        this(v4, abstractC0649x0, z10, sg2, (i10 & 16) != 0 ? null : interfaceC0644wd, (i10 & 32) != 0 ? null : f10);
    }

    @Override // com.ironsource.G
    public void a(IronSourceError error, B instance) {
        kotlin.jvm.internal.n.f(error, "error");
        kotlin.jvm.internal.n.f(instance, "instance");
        this.f26472n--;
        if (this.l) {
            return;
        }
        j();
    }

    public final void c() {
        this.f26465f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Pg pg2) {
        H hA = H.f26207c.a(this.f26461b, pg2);
        this.f26467h = hA;
        this.f26468i = Vg.f27498c.a(this.f26460a, this.f26461b, this.f26466g.a(), pg2, hA);
        j();
    }

    @Override // com.ironsource.Ug
    public void a(B instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        this.f26470k = instance;
        this.f26469j.remove(instance);
    }

    @Override // com.ironsource.Ug
    public void a() {
        IronLog.INTERNAL.verbose(C0506p0.a(this.f26460a, "destroyReadyToShowInstances", (String) null, 2, (Object) null));
        if (this.f26469j.isEmpty()) {
            return;
        }
        String strC = this.f26461b.b().c();
        for (B b10 : this.f26469j) {
            if (b10.A()) {
                InterfaceC0644wd interfaceC0644wd = this.f26463d;
                if (interfaceC0644wd != null) {
                    interfaceC0644wd.a(strC, false);
                }
            } else {
                b10.c();
            }
        }
        this.f26469j.clear();
        this.f26460a.d().h().a();
    }

    @Override // com.ironsource.Ug
    public B a(int i10) {
        List<B> listF = f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (((B) obj).x()) {
                arrayList.add(obj);
            }
        }
        return (B) xj.n.r0(i10, arrayList);
    }
}

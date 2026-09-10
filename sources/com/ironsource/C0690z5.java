package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.z5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0690z5 implements E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f31335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F0 f31336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<E0> f31337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final X8 f31338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0696zb f31339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0468mg f31340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final T1 f31341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final O f31342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C0540qg f31343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Tc f31344j;

    public C0690z5(IronSource.a adFormat, F0.b level, List<? extends E0> eventsInterfaces, AbstractC0437l3 abstractC0437l3) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(level, "level");
        kotlin.jvm.internal.n.f(eventsInterfaces, "eventsInterfaces");
        this.f31335a = adFormat;
        F0 f10 = new F0(adFormat, level, this, abstractC0437l3);
        this.f31336b = f10;
        this.f31337c = xj.n.O0(eventsInterfaces);
        X8 x10 = f10.f26030e;
        kotlin.jvm.internal.n.e(x10, "wrapper.init");
        this.f31338d = x10;
        C0696zb c0696zb = f10.f26031f;
        kotlin.jvm.internal.n.e(c0696zb, "wrapper.load");
        this.f31339e = c0696zb;
        C0468mg c0468mg = f10.f26032g;
        kotlin.jvm.internal.n.e(c0468mg, "wrapper.token");
        this.f31340f = c0468mg;
        T1 t10 = f10.f26033h;
        kotlin.jvm.internal.n.e(t10, "wrapper.auction");
        this.f31341g = t10;
        O o6 = f10.f26034i;
        kotlin.jvm.internal.n.e(o6, "wrapper.adInteraction");
        this.f31342h = o6;
        C0540qg c0540qg = f10.f26035j;
        kotlin.jvm.internal.n.e(c0540qg, "wrapper.troubleshoot");
        this.f31343i = c0540qg;
        Tc tc2 = f10.f26036k;
        kotlin.jvm.internal.n.e(tc2, "wrapper.operational");
        this.f31344j = tc2;
    }

    public final O a() {
        return this.f31342h;
    }

    public final T1 b() {
        return this.f31341g;
    }

    public final List<E0> c() {
        return this.f31337c;
    }

    public final X8 d() {
        return this.f31338d;
    }

    public final C0696zb e() {
        return this.f31339e;
    }

    public final Tc f() {
        return this.f31344j;
    }

    public final C0468mg g() {
        return this.f31340f;
    }

    public final C0540qg h() {
        return this.f31343i;
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 event) {
        kotlin.jvm.internal.n.f(event, "event");
        HashMap map = new HashMap();
        Iterator<E0> it = this.f31337c.iterator();
        while (it.hasNext()) {
            Map<String, Object> mapA = it.next().a(event);
            kotlin.jvm.internal.n.e(mapA, "it.getEventsAdditionalDataMap(event)");
            map.putAll(mapA);
        }
        return map;
    }

    public final void a(E0 eventInterface) {
        kotlin.jvm.internal.n.f(eventInterface, "eventInterface");
        this.f31337c.add(eventInterface);
    }

    public final void a(boolean z10) {
        if (z10) {
            this.f31339e.a(true);
            return;
        }
        if (!z10) {
            IronSource.a aVar = this.f31335a;
            IronSource.a aVar2 = IronSource.a.BANNER;
            C0696zb c0696zb = this.f31339e;
            if (aVar == aVar2) {
                c0696zb.d();
                return;
            } else {
                c0696zb.a(false);
                return;
            }
        }
        throw new aa.b((byte) 0, 20);
    }

    public /* synthetic */ C0690z5(IronSource.a aVar, F0.b bVar, List list, AbstractC0437l3 abstractC0437l3, int i10, kotlin.jvm.internal.g gVar) {
        this(aVar, bVar, (i10 & 4) != 0 ? xj.v.f53866a : list, (i10 & 8) != 0 ? null : abstractC0437l3);
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3838y5 implements E0 {
    private final IronSource.a a;
    private final F0 b;
    private final List<E0> c;
    private final V8 d;
    private final C3793vb e;
    private final Tf f;
    private final T1 g;
    private final O h;
    private final Xf i;
    private final Oc j;

    public C3838y5(IronSource.a adFormat, F0.b level, List<? extends E0> eventsInterfaces, AbstractC3612l3 abstractC3612l3) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(eventsInterfaces, "eventsInterfaces");
        this.a = adFormat;
        F0 f0 = new F0(adFormat, level, this, abstractC3612l3);
        this.b = f0;
        this.c = CollectionsKt.basify(eventsInterfaces);
        V8 v8 = f0.e;
        Intrinsics.checkNotNullExpressionValue(v8, "wrapper.init");
        this.d = v8;
        C3793vb c3793vb = f0.f;
        Intrinsics.checkNotNullExpressionValue(c3793vb, "wrapper.load");
        this.e = c3793vb;
        Tf tf = f0.g;
        Intrinsics.checkNotNullExpressionValue(tf, "wrapper.token");
        this.f = tf;
        T1 t1 = f0.h;
        Intrinsics.checkNotNullExpressionValue(t1, "wrapper.auction");
        this.g = t1;
        O o = f0.i;
        Intrinsics.checkNotNullExpressionValue(o, "wrapper.adInteraction");
        this.h = o;
        Xf xf = f0.j;
        Intrinsics.checkNotNullExpressionValue(xf, "wrapper.troubleshoot");
        this.i = xf;
        Oc oc = f0.k;
        Intrinsics.checkNotNullExpressionValue(oc, "wrapper.operational");
        this.j = oc;
    }

    public final O a() {
        return this.h;
    }

    public final T1 b() {
        return this.g;
    }

    public final List<E0> c() {
        return this.c;
    }

    public final V8 d() {
        return this.d;
    }

    public final C3793vb e() {
        return this.e;
    }

    public final Oc f() {
        return this.j;
    }

    public final Tf g() {
        return this.f;
    }

    public final Xf h() {
        return this.i;
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap map = new HashMap();
        Iterator<E0> it = this.c.iterator();
        while (it.hasNext()) {
            Map<String, Object> mapA = it.next().a(event);
            Intrinsics.checkNotNullExpressionValue(mapA, "it.getEventsAdditionalDataMap(event)");
            map.putAll(mapA);
        }
        return map;
    }

    public final void a(E0 eventInterface) {
        Intrinsics.checkNotNullParameter(eventInterface, "eventInterface");
        this.c.add(eventInterface);
    }

    public final void a(boolean z) {
        if (z) {
            this.e.a(true);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.a == IronSource.a.BANNER) {
                this.e.a();
            } else {
                this.e.a(false);
            }
        }
    }

    public /* synthetic */ C3838y5(IronSource.a aVar, F0.b bVar, List list, AbstractC3612l3 abstractC3612l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, bVar, (i & 4) != 0 ? p002kotlin.collections.adultoid.formularize() : list, (i & 8) != 0 ? null : abstractC3612l3);
    }
}

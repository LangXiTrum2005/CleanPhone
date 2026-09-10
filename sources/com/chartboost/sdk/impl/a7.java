package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.InitializedLazyImpl;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a7 implements z6, y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Lazy f13407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Lazy f13408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Lazy f13409c;
    public Lazy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Lazy f13410e;
    public Lazy f;
    public final Map g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f13411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f13412i;

    public a7(Lazy config, Lazy throttler, Lazy requestBodyBuilder, Lazy privacyApi, Lazy trackingRequest, Lazy trackingEventCache) {
        Intrinsics.f(config, "config");
        Intrinsics.f(throttler, "throttler");
        Intrinsics.f(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.f(privacyApi, "privacyApi");
        Intrinsics.f(trackingRequest, "trackingRequest");
        Intrinsics.f(trackingEventCache, "trackingEventCache");
        this.f13407a = config;
        this.f13408b = throttler;
        this.f13409c = requestBodyBuilder;
        this.d = privacyApi;
        this.f13410e = trackingRequest;
        this.f = trackingEventCache;
        this.g = new LinkedHashMap();
        this.f13411h = new LinkedHashMap();
        this.f13412i = new ArrayList();
    }

    public final String a(String str, String str2) {
        return android.support.v4.media.a.m(str, str2);
    }

    public final void b(ch chVar) {
        Unit unit;
        if (chVar != null) {
            try {
                if (((ah) this.f13407a.getX()).d()) {
                    c(chVar);
                } else {
                    d(chVar);
                }
                unit = Unit.f43263a;
            } catch (Exception e2) {
                za.a("Cannot send tracking event", e2);
                return;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("Cannot save empty event", (Throwable) null, 2, (Object) null);
        }
    }

    public final void c(ch chVar) {
        ((eh) this.f.getX()).a(chVar, a(), ((ah) this.f13407a.getX()).e());
        if (chVar.g() == ch.a.HIGH) {
            a(((eh) this.f.getX()).a());
        }
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f13411h.remove(a(location, type));
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        mo185clearFromStorage(chVar);
        return chVar;
    }

    public final void d(ch chVar) {
        this.f13412i.add(chVar);
        if (chVar.g() == ch.a.HIGH) {
            a(((eh) this.f.getX()).a(this.f13412i, a()));
        }
    }

    public final String e(ch chVar) {
        return a(chVar.c(), chVar.a());
    }

    public final boolean f(ch chVar) {
        fh fhVarF = chVar.f();
        return fhVarF == fh.a.START || fhVarF == fh.i.START;
    }

    public final void g(ch chVar) {
        chVar.a((ug) this.g.get(e(chVar)));
        chVar.a(a(chVar));
        b(chVar);
        za.a("Event: " + chVar, (Throwable) null, 2, (Object) null);
        h(chVar);
    }

    public final void h(ch chVar) {
        if (f(chVar)) {
            this.f13411h.put(e(chVar), chVar);
        }
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        mo186persist(chVar);
        return chVar;
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        mo187refresh(ahVar);
        return ahVar;
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        mo188store(ugVar);
        return ugVar;
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        mo189track(chVar);
        return chVar;
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage, reason: collision with other method in class */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        ((eh) this.f.getX()).a(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist, reason: collision with other method in class */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        event.a((ug) this.g.get(e(event)));
        event.a(a(event));
        za.a("Persist event: " + event, (Throwable) null, 2, (Object) null);
        ((eh) this.f.getX()).a(event, a());
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh, reason: collision with other method in class */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f13407a = new InitializedLazyImpl(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store, reason: collision with other method in class */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.g.put(a(ad), ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track, reason: collision with other method in class */
    public void mo189track(ch event) {
        Unit unit;
        Intrinsics.f(event, "event");
        ah ahVar = (ah) this.f13407a.getX();
        if (!ahVar.g()) {
            za.a("Tracking is disabled", (Throwable) null, 2, (Object) null);
            return;
        }
        if (ahVar.a().contains(event.f())) {
            za.a("Event name " + event.f() + " is black-listed", (Throwable) null, 2, (Object) null);
            return;
        }
        ch chVarE = ((w6) this.f13408b.getX()).e(event);
        if (chVarE != null) {
            g(chVarE);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.a("Event is throttled " + event, (Throwable) null, 2, (Object) null);
        }
    }

    public final float a(ch chVar) {
        if (!chVar.h()) {
            return chVar.b();
        }
        if (!chVar.m()) {
            return 0.0f;
        }
        try {
            ch chVar2 = (ch) this.f13411h.remove(e(chVar));
            if (chVar2 != null) {
                return (chVar.i() - chVar2.i()) / 1000.0f;
            }
            return -1.0f;
        } catch (Exception e2) {
            za.a("Cannot calculate latency", e2);
            return -1.0f;
        }
    }

    public final void a(List list) {
        ((ih) this.f13410e.getX()).a(((ah) this.f13407a.getX()).b(), list);
    }

    public final s6 a() {
        try {
            gf gfVarA = ((ef) this.f13409c.getX()).a();
            return r6.f14995a.a(gfVarA.c(), gfVarA.h(), gfVarA.g().c(), (be) this.d.getX(), gfVarA.f14024h);
        } catch (Exception e2) {
            za.a("Cannot create environment data for tracking", e2);
            return new s6(null, 0, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, 0, false, 0, 0L, 0L, 0, 0, 0, 0L, 0L, -1, null);
        }
    }

    public final String a(ug ugVar) {
        return android.support.v4.media.a.m(ugVar.e(), ugVar.d());
    }
}

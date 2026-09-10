package com.inmobi.media;

import formularization.attabal;
import formularization.beachfront;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.flow.marial;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3214s2 implements InterfaceC3370y8 {
    public final saran a;
    public final C3360xn b;
    public final formularize c;
    public final attabal d;
    public final AtomicBoolean e;
    public monroe f;
    public final Ee g;

    public AbstractC3214s2(saran coroutineScope, C3285un viewabilityModel, C3360xn viewabilityCriteria, formularize lifecycleObserver) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(viewabilityModel, "viewabilityModel");
        Intrinsics.checkNotNullParameter(viewabilityCriteria, "viewabilityCriteria");
        Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        this.a = coroutineScope;
        this.b = viewabilityCriteria;
        this.c = lifecycleObserver;
        this.d = beachfront.saneness(false, 1, null);
        this.e = new AtomicBoolean(false);
        this.g = new Ee(coroutineScope, viewabilityModel);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(AbstractC3214s2 abstractC3214s2, ContinuationImpl continuationImpl) {
        C3115o2 c3115o2;
        attabal attabalVar;
        abstractC3214s2.getClass();
        if (continuationImpl instanceof C3115o2) {
            c3115o2 = (C3115o2) continuationImpl;
            int i = c3115o2.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3115o2.d = i - Integer.MIN_VALUE;
            } else {
                c3115o2 = new C3115o2(abstractC3214s2, continuationImpl);
            }
        } else {
            c3115o2 = new C3115o2(abstractC3214s2, continuationImpl);
        }
        Object obj = c3115o2.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = c3115o2.d;
        if (i2 == 0) {
            dern.saneness(obj);
            attabal attabalVar2 = abstractC3214s2.d;
            c3115o2.a = attabalVar2;
            c3115o2.d = 1;
            if (attabalVar2.attabal(null, c3115o2) == objBeachfront) {
                return objBeachfront;
            }
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = c3115o2.a;
            dern.saneness(obj);
        }
        try {
            Bn bnC = abstractC3214s2.c();
            C3328wg c3328wg = bnC.a;
            c3328wg.f.set(true);
            H6.a(c3328wg.e);
            c3328wg.e = null;
            H6.a(bnC.d.a);
            bnC.d.a = null;
            H6.a(bnC.e);
            bnC.e = null;
            abstractC3214s2.g.b();
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(AbstractC3214s2 abstractC3214s2, ContinuationImpl continuationImpl) {
        C3140p2 c3140p2;
        attabal attabalVar;
        abstractC3214s2.getClass();
        if (continuationImpl instanceof C3140p2) {
            c3140p2 = (C3140p2) continuationImpl;
            int i = c3140p2.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3140p2.d = i - Integer.MIN_VALUE;
            } else {
                c3140p2 = new C3140p2(abstractC3214s2, continuationImpl);
            }
        } else {
            c3140p2 = new C3140p2(abstractC3214s2, continuationImpl);
        }
        Object obj = c3140p2.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = c3140p2.d;
        if (i2 == 0) {
            dern.saneness(obj);
            attabal attabalVar2 = abstractC3214s2.d;
            c3140p2.a = attabalVar2;
            c3140p2.d = 1;
            if (attabalVar2.attabal(null, c3140p2) == objBeachfront) {
                return objBeachfront;
            }
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = c3140p2.a;
            dern.saneness(obj);
        }
        try {
            if (abstractC3214s2.e.get()) {
                abstractC3214s2.g.a();
            } else {
                abstractC3214s2.g.b();
            }
            if (abstractC3214s2.e.get()) {
                C3328wg c3328wg = abstractC3214s2.c().a;
                c3328wg.f.set(false);
                c3328wg.a();
            } else {
                C3328wg c3328wg2 = abstractC3214s2.c().a;
                c3328wg2.b.setValue(Mn.HIDDEN);
                c3328wg2.f.set(true);
                H6.a(c3328wg2.e);
                c3328wg2.e = null;
            }
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    public abstract Bn c();

    @Override // com.inmobi.media.InterfaceC3370y8
    public final void a() {
        this.e.set(false);
        this.g.b();
        Bn bnC = c();
        C3328wg c3328wg = bnC.a;
        c3328wg.f.set(true);
        H6.a(c3328wg.e);
        c3328wg.e = null;
        H6.a(bnC.d.a);
        bnC.d.a = null;
        H6.a(bnC.e);
        bnC.e = null;
        H6.a(this.f);
        this.f = null;
    }

    @Override // com.inmobi.media.InterfaceC3370y8
    public final kotlinx.coroutines.flow.dern b() {
        if (this.f == null) {
            this.f = cutely.wireman(this.a, null, null, new C3090n2(this.c, null, this), 3, null);
            Unit unit = Unit.f29295attabal;
        }
        Bn bnC = c();
        if (bnC.e == null) {
            C3328wg c3328wg = bnC.a;
            c3328wg.a();
            bnC.e = cutely.wireman(bnC.b.a, null, null, new C3410zn(c3328wg.b, null, bnC), 3, null);
            Unit unit2 = Unit.f29295attabal;
        }
        return marial.cuirassed(marial.trm(bnC.c, new C3165q2(this, null)), new C3189r2(this, null));
    }
}

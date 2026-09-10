package com.inmobi.media;

import formularization.attabal;
import formularization.beachfront;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2907fj {
    public final saran a;
    public final attabal b;

    public AbstractC2907fj(saran coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.a = coroutineScope;
        this.b = beachfront.saneness(false, 1, null);
    }

    public abstract InterfaceC2830cj a();

    public abstract void a(InterfaceC2830cj interfaceC2830cj);

    public final void a(InterfaceC2830cj newState, InterfaceC2830cj callerState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        Intrinsics.checkNotNullParameter(callerState, "callerState");
        cutely.wireman(this.a, null, null, new C2856dj(this, newState, callerState, null), 3, null);
    }

    public final void b(InterfaceC2830cj interfaceC2830cj, InterfaceC2830cj interfaceC2830cj2) {
        if (Intrinsics.wireman(a(), interfaceC2830cj2) && !Intrinsics.wireman(a(), interfaceC2830cj)) {
            Intrinsics.checkNotNullExpressionValue(getClass().getSimpleName(), "getSimpleName(...)");
            a().getClass();
            interfaceC2830cj.getClass();
            a().c();
            a(interfaceC2830cj);
            a().a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Vc vc, InterfaceC2830cj interfaceC2830cj, ContinuationImpl continuationImpl) {
        C2881ej c2881ej;
        attabal attabalVar;
        InterfaceC2830cj interfaceC2830cj2;
        if (continuationImpl instanceof C2881ej) {
            c2881ej = (C2881ej) continuationImpl;
            int i = c2881ej.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2881ej.f = i - Integer.MIN_VALUE;
            } else {
                c2881ej = new C2881ej(this, continuationImpl);
            }
        } else {
            c2881ej = new C2881ej(this, continuationImpl);
        }
        Object obj = c2881ej.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = c2881ej.f;
        if (i2 == 0) {
            dern.saneness(obj);
            attabalVar = this.b;
            c2881ej.a = vc;
            c2881ej.b = interfaceC2830cj;
            c2881ej.c = attabalVar;
            c2881ej.f = 1;
            if (attabalVar.attabal(null, c2881ej) == objBeachfront) {
                interfaceC2830cj2 = vc;
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabal attabalVar2 = c2881ej.c;
            interfaceC2830cj = c2881ej.b;
            InterfaceC2830cj interfaceC2830cj3 = c2881ej.a;
            dern.saneness(obj);
            attabalVar = attabalVar2;
            interfaceC2830cj2 = interfaceC2830cj3;
        }
        try {
            interfaceC2830cj2 = vc;
            b(interfaceC2830cj2, interfaceC2830cj);
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }
}

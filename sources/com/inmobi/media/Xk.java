package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Xk extends SuspendLambda implements Function2 {
    public int a;

    public Xk(dern dernVar) {
        super(2, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new Xk(dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Xk((dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            String strB = Ji.b();
            if (strB == null) {
                return Unit.f29295attabal;
            }
            if (!Intrinsics.wireman(strB, Ji.c)) {
                C2968i4 c2968i4 = Y3.a;
                this.a = 1;
                Object objA = C2923g9.a(((C2763a4) Y3.a.b.b.getValue()).a, "config_db", null, this, 6);
                if (objA != attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
                if (objA != attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
                if (objA != attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
                if (objA == objBeachfront) {
                    return objBeachfront;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}

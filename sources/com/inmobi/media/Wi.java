package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Wi extends SuspendLambda implements Function1 {
    public int a;

    public Wi(dern dernVar) {
        super(1, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new Wi(dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Wi((dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            Intrinsics.checkNotNullExpressionValue(Yi.b, "access$getTAG$p(...)");
            Qi qi = Qi.a;
            boolean sessionEnabled = Yi.a().getSessionEnabled();
            qi.getClass();
            Qi.e = sessionEnabled;
            if (!sessionEnabled) {
                Qi.d = null;
            }
            Qi.c();
            if (Ji.b() == null || Yi.a().getLocationEnabled()) {
                C3074mb c3074mb = C3074mb.a;
                this.a = 1;
                if (c3074mb.a(this) == objBeachfront) {
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

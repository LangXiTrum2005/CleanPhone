package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2795ba extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3174qb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2795ba(C3174qb c3174qb, dern dernVar) {
        super(2, dernVar);
        this.b = c3174qb;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2795ba(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2795ba(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            C3348xb c3348xb = (C3348xb) AbstractC3373yb.a.getValue();
            C3174qb c3174qb = this.b;
            this.a = 1;
            if (c3348xb.b(c3174qb, this) == objBeachfront) {
                return objBeachfront;
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

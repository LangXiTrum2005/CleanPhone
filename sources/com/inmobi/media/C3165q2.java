package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3165q2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ AbstractC3214s2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3165q2(AbstractC3214s2 abstractC3214s2, dern dernVar) {
        super(2, dernVar);
        this.b = abstractC3214s2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3165q2(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3165q2(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            AbstractC3214s2 abstractC3214s2 = this.b;
            this.a = 1;
            if (AbstractC3214s2.b(abstractC3214s2, this) == objBeachfront) {
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

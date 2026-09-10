package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3168q5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3192r5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3168q5(C3192r5 c3192r5, dern dernVar) {
        super(2, dernVar);
        this.b = c3192r5;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3168q5(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3168q5(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            AbstractC3213s1 abstractC3213s1 = this.b.b;
            if (abstractC3213s1 != null) {
                abstractC3213s1.a();
            }
            Fc fc = this.b.a;
            if (fc != null) {
                this.a = 1;
                if (fc.a(this) == objBeachfront) {
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

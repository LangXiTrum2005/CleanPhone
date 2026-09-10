package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3020k7 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ C3070m7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3020k7(C3070m7 c3070m7, dern dernVar) {
        super(1, dernVar);
        this.b = c3070m7;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new C3020k7(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3020k7(this.b, (dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            C3070m7 c3070m7 = this.b;
            this.a = 1;
            if (c3070m7.b(this) == objBeachfront) {
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

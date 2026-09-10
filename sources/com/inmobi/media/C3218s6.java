package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.s6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3218s6 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ C3268u6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3218s6(C3268u6 c3268u6, dern dernVar) {
        super(1, dernVar);
        this.b = c3268u6;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new C3218s6(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3218s6(this.b, (dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                C3268u6 c3268u6 = this.b;
                this.a = 1;
                if (C3268u6.a(c3268u6, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
        } catch (Exception e) {
            e.toString();
        }
        return Unit.f29295attabal;
    }
}

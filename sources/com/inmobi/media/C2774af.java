package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2774af extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ C2826cf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2774af(C2826cf c2826cf, dern dernVar) {
        super(1, dernVar);
        this.b = c2826cf;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new C2774af(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C2774af(this.b, (dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            C2826cf c2826cf = this.b;
            this.a = 1;
            if (c2826cf.b(this) == objBeachfront) {
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

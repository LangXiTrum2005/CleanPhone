package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2844d7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3070m7 b;
    public final /* synthetic */ Rf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2844d7(C3070m7 c3070m7, Rf rf, dern dernVar) {
        super(2, dernVar);
        this.b = c3070m7;
        this.c = rf;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2844d7(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2844d7(this.b, this.c, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            C3070m7 c3070m7 = this.b;
            Rf rf = this.c;
            C2818c7 c2818c7 = new C2818c7(this.b);
            this.a = 1;
            if (c3070m7.a(rf, c2818c7, this) == objBeachfront) {
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

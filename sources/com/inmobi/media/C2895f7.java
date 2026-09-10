package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2895f7 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3070m7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2895f7(C3070m7 c3070m7, dern dernVar) {
        super(2, dernVar);
        this.c = c3070m7;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C2895f7 c2895f7 = new C2895f7(this.c, dernVar);
        c2895f7.b = obj;
        return c2895f7;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C2895f7 c2895f7 = new C2895f7(this.c, (dern) obj2);
        c2895f7.b = (Xf) obj;
        return c2895f7.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            Xf xf = (Xf) this.b;
            C3070m7 c3070m7 = this.c;
            this.a = 1;
            Object objA = c3070m7.b.a(xf, this);
            if (objA != attabal.beachfront()) {
                objA = Unit.f29295attabal;
            }
            if (objA == objBeachfront) {
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

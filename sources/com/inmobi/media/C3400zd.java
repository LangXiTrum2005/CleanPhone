package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3400zd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ AbstractC3318w6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3400zd(AbstractC3318w6 abstractC3318w6, dern dernVar) {
        super(2, dernVar);
        this.b = abstractC3318w6;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3400zd(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3400zd(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        p002kotlin.dern.saneness(obj);
        AbstractC3318w6 abstractC3318w6 = this.b;
        this.a = 1;
        Object objA = abstractC3318w6.a(this);
        return objA == objBeachfront ? objBeachfront : objA;
    }
}

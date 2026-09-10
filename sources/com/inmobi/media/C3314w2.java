package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3314w2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AbstractC3339x2 a;
    public final /* synthetic */ Rl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3314w2(AbstractC3339x2 abstractC3339x2, Rl rl, dern dernVar) {
        super(2, dernVar);
        this.a = abstractC3339x2;
        this.b = rl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3314w2(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3314w2(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        AbstractC3339x2 abstractC3339x2 = this.a;
        Rl rl = this.b;
        int i = AbstractC3339x2.h;
        abstractC3339x2.b(rl);
        return Unit.f29295attabal;
    }
}

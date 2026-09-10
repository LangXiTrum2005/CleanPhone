package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3181qi extends SuspendLambda implements Function2 {
    public final /* synthetic */ AbstractC3205ri a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3181qi(AbstractC3205ri abstractC3205ri, dern dernVar) {
        super(2, dernVar);
        this.a = abstractC3205ri;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3181qi(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3181qi(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.d.onUserLeftApplication();
        return Unit.f29295attabal;
    }
}

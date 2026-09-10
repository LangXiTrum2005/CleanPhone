package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.de, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2851de extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3251te a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2851de(C3251te c3251te, dern dernVar) {
        super(2, dernVar);
        this.a = c3251te;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2851de(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2851de(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        AbstractC3310vn.a(this.a.b.c.c);
        AbstractC3310vn.a(this.a.b.c.b);
        return Unit.f29295attabal;
    }
}

package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2833cm extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3135om a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2833cm(C3135om c3135om, dern dernVar) {
        super(2, dernVar);
        this.a = c3135om;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2833cm(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2833cm(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        C3135om c3135om = this.a;
        return new Sd(c3135om.a, c3135om.b, c3135om.c.e, c3135om.e);
    }
}

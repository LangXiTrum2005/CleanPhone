package com.inmobi.media;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2988j0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3063m0 a;
    public final /* synthetic */ Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2988j0(C3063m0 c3063m0, Map map, dern dernVar) {
        super(2, dernVar);
        this.a = c3063m0;
        this.b = map;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2988j0(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2988j0(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        Map mapA = AbstractC2983ik.a(this.a.b);
        mapA.putAll(this.b);
        Wj wj = Wj.a;
        Wj.b("ServerError", mapA, EnumC2779ak.SDK);
        return Unit.f29295attabal;
    }
}

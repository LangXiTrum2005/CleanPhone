package com.inmobi.media;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3131oi extends SuspendLambda implements Function2 {
    public final /* synthetic */ AbstractC3205ri a;
    public final /* synthetic */ Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3131oi(AbstractC3205ri abstractC3205ri, Map map, dern dernVar) {
        super(2, dernVar);
        this.a = abstractC3205ri;
        this.b = map;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3131oi(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3131oi(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.d.onAdClicked(this.b);
        return Unit.f29295attabal;
    }
}

package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3060lm extends SuspendLambda implements Function2 {
    public final /* synthetic */ K3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3060lm(K3 k3, dern dernVar) {
        super(2, dernVar);
        this.a = k3;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3060lm(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3060lm(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.a();
        return Unit.f29295attabal;
    }
}

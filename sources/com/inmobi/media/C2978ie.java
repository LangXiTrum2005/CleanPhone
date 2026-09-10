package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2978ie extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3226se a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2978ie(C3226se c3226se, dern dernVar) {
        super(2, dernVar);
        this.a = c3226se;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2978ie(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2978ie(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.h.onVideoCompleted();
        return Unit.f29295attabal;
    }
}

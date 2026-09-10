package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2873eb extends SuspendLambda implements Function2 {
    public final /* synthetic */ C2899fb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2873eb(C2899fb c2899fb, dern dernVar) {
        super(2, dernVar);
        this.a = c2899fb;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2873eb(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2873eb(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        C2899fb c2899fb = this.a;
        c2899fb.f.onAdLoadFailed(c2899fb.e);
        return Unit.f29295attabal;
    }
}

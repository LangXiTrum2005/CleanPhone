package com.inmobi.media;

import java.lang.ref.WeakReference;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3147p9 extends SuspendLambda implements Function1 {
    public C3147p9(dern dernVar) {
        super(1, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new C3147p9(dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3147p9((dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        C3348xb c3348xb = (C3348xb) AbstractC3373yb.a.getValue();
        C3122o9 listener = AbstractC3172q9.c;
        c3348xb.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        c3348xb.b = new WeakReference(listener);
        return Unit.f29295attabal;
    }
}

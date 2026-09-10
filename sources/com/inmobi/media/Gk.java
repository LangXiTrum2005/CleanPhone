package com.inmobi.media;

import kotlinx.coroutines.monroe;
import kotlinx.coroutines.walach;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Gk extends SuspendLambda implements Function1 {
    public Gk(dern dernVar) {
        super(1, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new Gk(dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Gk((dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        walach walachVar;
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        if (Jk.b.b.get() != null && (walachVar = Jk.d) != null) {
            monroe.attabal.attabal(walachVar, null, 1, null);
        }
        return Unit.f29295attabal;
    }
}

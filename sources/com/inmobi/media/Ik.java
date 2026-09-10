package com.inmobi.media;

import kotlinx.coroutines.monroe;
import kotlinx.coroutines.walach;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Ik extends SuspendLambda implements Function1 {
    public Ik(dern dernVar) {
        super(1, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new Ik(dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Ik((dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        walach walachVar = Jk.d;
        if (walachVar != null) {
            monroe.attabal.attabal(walachVar, null, 1, null);
        }
        Jk.d = null;
        Jk.c.clear();
        return Unit.f29295attabal;
    }
}

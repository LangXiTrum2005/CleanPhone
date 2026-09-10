package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3177qe extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;

    public C3177qe(dern dernVar) {
        super(2, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3177qe c3177qe = new C3177qe(dernVar);
        c3177qe.a = ((Boolean) obj).booleanValue();
        return c3177qe;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        C3177qe c3177qe = new C3177qe((dern) obj2);
        c3177qe.a = bool.booleanValue();
        return c3177qe.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        return igo.attabal.attabal(this.a);
    }
}

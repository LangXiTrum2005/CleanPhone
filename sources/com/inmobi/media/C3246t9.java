package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3246t9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3271u9 b;
    public final /* synthetic */ Me c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3246t9(C3271u9 c3271u9, Me me2, dern dernVar) {
        super(2, dernVar);
        this.b = c3271u9;
        this.c = me2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3246t9(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3246t9(this.b, this.c, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        p002kotlin.dern.saneness(obj);
        C3341x4 c3341x4 = this.b.a;
        Me me2 = this.c;
        this.a = 1;
        Object objA = c3341x4.a(me2, this);
        return objA == objBeachfront ? objBeachfront : objA;
    }
}

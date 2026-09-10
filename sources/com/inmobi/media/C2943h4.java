package com.inmobi.media;

import kotlinx.coroutines.flow.marial;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2943h4 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C2968i4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2943h4(C2968i4 c2968i4, dern dernVar) {
        super(2, dernVar);
        this.b = c2968i4;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2943h4(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2943h4(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            C2968i4 c2968i4 = this.b;
            this.a = 1;
            Object objCollect = marial.adultoid(new C3279uh(new C3304vh((C2763a4) c2968i4.b.b.getValue()), null)).collect(new C2866e4(c2968i4), this);
            if (objCollect != attabal.beachfront()) {
                objCollect = Unit.f29295attabal;
            }
            if (objCollect == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}

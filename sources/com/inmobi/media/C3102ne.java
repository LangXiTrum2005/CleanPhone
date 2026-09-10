package com.inmobi.media;

import kotlinx.coroutines.flow.marial;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3102ne extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3251te b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3102ne(C3251te c3251te, dern dernVar) {
        super(2, dernVar);
        this.b = c3251te;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3102ne(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3102ne(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            InterfaceC3072m9 interfaceC3072m9L = this.b.l();
            if (interfaceC3072m9L != null) {
                ((C3097n9) interfaceC3072m9L).a("NativeRenderedState", "Impression Tracking Started - waiting for viewability criteria");
            }
            kotlinx.coroutines.flow.dern dernVarB = ((C2901fd) this.b.b.j.getValue()).b();
            C3077me c3077me = new C3077me(null);
            this.a = 1;
            if (marial.polloi(dernVarB, c3077me, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        this.b.m();
        ((C2901fd) this.b.b.j.getValue()).a();
        return Unit.f29295attabal;
    }
}

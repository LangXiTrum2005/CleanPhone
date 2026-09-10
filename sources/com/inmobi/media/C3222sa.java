package com.inmobi.media;

import kotlinx.coroutines.gintrap;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Ref$IntRef;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3222sa extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3123oa b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3222sa(ViewTreeObserverOnGlobalLayoutListenerC3123oa viewTreeObserverOnGlobalLayoutListenerC3123oa, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, dern dernVar) {
        super(2, dernVar);
        this.b = viewTreeObserverOnGlobalLayoutListenerC3123oa;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3222sa(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3222sa) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            gintrap gintrapVar = this.b.e;
            this.a = 1;
            if (gintrapVar.dent(this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        Ref$IntRef ref$IntRef = this.c;
        ViewTreeObserverOnGlobalLayoutListenerC3123oa viewTreeObserverOnGlobalLayoutListenerC3123oa = this.b;
        ref$IntRef.element = viewTreeObserverOnGlobalLayoutListenerC3123oa.c;
        this.d.element = viewTreeObserverOnGlobalLayoutListenerC3123oa.d;
        return Unit.f29295attabal;
    }
}

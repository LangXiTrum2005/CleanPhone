package com.inmobi.media;

import kotlinx.coroutines.splinterproof;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Wh extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ GestureDetectorOnGestureListenerC2829ci b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wh(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, dern dernVar) {
        super(2, dernVar);
        this.b = gestureDetectorOnGestureListenerC2829ci;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new Wh(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Wh(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC3072m9 interfaceC3072m9;
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            this.a = 1;
            if (splinterproof.attabal(1000L, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        if (!this.b.isAttachedToWindow() && (interfaceC3072m9 = this.b.i) != null) {
            ((C3097n9) interfaceC3072m9).a();
        }
        return Unit.f29295attabal;
    }
}

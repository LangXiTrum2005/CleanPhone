package com.inmobi.media;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3111nn extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Vm c;
    public final /* synthetic */ C3161pn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3111nn(Vm vm, dern dernVar, C3161pn c3161pn) {
        super(2, dernVar);
        this.c = vm;
        this.d = c3161pn;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3111nn c3111nn = new C3111nn(this.c, dernVar, this.d);
        c3111nn.b = obj;
        return c3111nn;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3111nn) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            saran saranVar = (saran) this.b;
            Vm vm = this.c;
            C3086mn c3086mn = new C3086mn(saranVar, this.d);
            this.a = 1;
            if (vm.collect(c3086mn, this) == objBeachfront) {
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

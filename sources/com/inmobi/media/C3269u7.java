package com.inmobi.media;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3269u7 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3344x7 c;
    public final /* synthetic */ N7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3269u7(C3344x7 c3344x7, dern dernVar, N7 n7) {
        super(2, dernVar);
        this.c = c3344x7;
        this.d = n7;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3269u7 c3269u7 = new C3269u7(this.c, dernVar, this.d);
        c3269u7.b = obj;
        return c3269u7;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3269u7) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            saran saranVar = (saran) this.b;
            C3344x7 c3344x7 = this.c;
            C3244t7 c3244t7 = new C3244t7(saranVar, this.d);
            this.a = 1;
            if (c3344x7.collect(c3244t7, this) == objBeachfront) {
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

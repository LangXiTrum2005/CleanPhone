package com.inmobi.media;

import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Yl extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ formularize c;
    public final /* synthetic */ C3135om d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yl(formularize formularizeVar, dern dernVar, C3135om c3135om) {
        super(2, dernVar);
        this.c = formularizeVar;
        this.d = c3135om;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        Yl yl = new Yl(this.c, dernVar, this.d);
        yl.b = obj;
        return yl;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Yl) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            saran saranVar = (saran) this.b;
            formularize formularizeVar = this.c;
            Xl xl = new Xl(saranVar, this.d);
            this.a = 1;
            if (formularizeVar.collect(xl, this) == objBeachfront) {
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

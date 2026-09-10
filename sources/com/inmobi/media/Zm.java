package com.inmobi.media;

import kotlinx.coroutines.flow.apical;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Zm extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ apical c;
    public final /* synthetic */ C2808bn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zm(apical apicalVar, dern dernVar, C2808bn c2808bn) {
        super(2, dernVar);
        this.c = apicalVar;
        this.d = c2808bn;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        Zm zm = new Zm(this.c, dernVar, this.d);
        zm.b = obj;
        return zm;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Zm) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            saran saranVar = (saran) this.b;
            apical apicalVar = this.c;
            Ym ym = new Ym(saranVar, this.d);
            this.a = 1;
            if (apicalVar.collect(ym, this) == objBeachfront) {
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

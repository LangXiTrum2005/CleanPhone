package com.inmobi.media;

import kotlinx.coroutines.flow.apical;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2902fe extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ apical c;
    public final /* synthetic */ C3251te d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2902fe(apical apicalVar, dern dernVar, C3251te c3251te) {
        super(2, dernVar);
        this.c = apicalVar;
        this.d = c3251te;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C2902fe c2902fe = new C2902fe(this.c, dernVar, this.d);
        c2902fe.b = obj;
        return c2902fe;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2902fe) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            saran saranVar = (saran) this.b;
            apical apicalVar = this.c;
            C2876ee c2876ee = new C2876ee(saranVar, this.d);
            this.a = 1;
            if (apicalVar.collect(c2876ee, this) == objBeachfront) {
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

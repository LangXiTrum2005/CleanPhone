package com.inmobi.media;

import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3090n2 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ formularize c;
    public final /* synthetic */ AbstractC3214s2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3090n2(formularize formularizeVar, dern dernVar, AbstractC3214s2 abstractC3214s2) {
        super(2, dernVar);
        this.c = formularizeVar;
        this.d = abstractC3214s2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3090n2 c3090n2 = new C3090n2(this.c, dernVar, this.d);
        c3090n2.b = obj;
        return c3090n2;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3090n2) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            saran saranVar = (saran) this.b;
            formularize formularizeVar = this.c;
            C3065m2 c3065m2 = new C3065m2(saranVar, this.d);
            this.a = 1;
            if (formularizeVar.collect(c3065m2, this) == objBeachfront) {
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

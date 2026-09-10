package com.inmobi.media;

import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3410zn extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ formularize c;
    public final /* synthetic */ Bn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3410zn(formularize formularizeVar, dern dernVar, Bn bn) {
        super(2, dernVar);
        this.c = formularizeVar;
        this.d = bn;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3410zn c3410zn = new C3410zn(this.c, dernVar, this.d);
        c3410zn.b = obj;
        return c3410zn;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3410zn) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            saran saranVar = (saran) this.b;
            formularize formularizeVar = this.c;
            C3385yn c3385yn = new C3385yn(saranVar, this.d);
            this.a = 1;
            if (formularizeVar.collect(c3385yn, this) == objBeachfront) {
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

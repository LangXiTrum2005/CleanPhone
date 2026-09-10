package com.inmobi.media;

import kotlinx.coroutines.flow.dern;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2910fm extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dern c;
    public final /* synthetic */ C3135om d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2910fm(dern dernVar, wretchedly.dern dernVar2, C3135om c3135om) {
        super(2, dernVar2);
        this.c = dernVar;
        this.d = c3135om;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        C2910fm c2910fm = new C2910fm(this.c, dernVar, this.d);
        c2910fm.b = obj;
        return c2910fm;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2910fm) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            saran saranVar = (saran) this.b;
            dern dernVar = this.c;
            C2884em c2884em = new C2884em(saranVar, this.d);
            this.a = 1;
            if (dernVar.collect(c2884em, this) == objBeachfront) {
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

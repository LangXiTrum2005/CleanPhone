package com.inmobi.media;

import kotlinx.coroutines.flow.apical;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2834cn extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C2911fn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2834cn(C2911fn c2911fn, dern dernVar) {
        super(2, dernVar);
        this.b = c2911fn;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2834cn(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2834cn(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            C2911fn c2911fn = this.b;
            apical apicalVar = c2911fn.d;
            Pl pl = new Pl(c2911fn.a.getDuration());
            this.a = 1;
            if (apicalVar.emit(pl, this) == objBeachfront) {
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

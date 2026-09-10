package ads_mobile_sdk;

import kotlinx.coroutines.splinterproof;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sn extends SuspendLambda implements Function2 {
    public formularization.attabal a;
    public un b;
    public int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ un e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(long j, un unVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = j;
        this.e = unVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new sn(this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new sn(this.d, this.e, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        formularization.attabal attabalVar;
        un unVar;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.c;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            long j = this.d;
            this.c = 1;
            if (splinterproof.saneness(j, this) != objBeachfront) {
            }
            return objBeachfront;
        }
        if (i == 1) {
            p002kotlin.dern.saneness(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            unVar = this.b;
            attabalVar = this.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            unVar.j = unVar.b();
            unVar.k = null;
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
        un unVar2 = this.e;
        attabalVar = unVar2.h;
        this.a = attabalVar;
        this.b = unVar2;
        this.c = 2;
        if (attabalVar.attabal(null, this) != objBeachfront) {
            unVar = unVar2;
            unVar.j = unVar.b();
            unVar.k = null;
            return Unit.f29295attabal;
        }
        return objBeachfront;
    }
}

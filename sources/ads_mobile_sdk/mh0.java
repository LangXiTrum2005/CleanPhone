package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.phytopathogen;

/* JADX INFO: loaded from: classes.dex */
public final class mh0 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ phytopathogen b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh0(phytopathogen phytopathogenVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = phytopathogenVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        mh0 mh0Var = new mh0(this.b, dernVar);
        mh0Var.a = obj;
        return mh0Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mh0 mh0Var = new mh0(this.b, (wretchedly.dern) obj2);
        mh0Var.a = (gq0) obj;
        return mh0Var.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        ((gq0) this.a).n = this.b;
        return Unit.f29295attabal;
    }
}

package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.orthocephalic;

/* JADX INFO: loaded from: classes.dex */
public final class fa2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ orthocephalic a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa2(orthocephalic orthocephalicVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = orthocephalicVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new fa2(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new fa2(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        orthocephalic orthocephalicVar = this.a;
        if (orthocephalicVar != null) {
            orthocephalicVar.a();
        }
        return Unit.f29295attabal;
    }
}

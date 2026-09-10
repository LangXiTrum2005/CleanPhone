package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xf extends SuspendLambda implements Function2 {
    public final /* synthetic */ vf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(vf vfVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = vfVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new xf(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vf vfVar = this.a;
        new xf(vfVar, (wretchedly.dern) obj2);
        Unit unit = Unit.f29295attabal;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(unit);
        return vfVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        return this.a;
    }
}

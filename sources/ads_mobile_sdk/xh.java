package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.dight;

/* JADX INFO: loaded from: classes.dex */
public final class xh extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ dight b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(dight dightVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = dightVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        xh xhVar = new xh(this.b, dernVar);
        xhVar.a = obj;
        return xhVar;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        xh xhVar = new xh(this.b, (wretchedly.dern) obj2);
        xhVar.a = (d41) obj;
        return xhVar.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        return new ke2((d41) this.a, ((na2) ((h80) this.b).k.get()).b(), (na2) ((h80) this.b).k.get());
    }
}

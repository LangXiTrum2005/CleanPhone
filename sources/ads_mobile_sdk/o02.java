package ads_mobile_sdk;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.monroe;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o02 extends SuspendLambda implements Function2 {
    public final /* synthetic */ q02 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o02(q02 q02Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = q02Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new o02(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new o02(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        List list = this.a.g;
        if (list == null) {
            Intrinsics.preprohormone("renderingJobs");
            list = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((monroe) it.next()).attabal(new CancellationException("Best possible ad config has been rendered, cancelling inflight renderers."));
        }
        return Unit.f29295attabal;
    }
}

package ads_mobile_sdk;

import android.net.Uri;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.gerenuk;

/* JADX INFO: loaded from: classes.dex */
public final class iq0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pq0 b;
    public final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq0(pq0 pq0Var, Uri uri, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = pq0Var;
        this.c = uri;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new iq0(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new iq0(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            pq0 pq0Var = this.b;
            gerenuk gerenukVar = pq0Var.a;
            gq0 gq0Var = pq0Var.b;
            Uri uri = this.c;
            this.a = 1;
            if (gerenukVar.a(gq0Var, uri, this) == objBeachfront) {
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

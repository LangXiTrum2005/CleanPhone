package ads_mobile_sdk;

import kotlinx.coroutines.gintrap;
import kotlinx.coroutines.saran;
import org.chromium.net.CronetProvider;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class hy extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ky b;
    public final /* synthetic */ CronetProvider c;
    public final /* synthetic */ gintrap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(ky kyVar, CronetProvider cronetProvider, gintrap gintrapVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = kyVar;
        this.c = cronetProvider;
        this.d = gintrapVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new hy(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hy) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            ky kyVar = this.b;
            CronetProvider cronetProvider = this.c;
            gintrap gintrapVar = this.d;
            this.a = 1;
            if (ky.a(kyVar, cronetProvider, gintrapVar, this) == objBeachfront) {
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

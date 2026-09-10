package ads_mobile_sdk;

import android.net.Network;
import android.net.NetworkCapabilities;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class as1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ js1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Network d;
    public final /* synthetic */ NetworkCapabilities e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as1(js1 js1Var, long j, Network network, NetworkCapabilities networkCapabilities, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = js1Var;
        this.c = j;
        this.d = network;
        this.e = networkCapabilities;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new as1(this.b, this.c, this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((as1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            js1 js1Var = this.b;
            long j = this.c;
            Network network = this.d;
            NetworkCapabilities networkCapabilities = this.e;
            this.a = 1;
            if (js1Var.a(j, network, networkCapabilities, false, this) == objBeachfront) {
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

package ads_mobile_sdk;

import java.util.ArrayList;
import kotlinx.coroutines.cord;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.polder;
import kotlinx.coroutines.privatdozent;
import p002kotlin.Unit;
import p002kotlin.collections.dovishness;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.laky;

/* JADX INFO: loaded from: classes.dex */
public final class v51 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ z51 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v51(z51 z51Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = z51Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new v51(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v51(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList<eddy.dern> arrayList;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            cord cordVar = this.b.v;
            this.a = 1;
            if (cordVar.starveling(this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        z51 z51Var = this.b;
        synchronized (z51Var.s) {
            arrayList = z51Var.t;
        }
        z51 z51Var2 = this.b;
        ArrayList arrayList2 = new ArrayList(dovishness.gintrap(arrayList, 10));
        for (eddy.dern dernVar : arrayList) {
            laky lakyVar = ip0.f;
            cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new u51(dernVar, z51Var2, null), 3, null);
            arrayList2.add(Unit.f29295attabal);
        }
        return Unit.f29295attabal;
    }
}

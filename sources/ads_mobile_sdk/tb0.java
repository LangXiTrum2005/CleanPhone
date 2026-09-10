package ads_mobile_sdk;

import java.util.List;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.polder;
import kotlinx.coroutines.privatdozent;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.laky;

/* JADX INFO: loaded from: classes.dex */
public final class tb0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb0(wb0 wb0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = wb0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new tb0(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new tb0(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<Pair> listMolet;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            wb0 wb0Var = this.b;
            this.a = 1;
            synchronized (wb0Var) {
                listMolet = CollectionsKt.molet(wb0Var.p);
                wb0Var.p.clear();
                wb0Var.q.set(false);
                Unit unit = Unit.f29295attabal;
            }
            for (Pair pair : listMolet) {
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                laky lakyVar = ip0.f;
                cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new ib0(null, wb0Var, str, str2), 3, null);
            }
            if (Unit.f29295attabal == objBeachfront) {
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

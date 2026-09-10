package ads_mobile_sdk;

import kotlinx.coroutines.cutely;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.polder;
import kotlinx.coroutines.privatdozent;
import kurbash.formularize;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.laky;
import saneness.orthocephalic;
import saneness.spartacist;
import saneness.sudan;

/* JADX INFO: loaded from: classes.dex */
public final class ha2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ na2 a;
    public final /* synthetic */ spartacist b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha2(na2 na2Var, spartacist spartacistVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = na2Var;
        this.b = spartacistVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ha2(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ha2(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        na2 na2Var = this.a;
        formularize[] formularizeVarArr = na2.y;
        if (na2Var.m.getAndSet(false)) {
            orthocephalic orthocephalicVar = this.a.n;
            laky lakyVar = ip0.f;
            spartacist spartacistVar = this.b;
            dhss dhssVar = dhss.f32190kowloon;
            CoroutineContext coroutineContextPlus = dhssVar.plus(getContext());
            sudan sudanVar = s13.b;
            CoroutineContext coroutineContextMinusKey = coroutineContextPlus.minusKey(sudanVar);
            polder.Companion companion = polder.INSTANCE;
            CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(companion);
            monroe.Companion companion2 = monroe.INSTANCE;
            cutely.wireman(privatdozent.attabal(coroutineContextMinusKey2.minusKey(companion2)), null, null, new ea2(null, orthocephalicVar, spartacistVar), 3, null);
            cutely.wireman(privatdozent.attabal(dhssVar.plus(getContext()).minusKey(sudanVar).minusKey(companion).minusKey(companion2)), null, null, new fa2(orthocephalicVar, null), 3, null);
            this.a.n = null;
        } else {
            laky lakyVar2 = ip0.f;
            cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new ga2(this.a, null), 3, null);
        }
        return Unit.f29295attabal;
    }
}

package ads_mobile_sdk;

import kotlinx.coroutines.cutely;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.polder;
import kotlinx.coroutines.privatdozent;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.canephora;
import saneness.laky;
import saneness.orthocephalic;

/* JADX INFO: loaded from: classes.dex */
public final class i92 extends SuspendLambda implements Function2 {
    public final /* synthetic */ orthocephalic a;
    public final /* synthetic */ canephora b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i92(orthocephalic orthocephalicVar, canephora canephoraVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = orthocephalicVar;
        this.b = canephoraVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new i92(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i92(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        laky lakyVar = ip0.f;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new h92(this.a, this.b, null), 3, null);
        return Unit.f29295attabal;
    }
}

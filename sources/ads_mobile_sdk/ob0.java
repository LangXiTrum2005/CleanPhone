package ads_mobile_sdk;

import kotlinx.coroutines.cutely;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.polder;
import kotlinx.coroutines.privatdozent;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.laky;

/* JADX INFO: loaded from: classes.dex */
public final class ob0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ wb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob0(wb0 wb0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = wb0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ob0(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ob0(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        laky lakyVar = ip0.f;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new nb0(this.a, null), 3, null);
        return Unit.f29295attabal;
    }
}

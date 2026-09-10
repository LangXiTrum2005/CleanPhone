package ads_mobile_sdk;

import complexometry.ResponseInfo;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.polder;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import kurbash.formularize;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.laky;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class ka2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ na2 a;
    public final /* synthetic */ spartacist b;
    public final /* synthetic */ ResponseInfo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka2(ResponseInfo responseInfo, na2 na2Var, spartacist spartacistVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = na2Var;
        this.b = spartacistVar;
        this.c = responseInfo;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ka2(this.c, this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ka2) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        na2 na2Var = this.a;
        formularize[] formularizeVarArr = na2.y;
        if (na2Var.m.get()) {
            laky lakyVar = ip0.f;
            na2 na2Var2 = this.a;
            spartacist spartacistVar = this.b;
            cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new ia2(this.c, na2Var2, spartacistVar, null), 3, null);
        } else {
            laky lakyVar2 = ip0.f;
            na2 na2Var3 = this.a;
            spartacist spartacistVar2 = this.b;
            cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new ja2(this.c, na2Var3, spartacistVar2, null), 3, null);
        }
        return Unit.f29295attabal;
    }
}

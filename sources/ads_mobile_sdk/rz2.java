package ads_mobile_sdk;

import complexometry.adultoid;
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
public final class rz2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ adultoid.attabal a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz2(adultoid.attabal attabalVar, wretchedly.dern dernVar, boolean z) {
        super(2, dernVar);
        this.a = attabalVar;
        this.b = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new rz2(this.a, dernVar, this.b);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new rz2(this.a, (wretchedly.dern) obj2, this.b).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        laky lakyVar = ip0.f;
        cutely.wireman(privatdozent.attabal(dhss.f32190kowloon.plus(getContext()).minusKey(s13.b).minusKey(polder.INSTANCE).minusKey(monroe.INSTANCE)), null, null, new qz2(this.a, null, this.b), 3, null);
        return Unit.f29295attabal;
    }
}

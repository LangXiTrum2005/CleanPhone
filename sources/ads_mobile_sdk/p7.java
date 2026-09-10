package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class p7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ kotlinx.coroutines.channels.wireman b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(kotlinx.coroutines.channels.wireman wiremanVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = wiremanVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new p7(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p7(this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            kotlinx.coroutines.channels.wireman wiremanVar = this.b;
            Unit unit = Unit.f29295attabal;
            this.a = 1;
            if (wiremanVar.wireman(unit, this) == objBeachfront) {
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

package ads_mobile_sdk;

import kotlinx.coroutines.walach;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class p8 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ walach b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(walach walachVar, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.b = walachVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new p8(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new p8(this.b, (wretchedly.dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        p002kotlin.dern.saneness(obj);
        walach walachVar = this.b;
        this.a = 1;
        Object objDent = walachVar.dent(this);
        return objDent == objBeachfront ? objBeachfront : objDent;
    }
}

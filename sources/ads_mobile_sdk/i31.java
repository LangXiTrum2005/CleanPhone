package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.fright;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class i31 extends SuspendLambda implements Function2 {
    public q02 a;
    public int b;
    public final /* synthetic */ j31 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i31(j31 j31Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.c = j31Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new i31(this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i31(this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q02 q02Var;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.b;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            j31 j31Var = this.c;
            q02Var = j31Var.e;
            fright frightVar = j31Var.d;
            this.a = q02Var;
            this.b = 1;
            obj = frightVar.a(this);
            if (obj != objBeachfront) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        q02Var = this.a;
        p002kotlin.dern.saneness(obj);
        spartacist spartacistVar = (spartacist) obj;
        if (spartacistVar instanceof nn0) {
            return (nn0) spartacistVar;
        }
        Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        jm2 jm2Var = (jm2) ((tn0) spartacistVar).b;
        this.a = null;
        this.b = 2;
        Object objA = q02Var.a(jm2Var, this);
        return objA == objBeachfront ? objBeachfront : objA;
    }
}

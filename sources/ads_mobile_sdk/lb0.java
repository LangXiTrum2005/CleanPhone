package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lb0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ wb0 a;
    public final /* synthetic */ FullScreenContentError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb0(wretchedly.dern dernVar, wb0 wb0Var, FullScreenContentError fullScreenContentError) {
        super(2, dernVar);
        this.a = wb0Var;
        this.b = fullScreenContentError;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new lb0(dernVar, this.a, this.b);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new lb0((wretchedly.dern) obj2, this.a, this.b).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        complexometry.dern dernVarA = this.a.a();
        if (dernVarA != null) {
            dernVarA.competently(this.b);
        }
        return Unit.f29295attabal;
    }
}

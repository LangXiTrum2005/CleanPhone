package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import kotlinx.coroutines.impromptu;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.metairie;
import saneness.orthocephalic;
import tetrahedral.triweekly;

/* JADX INFO: loaded from: classes.dex */
public final class e92 extends SuspendLambda implements triweekly {
    public int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ k92 c;
    public final /* synthetic */ CoroutineContext d;
    public final /* synthetic */ orthocephalic e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e92(k92 k92Var, CoroutineContext coroutineContext, orthocephalic orthocephalicVar, wretchedly.dern dernVar) {
        super(3, dernVar);
        this.c = k92Var;
        this.d = coroutineContext;
        this.e = orthocephalicVar;
    }

    @Override // tetrahedral.triweekly
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e92 e92Var = new e92(this.c, this.d, this.e, (wretchedly.dern) obj3);
        e92Var.b = (Throwable) obj2;
        return e92Var.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            Throwable th = this.b;
            k92 k92Var = this.c;
            on0 error = new on0(th, null, null, 6);
            k92Var.getClass();
            Intrinsics.checkNotNullParameter(error, "error");
            LoadAdError loadAdError = new LoadAdError(error.a().a(), metairie.attabal(error), null);
            CoroutineContext coroutineContext = this.d;
            d92 d92Var = new d92(loadAdError, this.e, null);
            this.a = 1;
            if (impromptu.competently(coroutineContext, d92Var, this) == objBeachfront) {
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

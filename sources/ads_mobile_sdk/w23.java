package ads_mobile_sdk;

import android.os.IInterface;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.ayutthaya;
import saneness.canonical;

/* JADX INFO: loaded from: classes.dex */
public final class w23 extends SuspendLambda implements Function2 {
    public final /* synthetic */ x23 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w23(x23 x23Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = x23Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new w23(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new w23(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        try {
            IInterface service = this.a.d.getService();
            Intrinsics.checkNotNullExpressionValue(service, "getService(...)");
            String packageName = this.a.b.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            ((ayutthaya) ((canonical) service)).cutely(new ya0(packageName), this.a);
        } catch (Throwable th) {
            x23 x23Var = this.a;
            on0 on0Var = new on0(th, null, null, 6);
            int i = x23.f3294dern;
            if (!x23Var.f.getAndSet(true)) {
                x23Var.h.saran(on0Var);
            }
            ((d13) this.a.c).a("Throwable caught getting trustless token", th);
        }
        return Unit.f29295attabal;
    }
}

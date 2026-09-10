package ads_mobile_sdk;

import com.ironsource.X3;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.astrogate;

/* JADX INFO: loaded from: classes.dex */
public final class en2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ fn2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en2(fn2 fn2Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = fn2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new en2(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new en2(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        fn2 fn2Var = this.a;
        astrogate astrogateVar = fn2Var.i;
        if (astrogateVar != null) {
            int i = fn2Var.h;
            wz0 wz0Var = (wz0) astrogateVar;
            jk0 jk0Var = wz0Var.i;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:inspector:shake_count", X3.i.W);
            if (i == ((Number) jk0Var.a("gads:inspector:shake_count", 3, zk.f)).intValue()) {
                saran saranVar = wz0Var.d;
                gz0 block = new gz0(wz0Var, null);
                EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
            }
        }
        return Unit.f29295attabal;
    }
}

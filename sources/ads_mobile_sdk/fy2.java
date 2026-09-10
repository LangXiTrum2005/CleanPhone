package ads_mobile_sdk;

import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.ballistician;

/* JADX INFO: loaded from: classes.dex */
public final class fy2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ hy2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy2(hy2 hy2Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = hy2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new fy2(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new fy2(this.a, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        ballistician ballisticianVar = this.a.e;
        for (Map.Entry entry : ballisticianVar.b.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            saran saranVar = ballisticianVar.a;
            lz2 block = new lz2("onVideoPlay", str, value, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
        return Unit.f29295attabal;
    }
}

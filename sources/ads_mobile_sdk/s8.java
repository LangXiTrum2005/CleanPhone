package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s8 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ v8 b;
    public final /* synthetic */ Map.Entry c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(v8 v8Var, Map.Entry entry, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = v8Var;
        this.c = entry;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new s8(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new s8(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            v8 v8Var = this.b;
            Object key = this.c.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            Object value = this.c.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            this.a = 1;
            if (v8.a(v8Var, (String) key, (j8) value, this) == objBeachfront) {
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

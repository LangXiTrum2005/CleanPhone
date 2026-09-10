package ads_mobile_sdk;

import java.util.UUID;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class te0 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ UUID e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te0(String str, String str2, UUID uuid, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.c = str;
        this.d = str2;
        this.e = uuid;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        te0 te0Var = new te0(this.c, this.d, this.e, dernVar);
        te0Var.b = obj;
        return te0Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((te0) create((e51) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
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
        e51 e51Var = (e51) this.b;
        String str = this.c;
        String str2 = this.d;
        UUID uuid = this.e;
        this.a = 1;
        e51Var.getClass();
        Object objA = e51.a(e51Var, str, str2, uuid, this);
        return objA == objBeachfront ? objBeachfront : objA;
    }
}

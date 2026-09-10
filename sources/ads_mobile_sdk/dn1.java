package ads_mobile_sdk;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class dn1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ hn1 b;
    public final /* synthetic */ JsonElement c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn1(hn1 hn1Var, JsonElement jsonElement, boolean z, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = hn1Var;
        this.c = jsonElement;
        this.d = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new dn1(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dn1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
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
        hn1 hn1Var = this.b;
        JsonObject jsonObjectA = cb1.a(this.c);
        boolean z = this.d;
        this.a = 1;
        int i2 = hn1.h;
        Object objA = hn1Var.a(jsonObjectA, z, this);
        return objA == objBeachfront ? objBeachfront : objA;
    }
}

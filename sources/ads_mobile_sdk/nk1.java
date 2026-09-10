package ads_mobile_sdk;

import com.google.gson.JsonArray;
import java.util.ArrayList;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.channels.kowloon;
import kotlinx.coroutines.cutely;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nk1 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ JsonArray c;
    public final /* synthetic */ int d;
    public final /* synthetic */ qk1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk1(int i, qk1 qk1Var, JsonArray jsonArray, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.c = jsonArray;
        this.d = i;
        this.e = qk1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        nk1 nk1Var = new nk1(this.d, this.e, this.c, dernVar);
        nk1Var.b = obj;
        return nk1Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nk1) create((kowloon) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            kowloon kowloonVar = (kowloon) this.b;
            int size = this.c.size();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.d; i2++) {
                qk1 qk1Var = this.e;
                arrayList.add(cutely.wireman(qk1Var.s, null, null, new mk1(qk1Var, i2, size, this.c, kowloonVar, null), 3, null));
            }
            this.a = 1;
            if (AwaitKt.dern(arrayList, this) == objBeachfront) {
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

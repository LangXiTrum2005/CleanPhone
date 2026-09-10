package ads_mobile_sdk;

import com.google.gson.JsonObject;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sj1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ vj1 b;
    public final /* synthetic */ hj1 c;
    public final /* synthetic */ JsonObject d;
    public final /* synthetic */ a22 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj1(a22 a22Var, hj1 hj1Var, vj1 vj1Var, JsonObject jsonObject, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = vj1Var;
        this.c = hj1Var;
        this.d = jsonObject;
        this.e = a22Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        vj1 vj1Var = this.b;
        sj1 sj1Var = new sj1(this.e, this.c, vj1Var, this.d, dernVar);
        sj1Var.a = obj;
        return sj1Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sj1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        saran saranVar = (saran) this.a;
        vj1 vj1Var = this.b;
        cutely.wireman(saranVar, vj1Var.b, null, new kj1(this.c, vj1Var, this.d, null), 2, null);
        vj1 vj1Var2 = this.b;
        cutely.wireman(saranVar, vj1Var2.b, null, new lj1(this.c, vj1Var2, this.d, null), 2, null);
        vj1 vj1Var3 = this.b;
        cutely.wireman(saranVar, vj1Var3.b, null, new mj1(this.c, vj1Var3, this.d, null), 2, null);
        vj1 vj1Var4 = this.b;
        cutely.wireman(saranVar, vj1Var4.b, null, new nj1(this.c, vj1Var4, this.d, null), 2, null);
        vj1 vj1Var5 = this.b;
        cutely.wireman(saranVar, vj1Var5.b, null, new oj1(this.e, this.c, vj1Var5, this.d, null), 2, null);
        vj1 vj1Var6 = this.b;
        cutely.wireman(saranVar, vj1Var6.b, null, new pj1(this.c, vj1Var6, this.d, null), 2, null);
        vj1 vj1Var7 = this.b;
        cutely.wireman(saranVar, vj1Var7.b, null, new qj1(this.c, vj1Var7, this.d, null), 2, null);
        return cutely.wireman(saranVar, this.b.b, null, new rj1(this.d, this.c, null), 2, null);
    }
}

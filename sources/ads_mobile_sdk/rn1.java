package ads_mobile_sdk;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.dovishness;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rn1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ JsonArray b;
    public final /* synthetic */ sn1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn1(JsonArray jsonArray, sn1 sn1Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = jsonArray;
        this.c = sn1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        rn1 rn1Var = new rn1(this.b, this.c, dernVar);
        rn1Var.a = obj;
        return rn1Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rn1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        saran saranVar = (saran) this.a;
        JsonArray jsonArray = this.b;
        sn1 sn1Var = this.c;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(jsonArray, 10));
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            arrayList.add(cutely.saneness(saranVar, null, null, new qn1(it.next(), sn1Var, null), 3, null));
        }
        return arrayList;
    }
}

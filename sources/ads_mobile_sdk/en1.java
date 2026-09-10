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
public final class en1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ JsonArray b;
    public final /* synthetic */ hn1 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en1(hn1 hn1Var, JsonArray jsonArray, wretchedly.dern dernVar, boolean z) {
        super(2, dernVar);
        this.b = jsonArray;
        this.c = hn1Var;
        this.d = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        en1 en1Var = new en1(this.c, this.b, dernVar, this.d);
        en1Var.a = obj;
        return en1Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((en1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        saran saranVar = (saran) this.a;
        JsonArray jsonArray = this.b;
        hn1 hn1Var = this.c;
        boolean z = this.d;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(jsonArray, 10));
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            arrayList.add(cutely.saneness(saranVar, null, null, new dn1(hn1Var, it.next(), z, null), 3, null));
        }
        return arrayList;
    }
}

package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.kattegat;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class m02 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ q02 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m02(q02 q02Var, int i, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = q02Var;
        this.c = i;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        m02 m02Var = new m02(this.b, this.c, dernVar);
        m02Var.a = obj;
        return m02Var;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m02) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        saran saranVar = (saran) this.a;
        q02 q02Var = this.b;
        IntRange intRangeMonoploid = p002kotlin.ranges.wireman.monoploid(0, this.c);
        q02 q02Var2 = this.b;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(intRangeMonoploid, 10));
        Iterator<Integer> it = intRangeMonoploid.iterator();
        while (it.hasNext()) {
            ((kattegat) it).nextInt();
            arrayList.add(cutely.wireman(saranVar, q02Var2.b, null, new l02(q02Var2, null), 2, null));
        }
        q02Var.g = arrayList;
        return Unit.f29295attabal;
    }
}

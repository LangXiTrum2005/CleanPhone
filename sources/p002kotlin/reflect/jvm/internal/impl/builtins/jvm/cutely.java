package p002kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.cultivated;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: mappingUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class cutely {
    public static final cultivated attabal(wireman from, wireman to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        from.triweekly().size();
        to.triweekly().size();
        cultivated.attabal attabalVar = cultivated.f31745dern;
        List<clubfoot> listTriweekly = from.triweekly();
        Intrinsics.checkNotNullExpressionValue(listTriweekly, "getDeclaredTypeParameters(...)");
        List<clubfoot> list = listTriweekly;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((clubfoot) it.next()).impromptu());
        }
        List<clubfoot> listTriweekly2 = to.triweekly();
        Intrinsics.checkNotNullExpressionValue(listTriweekly2, "getDeclaredTypeParameters(...)");
        List<clubfoot> list2 = listTriweekly2;
        ArrayList arrayList2 = new ArrayList(dovishness.gintrap(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            merc mercVarImpassible = ((clubfoot) it2.next()).impassible();
            Intrinsics.checkNotNullExpressionValue(mercVarImpassible, "getDefaultType(...)");
            arrayList2.add(TypeUtilsKt.attabal(mercVarImpassible));
        }
        return cultivated.attabal.marial(attabalVar, seminary.dovishness(CollectionsKt.fastrack(arrayList, arrayList2)), false, 2, null);
    }
}

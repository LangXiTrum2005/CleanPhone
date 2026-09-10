package p002kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.adultoid;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.preprohormone;
import p002kotlin.reflect.jvm.internal.impl.types.stratoscope;
import p002kotlin.reflect.jvm.internal.impl.types.yemenite;
import prescient.competently;

/* JADX INFO: compiled from: IntersectionType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class wireman {
    public static final empress attabal(List<? extends empress> types) {
        merc mercVarSakeen;
        Intrinsics.checkNotNullParameter(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (empress) CollectionsKt.herdbook(types);
        }
        List<? extends empress> list = types;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        boolean z = false;
        boolean z2 = false;
        for (empress empressVar : list) {
            z = z || yemenite.attabal(empressVar);
            if (empressVar instanceof merc) {
                mercVarSakeen = (merc) empressVar;
            } else {
                if (!(empressVar instanceof preprohormone)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (adultoid.attabal(empressVar)) {
                    return empressVar;
                }
                mercVarSakeen = ((preprohormone) empressVar).sakeen();
                z2 = true;
            }
            arrayList.add(mercVarSakeen);
        }
        if (z) {
            return competently.wireman(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, types.toString());
        }
        if (!z2) {
            return TypeIntersector.f31713attabal.dern(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(dovishness.gintrap(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(stratoscope.wireman((empress) it.next()));
        }
        TypeIntersector typeIntersector = TypeIntersector.f31713attabal;
        return KotlinTypeFactory.wireman(typeIntersector.dern(arrayList), typeIntersector.dern(arrayList2));
    }
}

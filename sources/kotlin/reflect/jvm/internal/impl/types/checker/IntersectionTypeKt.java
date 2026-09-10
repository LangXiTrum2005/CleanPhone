package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class IntersectionTypeKt {
    public static final UnwrappedType a(ArrayList arrayList) {
        SimpleType simpleType;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (UnwrappedType) CollectionsKt.W(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            UnwrappedType unwrappedType = (UnwrappedType) it.next();
            z2 = z2 || KotlinTypeKt.a(unwrappedType);
            if (unwrappedType instanceof SimpleType) {
                simpleType = (SimpleType) unwrappedType;
            } else {
                if (!(unwrappedType instanceof FlexibleType)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (DynamicTypesKt.a(unwrappedType)) {
                    return unwrappedType;
                }
                simpleType = ((FlexibleType) unwrappedType).f44509Y;
                z3 = true;
            }
            arrayList2.add(simpleType);
        }
        if (z2) {
            return ErrorUtils.c(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        TypeIntersector typeIntersector = TypeIntersector.f44579a;
        if (!z3) {
            return typeIntersector.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(FlexibleTypesKt.c((UnwrappedType) it2.next()));
        }
        return KotlinTypeFactory.b(typeIntersector.b(arrayList2), typeIntersector.b(arrayList3));
    }
}

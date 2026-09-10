package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution$Companion$createByConstructorsMap$1;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class MappingUtilKt {
    public static final TypeConstructorSubstitution$Companion$createByConstructorsMap$1 a(ClassDescriptor from, ClassDescriptor to) {
        Intrinsics.f(from, "from");
        Intrinsics.f(to, "to");
        from.p().size();
        to.p().size();
        List listP = from.p();
        Intrinsics.e(listP, "from.declaredTypeParameters");
        List list = listP;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeParameterDescriptor) it.next()).h());
        }
        List listP2 = to.p();
        Intrinsics.e(listP2, "to.declaredTypeParameters");
        List list2 = listP2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            SimpleType simpleTypeO = ((TypeParameterDescriptor) it2.next()).o();
            Intrinsics.e(simpleTypeO, "it.defaultType");
            arrayList2.add(TypeUtilsKt.a(simpleTypeO));
        }
        return new TypeConstructorSubstitution$Companion$createByConstructorsMap$1(MapsKt.p(CollectionsKt.n0(arrayList, arrayList2)));
    }
}

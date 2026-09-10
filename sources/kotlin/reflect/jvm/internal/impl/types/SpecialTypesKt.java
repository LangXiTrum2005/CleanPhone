package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SpecialTypesKt {
    public static final UnwrappedType a(UnwrappedType unwrappedType, boolean z2) {
        Intrinsics.f(unwrappedType, "<this>");
        DefinitelyNotNullType definitelyNotNullTypeA = DefinitelyNotNullType.Companion.a(unwrappedType, z2);
        if (definitelyNotNullTypeA != null) {
            return definitelyNotNullTypeA;
        }
        SimpleType simpleTypeB = b(unwrappedType);
        return simpleTypeB != null ? simpleTypeB : unwrappedType.L0(false);
    }

    public static final SimpleType b(UnwrappedType unwrappedType) {
        IntersectionTypeConstructor intersectionTypeConstructor;
        TypeConstructor typeConstructorH0 = unwrappedType.H0();
        IntersectionTypeConstructor intersectionTypeConstructor2 = typeConstructorH0 instanceof IntersectionTypeConstructor ? (IntersectionTypeConstructor) typeConstructorH0 : null;
        if (intersectionTypeConstructor2 != null) {
            LinkedHashSet<KotlinType> linkedHashSet = intersectionTypeConstructor2.f44513b;
            ArrayList arrayList = new ArrayList(CollectionsKt.n(linkedHashSet, 10));
            boolean z2 = false;
            for (KotlinType kotlinTypeA : linkedHashSet) {
                if (TypeUtils.e(kotlinTypeA)) {
                    kotlinTypeA = a(kotlinTypeA.K0(), false);
                    z2 = true;
                }
                arrayList.add(kotlinTypeA);
            }
            if (z2) {
                KotlinType kotlinTypeA2 = intersectionTypeConstructor2.f44512a;
                if (kotlinTypeA2 == null) {
                    kotlinTypeA2 = null;
                } else if (TypeUtils.e(kotlinTypeA2)) {
                    kotlinTypeA2 = a(kotlinTypeA2.K0(), false);
                }
                intersectionTypeConstructor = new IntersectionTypeConstructor(new IntersectionTypeConstructor(arrayList).f44513b);
                intersectionTypeConstructor.f44512a = kotlinTypeA2;
            } else {
                intersectionTypeConstructor = null;
            }
            if (intersectionTypeConstructor != null) {
                return intersectionTypeConstructor.f();
            }
        }
        return null;
    }

    public static final SimpleType c(SimpleType simpleType, SimpleType abbreviatedType) {
        Intrinsics.f(simpleType, "<this>");
        Intrinsics.f(abbreviatedType, "abbreviatedType");
        return KotlinTypeKt.a(simpleType) ? simpleType : new AbbreviatedType(simpleType, abbreviatedType);
    }
}

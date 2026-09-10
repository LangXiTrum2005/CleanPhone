package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class AbstractStrictEqualityTypeChecker {
    public static boolean a(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        if (classicTypeSystemContext.a(simpleTypeMarker) == classicTypeSystemContext.a(simpleTypeMarker2) && classicTypeSystemContext.o(simpleTypeMarker) == classicTypeSystemContext.o(simpleTypeMarker2)) {
            if ((classicTypeSystemContext.l0(simpleTypeMarker) == null) == (classicTypeSystemContext.l0(simpleTypeMarker2) == null) && classicTypeSystemContext.o0(classicTypeSystemContext.Z(simpleTypeMarker), classicTypeSystemContext.Z(simpleTypeMarker2))) {
                if (!classicTypeSystemContext.y(simpleTypeMarker, simpleTypeMarker2)) {
                    int iA = classicTypeSystemContext.a(simpleTypeMarker);
                    for (int i2 = 0; i2 < iA; i2++) {
                        TypeArgumentMarker typeArgumentMarkerU = classicTypeSystemContext.u(simpleTypeMarker, i2);
                        TypeArgumentMarker typeArgumentMarkerU2 = classicTypeSystemContext.u(simpleTypeMarker2, i2);
                        if (classicTypeSystemContext.j(typeArgumentMarkerU) == classicTypeSystemContext.j(typeArgumentMarkerU2) && (classicTypeSystemContext.j(typeArgumentMarkerU) || (classicTypeSystemContext.j0(typeArgumentMarkerU) == classicTypeSystemContext.j0(typeArgumentMarkerU2) && b(classicTypeSystemContext, classicTypeSystemContext.n0(typeArgumentMarkerU), classicTypeSystemContext.n0(typeArgumentMarkerU2))))) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean b(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        SimpleType simpleTypeF = classicTypeSystemContext.F(kotlinTypeMarker);
        SimpleType simpleTypeF2 = classicTypeSystemContext.F(kotlinTypeMarker2);
        if (simpleTypeF != null && simpleTypeF2 != null) {
            return a(classicTypeSystemContext, simpleTypeF, simpleTypeF2);
        }
        FlexibleType flexibleTypeV = classicTypeSystemContext.V(kotlinTypeMarker);
        FlexibleType flexibleTypeV2 = classicTypeSystemContext.V(kotlinTypeMarker2);
        return flexibleTypeV != null && flexibleTypeV2 != null && a(classicTypeSystemContext, classicTypeSystemContext.B(flexibleTypeV), classicTypeSystemContext.B(flexibleTypeV2)) && a(classicTypeSystemContext, classicTypeSystemContext.g0(flexibleTypeV), classicTypeSystemContext.g0(flexibleTypeV2));
    }
}

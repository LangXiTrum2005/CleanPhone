package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* JADX INFO: loaded from: classes7.dex */
public final class AbstractNullabilityChecker {
    public static boolean a(TypeCheckerState typeCheckerState, SimpleTypeMarker type, TypeCheckerState.SupertypesPolicy supertypesPolicy) {
        Intrinsics.f(type, "type");
        ClassicTypeSystemContext classicTypeSystemContext = typeCheckerState.f44532c;
        if ((classicTypeSystemContext.z(type) && !classicTypeSystemContext.o(type)) || classicTypeSystemContext.T(type)) {
            return true;
        }
        typeCheckerState.c();
        ArrayDeque arrayDeque = typeCheckerState.g;
        Intrinsics.c(arrayDeque);
        SmartSet smartSet = typeCheckerState.f44534h;
        Intrinsics.c(smartSet);
        arrayDeque.push(type);
        while (!arrayDeque.isEmpty()) {
            if (smartSet.f44649Y > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + CollectionsKt.D(smartSet, null, null, null, null, 63)).toString());
            }
            SimpleTypeMarker current = (SimpleTypeMarker) arrayDeque.pop();
            Intrinsics.e(current, "current");
            if (smartSet.add(current)) {
                boolean zO = classicTypeSystemContext.o(current);
                TypeCheckerState.SupertypesPolicy.None none = TypeCheckerState.SupertypesPolicy.None.f44537a;
                TypeCheckerState.SupertypesPolicy supertypesPolicy2 = zO ? none : supertypesPolicy;
                if (supertypesPolicy2.equals(none)) {
                    supertypesPolicy2 = null;
                }
                if (supertypesPolicy2 == null) {
                    continue;
                } else {
                    Iterator it = classicTypeSystemContext.M(classicTypeSystemContext.Z(current)).iterator();
                    while (it.hasNext()) {
                        SimpleTypeMarker simpleTypeMarkerA = supertypesPolicy2.a(typeCheckerState, (KotlinTypeMarker) it.next());
                        if ((classicTypeSystemContext.z(simpleTypeMarkerA) && !classicTypeSystemContext.o(simpleTypeMarkerA)) || classicTypeSystemContext.T(simpleTypeMarkerA)) {
                            typeCheckerState.a();
                            return true;
                        }
                        arrayDeque.add(simpleTypeMarkerA);
                    }
                }
            }
        }
        typeCheckerState.a();
        return false;
    }

    public static boolean b(TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        ClassicTypeSystemContext classicTypeSystemContext = typeCheckerState.f44532c;
        if (classicTypeSystemContext.D(simpleTypeMarker)) {
            return true;
        }
        if (classicTypeSystemContext.o(simpleTypeMarker)) {
            return false;
        }
        if (typeCheckerState.f44531b && classicTypeSystemContext.w(simpleTypeMarker)) {
            return true;
        }
        return classicTypeSystemContext.o0(classicTypeSystemContext.Z(simpleTypeMarker), typeConstructorMarker);
    }
}

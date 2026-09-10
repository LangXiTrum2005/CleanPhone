package kotlin.reflect.jvm.internal.impl.types;

import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeSubstitutionKt {
    public static final SimpleType a(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        UnwrappedType unwrappedTypeK0 = kotlinType.K0();
        SimpleType simpleType = unwrappedTypeK0 instanceof SimpleType ? (SimpleType) unwrappedTypeK0 : null;
        if (simpleType != null) {
            return simpleType;
        }
        throw new IllegalStateException(("This is should be simple type: " + kotlinType).toString());
    }

    public static final SimpleType b(SimpleType simpleType, List newArguments, TypeAttributes newAttributes) {
        Intrinsics.f(simpleType, "<this>");
        Intrinsics.f(newArguments, "newArguments");
        Intrinsics.f(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == simpleType.G0()) {
            return simpleType;
        }
        if (newArguments.isEmpty()) {
            return simpleType.N0(newAttributes);
        }
        if (!(simpleType instanceof ErrorType)) {
            return KotlinTypeFactory.d(newAttributes, simpleType.H0(), newArguments, simpleType.I0(), null);
        }
        ErrorType errorType = (ErrorType) simpleType;
        String[] strArr = errorType.h0;
        return new ErrorType(errorType.f44585Y, errorType.Z, errorType.e0, newArguments, errorType.g0, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static KotlinType c(KotlinType kotlinType, List list, Annotations annotations, int i2) {
        if ((i2 & 2) != 0) {
            annotations = kotlinType.getAnnotations();
        }
        Intrinsics.f(kotlinType, "<this>");
        if ((list.isEmpty() || list == kotlinType.F0()) && annotations == kotlinType.getAnnotations()) {
            return kotlinType;
        }
        TypeAttributes typeAttributesG0 = kotlinType.G0();
        if ((annotations instanceof FilteredAnnotations) && annotations.isEmpty()) {
            annotations = Annotations.Companion.f43614a;
        }
        TypeAttributes typeAttributesA = TypeAttributesKt.a(typeAttributesG0, annotations);
        UnwrappedType unwrappedTypeK0 = kotlinType.K0();
        if (unwrappedTypeK0 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeK0;
            return KotlinTypeFactory.b(b(flexibleType.f44509Y, list, typeAttributesA), b(flexibleType.Z, list, typeAttributesA));
        }
        if (unwrappedTypeK0 instanceof SimpleType) {
            return b((SimpleType) unwrappedTypeK0, list, typeAttributesA);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ SimpleType d(SimpleType simpleType, List list, TypeAttributes typeAttributes, int i2) {
        if ((i2 & 1) != 0) {
            list = simpleType.F0();
        }
        if ((i2 & 2) != 0) {
            typeAttributes = simpleType.G0();
        }
        return b(simpleType, list, typeAttributes);
    }
}

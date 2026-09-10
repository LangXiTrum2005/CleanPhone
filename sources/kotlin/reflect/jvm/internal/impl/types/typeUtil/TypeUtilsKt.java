package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeUtilsKt {
    public static final TypeProjectionImpl a(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        return new TypeProjectionImpl(kotlinType);
    }

    public static final boolean b(KotlinType kotlinType, TypeConstructor typeConstructor, Set set) {
        boolean zB;
        if (Intrinsics.a(kotlinType.H0(), typeConstructor)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = classifierDescriptorC instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorC : null;
        List listP = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.p() : null;
        Iterable iterableM0 = CollectionsKt.m0(kotlinType.F0());
        if (!(iterableM0 instanceof Collection) || !((Collection) iterableM0).isEmpty()) {
            Iterator it = iterableM0.iterator();
            do {
                IndexingIterator indexingIterator = (IndexingIterator) it;
                if (indexingIterator.X.hasNext()) {
                    IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
                    int i2 = indexedValue.f43274a;
                    TypeProjection typeProjection = (TypeProjection) indexedValue.f43275b;
                    TypeParameterDescriptor typeParameterDescriptor = listP != null ? (TypeParameterDescriptor) CollectionsKt.B(i2, listP) : null;
                    if ((typeParameterDescriptor == null || set == null || !set.contains(typeParameterDescriptor)) && !typeProjection.a()) {
                        KotlinType type = typeProjection.getType();
                        Intrinsics.e(type, "argument.type");
                        zB = b(type, typeConstructor, set);
                    } else {
                        zB = false;
                    }
                }
            } while (!zB);
            return true;
        }
        return false;
    }

    public static final boolean c(KotlinType kotlinType) {
        return TypeUtils.c(kotlinType, TypeUtilsKt$containsTypeAliasParameters$1.X, null);
    }

    public static final TypeProjectionImpl d(KotlinType type, Variance variance, TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.f(type, "type");
        if ((typeParameterDescriptor != null ? typeParameterDescriptor.j() : null) == variance) {
            variance = Variance.INVARIANT;
        }
        return new TypeProjectionImpl(type, variance);
    }

    public static final void e(KotlinType kotlinType, SimpleType simpleType, LinkedHashSet linkedHashSet, Set set) {
        ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
        if (classifierDescriptorC instanceof TypeParameterDescriptor) {
            if (!Intrinsics.a(kotlinType.H0(), simpleType.H0())) {
                linkedHashSet.add(classifierDescriptorC);
                return;
            }
            for (KotlinType upperBound : ((TypeParameterDescriptor) classifierDescriptorC).getUpperBounds()) {
                Intrinsics.e(upperBound, "upperBound");
                e(upperBound, simpleType, linkedHashSet, set);
            }
            return;
        }
        ClassifierDescriptor classifierDescriptorC2 = kotlinType.H0().c();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = classifierDescriptorC2 instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorC2 : null;
        List listP = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.p() : null;
        int i2 = 0;
        for (TypeProjection typeProjection : kotlinType.F0()) {
            int i3 = i2 + 1;
            TypeParameterDescriptor typeParameterDescriptor = listP != null ? (TypeParameterDescriptor) CollectionsKt.B(i2, listP) : null;
            if ((typeParameterDescriptor == null || set == null || !set.contains(typeParameterDescriptor)) && !typeProjection.a() && !CollectionsKt.o(linkedHashSet, typeProjection.getType().H0().c()) && !Intrinsics.a(typeProjection.getType().H0(), simpleType.H0())) {
                KotlinType type = typeProjection.getType();
                Intrinsics.e(type, "argument.type");
                e(type, simpleType, linkedHashSet, set);
            }
            i2 = i3;
        }
    }

    public static final KotlinBuiltIns f(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        KotlinBuiltIns kotlinBuiltInsK = kotlinType.H0().k();
        Intrinsics.e(kotlinBuiltInsK, "constructor.builtIns");
        return kotlinBuiltInsK;
    }

    public static final KotlinType g(TypeParameterDescriptor typeParameterDescriptor) {
        Object obj;
        List upperBounds = typeParameterDescriptor.getUpperBounds();
        Intrinsics.e(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List upperBounds2 = typeParameterDescriptor.getUpperBounds();
        Intrinsics.e(upperBounds2, "upperBounds");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ClassifierDescriptor classifierDescriptorC = ((KotlinType) next).H0().c();
            ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
            if (classDescriptor != null && classDescriptor.getKind() != ClassKind.f43559Y && classDescriptor.getKind() != ClassKind.f0) {
                obj = next;
                break;
            }
        }
        KotlinType kotlinType = (KotlinType) obj;
        if (kotlinType != null) {
            return kotlinType;
        }
        List upperBounds3 = typeParameterDescriptor.getUpperBounds();
        Intrinsics.e(upperBounds3, "upperBounds");
        Object objW = CollectionsKt.w(upperBounds3);
        Intrinsics.e(objW, "upperBounds.first()");
        return (KotlinType) objW;
    }

    public static final boolean h(TypeParameterDescriptor typeParameter, TypeConstructor typeConstructor, Set set) {
        Intrinsics.f(typeParameter, "typeParameter");
        List upperBounds = typeParameter.getUpperBounds();
        Intrinsics.e(upperBounds, "typeParameter.upperBounds");
        List<KotlinType> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (KotlinType upperBound : list) {
            Intrinsics.e(upperBound, "upperBound");
            if (b(upperBound, typeParameter.o().H0(), set) && (typeConstructor == null || Intrinsics.a(upperBound.H0(), typeConstructor))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean i(KotlinType kotlinType, KotlinType superType) {
        Intrinsics.f(superType, "superType");
        return KotlinTypeChecker.f44562a.d(kotlinType, superType);
    }

    public static final UnwrappedType j(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        UnwrappedType unwrappedTypeG = TypeUtils.g(kotlinType, true);
        Intrinsics.e(unwrappedTypeG, "makeNullable(this)");
        return unwrappedTypeG;
    }

    public static final KotlinType k(KotlinType kotlinType, Annotations annotations) {
        return (kotlinType.getAnnotations().isEmpty() && annotations.isEmpty()) ? kotlinType : kotlinType.K0().N0(TypeAttributesKt.a(kotlinType.G0(), annotations));
    }

    public static final UnwrappedType l(KotlinType kotlinType) {
        SimpleType simpleType;
        UnwrappedType unwrappedTypeD;
        Intrinsics.f(kotlinType, "<this>");
        UnwrappedType unwrappedTypeK0 = kotlinType.K0();
        if (unwrappedTypeK0 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeK0;
            SimpleType simpleTypeD = flexibleType.f44509Y;
            if (!simpleTypeD.H0().getParameters().isEmpty() && simpleTypeD.H0().c() != null) {
                List parameters = simpleTypeD.H0().getParameters();
                Intrinsics.e(parameters, "constructor.parameters");
                List list = parameters;
                ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StarProjectionImpl((TypeParameterDescriptor) it.next()));
                }
                simpleTypeD = TypeSubstitutionKt.d(simpleTypeD, arrayList, null, 2);
            }
            SimpleType simpleTypeD2 = flexibleType.Z;
            if (!simpleTypeD2.H0().getParameters().isEmpty() && simpleTypeD2.H0().c() != null) {
                List parameters2 = simpleTypeD2.H0().getParameters();
                Intrinsics.e(parameters2, "constructor.parameters");
                List list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new StarProjectionImpl((TypeParameterDescriptor) it2.next()));
                }
                simpleTypeD2 = TypeSubstitutionKt.d(simpleTypeD2, arrayList2, null, 2);
            }
            unwrappedTypeD = KotlinTypeFactory.b(simpleTypeD, simpleTypeD2);
        } else {
            if (!(unwrappedTypeK0 instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            simpleType = (SimpleType) unwrappedTypeK0;
            if (!simpleType.H0().getParameters().isEmpty() && simpleType.H0().c() != null) {
                unwrappedTypeD = simpleType;
                unwrappedTypeD = simpleType;
                List parameters3 = simpleType.H0().getParameters();
                Intrinsics.e(parameters3, "constructor.parameters");
                List list3 = parameters3;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.n(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new StarProjectionImpl((TypeParameterDescriptor) it3.next()));
                }
                unwrappedTypeD = TypeSubstitutionKt.d(simpleType, arrayList3, null, 2);
            }
        }
        unwrappedTypeD = simpleType;
        unwrappedTypeD = simpleType;
        unwrappedTypeD = simpleType;
        return TypeWithEnhancementKt.b(unwrappedTypeD, unwrappedTypeK0);
    }

    public static final boolean m(SimpleType simpleType) {
        return TypeUtils.c(simpleType, TypeUtilsKt$requiresTypeAliasExpansion$1.X, null);
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaTypeEnhancement {

    public static final class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnwrappedType f43919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43920b;

        public Result(UnwrappedType unwrappedType, int i2) {
            this.f43919a = unwrappedType;
            this.f43920b = i2;
        }
    }

    public static final class SimpleResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SimpleType f43921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f43923c;

        public SimpleResult(SimpleType simpleType, int i2, boolean z2) {
            this.f43921a = simpleType;
            this.f43922b = i2;
            this.f43923c = z2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x019a  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ca  */
    public final SimpleResult a(SimpleType simpleType, Function1 function1, int i2, TypeComponentPosition typeComponentPosition, boolean z2, boolean z3) {
        ClassDescriptor classDescriptorA;
        Boolean bool;
        TypeConstructor typeConstructorH0;
        Result result;
        UnwrappedType unwrappedType;
        TypeProjectionBase typeProjectionBaseJ;
        Function1 function2 = function1;
        int i3 = 0;
        TypeComponentPosition typeComponentPosition2 = TypeComponentPosition.Z;
        boolean z4 = typeComponentPosition != typeComponentPosition2;
        boolean z5 = (z3 && z2) ? false : true;
        UnwrappedType unwrappedType2 = null;
        if (!z4 && simpleType.F0().isEmpty()) {
            return new SimpleResult(null, 1, false);
        }
        ClassifierDescriptor classifierDescriptorC = simpleType.H0().c();
        if (classifierDescriptorC == null) {
            return new SimpleResult(null, 1, false);
        }
        AbstractSignatureParts$computeIndexedQualifiers$1 abstractSignatureParts$computeIndexedQualifiers$1 = (AbstractSignatureParts$computeIndexedQualifiers$1) function2;
        JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) abstractSignatureParts$computeIndexedQualifiers$1.invoke(Integer.valueOf(i2));
        Annotations annotations = TypeEnhancementKt.f43957a;
        if (typeComponentPosition == typeComponentPosition2 || !(classifierDescriptorC instanceof ClassDescriptor)) {
            classDescriptorA = null;
        } else if (javaTypeQualifiers.f43926b == MutabilityQualifier.X && typeComponentPosition == TypeComponentPosition.X) {
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorC;
            String str = JavaToKotlinClassMap.f43521a;
            FqNameUnsafe fqNameUnsafeG = DescriptorUtils.g(classDescriptor);
            HashMap map = JavaToKotlinClassMap.j;
            if (map.containsKey(fqNameUnsafeG)) {
                FqName fqName = (FqName) map.get(DescriptorUtils.g(classDescriptor));
                if (fqName == null) {
                    throw new IllegalArgumentException("Given class " + classDescriptor + " is not a mutable collection");
                }
                classDescriptorA = DescriptorUtilsKt.e(classDescriptor).i(fqName);
            } else if (javaTypeQualifiers.f43926b == MutabilityQualifier.f43928Y) {
                classDescriptorA = null;
            } else {
                classDescriptorA = null;
            }
        } else if (javaTypeQualifiers.f43926b == MutabilityQualifier.f43928Y || typeComponentPosition != TypeComponentPosition.f43955Y) {
            classDescriptorA = null;
        } else {
            ClassDescriptor classDescriptor2 = (ClassDescriptor) classifierDescriptorC;
            String str2 = JavaToKotlinClassMap.f43521a;
            if (JavaToKotlinClassMap.k.containsKey(DescriptorUtils.g(classDescriptor2))) {
                classDescriptorA = JavaToKotlinClassMapper.a(classDescriptor2);
            } else {
                classDescriptorA = null;
            }
        }
        if (typeComponentPosition == typeComponentPosition2) {
            bool = null;
        } else {
            NullabilityQualifier nullabilityQualifier = javaTypeQualifiers.f43925a;
            int i4 = nullabilityQualifier == null ? -1 : TypeEnhancementKt.WhenMappings.f43959a[nullabilityQualifier.ordinal()];
            if (i4 == 1) {
                bool = Boolean.TRUE;
            } else if (i4 != 2) {
                bool = null;
            } else {
                bool = Boolean.FALSE;
            }
        }
        if (classDescriptorA == null || (typeConstructorH0 = classDescriptorA.h()) == null) {
            typeConstructorH0 = simpleType.H0();
        }
        Intrinsics.e(typeConstructorH0, "enhancedClassifier?.typeConstructor ?: constructor");
        int i5 = i2 + 1;
        List listF0 = simpleType.F0();
        List parameters = typeConstructorH0.getParameters();
        Intrinsics.e(parameters, "typeConstructor.parameters");
        List list = parameters;
        Iterator it = listF0.iterator();
        Iterator it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.n(listF0, 10), CollectionsKt.n(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
            TypeProjection typeProjection = (TypeProjection) next;
            if (z5) {
                if (!typeProjection.a()) {
                    result = b(typeProjection.getType().K0(), function2, i5, z3);
                } else if (((JavaTypeQualifiers) abstractSignatureParts$computeIndexedQualifiers$1.invoke(Integer.valueOf(i5))).f43925a == NullabilityQualifier.X) {
                    UnwrappedType unwrappedTypeK0 = typeProjection.getType().K0();
                    result = new Result(KotlinTypeFactory.b(FlexibleTypesKt.b(unwrappedTypeK0).L0(false), FlexibleTypesKt.c(unwrappedTypeK0).L0(true)), 1);
                } else {
                    result = new Result(null, 1);
                }
                i5 += result.f43920b;
                unwrappedType = result.f43919a;
                if (unwrappedType != null) {
                    Variance varianceB = typeProjection.b();
                    Intrinsics.e(varianceB, "arg.projectionKind");
                    typeProjectionBaseJ = TypeUtilsKt.d(unwrappedType, varianceB, typeParameterDescriptor);
                } else if (classDescriptorA == null && !typeProjection.a()) {
                    KotlinType type = typeProjection.getType();
                    Intrinsics.e(type, "arg.type");
                    Variance varianceB2 = typeProjection.b();
                    Intrinsics.e(varianceB2, "arg.projectionKind");
                    typeProjectionBaseJ = TypeUtilsKt.d(type, varianceB2, typeParameterDescriptor);
                } else if (classDescriptorA != null) {
                    typeProjectionBaseJ = TypeUtils.j(typeParameterDescriptor);
                } else {
                    typeProjectionBaseJ = null;
                }
                arrayList.add(typeProjectionBaseJ);
                function2 = function1;
                bool = bool;
                i3 = 0;
                unwrappedType2 = null;
            } else {
                result = new Result(unwrappedType2, i3);
            }
            i5 += result.f43920b;
            unwrappedType = result.f43919a;
            if (unwrappedType != null) {
                Variance varianceB3 = typeProjection.b();
                Intrinsics.e(varianceB3, "arg.projectionKind");
                typeProjectionBaseJ = TypeUtilsKt.d(unwrappedType, varianceB3, typeParameterDescriptor);
            } else if (classDescriptorA == null) {
                if (classDescriptorA != null) {
                    typeProjectionBaseJ = TypeUtils.j(typeParameterDescriptor);
                } else {
                    typeProjectionBaseJ = null;
                }
            } else if (classDescriptorA != null) {
                typeProjectionBaseJ = TypeUtils.j(typeParameterDescriptor);
            } else {
                typeProjectionBaseJ = null;
            }
            arrayList.add(typeProjectionBaseJ);
            function2 = function1;
            bool = bool;
            i3 = 0;
            unwrappedType2 = null;
        }
        Boolean bool2 = bool;
        int i6 = i5 - i2;
        if (classDescriptorA == null && bool2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((TypeProjection) it3.next()) == null);
            }
            return new SimpleResult(null, i6, false);
        }
        Annotations annotations2 = simpleType.getAnnotations();
        EnhancedTypeAnnotations enhancedTypeAnnotations = TypeEnhancementKt.f43958b;
        if (classDescriptorA == null) {
            enhancedTypeAnnotations = null;
        }
        Annotations annotations3 = TypeEnhancementKt.f43957a;
        if (bool2 == null) {
            annotations3 = null;
        }
        ArrayList arrayListW = ArraysKt.w(new Annotations[]{annotations2, enhancedTypeAnnotations, annotations3});
        int size = arrayListW.size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected");
        }
        Annotations compositeAnnotations = size != 1 ? new CompositeAnnotations(CollectionsKt.i0(arrayListW)) : (Annotations) CollectionsKt.W(arrayListW);
        Intrinsics.f(compositeAnnotations, "<this>");
        TypeAttributes typeAttributesA = DefaultTypeAttributeTranslator.f44500a.a(compositeAnnotations);
        List listF1 = simpleType.F0();
        Iterator it4 = arrayList.iterator();
        Iterator it5 = listF1.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt.n(arrayList, 10), CollectionsKt.n(listF1, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            TypeProjection typeProjection2 = (TypeProjection) it5.next();
            TypeProjection typeProjection3 = (TypeProjection) next2;
            if (typeProjection3 != null) {
                typeProjection2 = typeProjection3;
            }
            arrayList2.add(typeProjection2);
        }
        SimpleType simpleTypeD = KotlinTypeFactory.d(typeAttributesA, typeConstructorH0, arrayList2, bool2 != null ? bool2.booleanValue() : simpleType.I0(), null);
        if (javaTypeQualifiers.f43927c) {
            simpleTypeD = new NotNullTypeParameterImpl(simpleTypeD);
        }
        return new SimpleResult(simpleTypeD, i6, bool2 != null && javaTypeQualifiers.d);
    }

    public final Result b(UnwrappedType unwrappedType, Function1 function1, int i2, boolean z2) {
        UnwrappedType unwrappedTypeB;
        SimpleType simpleType;
        SimpleType simpleType2;
        UnwrappedType unwrappedTypeC = null;
        if (KotlinTypeKt.a(unwrappedType)) {
            return new Result(null, 1);
        }
        if (!(unwrappedType instanceof FlexibleType)) {
            if (!(unwrappedType instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            SimpleResult simpleResultA = a((SimpleType) unwrappedType, function1, i2, TypeComponentPosition.Z, false, z2);
            boolean z3 = simpleResultA.f43923c;
            UnwrappedType unwrappedTypeC2 = simpleResultA.f43921a;
            if (z3) {
                unwrappedTypeC2 = TypeWithEnhancementKt.c(unwrappedType, unwrappedTypeC2);
            }
            return new Result(unwrappedTypeC2, simpleResultA.f43922b);
        }
        boolean z4 = unwrappedType instanceof RawType;
        FlexibleType flexibleType = (FlexibleType) unwrappedType;
        SimpleResult simpleResultA2 = a(flexibleType.f44509Y, function1, i2, TypeComponentPosition.X, z4, z2);
        SimpleResult simpleResultA3 = a(flexibleType.Z, function1, i2, TypeComponentPosition.f43955Y, z4, z2);
        SimpleType simpleType3 = simpleResultA3.f43921a;
        SimpleType simpleType4 = simpleResultA2.f43921a;
        if (simpleType4 != null || simpleType3 != null) {
            if (simpleResultA2.f43923c || simpleResultA3.f43923c) {
                if (simpleType3 != null) {
                    if (simpleType4 == null) {
                        simpleType4 = simpleType3;
                    }
                    unwrappedTypeB = KotlinTypeFactory.b(simpleType4, simpleType3);
                } else {
                    Intrinsics.c(simpleType4);
                    unwrappedTypeB = simpleType4;
                }
                unwrappedTypeC = TypeWithEnhancementKt.c(unwrappedType, unwrappedTypeB);
            } else {
                SimpleType simpleType5 = flexibleType.Z;
                SimpleType simpleType6 = flexibleType.f44509Y;
                if (z4) {
                    if (simpleType4 == null) {
                        simpleType = simpleType4;
                        simpleType2 = simpleType4;
                        simpleType2 = simpleType6;
                    }
                    if (simpleType3 == null) {
                        simpleType3 = simpleType5;
                    }
                    unwrappedTypeC = new RawTypeImpl(simpleType2, simpleType3);
                } else {
                    if (simpleType4 == null) {
                        simpleType = simpleType6;
                    }
                    if (simpleType3 == null) {
                        simpleType3 = simpleType5;
                    }
                    unwrappedTypeC = KotlinTypeFactory.b(simpleType, simpleType3);
                }
            }
        }
        return new Result(unwrappedTypeC, simpleResultA2.f43922b);
    }
}

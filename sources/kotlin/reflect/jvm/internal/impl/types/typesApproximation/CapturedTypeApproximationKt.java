package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class CapturedTypeApproximationKt {

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final ApproximationBounds a(KotlinType type) {
        TypeArgument typeArgument;
        Object objC;
        TypeArgument typeArgument2;
        Intrinsics.f(type, "type");
        if (FlexibleTypesKt.a(type)) {
            ApproximationBounds approximationBoundsA = a(FlexibleTypesKt.b(type));
            ApproximationBounds approximationBoundsA2 = a(FlexibleTypesKt.c(type));
            return new ApproximationBounds(TypeWithEnhancementKt.b(KotlinTypeFactory.b(FlexibleTypesKt.b((KotlinType) approximationBoundsA.f44597a), FlexibleTypesKt.c((KotlinType) approximationBoundsA2.f44597a)), type), TypeWithEnhancementKt.b(KotlinTypeFactory.b(FlexibleTypesKt.b((KotlinType) approximationBoundsA.f44598b), FlexibleTypesKt.c((KotlinType) approximationBoundsA2.f44598b)), type));
        }
        TypeConstructor typeConstructorH0 = type.H0();
        boolean z2 = true;
        if (type.H0() instanceof CapturedTypeConstructor) {
            Intrinsics.d(typeConstructorH0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            TypeProjection typeProjectionB = ((CapturedTypeConstructor) typeConstructorH0).b();
            KotlinType type2 = typeProjectionB.getType();
            Intrinsics.e(type2, "typeProjection.type");
            KotlinType kotlinTypeH = TypeUtils.h(type2, type.I0());
            Intrinsics.e(kotlinTypeH, "makeNullableIfNeeded(this, type.isMarkedNullable)");
            int iOrdinal = typeProjectionB.b().ordinal();
            if (iOrdinal == 1) {
                return new ApproximationBounds(kotlinTypeH, TypeUtilsKt.f(type).n());
            }
            if (iOrdinal != 2) {
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + typeProjectionB);
            }
            SimpleType simpleTypeM = TypeUtilsKt.f(type).m();
            Intrinsics.e(simpleTypeM, "type.builtIns.nothingType");
            KotlinType kotlinTypeH2 = TypeUtils.h(simpleTypeM, type.I0());
            Intrinsics.e(kotlinTypeH2, "makeNullableIfNeeded(this, type.isMarkedNullable)");
            return new ApproximationBounds(kotlinTypeH2, kotlinTypeH);
        }
        if (type.F0().isEmpty() || type.F0().size() != typeConstructorH0.getParameters().size()) {
            return new ApproximationBounds(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listF0 = type.F0();
        List parameters = typeConstructorH0.getParameters();
        Intrinsics.e(parameters, "typeConstructor.parameters");
        for (Pair pair : CollectionsKt.n0(listF0, parameters)) {
            TypeProjection typeProjection = (TypeProjection) pair.X;
            TypeParameterDescriptor typeParameter = (TypeParameterDescriptor) pair.f43249Y;
            Intrinsics.e(typeParameter, "typeParameter");
            Variance varianceJ = typeParameter.j();
            if (varianceJ == null) {
                TypeSubstitutor.a(35);
                throw null;
            }
            if (typeProjection == null) {
                TypeSubstitutor.a(36);
                throw null;
            }
            TypeSubstitutor typeSubstitutor = TypeSubstitutor.f44550b;
            int iOrdinal2 = (typeProjection.a() ? Variance.OUT_VARIANCE : TypeSubstitutor.b(varianceJ, typeProjection.b())).ordinal();
            if (iOrdinal2 == 0) {
                KotlinType type3 = typeProjection.getType();
                Intrinsics.e(type3, "type");
                KotlinType type4 = typeProjection.getType();
                Intrinsics.e(type4, "type");
                typeArgument2 = new TypeArgument(typeParameter, type3, type4);
            } else if (iOrdinal2 == 1) {
                KotlinType type5 = typeProjection.getType();
                Intrinsics.e(type5, "type");
                typeArgument2 = new TypeArgument(typeParameter, type5, DescriptorUtilsKt.e(typeParameter).n());
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                SimpleType simpleTypeM2 = DescriptorUtilsKt.e(typeParameter).m();
                Intrinsics.e(simpleTypeM2, "typeParameter.builtIns.nothingType");
                KotlinType type6 = typeProjection.getType();
                Intrinsics.e(type6, "type");
                typeArgument2 = new TypeArgument(typeParameter, simpleTypeM2, type6);
            }
            if (typeProjection.a()) {
                arrayList.add(typeArgument2);
                arrayList2.add(typeArgument2);
            } else {
                ApproximationBounds approximationBoundsA3 = a(typeArgument2.f44600b);
                KotlinType kotlinType = (KotlinType) approximationBoundsA3.f44597a;
                KotlinType kotlinType2 = (KotlinType) approximationBoundsA3.f44598b;
                ApproximationBounds approximationBoundsA4 = a(typeArgument2.f44601c);
                KotlinType kotlinType3 = (KotlinType) approximationBoundsA4.f44597a;
                KotlinType kotlinType4 = (KotlinType) approximationBoundsA4.f44598b;
                TypeParameterDescriptor typeParameterDescriptor = typeArgument2.f44599a;
                TypeArgument typeArgument3 = new TypeArgument(typeParameterDescriptor, kotlinType2, kotlinType3);
                TypeArgument typeArgument4 = new TypeArgument(typeParameterDescriptor, kotlinType, kotlinType4);
                arrayList.add(typeArgument3);
                arrayList2.add(typeArgument4);
            }
        }
        if (arrayList.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            typeArgument = (TypeArgument) it.next();
            typeArgument.getClass();
        } while (KotlinTypeChecker.f44562a.d(typeArgument.f44600b, typeArgument.f44601c));
        if (z2) {
            objC = TypeUtilsKt.f(type).m();
            Intrinsics.e(objC, "type.builtIns.nothingType");
        } else {
            objC = c(type, arrayList);
        }
        return new ApproximationBounds(objC, c(type, arrayList2));
    }

    public static final TypeProjection b(TypeProjection typeProjection, boolean z2) {
        if (typeProjection == null) {
            return null;
        }
        if (!typeProjection.a()) {
            KotlinType type = typeProjection.getType();
            Intrinsics.e(type, "typeProjection.type");
            if (TypeUtils.c(type, CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1.X, null)) {
                Variance varianceB = typeProjection.b();
                Intrinsics.e(varianceB, "typeProjection.projectionKind");
                if (varianceB == Variance.OUT_VARIANCE) {
                    return new TypeProjectionImpl((KotlinType) a(type).f44598b, varianceB);
                }
                if (z2) {
                    return new TypeProjectionImpl((KotlinType) a(type).f44597a, varianceB);
                }
                CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1 capturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1 = new CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1();
                TypeSubstitutor typeSubstitutor = new TypeSubstitutor(capturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1);
                if (!capturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1.e()) {
                    try {
                        return typeSubstitutor.j(typeProjection, null, 0);
                    } catch (TypeSubstitutor.SubstitutionException unused) {
                        return null;
                    }
                }
            }
        }
        return typeProjection;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    public static final KotlinType c(KotlinType kotlinType, ArrayList arrayList) {
        TypeProjectionImpl typeProjectionImpl;
        kotlinType.F0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TypeArgument typeArgument = (TypeArgument) it.next();
            typeArgument.getClass();
            NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = KotlinTypeChecker.f44562a;
            KotlinType kotlinType2 = typeArgument.f44600b;
            KotlinType kotlinType3 = typeArgument.f44601c;
            newKotlinTypeCheckerImpl.d(kotlinType2, kotlinType3);
            if (Intrinsics.a(kotlinType2, kotlinType3)) {
                typeProjectionImpl = new TypeProjectionImpl(kotlinType2);
            } else {
                TypeParameterDescriptor typeParameterDescriptor = typeArgument.f44599a;
                Variance varianceJ = typeParameterDescriptor.j();
                Variance variance = Variance.IN_VARIANCE;
                if (varianceJ == variance) {
                    typeProjectionImpl = new TypeProjectionImpl(kotlinType2);
                } else {
                    boolean zD = KotlinBuiltIns.D(kotlinType2);
                    Variance variance2 = Variance.OUT_VARIANCE;
                    Variance variance3 = Variance.INVARIANT;
                    if (zD && typeParameterDescriptor.j() != variance) {
                        if (variance2 == typeParameterDescriptor.j()) {
                            variance2 = variance3;
                        }
                        typeProjectionImpl = new TypeProjectionImpl(kotlinType3, variance2);
                    } else {
                        if (kotlinType3 == null) {
                            KotlinBuiltIns.a(140);
                            throw null;
                        }
                        if (KotlinBuiltIns.w(kotlinType3) && kotlinType3.I0()) {
                            if (variance == typeParameterDescriptor.j()) {
                                variance = variance3;
                            }
                            typeProjectionImpl = new TypeProjectionImpl(kotlinType2, variance);
                        } else {
                            if (variance2 == typeParameterDescriptor.j()) {
                                variance2 = variance3;
                            }
                            typeProjectionImpl = new TypeProjectionImpl(kotlinType3, variance2);
                        }
                    }
                }
            }
            arrayList2.add(typeProjectionImpl);
        }
        return TypeSubstitutionKt.c(kotlinType, arrayList2, null, 6);
    }
}

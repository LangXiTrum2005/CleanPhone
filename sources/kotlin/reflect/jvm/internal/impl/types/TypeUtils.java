package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* JADX INFO: loaded from: classes7.dex */
public class TypeUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ErrorType f44555a = ErrorUtils.c(ErrorTypeKind.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ErrorType f44556b = ErrorUtils.c(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SpecialType f44557c = new SpecialType("NO_EXPECTED_TYPE");
    public static final SpecialType d = new SpecialType("UNIT_EXPECTED_TYPE");

    public static class SpecialType extends DelegatingSimpleType {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final String f44558Y;

        public SpecialType(String str) {
            this.f44558Y = str;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0030  */
        public static /* synthetic */ void T0(int i2) {
            String str = (i2 == 1 || i2 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 1 || i2 == 4) ? 2 : 3];
            if (i2 == 1) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else if (i2 == 2) {
                objArr[0] = "delegate";
            } else if (i2 == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i2 != 4) {
                objArr[0] = "newAttributes";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
            if (i2 == 1) {
                objArr[1] = "toString";
            } else if (i2 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i2 == 3) {
                    objArr[2] = "refine";
                } else if (i2 != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            String str2 = String.format(str, objArr);
            if (i2 != 1 && i2 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
        /* JADX INFO: renamed from: J0 */
        public final KotlinType M0(KotlinTypeRefiner kotlinTypeRefiner) {
            if (kotlinTypeRefiner != null) {
                return this;
            }
            T0(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        public final /* bridge */ /* synthetic */ UnwrappedType L0(boolean z2) {
            L0(z2);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        /* JADX INFO: renamed from: M0 */
        public final UnwrappedType J0(KotlinTypeRefiner kotlinTypeRefiner) {
            if (kotlinTypeRefiner != null) {
                return this;
            }
            T0(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        public final /* bridge */ /* synthetic */ UnwrappedType N0(TypeAttributes typeAttributes) {
            N0(typeAttributes);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        /* JADX INFO: renamed from: O0 */
        public final SimpleType L0(boolean z2) {
            throw new IllegalStateException(this.f44558Y);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        /* JADX INFO: renamed from: P0 */
        public final SimpleType N0(TypeAttributes typeAttributes) {
            if (typeAttributes != null) {
                throw new IllegalStateException(this.f44558Y);
            }
            T0(0);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        public final SimpleType Q0() {
            throw new IllegalStateException(this.f44558Y);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        /* JADX INFO: renamed from: R0 */
        public final SimpleType J0(KotlinTypeRefiner kotlinTypeRefiner) {
            if (kotlinTypeRefiner != null) {
                return this;
            }
            T0(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        public final DelegatingSimpleType S0(SimpleType simpleType) {
            throw new IllegalStateException(this.f44558Y);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        public final String toString() {
            String str = this.f44558Y;
            if (str != null) {
                return str;
            }
            T0(1);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        if (i2 != 4 && i2 != 9 && i2 != 11 && i2 != 15 && i2 != 17 && i2 != 19 && i2 != 26 && i2 != 35 && i2 != 48 && i2 != 53 && i2 != 6 && i2 != 7) {
            switch (i2) {
                case 56:
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i2 != 4 && i2 != 9 && i2 != 11 && i2 != 15 && i2 != 17 && i2 != 19 && i2 != 26 && i2 != 35 && i2 != 48 && i2 != 53 && i2 != 6 && i2 != 7) {
            switch (i2) {
                case 56:
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                case 58:
                case 59:
                    i3 = 2;
                    break;
                default:
                    i3 = 3;
                    break;
            }
        } else {
            i3 = 2;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case AD_REWARD_USER_VALUE:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                objArr[0] = "expectedType";
                break;
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i2 == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i2 == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i2 == 11 || i2 == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i2 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i2 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i2 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i2 == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i2 == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i2 != 53) {
            if (i2 != 6 && i2 != 7) {
                switch (i2) {
                    case 56:
                    case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i2) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case AD_REWARD_USER_VALUE:
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 4 && i2 != 9 && i2 != 11 && i2 != 15 && i2 != 17 && i2 != 19 && i2 != 26 && i2 != 35 && i2 != 48 && i2 != 53 && i2 != 6 && i2 != 7) {
            switch (i2) {
                case 56:
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(28);
            throw null;
        }
        if (kotlinType.I0()) {
            return true;
        }
        return FlexibleTypesKt.a(kotlinType) && b(((FlexibleType) kotlinType.K0()).Z);
    }

    public static boolean c(KotlinType kotlinType, Function1 function1, SmartSet smartSet) {
        if (kotlinType == null) {
            return false;
        }
        UnwrappedType unwrappedTypeK0 = kotlinType.K0();
        if (m(kotlinType)) {
            return ((Boolean) function1.invoke(unwrappedTypeK0)).booleanValue();
        }
        if (smartSet != null && smartSet.contains(kotlinType)) {
            return false;
        }
        if (((Boolean) function1.invoke(unwrappedTypeK0)).booleanValue()) {
            return true;
        }
        if (smartSet == null) {
            smartSet = new SmartSet();
        }
        smartSet.add(kotlinType);
        FlexibleType flexibleType = unwrappedTypeK0 instanceof FlexibleType ? (FlexibleType) unwrappedTypeK0 : null;
        if (flexibleType != null && (c(flexibleType.f44509Y, function1, smartSet) || c(flexibleType.Z, function1, smartSet))) {
            return true;
        }
        if ((unwrappedTypeK0 instanceof DefinitelyNotNullType) && c(((DefinitelyNotNullType) unwrappedTypeK0).f44501Y, function1, smartSet)) {
            return true;
        }
        TypeConstructor typeConstructorH0 = kotlinType.H0();
        if (typeConstructorH0 instanceof IntersectionTypeConstructor) {
            Iterator it = ((IntersectionTypeConstructor) typeConstructorH0).f44513b.iterator();
            while (it.hasNext()) {
                if (c((KotlinType) it.next(), function1, smartSet)) {
                    return true;
                }
            }
            return false;
        }
        for (TypeProjection typeProjection : kotlinType.F0()) {
            if (!typeProjection.a() && c(typeProjection.getType(), function1, smartSet)) {
                return true;
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new TypeProjectionImpl(((TypeParameterDescriptor) it.next()).o()));
        }
        return CollectionsKt.i0(arrayList);
    }

    public static boolean e(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(27);
            throw null;
        }
        if (!kotlinType.I0() && (!FlexibleTypesKt.a(kotlinType) || !e(((FlexibleType) kotlinType.K0()).Z))) {
            if (!(kotlinType.K0() instanceof DefinitelyNotNullType)) {
                if (f(kotlinType)) {
                    if (!(kotlinType.H0().c() instanceof ClassDescriptor)) {
                        TypeSubstitutor typeSubstitutorD = TypeSubstitutor.d(kotlinType);
                        Collection<KotlinType> collectionD = kotlinType.H0().d();
                        ArrayList arrayList = new ArrayList(collectionD.size());
                        for (KotlinType kotlinType2 : collectionD) {
                            if (kotlinType2 == null) {
                                a(21);
                                throw null;
                            }
                            KotlinType kotlinTypeI = typeSubstitutorD.i(kotlinType2, Variance.INVARIANT);
                            KotlinType kotlinTypeH = kotlinTypeI != null ? h(kotlinTypeI, kotlinType.I0()) : null;
                            if (kotlinTypeH != null) {
                                arrayList.add(kotlinTypeH);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((KotlinType) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (kotlinType instanceof AbstractStubType) {
                    throw null;
                }
                TypeConstructor typeConstructorH0 = kotlinType.H0();
                if (typeConstructorH0 instanceof IntersectionTypeConstructor) {
                    Iterator it2 = ((IntersectionTypeConstructor) typeConstructorH0).f44513b.iterator();
                    while (it2.hasNext()) {
                        if (e((KotlinType) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(KotlinType kotlinType) {
        if (kotlinType != null) {
            return (kotlinType.H0().c() instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) kotlinType.H0().c() : null) != null || (kotlinType.H0() instanceof NewTypeVariableConstructor);
        }
        a(60);
        throw null;
    }

    public static UnwrappedType g(KotlinType kotlinType, boolean z2) {
        if (kotlinType == null) {
            a(3);
            throw null;
        }
        UnwrappedType unwrappedTypeL0 = kotlinType.K0().L0(z2);
        if (unwrappedTypeL0 != null) {
            return unwrappedTypeL0;
        }
        a(4);
        throw null;
    }

    public static KotlinType h(KotlinType kotlinType, boolean z2) {
        if (kotlinType != null) {
            return z2 ? g(kotlinType, true) : kotlinType;
        }
        a(8);
        throw null;
    }

    public static SimpleType i(SimpleType simpleType, boolean z2) {
        if (simpleType == null) {
            a(5);
            throw null;
        }
        if (!z2) {
            return simpleType;
        }
        SimpleType simpleTypeL0 = simpleType.L0(true);
        if (simpleTypeL0 != null) {
            return simpleTypeL0;
        }
        a(6);
        throw null;
    }

    public static StarProjectionImpl j(TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor != null) {
            return new StarProjectionImpl(typeParameterDescriptor);
        }
        a(45);
        throw null;
    }

    public static TypeProjectionBase k(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        if (typeParameterDescriptor != null) {
            return erasureTypeAttributes.b() == TypeUsage.X ? new TypeProjectionImpl(StarProjectionImplKt.b(typeParameterDescriptor)) : new StarProjectionImpl(typeParameterDescriptor);
        }
        a(46);
        throw null;
    }

    public static SimpleType l(TypeConstructor typeConstructor, MemberScope memberScope, Function1 function1) {
        if (typeConstructor == null) {
            a(12);
            throw null;
        }
        if (memberScope == null) {
            a(13);
            throw null;
        }
        List listD = d(typeConstructor.getParameters());
        TypeAttributes.f44529Y.getClass();
        return KotlinTypeFactory.f(TypeAttributes.Z, typeConstructor, listD, false, memberScope, function1);
    }

    public static boolean m(KotlinType kotlinType) {
        if (kotlinType != null) {
            return kotlinType == f44557c || kotlinType == d;
        }
        a(0);
        throw null;
    }
}

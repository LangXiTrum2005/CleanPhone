package kotlin.reflect.jvm.internal.impl.types;

import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public class TypeSubstitutor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TypeSubstitutor f44550b = new TypeSubstitutor(TypeSubstitution.f44548a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeSubstitution f44551a;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$1, reason: invalid class name */
    final class AnonymousClass1 implements Function1<FqName, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            FqName fqName = (FqName) obj;
            if (fqName != null) {
                return Boolean.valueOf(!fqName.equals(StandardNames.FqNames.y));
            }
            throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44552a;

        static {
            int[] iArr = new int[VarianceConflictType.values().length];
            f44552a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44552a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44552a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class SubstitutionException extends Exception {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class VarianceConflictType {
        public static final VarianceConflictType X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final VarianceConflictType f44553Y;
        public static final VarianceConflictType Z;
        public static final /* synthetic */ VarianceConflictType[] e0;

        static {
            VarianceConflictType varianceConflictType = new VarianceConflictType("NO_CONFLICT", 0);
            X = varianceConflictType;
            VarianceConflictType varianceConflictType2 = new VarianceConflictType("IN_IN_OUT_POSITION", 1);
            f44553Y = varianceConflictType2;
            VarianceConflictType varianceConflictType3 = new VarianceConflictType("OUT_IN_IN_POSITION", 2);
            Z = varianceConflictType3;
            e0 = new VarianceConflictType[]{varianceConflictType, varianceConflictType2, varianceConflictType3};
        }

        public static VarianceConflictType valueOf(String str) {
            return (VarianceConflictType) Enum.valueOf(VarianceConflictType.class, str);
        }

        public static VarianceConflictType[] values() {
            return (VarianceConflictType[]) e0.clone();
        }
    }

    public TypeSubstitutor(TypeSubstitution typeSubstitution) {
        this.f44551a = typeSubstitution;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        if (i2 != 1 && i2 != 2 && i2 != 8 && i2 != 34 && i2 != 37) {
            switch (i2) {
                default:
                    switch (i2) {
                        default:
                            switch (i2) {
                                default:
                                    switch (i2) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i2 != 1 && i2 != 2 && i2 != 8 && i2 != 34 && i2 != 37) {
            switch (i2) {
                case 11:
                case 12:
                case 13:
                    i3 = 2;
                    break;
                default:
                    switch (i2) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i3 = 2;
                            break;
                        default:
                            switch (i2) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i3 = 2;
                                    break;
                                default:
                                    switch (i2) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i3 = 2;
                                            break;
                                        default:
                                            i3 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i3 = 2;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i2 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i2 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i2 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i2 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i2 != 37) {
            switch (i2) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i2) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i2) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i2) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i2) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 1 && i2 != 2 && i2 != 8 && i2 != 34 && i2 != 37) {
            switch (i2) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i2) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i2) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i2) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static Variance b(Variance variance, Variance variance2) {
        if (variance == null) {
            a(38);
            throw null;
        }
        if (variance2 == null) {
            a(39);
            throw null;
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 != null) {
                return variance2;
            }
            a(40);
            throw null;
        }
        if (variance2 == variance3) {
            if (variance != null) {
                return variance;
            }
            a(41);
            throw null;
        }
        if (variance == variance2) {
            if (variance2 != null) {
                return variance2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    public static VarianceConflictType c(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        Variance variance4 = Variance.OUT_VARIANCE;
        if (variance == variance3 && variance2 == variance4) {
            return VarianceConflictType.Z;
        }
        return (variance == variance4 && variance2 == variance3) ? VarianceConflictType.f44553Y : VarianceConflictType.X;
    }

    public static TypeSubstitutor d(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(6);
            throw null;
        }
        return new TypeSubstitutor(TypeConstructorSubstitution.f44539b.a(kotlinType.H0(), kotlinType.F0()));
    }

    public static TypeSubstitutor e(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            a(3);
            throw null;
        }
        if (typeSubstitution2 == null) {
            a(4);
            throw null;
        }
        if (typeSubstitution.e()) {
            typeSubstitution = typeSubstitution2;
        } else if (!typeSubstitution2.e()) {
            typeSubstitution = new DisjointKeysUnionTypeSubstitution(typeSubstitution, typeSubstitution2);
        }
        return new TypeSubstitutor(typeSubstitution);
    }

    public static String h(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (ExceptionUtilsKt.a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + d9.i.f24752e;
        }
    }

    public final TypeSubstitution f() {
        TypeSubstitution typeSubstitution = this.f44551a;
        if (typeSubstitution != null) {
            return typeSubstitution;
        }
        a(8);
        throw null;
    }

    public final KotlinType g(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            a(9);
            throw null;
        }
        if (this.f44551a.e()) {
            return kotlinType;
        }
        try {
            KotlinType type = j(new TypeProjectionImpl(kotlinType, variance), null, 0).getType();
            if (type != null) {
                return type;
            }
            a(12);
            throw null;
        } catch (SubstitutionException e2) {
            return ErrorUtils.c(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e2.getMessage());
        }
    }

    public final KotlinType i(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            a(14);
            throw null;
        }
        if (variance == null) {
            a(15);
            throw null;
        }
        TypeProjection typeProjectionImpl = new TypeProjectionImpl(f().f(kotlinType, variance), variance);
        TypeSubstitution typeSubstitution = this.f44551a;
        if (!typeSubstitution.e()) {
            try {
                typeProjectionImpl = j(typeProjectionImpl, null, 0);
            } catch (SubstitutionException unused) {
                typeProjectionImpl = null;
            }
        }
        if (typeSubstitution.a() || typeSubstitution.b()) {
            typeProjectionImpl = CapturedTypeApproximationKt.b(typeProjectionImpl, typeSubstitution.b());
        }
        if (typeProjectionImpl == null) {
            return null;
        }
        return typeProjectionImpl.getType();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:107:0x0213  */
    /* JADX WARN: Code duplicated, block: B:109:0x021b  */
    /* JADX WARN: Code duplicated, block: B:110:0x021e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0221  */
    /* JADX WARN: Code duplicated, block: B:113:0x0224  */
    /* JADX WARN: Code duplicated, block: B:116:0x0229  */
    /* JADX WARN: Code duplicated, block: B:122:0x0246  */
    /* JADX WARN: Code duplicated, block: B:127:0x0267  */
    /* JADX WARN: Code duplicated, block: B:129:0x028b  */
    /* JADX WARN: Code duplicated, block: B:131:0x028e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0292  */
    /* JADX WARN: Code duplicated, block: B:136:0x0298  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0130  */
    /* JADX WARN: Code duplicated, block: B:63:0x0140  */
    /* JADX WARN: Code duplicated, block: B:65:0x0150  */
    /* JADX WARN: Code duplicated, block: B:67:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0159  */
    /* JADX WARN: Code duplicated, block: B:71:0x0161  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0180  */
    /* JADX WARN: Code duplicated, block: B:81:0x018a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:87:0x019d  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final TypeProjection j(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor, int i2) throws SubstitutionException {
        KotlinType type;
        Variance varianceB;
        UnwrappedType unwrappedTypeK0;
        AbbreviatedType abbreviatedType;
        SimpleType simpleType;
        Variance variance;
        List parameters;
        List newArguments;
        ArrayList arrayList;
        boolean z2;
        KotlinType kotlinTypeC;
        TypeParameterDescriptor typeParameterDescriptor2;
        TypeProjection typeProjection2;
        TypeProjection typeProjectionJ;
        int iOrdinal;
        char c2;
        TypeSubstitutor typeSubstitutor;
        VarianceConflictType varianceConflictTypeC;
        Object objK0;
        CustomTypeParameter customTypeParameter;
        KotlinType kotlinTypeH;
        Annotations annotationsC;
        int iOrdinal2;
        TypeSubstitutor typeSubstitutor2 = this;
        int i3 = 0;
        KotlinType kotlinTypeI = null;
        if (typeProjection == null) {
            a(18);
            throw null;
        }
        TypeSubstitution typeSubstitution = typeSubstitutor2.f44551a;
        if (i2 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + h(typeProjection) + "; substitution: " + h(typeSubstitution));
        }
        if (!typeProjection.a()) {
            KotlinType type2 = typeProjection.getType();
            if (type2 instanceof TypeWithEnhancement) {
                TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type2;
                UnwrappedType origin = typeWithEnhancement.getOrigin();
                KotlinType kotlinTypeZ = typeWithEnhancement.Z();
                TypeProjection typeProjectionJ2 = typeSubstitutor2.j(new TypeProjectionImpl(origin, typeProjection.b()), typeParameterDescriptor, i2 + 1);
                return typeProjectionJ2.a() ? typeProjectionJ2 : new TypeProjectionImpl(TypeWithEnhancementKt.c(typeProjectionJ2.getType().K0(), typeSubstitutor2.i(kotlinTypeZ, typeProjection.b())), typeProjectionJ2.b());
            }
            if (!DynamicTypesKt.a(type2) && !(type2.K0() instanceof RawType)) {
                TypeProjection typeProjectionD = typeSubstitution.d(type2);
                if (typeProjectionD == null) {
                    typeProjectionD = null;
                } else if (type2.getAnnotations().E0(StandardNames.FqNames.y)) {
                    TypeConstructor typeConstructorH0 = typeProjectionD.getType().H0();
                    if (typeConstructorH0 instanceof NewCapturedTypeConstructor) {
                        TypeProjection typeProjection3 = ((NewCapturedTypeConstructor) typeConstructorH0).f44567a;
                        Variance varianceB2 = typeProjection3.b();
                        VarianceConflictType varianceConflictTypeC2 = c(typeProjection.b(), varianceB2);
                        VarianceConflictType varianceConflictType = VarianceConflictType.Z;
                        if (varianceConflictTypeC2 == varianceConflictType) {
                            typeProjectionD = new TypeProjectionImpl(typeProjection3.getType());
                        } else if (typeParameterDescriptor != null && c(typeParameterDescriptor.j(), varianceB2) == varianceConflictType) {
                            typeProjectionD = new TypeProjectionImpl(typeProjection3.getType());
                        }
                    }
                }
                Variance varianceB3 = typeProjection.b();
                if (typeProjectionD == null && FlexibleTypesKt.a(type2)) {
                    Object objK1 = type2.K0();
                    CustomTypeParameter customTypeParameter2 = objK1 instanceof CustomTypeParameter ? (CustomTypeParameter) objK1 : null;
                    if (!(customTypeParameter2 != null ? customTypeParameter2.y0() : false)) {
                        FlexibleType flexibleType = (FlexibleType) type2.K0();
                        SimpleType simpleType2 = flexibleType.f44509Y;
                        int i4 = i2 + 1;
                        TypeProjection typeProjectionJ3 = typeSubstitutor2.j(new TypeProjectionImpl(simpleType2, varianceB3), typeParameterDescriptor, i4);
                        SimpleType simpleType3 = flexibleType.Z;
                        TypeProjection typeProjectionJ4 = typeSubstitutor2.j(new TypeProjectionImpl(simpleType3, varianceB3), typeParameterDescriptor, i4);
                        Variance varianceB4 = typeProjectionJ3.b();
                        if (typeProjectionJ3.getType() != simpleType2 || typeProjectionJ4.getType() != simpleType3) {
                            return new TypeProjectionImpl(KotlinTypeFactory.b(TypeSubstitutionKt.a(typeProjectionJ3.getType()), TypeSubstitutionKt.a(typeProjectionJ4.getType())), varianceB4);
                        }
                    } else if (!KotlinBuiltIns.D(type2)) {
                        if (typeProjectionD != null) {
                            varianceConflictTypeC = c(varianceB3, typeProjectionD.b());
                            if (!(type2.H0() instanceof CapturedTypeConstructor)) {
                                iOrdinal2 = varianceConflictTypeC.ordinal();
                                if (iOrdinal2 != 1) {
                                    return new TypeProjectionImpl(type2.H0().k().n(), Variance.OUT_VARIANCE);
                                }
                                if (iOrdinal2 == 2) {
                                    throw new SubstitutionException("Out-projection in in-position");
                                }
                            }
                            objK0 = type2.K0();
                            if (objK0 instanceof CustomTypeParameter) {
                                customTypeParameter = (CustomTypeParameter) objK0;
                            } else {
                                customTypeParameter = null;
                            }
                            if (customTypeParameter != null) {
                                customTypeParameter = null;
                            } else {
                                customTypeParameter = null;
                            }
                            if (typeProjectionD.a()) {
                                return typeProjectionD;
                            }
                            if (customTypeParameter != null) {
                                kotlinTypeH = customTypeParameter.c0(typeProjectionD.getType());
                            } else {
                                kotlinTypeH = TypeUtils.h(typeProjectionD.getType(), type2.I0());
                            }
                            if (!type2.getAnnotations().isEmpty()) {
                                annotationsC = typeSubstitution.c(type2.getAnnotations());
                                if (annotationsC != null) {
                                    a(33);
                                    throw null;
                                }
                                if (annotationsC.E0(StandardNames.FqNames.y)) {
                                    annotationsC = new FilteredAnnotations(annotationsC, new AnonymousClass1());
                                }
                                kotlinTypeH = TypeUtilsKt.k(kotlinTypeH, new CompositeAnnotations(kotlinTypeH.getAnnotations(), annotationsC));
                            }
                            if (varianceConflictTypeC == VarianceConflictType.X) {
                                varianceB3 = b(varianceB3, typeProjectionD.b());
                            }
                            return new TypeProjectionImpl(kotlinTypeH, varianceB3);
                        }
                        type = typeProjection.getType();
                        varianceB = typeProjection.b();
                        if (!(type.H0().c() instanceof TypeParameterDescriptor)) {
                            unwrappedTypeK0 = type.K0();
                            if (unwrappedTypeK0 instanceof AbbreviatedType) {
                                abbreviatedType = (AbbreviatedType) unwrappedTypeK0;
                            } else {
                                abbreviatedType = null;
                            }
                            if (abbreviatedType != null) {
                                simpleType = abbreviatedType.Z;
                            } else {
                                simpleType = null;
                            }
                            variance = Variance.INVARIANT;
                            if (simpleType != null) {
                                if (typeSubstitution instanceof IndexedParametersSubstitution) {
                                    typeSubstitutor = typeSubstitutor2;
                                } else {
                                    typeSubstitutor = typeSubstitutor2;
                                }
                                kotlinTypeI = typeSubstitutor.i(simpleType, variance);
                            }
                            parameters = type.H0().getParameters();
                            newArguments = type.F0();
                            arrayList = new ArrayList(parameters.size());
                            z2 = false;
                            while (i3 < parameters.size()) {
                                typeParameterDescriptor2 = (TypeParameterDescriptor) parameters.get(i3);
                                typeProjection2 = (TypeProjection) newArguments.get(i3);
                                typeProjectionJ = typeSubstitutor2.j(typeProjection2, typeParameterDescriptor2, i2 + 1);
                                iOrdinal = c(typeParameterDescriptor2.j(), typeProjectionJ.b()).ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal != 1) {
                                        c2 = 2;
                                        if (iOrdinal == 2) {
                                        }
                                    } else {
                                        c2 = 2;
                                    }
                                    typeProjectionJ = TypeUtils.j(typeParameterDescriptor2);
                                } else {
                                    c2 = 2;
                                    if (typeParameterDescriptor2.j() != variance) {
                                        typeProjectionJ = new TypeProjectionImpl(typeProjectionJ.getType(), variance);
                                    }
                                }
                                if (typeProjectionJ != typeProjection2) {
                                    z2 = true;
                                }
                                arrayList.add(typeProjectionJ);
                                i3++;
                                typeSubstitutor2 = this;
                            }
                            if (z2) {
                                newArguments = arrayList;
                            }
                            Annotations newAnnotations = typeSubstitution.c(type.getAnnotations());
                            Intrinsics.f(newArguments, "newArguments");
                            Intrinsics.f(newAnnotations, "newAnnotations");
                            kotlinTypeC = TypeSubstitutionKt.c(type, newArguments, newAnnotations, 4);
                            if (kotlinTypeC instanceof SimpleType) {
                                kotlinTypeC = SpecialTypesKt.c((SimpleType) kotlinTypeC, (SimpleType) kotlinTypeI);
                            }
                            return new TypeProjectionImpl(kotlinTypeC, varianceB);
                        }
                    }
                } else if (!KotlinBuiltIns.D(type2) && !KotlinTypeKt.a(type2)) {
                    if (typeProjectionD != null) {
                        varianceConflictTypeC = c(varianceB3, typeProjectionD.b());
                        if (!(type2.H0() instanceof CapturedTypeConstructor)) {
                            iOrdinal2 = varianceConflictTypeC.ordinal();
                            if (iOrdinal2 != 1) {
                                return new TypeProjectionImpl(type2.H0().k().n(), Variance.OUT_VARIANCE);
                            }
                            if (iOrdinal2 == 2) {
                                throw new SubstitutionException("Out-projection in in-position");
                            }
                        }
                        objK0 = type2.K0();
                        if (objK0 instanceof CustomTypeParameter) {
                            customTypeParameter = (CustomTypeParameter) objK0;
                        } else {
                            customTypeParameter = null;
                        }
                        if (customTypeParameter != null || !customTypeParameter.y0()) {
                            customTypeParameter = null;
                        }
                        if (typeProjectionD.a()) {
                            return typeProjectionD;
                        }
                        if (customTypeParameter != null) {
                            kotlinTypeH = customTypeParameter.c0(typeProjectionD.getType());
                        } else {
                            kotlinTypeH = TypeUtils.h(typeProjectionD.getType(), type2.I0());
                        }
                        if (!type2.getAnnotations().isEmpty()) {
                            annotationsC = typeSubstitution.c(type2.getAnnotations());
                            if (annotationsC != null) {
                                a(33);
                                throw null;
                            }
                            if (annotationsC.E0(StandardNames.FqNames.y)) {
                                annotationsC = new FilteredAnnotations(annotationsC, new AnonymousClass1());
                            }
                            kotlinTypeH = TypeUtilsKt.k(kotlinTypeH, new CompositeAnnotations(kotlinTypeH.getAnnotations(), annotationsC));
                        }
                        if (varianceConflictTypeC == VarianceConflictType.X) {
                            varianceB3 = b(varianceB3, typeProjectionD.b());
                        }
                        return new TypeProjectionImpl(kotlinTypeH, varianceB3);
                    }
                    type = typeProjection.getType();
                    varianceB = typeProjection.b();
                    if (!(type.H0().c() instanceof TypeParameterDescriptor)) {
                        unwrappedTypeK0 = type.K0();
                        if (unwrappedTypeK0 instanceof AbbreviatedType) {
                            abbreviatedType = (AbbreviatedType) unwrappedTypeK0;
                        } else {
                            abbreviatedType = null;
                        }
                        if (abbreviatedType != null) {
                            simpleType = abbreviatedType.Z;
                        } else {
                            simpleType = null;
                        }
                        variance = Variance.INVARIANT;
                        if (simpleType != null) {
                            if ((typeSubstitution instanceof IndexedParametersSubstitution) || !typeSubstitution.b()) {
                                typeSubstitutor = typeSubstitutor2;
                            } else {
                                IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
                                typeSubstitutor = new TypeSubstitutor(new IndexedParametersSubstitution(indexedParametersSubstitution.f44510b, indexedParametersSubstitution.f44511c, false));
                            }
                            kotlinTypeI = typeSubstitutor.i(simpleType, variance);
                        }
                        parameters = type.H0().getParameters();
                        newArguments = type.F0();
                        arrayList = new ArrayList(parameters.size());
                        z2 = false;
                        while (i3 < parameters.size()) {
                            typeParameterDescriptor2 = (TypeParameterDescriptor) parameters.get(i3);
                            typeProjection2 = (TypeProjection) newArguments.get(i3);
                            typeProjectionJ = typeSubstitutor2.j(typeProjection2, typeParameterDescriptor2, i2 + 1);
                            iOrdinal = c(typeParameterDescriptor2.j(), typeProjectionJ.b()).ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != 1) {
                                    c2 = 2;
                                    if (iOrdinal == 2) {
                                    }
                                } else {
                                    c2 = 2;
                                }
                                typeProjectionJ = TypeUtils.j(typeParameterDescriptor2);
                            } else {
                                c2 = 2;
                                if (typeParameterDescriptor2.j() != variance && !typeProjectionJ.a()) {
                                    typeProjectionJ = new TypeProjectionImpl(typeProjectionJ.getType(), variance);
                                }
                            }
                            if (typeProjectionJ != typeProjection2) {
                                z2 = true;
                            }
                            arrayList.add(typeProjectionJ);
                            i3++;
                            typeSubstitutor2 = this;
                        }
                        if (z2) {
                            newArguments = arrayList;
                        }
                        Annotations newAnnotations2 = typeSubstitution.c(type.getAnnotations());
                        Intrinsics.f(newArguments, "newArguments");
                        Intrinsics.f(newAnnotations2, "newAnnotations");
                        kotlinTypeC = TypeSubstitutionKt.c(type, newArguments, newAnnotations2, 4);
                        if ((kotlinTypeC instanceof SimpleType) && (kotlinTypeI instanceof SimpleType)) {
                            kotlinTypeC = SpecialTypesKt.c((SimpleType) kotlinTypeC, (SimpleType) kotlinTypeI);
                        }
                        return new TypeProjectionImpl(kotlinTypeC, varianceB);
                    }
                }
            }
        }
        return typeProjection;
    }
}

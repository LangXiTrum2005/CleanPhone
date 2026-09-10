package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class RawSubstitution extends TypeSubstitution {
    public static final JavaTypeAttributes d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final JavaTypeAttributes f43909e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RawProjectionComputer f43910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TypeParameterUpperBoundEraser f43911c;

    public static final class Companion {
    }

    static {
        TypeUsage typeUsage = TypeUsage.f44554Y;
        d = JavaTypeAttributes.e(JavaTypeAttributesKt.a(typeUsage, false, null, 5), JavaTypeFlexibility.Z, false, null, null, 61);
        f43909e = JavaTypeAttributes.e(JavaTypeAttributesKt.a(typeUsage, false, null, 5), JavaTypeFlexibility.f43903Y, false, null, null, 61);
    }

    public RawSubstitution() {
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.f43910b = rawProjectionComputer;
        this.f43911c = new TypeParameterUpperBoundEraser(rawProjectionComputer);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final TypeProjection d(KotlinType kotlinType) {
        return new TypeProjectionImpl(h(kotlinType, new JavaTypeAttributes(TypeUsage.f44554Y, false, false, null, 62)));
    }

    public final Pair g(final SimpleType simpleType, final ClassDescriptor classDescriptor, final JavaTypeAttributes javaTypeAttributes) {
        if (simpleType.H0().getParameters().isEmpty()) {
            return new Pair(simpleType, Boolean.FALSE);
        }
        if (KotlinBuiltIns.x(simpleType)) {
            TypeProjection typeProjection = (TypeProjection) simpleType.F0().get(0);
            Variance varianceB = typeProjection.b();
            KotlinType type = typeProjection.getType();
            Intrinsics.e(type, "componentTypeProjection.type");
            return new Pair(KotlinTypeFactory.d(simpleType.G0(), simpleType.H0(), CollectionsKt.H(new TypeProjectionImpl(h(type, javaTypeAttributes), varianceB)), simpleType.I0(), null), Boolean.FALSE);
        }
        if (KotlinTypeKt.a(simpleType)) {
            return new Pair(ErrorUtils.c(ErrorTypeKind.ERROR_RAW_TYPE, simpleType.H0().toString()), Boolean.FALSE);
        }
        MemberScope memberScopeJ0 = classDescriptor.j0(this);
        Intrinsics.e(memberScopeJ0, "declaration.getMemberScope(this)");
        TypeAttributes typeAttributesG0 = simpleType.G0();
        TypeConstructor typeConstructorH = classDescriptor.h();
        Intrinsics.e(typeConstructorH, "declaration.typeConstructor");
        List parameters = classDescriptor.h().getParameters();
        Intrinsics.e(parameters, "declaration.typeConstructor.parameters");
        List<TypeParameterDescriptor> list = parameters;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
        for (TypeParameterDescriptor parameter : list) {
            Intrinsics.e(parameter, "parameter");
            TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.f43911c;
            arrayList.add(this.f43910b.a(parameter, javaTypeAttributes, typeParameterUpperBoundEraser, typeParameterUpperBoundEraser.b(parameter, javaTypeAttributes)));
        }
        return new Pair(KotlinTypeFactory.f(typeAttributesG0, typeConstructorH, arrayList, simpleType.I0(), memberScopeJ0, new Function1<KotlinTypeRefiner, SimpleType>(this, simpleType, javaTypeAttributes) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ClassId classIdF;
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
                Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
                ClassDescriptor classDescriptor2 = this.X;
                if (classDescriptor2 == null) {
                    classDescriptor2 = null;
                }
                if (classDescriptor2 != null && (classIdF = DescriptorUtilsKt.f(classDescriptor2)) != null) {
                    kotlinTypeRefiner.b(classIdF);
                }
                return null;
            }
        }), Boolean.TRUE);
    }

    public final KotlinType h(KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes) {
        ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
        if (classifierDescriptorC instanceof TypeParameterDescriptor) {
            javaTypeAttributes.getClass();
            return h(this.f43911c.b((TypeParameterDescriptor) classifierDescriptorC, JavaTypeAttributes.e(javaTypeAttributes, null, true, null, null, 59)), javaTypeAttributes);
        }
        if (!(classifierDescriptorC instanceof ClassDescriptor)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + classifierDescriptorC).toString());
        }
        ClassifierDescriptor classifierDescriptorC2 = FlexibleTypesKt.c(kotlinType).H0().c();
        if (classifierDescriptorC2 instanceof ClassDescriptor) {
            Pair pairG = g(FlexibleTypesKt.b(kotlinType), (ClassDescriptor) classifierDescriptorC, d);
            SimpleType simpleType = (SimpleType) pairG.X;
            boolean zBooleanValue = ((Boolean) pairG.f43249Y).booleanValue();
            Pair pairG2 = g(FlexibleTypesKt.c(kotlinType), (ClassDescriptor) classifierDescriptorC2, f43909e);
            SimpleType simpleType2 = (SimpleType) pairG2.X;
            return (zBooleanValue || ((Boolean) pairG2.f43249Y).booleanValue()) ? new RawTypeImpl(simpleType, simpleType2) : KotlinTypeFactory.b(simpleType, simpleType2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + classifierDescriptorC2 + "\" while for lower it's \"" + classifierDescriptorC + AbstractJsonLexerKt.STRING).toString());
    }
}

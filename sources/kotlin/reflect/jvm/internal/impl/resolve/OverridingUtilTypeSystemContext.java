package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2;
import kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* JADX INFO: loaded from: classes7.dex */
public final class OverridingUtilTypeSystemContext implements ClassicTypeSystemContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f44293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KotlinTypeChecker.TypeConstructorEquality f44294b;

    public OverridingUtilTypeSystemContext(HashMap map, KotlinTypeChecker.TypeConstructorEquality equalityAxioms) {
        Intrinsics.f(equalityAxioms, "equalityAxioms");
        this.f44293a = map;
        this.f44294b = equalityAxioms;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean A(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.O(simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleType B(FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.P(flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeArgumentMarker C(SimpleTypeMarker simpleTypeMarker, int i2) {
        Intrinsics.f(simpleTypeMarker, "<this>");
        if (i2 < 0 || i2 >= ClassicTypeSystemContext.DefaultImpls.b(simpleTypeMarker)) {
            return null;
        }
        return ClassicTypeSystemContext.DefaultImpls.n(simpleTypeMarker, i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean D(SimpleTypeMarker simpleTypeMarker) {
        Intrinsics.f(simpleTypeMarker, "<this>");
        return ClassicTypeSystemContext.DefaultImpls.I(O(simpleTypeMarker)) && !ClassicTypeSystemContext.DefaultImpls.J(simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final int E(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.T(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleType F(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.i(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final KotlinTypeMarker G(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.c0(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleTypeMarker H(SimpleTypeMarker simpleTypeMarker) {
        SimpleType simpleTypeS;
        Intrinsics.f(simpleTypeMarker, "<this>");
        DefinitelyNotNullType definitelyNotNullTypeE = ClassicTypeSystemContext.DefaultImpls.e(simpleTypeMarker);
        return (definitelyNotNullTypeE == null || (simpleTypeS = ClassicTypeSystemContext.DefaultImpls.S(definitelyNotNullTypeE)) == null) ? simpleTypeMarker : simpleTypeS;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean J(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.I(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean K(CapturedTypeMarker receiver) {
        Intrinsics.f(receiver, "$receiver");
        return receiver instanceof CapturedType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean L(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.f(kotlinTypeMarker, "<this>");
        FlexibleType flexibleTypeG = ClassicTypeSystemContext.DefaultImpls.g(kotlinTypeMarker);
        return (flexibleTypeG != null ? ClassicTypeSystemContext.DefaultImpls.f(flexibleTypeG) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final Collection M(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.X(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final Set N(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.U(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeConstructor O(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.f(kotlinTypeMarker, "<this>");
        SimpleType simpleTypeI = ClassicTypeSystemContext.DefaultImpls.i(kotlinTypeMarker);
        if (simpleTypeI == null) {
            simpleTypeI = i0(kotlinTypeMarker);
        }
        return ClassicTypeSystemContext.DefaultImpls.Y(simpleTypeI);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean P(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.C(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final RawType Q(FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.h(flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean R(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.f(kotlinTypeMarker, "<this>");
        return ClassicTypeSystemContext.DefaultImpls.H(i0(kotlinTypeMarker)) != ClassicTypeSystemContext.DefaultImpls.H(n(kotlinTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final ClassicTypeSystemContext$substitutionSupertypePolicy$2 S(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.W(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean T(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.f(kotlinTypeMarker, "<this>");
        SimpleType simpleTypeI = ClassicTypeSystemContext.DefaultImpls.i(kotlinTypeMarker);
        return (simpleTypeI != null ? ClassicTypeSystemContext.DefaultImpls.e(simpleTypeI) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean U(SimpleTypeMarker simpleTypeMarker) {
        Intrinsics.f(simpleTypeMarker, "<this>");
        return ClassicTypeSystemContext.DefaultImpls.F(ClassicTypeSystemContext.DefaultImpls.Y(simpleTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final FlexibleType V(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.g(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final CaptureStatus W(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.l(capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final UnwrappedType X(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.R(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeProjection Y(CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.V(capturedTypeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeConstructor Z(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.Y(simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final int a(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.b(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean a0(SimpleTypeMarker simpleTypeMarker) {
        Intrinsics.f(simpleTypeMarker, "<this>");
        SimpleType simpleTypeI = ClassicTypeSystemContext.DefaultImpls.i(simpleTypeMarker);
        return (simpleTypeI != null ? ClassicTypeSystemContext.DefaultImpls.d(this, simpleTypeI) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean b(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.L(capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final UnwrappedType b0(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.Q(capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean c(TypeParameterMarker typeParameterMarker, TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.x(typeParameterMarker, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean c0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.A(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeArgumentListMarker d(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.c(simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleType d0(SimpleTypeMarker simpleTypeMarker, boolean z2) {
        return ClassicTypeSystemContext.DefaultImpls.b0(simpleTypeMarker, z2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeArgumentMarker e(TypeArgumentListMarker typeArgumentListMarker, int i2) {
        Intrinsics.f(typeArgumentListMarker, "<this>");
        if (typeArgumentListMarker instanceof SimpleTypeMarker) {
            return ClassicTypeSystemContext.DefaultImpls.n((KotlinTypeMarker) typeArgumentListMarker, i2);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            TypeArgumentMarker typeArgumentMarker = ((ArgumentList) typeArgumentListMarker).get(i2);
            Intrinsics.e(typeArgumentMarker, "get(index)");
            return typeArgumentMarker;
        }
        throw new IllegalStateException(("unknown type argument list type: " + typeArgumentListMarker + ", " + Reflection.f43333a.b(typeArgumentListMarker.getClass())).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean e0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.G(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeParameterMarker f(TypeConstructorMarker typeConstructorMarker, int i2) {
        return ClassicTypeSystemContext.DefaultImpls.p(typeConstructorMarker, i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final List f0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.q(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    public final UnwrappedType g(SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.m(this, simpleTypeMarker, simpleTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleType g0(FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.a0(flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleType h(DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.S(definitelyNotNullTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final CapturedTypeMarker h0(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.d(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean i(KotlinTypeMarker receiver) {
        Intrinsics.f(receiver, "$receiver");
        return receiver instanceof NotNullTypeParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleType i0(KotlinTypeMarker kotlinTypeMarker) {
        SimpleType simpleTypeP;
        Intrinsics.f(kotlinTypeMarker, "<this>");
        FlexibleType flexibleTypeG = ClassicTypeSystemContext.DefaultImpls.g(kotlinTypeMarker);
        if (flexibleTypeG != null && (simpleTypeP = ClassicTypeSystemContext.DefaultImpls.P(flexibleTypeG)) != null) {
            return simpleTypeP;
        }
        SimpleType simpleTypeI = ClassicTypeSystemContext.DefaultImpls.i(kotlinTypeMarker);
        Intrinsics.c(simpleTypeI);
        return simpleTypeI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean j(TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.M(typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeVariance j0(TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.u(typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeVariance k(TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.v(typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeParameterDescriptor k0(TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.s(typeVariableTypeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleType l(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.k(simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final DefinitelyNotNullType l0(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.e(simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final int m(TypeArgumentListMarker typeArgumentListMarker) {
        Intrinsics.f(typeArgumentListMarker, "<this>");
        if (typeArgumentListMarker instanceof SimpleTypeMarker) {
            return ClassicTypeSystemContext.DefaultImpls.b((KotlinTypeMarker) typeArgumentListMarker);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            return ((ArgumentList) typeArgumentListMarker).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + typeArgumentListMarker + ", " + Reflection.f43333a.b(typeArgumentListMarker.getClass())).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean m0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.B(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleType n(KotlinTypeMarker kotlinTypeMarker) {
        SimpleType simpleTypeA0;
        Intrinsics.f(kotlinTypeMarker, "<this>");
        FlexibleType flexibleTypeG = ClassicTypeSystemContext.DefaultImpls.g(kotlinTypeMarker);
        if (flexibleTypeG != null && (simpleTypeA0 = ClassicTypeSystemContext.DefaultImpls.a0(flexibleTypeG)) != null) {
            return simpleTypeA0;
        }
        SimpleType simpleTypeI = ClassicTypeSystemContext.DefaultImpls.i(kotlinTypeMarker);
        Intrinsics.c(simpleTypeI);
        return simpleTypeI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final UnwrappedType n0(TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.r(typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean o(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.H(simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean o0(TypeConstructorMarker c1, TypeConstructorMarker c2) {
        Intrinsics.f(c1, "c1");
        Intrinsics.f(c2, "c2");
        if (!(c1 instanceof TypeConstructor)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(c2 instanceof TypeConstructor)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (ClassicTypeSystemContext.DefaultImpls.a(c1, c2)) {
            return true;
        }
        TypeConstructor typeConstructor = (TypeConstructor) c1;
        TypeConstructor typeConstructor2 = (TypeConstructor) c2;
        if (this.f44294b.a(typeConstructor, typeConstructor2)) {
            return true;
        }
        HashMap map = this.f44293a;
        if (map == null) {
            return false;
        }
        TypeConstructor typeConstructor3 = (TypeConstructor) map.get(typeConstructor);
        TypeConstructor typeConstructor4 = (TypeConstructor) map.get(typeConstructor2);
        if (typeConstructor3 == null || !typeConstructor3.equals(typeConstructor2)) {
            return typeConstructor4 != null && typeConstructor4.equals(typeConstructor);
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final List p(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.o(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean q(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.D(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final UnwrappedType r(ArrayList arrayList) {
        return IntersectionTypeKt.a(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeProjectionImpl s(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.j(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final NewCapturedTypeConstructor t(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.Z(capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeArgumentMarker u(KotlinTypeMarker kotlinTypeMarker, int i2) {
        return ClassicTypeSystemContext.DefaultImpls.n(kotlinTypeMarker, i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean v(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.z(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean w(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.N(simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean x(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.F(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext
    public final boolean y(SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.y(simpleTypeMarker, simpleTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean z(SimpleTypeMarker simpleTypeMarker) {
        Intrinsics.f(simpleTypeMarker, "<this>");
        return ClassicTypeSystemContext.DefaultImpls.A(ClassicTypeSystemContext.DefaultImpls.Y(simpleTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final void I(SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
    }
}

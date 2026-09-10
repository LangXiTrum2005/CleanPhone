package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;

/* JADX INFO: loaded from: classes7.dex */
public interface TypeSystemContext extends TypeSystemOptimizationContext {
    boolean A(SimpleTypeMarker simpleTypeMarker);

    SimpleType B(FlexibleTypeMarker flexibleTypeMarker);

    TypeArgumentMarker C(SimpleTypeMarker simpleTypeMarker, int i2);

    boolean D(SimpleTypeMarker simpleTypeMarker);

    int E(TypeConstructorMarker typeConstructorMarker);

    SimpleType F(KotlinTypeMarker kotlinTypeMarker);

    KotlinTypeMarker G(KotlinTypeMarker kotlinTypeMarker);

    SimpleTypeMarker H(SimpleTypeMarker simpleTypeMarker);

    void I(SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker);

    boolean J(TypeConstructorMarker typeConstructorMarker);

    boolean K(CapturedTypeMarker capturedTypeMarker);

    boolean L(KotlinTypeMarker kotlinTypeMarker);

    Collection M(TypeConstructorMarker typeConstructorMarker);

    Set N(SimpleTypeMarker simpleTypeMarker);

    TypeConstructor O(KotlinTypeMarker kotlinTypeMarker);

    boolean P(TypeConstructorMarker typeConstructorMarker);

    RawType Q(FlexibleTypeMarker flexibleTypeMarker);

    boolean R(KotlinTypeMarker kotlinTypeMarker);

    ClassicTypeSystemContext$substitutionSupertypePolicy$2 S(SimpleTypeMarker simpleTypeMarker);

    boolean T(KotlinTypeMarker kotlinTypeMarker);

    boolean U(SimpleTypeMarker simpleTypeMarker);

    FlexibleType V(KotlinTypeMarker kotlinTypeMarker);

    CaptureStatus W(CapturedTypeMarker capturedTypeMarker);

    UnwrappedType X(KotlinTypeMarker kotlinTypeMarker);

    TypeProjection Y(CapturedTypeConstructorMarker capturedTypeConstructorMarker);

    TypeConstructor Z(SimpleTypeMarker simpleTypeMarker);

    int a(KotlinTypeMarker kotlinTypeMarker);

    boolean a0(SimpleTypeMarker simpleTypeMarker);

    boolean b(CapturedTypeMarker capturedTypeMarker);

    UnwrappedType b0(CapturedTypeMarker capturedTypeMarker);

    boolean c(TypeParameterMarker typeParameterMarker, TypeConstructorMarker typeConstructorMarker);

    boolean c0(TypeConstructorMarker typeConstructorMarker);

    TypeArgumentListMarker d(SimpleTypeMarker simpleTypeMarker);

    SimpleType d0(SimpleTypeMarker simpleTypeMarker, boolean z2);

    TypeArgumentMarker e(TypeArgumentListMarker typeArgumentListMarker, int i2);

    boolean e0(TypeConstructorMarker typeConstructorMarker);

    TypeParameterMarker f(TypeConstructorMarker typeConstructorMarker, int i2);

    List f0(TypeConstructorMarker typeConstructorMarker);

    SimpleType g0(FlexibleTypeMarker flexibleTypeMarker);

    SimpleType h(DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker);

    CapturedTypeMarker h0(SimpleTypeMarker simpleTypeMarker);

    boolean i(KotlinTypeMarker kotlinTypeMarker);

    SimpleType i0(KotlinTypeMarker kotlinTypeMarker);

    boolean j(TypeArgumentMarker typeArgumentMarker);

    TypeVariance j0(TypeArgumentMarker typeArgumentMarker);

    TypeVariance k(TypeParameterMarker typeParameterMarker);

    TypeParameterDescriptor k0(TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker);

    SimpleType l(SimpleTypeMarker simpleTypeMarker);

    DefinitelyNotNullType l0(SimpleTypeMarker simpleTypeMarker);

    int m(TypeArgumentListMarker typeArgumentListMarker);

    boolean m0(TypeConstructorMarker typeConstructorMarker);

    SimpleType n(KotlinTypeMarker kotlinTypeMarker);

    UnwrappedType n0(TypeArgumentMarker typeArgumentMarker);

    boolean o(SimpleTypeMarker simpleTypeMarker);

    boolean o0(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2);

    List p(KotlinTypeMarker kotlinTypeMarker);

    boolean q(KotlinTypeMarker kotlinTypeMarker);

    UnwrappedType r(ArrayList arrayList);

    TypeProjectionImpl s(KotlinTypeMarker kotlinTypeMarker);

    NewCapturedTypeConstructor t(CapturedTypeMarker capturedTypeMarker);

    TypeArgumentMarker u(KotlinTypeMarker kotlinTypeMarker, int i2);

    boolean v(TypeConstructorMarker typeConstructorMarker);

    boolean w(SimpleTypeMarker simpleTypeMarker);

    boolean x(TypeConstructorMarker typeConstructorMarker);

    boolean z(SimpleTypeMarker simpleTypeMarker);
}

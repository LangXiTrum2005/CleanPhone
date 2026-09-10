package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes7.dex */
public final class ErrorType extends SimpleType {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final TypeConstructor f44585Y;
    public final ErrorScope Z;
    public final ErrorTypeKind e0;
    public final List f0;
    public final boolean g0;
    public final String[] h0;
    public final String i0;

    public ErrorType(TypeConstructor typeConstructor, ErrorScope errorScope, ErrorTypeKind kind, List arguments, boolean z2, String... formatParams) {
        Intrinsics.f(kind, "kind");
        Intrinsics.f(arguments, "arguments");
        Intrinsics.f(formatParams, "formatParams");
        this.f44585Y = typeConstructor;
        this.Z = errorScope;
        this.e0 = kind;
        this.f0 = arguments;
        this.g0 = z2;
        this.h0 = formatParams;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.i0 = String.format(kind.X, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final List F0() {
        return this.f0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes G0() {
        TypeAttributes.f44529Y.getClass();
        return TypeAttributes.Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeConstructor H0() {
        return this.f44585Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean I0() {
        return this.g0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: J0 */
    public final KotlinType M0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* JADX INFO: renamed from: M0 */
    public final UnwrappedType J0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType N0(TypeAttributes newAttributes) {
        Intrinsics.f(newAttributes, "newAttributes");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: O0 */
    public final SimpleType L0(boolean z2) {
        String[] strArr = this.h0;
        return new ErrorType(this.f44585Y, this.Z, this.e0, this.f0, z2, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: P0 */
    public final SimpleType N0(TypeAttributes newAttributes) {
        Intrinsics.f(newAttributes, "newAttributes");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final MemberScope n() {
        return this.Z;
    }
}

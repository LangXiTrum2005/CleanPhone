package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class CapturedType extends SimpleType implements CapturedTypeMarker {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final TypeProjection f44296Y;
    public final CapturedTypeConstructorImpl Z;
    public final boolean e0;
    public final TypeAttributes f0;

    public CapturedType(TypeProjection typeProjection, CapturedTypeConstructorImpl capturedTypeConstructorImpl, boolean z2, TypeAttributes attributes) {
        Intrinsics.f(typeProjection, "typeProjection");
        Intrinsics.f(attributes, "attributes");
        this.f44296Y = typeProjection;
        this.Z = capturedTypeConstructorImpl;
        this.e0 = z2;
        this.f0 = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final List F0() {
        return EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes G0() {
        return this.f0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeConstructor H0() {
        return this.Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean I0() {
        return this.e0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final KotlinType J0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new CapturedType(this.f44296Y.c(kotlinTypeRefiner), this.Z, this.e0, this.f0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType L0(boolean z2) {
        if (z2 == this.e0) {
            return this;
        }
        return new CapturedType(this.f44296Y, this.Z, z2, this.f0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* JADX INFO: renamed from: M0 */
    public final UnwrappedType J0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new CapturedType(this.f44296Y.c(kotlinTypeRefiner), this.Z, this.e0, this.f0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: O0 */
    public final SimpleType L0(boolean z2) {
        if (z2 == this.e0) {
            return this;
        }
        return new CapturedType(this.f44296Y, this.Z, z2, this.f0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: P0 */
    public final SimpleType N0(TypeAttributes newAttributes) {
        Intrinsics.f(newAttributes, "newAttributes");
        return new CapturedType(this.f44296Y, this.Z, this.e0, newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final MemberScope n() {
        return ErrorUtils.a(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f44296Y);
        sb.append(')');
        sb.append(this.e0 ? "?" : "");
        return sb.toString();
    }
}

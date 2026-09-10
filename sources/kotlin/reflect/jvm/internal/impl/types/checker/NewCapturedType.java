package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class NewCapturedType extends SimpleType implements CapturedTypeMarker {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final CaptureStatus f44566Y;
    public final NewCapturedTypeConstructor Z;
    public final UnwrappedType e0;
    public final TypeAttributes f0;
    public final boolean g0;
    public final boolean h0;

    public NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor constructor, UnwrappedType unwrappedType, TypeAttributes attributes, boolean z2, boolean z3) {
        Intrinsics.f(captureStatus, "captureStatus");
        Intrinsics.f(constructor, "constructor");
        Intrinsics.f(attributes, "attributes");
        this.f44566Y = captureStatus;
        this.Z = constructor;
        this.e0 = unwrappedType;
        this.f0 = attributes;
        this.g0 = z2;
        this.h0 = z3;
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
        return this.g0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType L0(boolean z2) {
        return new NewCapturedType(this.f44566Y, this.Z, this.e0, this.f0, z2, 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: O0 */
    public final SimpleType L0(boolean z2) {
        return new NewCapturedType(this.f44566Y, this.Z, this.e0, this.f0, z2, 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: P0 */
    public final SimpleType N0(TypeAttributes newAttributes) {
        Intrinsics.f(newAttributes, "newAttributes");
        return new NewCapturedType(this.f44566Y, this.Z, this.e0, newAttributes, this.g0, this.h0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final NewCapturedType J0(final KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        final NewCapturedTypeConstructor newCapturedTypeConstructor = this.Z;
        newCapturedTypeConstructor.getClass();
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionC = newCapturedTypeConstructor.f44567a.c(kotlinTypeRefiner);
        Function0<List<? extends UnwrappedType>> function0 = newCapturedTypeConstructor.f44568b != null ? new Function0<List<? extends UnwrappedType>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$refine$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Iterable iterable = (List) newCapturedTypeConstructor.f44570e.getX();
                if (iterable == null) {
                    iterable = EmptyList.X;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList = new ArrayList(CollectionsKt.n(iterable2, 10));
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UnwrappedType) it.next()).J0(kotlinTypeRefiner));
                }
                return arrayList;
            }
        } : null;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = newCapturedTypeConstructor.f44569c;
        if (newCapturedTypeConstructor2 == null) {
            newCapturedTypeConstructor2 = newCapturedTypeConstructor;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = new NewCapturedTypeConstructor(typeProjectionC, function0, newCapturedTypeConstructor2, newCapturedTypeConstructor.d);
        UnwrappedType unwrappedType = this.e0;
        return new NewCapturedType(this.f44566Y, newCapturedTypeConstructor3, unwrappedType != null ? kotlinTypeRefiner.a(unwrappedType).K0() : null, this.f0, this.g0, 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final MemberScope n() {
        return ErrorUtils.a(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, UnwrappedType unwrappedType, TypeAttributes typeAttributes, boolean z2, int i2) {
        if ((i2 & 8) != 0) {
            TypeAttributes.f44529Y.getClass();
            typeAttributes = TypeAttributes.Z;
        }
        this(captureStatus, newCapturedTypeConstructor, unwrappedType, typeAttributes, (i2 & 16) != 0 ? false : z2, false);
    }
}

package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;

/* JADX INFO: loaded from: classes7.dex */
public final class CapturedTypeConstructorImpl implements CapturedTypeConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeProjection f44297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NewCapturedTypeConstructor f44298b;

    public CapturedTypeConstructorImpl(TypeProjection projection) {
        Intrinsics.f(projection, "projection");
        this.f44297a = projection;
        projection.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public final TypeProjection b() {
        return this.f44297a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final /* bridge */ /* synthetic */ ClassifierDescriptor c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final Collection d() {
        TypeProjection typeProjection = this.f44297a;
        KotlinType type = typeProjection.b() == Variance.OUT_VARIANCE ? typeProjection.getType() : k().n();
        Intrinsics.e(type, "if (projection.projectio… builtIns.nullableAnyType");
        return CollectionsKt.H(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean e() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns k() {
        KotlinBuiltIns kotlinBuiltInsK = this.f44297a.getType().H0().k();
        Intrinsics.e(kotlinBuiltInsK, "projection.type.constructor.builtIns");
        return kotlinBuiltInsK;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f44297a + ')';
    }
}

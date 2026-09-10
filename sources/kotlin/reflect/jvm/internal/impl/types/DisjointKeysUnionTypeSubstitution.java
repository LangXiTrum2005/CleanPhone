package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes7.dex */
public final class DisjointKeysUnionTypeSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeSubstitution f44504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TypeSubstitution f44505c;

    public static final class Companion {
    }

    public DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        this.f44504b = typeSubstitution;
        this.f44505c = typeSubstitution2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean a() {
        return this.f44504b.a() || this.f44505c.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean b() {
        return this.f44504b.b() || this.f44505c.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final Annotations c(Annotations annotations) {
        Intrinsics.f(annotations, "annotations");
        return this.f44505c.c(this.f44504b.c(annotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final TypeProjection d(KotlinType kotlinType) {
        TypeProjection typeProjectionD = this.f44504b.d(kotlinType);
        return typeProjectionD == null ? this.f44505c.d(kotlinType) : typeProjectionD;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final KotlinType f(KotlinType topLevelType, Variance position) {
        Intrinsics.f(topLevelType, "topLevelType");
        Intrinsics.f(position, "position");
        return this.f44505c.f(this.f44504b.f(topLevelType, position), position);
    }
}

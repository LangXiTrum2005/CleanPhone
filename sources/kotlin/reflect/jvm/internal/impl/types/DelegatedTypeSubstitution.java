package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes7.dex */
public class DelegatedTypeSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeSubstitution f44502b;

    public DelegatedTypeSubstitution(TypeSubstitution typeSubstitution) {
        this.f44502b = typeSubstitution;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean a() {
        return this.f44502b.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean b() {
        return this.f44502b.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final Annotations c(Annotations annotations) {
        Intrinsics.f(annotations, "annotations");
        return this.f44502b.c(annotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public TypeProjection d(KotlinType kotlinType) {
        return this.f44502b.d(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean e() {
        return this.f44502b.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final KotlinType f(KotlinType topLevelType, Variance position) {
        Intrinsics.f(topLevelType, "topLevelType");
        Intrinsics.f(position, "position");
        return this.f44502b.f(topLevelType, position);
    }
}

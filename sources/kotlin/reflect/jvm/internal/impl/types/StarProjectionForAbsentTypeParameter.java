package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes7.dex */
public final class StarProjectionForAbsentTypeParameter extends TypeProjectionBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleType f44521a;

    public StarProjectionForAbsentTypeParameter(KotlinBuiltIns kotlinBuiltIns) {
        Intrinsics.f(kotlinBuiltIns, "kotlinBuiltIns");
        this.f44521a = kotlinBuiltIns.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final boolean a() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final Variance b() {
        return Variance.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final TypeProjection c(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final KotlinType getType() {
        return this.f44521a;
    }
}

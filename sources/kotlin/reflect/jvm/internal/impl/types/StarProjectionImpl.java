package kotlin.reflect.jvm.internal.impl.types;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes7.dex */
public final class StarProjectionImpl extends TypeProjectionBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeParameterDescriptor f44522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44523b;

    public StarProjectionImpl(TypeParameterDescriptor typeParameter) {
        Intrinsics.f(typeParameter, "typeParameter");
        this.f44522a = typeParameter;
        this.f44523b = LazyKt.a(LazyThreadSafetyMode.f43248Y, new Function0<KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl$_type$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StarProjectionImplKt.b(this.X.f44522a);
            }
        });
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final KotlinType getType() {
        return (KotlinType) this.f44523b.getX();
    }
}

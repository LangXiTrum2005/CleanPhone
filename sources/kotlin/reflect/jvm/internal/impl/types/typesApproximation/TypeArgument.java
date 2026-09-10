package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
final class TypeArgument {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeParameterDescriptor f44599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KotlinType f44600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KotlinType f44601c;

    public TypeArgument(TypeParameterDescriptor typeParameter, KotlinType inProjection, KotlinType outProjection) {
        Intrinsics.f(typeParameter, "typeParameter");
        Intrinsics.f(inProjection, "inProjection");
        Intrinsics.f(outProjection, "outProjection");
        this.f44599a = typeParameter;
        this.f44600b = inProjection;
        this.f44601c = outProjection;
    }
}

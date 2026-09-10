package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public final class IndexedParametersSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeParameterDescriptor[] f44510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TypeProjection[] f44511c;
    public final boolean d;

    public IndexedParametersSubstitution(TypeParameterDescriptor[] parameters, TypeProjection[] arguments, boolean z2) {
        Intrinsics.f(parameters, "parameters");
        Intrinsics.f(arguments, "arguments");
        this.f44510b = parameters;
        this.f44511c = arguments;
        this.d = z2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean b() {
        return this.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final TypeProjection d(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorC instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorC : null;
        if (typeParameterDescriptor != null) {
            int iG = typeParameterDescriptor.g();
            TypeParameterDescriptor[] typeParameterDescriptorArr = this.f44510b;
            if (iG < typeParameterDescriptorArr.length && Intrinsics.a(typeParameterDescriptorArr[iG].h(), typeParameterDescriptor.h())) {
                return this.f44511c[iG];
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean e() {
        return this.f44511c.length == 0;
    }
}

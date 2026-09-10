package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* JADX INFO: loaded from: classes7.dex */
public final class CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2 extends DelegatedTypeSubstitution {
    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean b() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final TypeProjection d(KotlinType kotlinType) {
        TypeProjection typeProjectionD = this.f44502b.d(kotlinType);
        if (typeProjectionD == null) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
        return CapturedTypeConstructorKt.a(typeProjectionD, classifierDescriptorC instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorC : null);
    }
}

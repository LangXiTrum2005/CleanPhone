package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeMappingConfigurationImpl implements TypeMappingConfiguration<JvmType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TypeMappingConfigurationImpl f44014a = new TypeMappingConfigurationImpl();

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public final void a(ClassDescriptor classDescriptor) {
        Intrinsics.f(classDescriptor, "classDescriptor");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public final void b(ClassDescriptor classDescriptor) {
    }
}

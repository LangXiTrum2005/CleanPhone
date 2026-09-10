package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;

/* JADX INFO: loaded from: classes7.dex */
public final class SingleModuleClassResolver implements ModuleClassResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JavaDescriptorResolver f43848a;

    public final ClassDescriptor a(JavaClass javaClass) {
        JavaDescriptorResolver javaDescriptorResolver = this.f43848a;
        if (javaDescriptorResolver != null) {
            return javaDescriptorResolver.a(javaClass);
        }
        Intrinsics.m("resolver");
        throw null;
    }
}

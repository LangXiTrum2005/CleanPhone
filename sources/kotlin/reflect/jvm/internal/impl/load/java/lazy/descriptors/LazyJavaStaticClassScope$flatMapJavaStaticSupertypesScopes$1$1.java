package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1 extends Lambda implements Function1<KotlinType, ClassDescriptor> {
    public static final LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1 X = new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClassifierDescriptor classifierDescriptorC = ((KotlinType) obj).H0().c();
        if (classifierDescriptorC instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorC;
        }
        return null;
    }
}

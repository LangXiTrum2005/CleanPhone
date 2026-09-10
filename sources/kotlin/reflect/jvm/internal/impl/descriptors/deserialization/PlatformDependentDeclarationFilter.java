package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public interface PlatformDependentDeclarationFilter {

    public static final class All implements PlatformDependentDeclarationFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final All f43622a = new All();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public final boolean b(ClassDescriptor classDescriptor, DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor) {
            Intrinsics.f(classDescriptor, "classDescriptor");
            return true;
        }
    }

    public static final class NoPlatformDependent implements PlatformDependentDeclarationFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoPlatformDependent f43623a = new NoPlatformDependent();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public final boolean b(ClassDescriptor classDescriptor, DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor) {
            Intrinsics.f(classDescriptor, "classDescriptor");
            return !deserializedSimpleFunctionDescriptor.getAnnotations().E0(PlatformDependentDeclarationFilterKt.f43624a);
        }
    }

    boolean b(ClassDescriptor classDescriptor, DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor);
}

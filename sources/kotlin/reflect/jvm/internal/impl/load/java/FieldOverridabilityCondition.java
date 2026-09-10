package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* JADX INFO: loaded from: classes7.dex */
public final class FieldOverridabilityCondition implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.Result b(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor, ClassDescriptor classDescriptor) {
        Intrinsics.f(superDescriptor, "superDescriptor");
        Intrinsics.f(subDescriptor, "subDescriptor");
        boolean z2 = subDescriptor instanceof PropertyDescriptor;
        ExternalOverridabilityCondition.Result result = ExternalOverridabilityCondition.Result.Z;
        if (!z2 || !(superDescriptor instanceof PropertyDescriptor)) {
            return result;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) subDescriptor;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) superDescriptor;
        if (!Intrinsics.a(propertyDescriptor.getName(), propertyDescriptor2.getName())) {
            return result;
        }
        if (JavaDescriptorUtilKt.a(propertyDescriptor) && JavaDescriptorUtilKt.a(propertyDescriptor2)) {
            return ExternalOverridabilityCondition.Result.X;
        }
        return (JavaDescriptorUtilKt.a(propertyDescriptor) || JavaDescriptorUtilKt.a(propertyDescriptor2)) ? ExternalOverridabilityCondition.Result.f44282Y : result;
    }
}

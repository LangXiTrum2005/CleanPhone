package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaForKotlinOverridePropertyDescriptor extends JavaPropertyDescriptor {
    public final SimpleFunctionDescriptor D0;
    public final SimpleFunctionDescriptor E0;
    public final PropertyDescriptor F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaForKotlinOverridePropertyDescriptor(ClassDescriptor ownerDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor2, PropertyDescriptor propertyDescriptor) {
        super(ownerDescriptor, Annotations.Companion.f43614a, simpleFunctionDescriptor.q(), simpleFunctionDescriptor.getVisibility(), simpleFunctionDescriptor2 != null, propertyDescriptor.getName(), simpleFunctionDescriptor.f(), null, CallableMemberDescriptor.Kind.X, false, null);
        Intrinsics.f(ownerDescriptor, "ownerDescriptor");
        this.D0 = simpleFunctionDescriptor;
        this.E0 = simpleFunctionDescriptor2;
        this.F0 = propertyDescriptor;
    }
}

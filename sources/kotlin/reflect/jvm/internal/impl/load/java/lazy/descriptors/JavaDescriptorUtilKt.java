package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaDescriptorUtilKt {
    public static final boolean a(PropertyDescriptor propertyDescriptor) {
        Intrinsics.f(propertyDescriptor, "<this>");
        return propertyDescriptor.getGetter() == null;
    }
}

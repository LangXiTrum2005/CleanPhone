package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

/* JADX INFO: loaded from: classes7.dex */
public final class UtilsKt {
    public static final DescriptorVisibility a(Visibility visibility) {
        Intrinsics.f(visibility, "<this>");
        DescriptorVisibility descriptorVisibility = (DescriptorVisibility) JavaDescriptorVisibilities.d.get(visibility);
        return descriptorVisibility == null ? DescriptorVisibilities.g(visibility) : descriptorVisibility;
    }
}

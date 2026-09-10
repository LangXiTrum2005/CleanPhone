package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class DeprecationCausedByFunctionNInfo extends DescriptorBasedDeprecationInfo {
    public final JavaCallableMemberDescriptor X;

    public DeprecationCausedByFunctionNInfo(JavaCallableMemberDescriptor target) {
        Intrinsics.f(target, "target");
        this.X = target;
    }
}

package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
final class NoDefaultAndVarargsCheck implements Check {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NoDefaultAndVarargsCheck f44617a = new NoDefaultAndVarargsCheck();

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
        List listE = javaMethodDescriptor.e();
        Intrinsics.e(listE, "functionDescriptor.valueParameters");
        List<ValueParameterDescriptor> list = listE;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (ValueParameterDescriptor it : list) {
            Intrinsics.e(it, "it");
            if (DescriptorUtilsKt.a(it) || it.o0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String b(JavaMethodDescriptor javaMethodDescriptor) {
        return Check.DefaultImpls.a(this, javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}

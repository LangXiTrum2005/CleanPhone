package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class BuiltinMethodsWithSpecialGenericSignature extends SpecialGenericSignatures {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f43732l = 0;

    public static final FunctionDescriptor a(FunctionDescriptor functionDescriptor) {
        Intrinsics.f(functionDescriptor, "functionDescriptor");
        Name name = functionDescriptor.getName();
        Intrinsics.e(name, "functionDescriptor.name");
        if (b(name)) {
            return (FunctionDescriptor) DescriptorUtilsKt.b(functionDescriptor, BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1.X);
        }
        return null;
    }

    public static boolean b(Name name) {
        Intrinsics.f(name, "<this>");
        return SpecialGenericSignatures.f43792e.contains(name);
    }
}

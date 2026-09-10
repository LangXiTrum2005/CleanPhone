package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReference implements Function1<ValueParameterDescriptor, Boolean> {
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 X = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2(1);

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "declaresDefaultValue";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.f43333a.b(ValueParameterDescriptor.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ValueParameterDescriptor p0 = (ValueParameterDescriptor) obj;
        Intrinsics.f(p0, "p0");
        return Boolean.valueOf(p0.u0());
    }
}

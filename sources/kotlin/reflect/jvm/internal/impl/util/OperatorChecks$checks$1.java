package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class OperatorChecks$checks$1 extends Lambda implements Function1<FunctionDescriptor, String> {
    public static final OperatorChecks$checks$1 X = new OperatorChecks$checks$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FunctionDescriptor $receiver = (FunctionDescriptor) obj;
        Intrinsics.f($receiver, "$this$$receiver");
        List valueParameters = $receiver.e();
        Intrinsics.e(valueParameters, "valueParameters");
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.G(valueParameters);
        boolean z2 = false;
        if (valueParameterDescriptor != null && !DescriptorUtilsKt.a(valueParameterDescriptor) && valueParameterDescriptor.o0() == null) {
            z2 = true;
        }
        List list = OperatorChecks.f44620a;
        if (z2) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }
}

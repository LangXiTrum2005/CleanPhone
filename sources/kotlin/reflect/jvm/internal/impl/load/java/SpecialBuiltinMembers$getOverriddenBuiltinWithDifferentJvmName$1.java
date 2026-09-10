package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
final class SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1 extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {
    public static final SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1 X = new SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        Intrinsics.f(it, "it");
        return Boolean.valueOf(ClassicBuiltinSpecialProperties.b(DescriptorUtilsKt.l(it)));
    }
}

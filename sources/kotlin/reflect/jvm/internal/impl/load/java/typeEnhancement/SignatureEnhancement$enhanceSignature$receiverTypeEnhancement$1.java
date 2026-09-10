package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
final class SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 extends Lambda implements Function1<CallableMemberDescriptor, KotlinType> {
    public static final SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 X = new SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        Intrinsics.f(it, "it");
        ReceiverParameterDescriptor receiverParameterDescriptorJ = it.J();
        Intrinsics.c(receiverParameterDescriptorJ);
        KotlinType type = receiverParameterDescriptorJ.getType();
        Intrinsics.e(type, "it.extensionReceiverParameter!!.type");
        return type;
    }
}

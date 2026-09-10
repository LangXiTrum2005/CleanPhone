package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1 extends Lambda implements Function1<FunctionDescriptor, CharSequence> {
    public static final KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1 X = new KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FunctionDescriptor descriptor = (FunctionDescriptor) obj;
        Intrinsics.f(descriptor, "descriptor");
        return DescriptorRenderer.f44239c.x(descriptor) + " | " + RuntimeTypeMapper.c(descriptor).getF43378b();
    }
}

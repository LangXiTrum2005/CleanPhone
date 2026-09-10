package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "first", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "kotlin.jvm.PlatformType", "second", "invoke", "(Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2 extends Lambda implements Function2<DescriptorVisibility, DescriptorVisibility, Integer> {
    public static final KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2 X = new KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer numB = DescriptorVisibilities.b((DescriptorVisibility) obj, (DescriptorVisibility) obj2);
        return Integer.valueOf(numB == null ? 0 : numB.intValue());
    }
}

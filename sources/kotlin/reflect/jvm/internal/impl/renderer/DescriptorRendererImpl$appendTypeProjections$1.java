package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes7.dex */
final class DescriptorRendererImpl$appendTypeProjections$1 extends Lambda implements Function1<TypeProjection, CharSequence> {
    public final /* synthetic */ DescriptorRendererImpl X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$appendTypeProjections$1(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.X = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TypeProjection it = (TypeProjection) obj;
        Intrinsics.f(it, "it");
        if (it.a()) {
            return "*";
        }
        KotlinType type = it.getType();
        Intrinsics.e(type, "it.type");
        String strA0 = this.X.a0(type);
        if (it.b() == Variance.INVARIANT) {
            return strA0;
        }
        return it.b() + ' ' + strA0;
    }
}

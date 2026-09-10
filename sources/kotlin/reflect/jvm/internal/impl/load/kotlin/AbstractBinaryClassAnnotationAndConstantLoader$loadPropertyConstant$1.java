package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
final class AbstractBinaryClassAnnotationAndConstantLoader$loadPropertyConstant$1 extends Lambda implements Function2<AbstractBinaryClassAnnotationAndConstantLoader.AnnotationsContainerWithConstants<Object, Object>, MemberSignature, Object> {
    public static final AbstractBinaryClassAnnotationAndConstantLoader$loadPropertyConstant$1 X = new AbstractBinaryClassAnnotationAndConstantLoader$loadPropertyConstant$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AbstractBinaryClassAnnotationAndConstantLoader.AnnotationsContainerWithConstants loadConstantFromProperty = (AbstractBinaryClassAnnotationAndConstantLoader.AnnotationsContainerWithConstants) obj;
        MemberSignature it = (MemberSignature) obj2;
        Intrinsics.f(loadConstantFromProperty, "$this$loadConstantFromProperty");
        Intrinsics.f(it, "it");
        return loadConstantFromProperty.f43962b.get(it);
    }
}

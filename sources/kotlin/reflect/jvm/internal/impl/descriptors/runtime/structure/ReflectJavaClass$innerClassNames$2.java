package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
final class ReflectJavaClass$innerClassNames$2 extends Lambda implements Function1<Class<?>, Name> {
    public static final ReflectJavaClass$innerClassNames$2 X = new ReflectJavaClass$innerClassNames$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        if (!Name.h(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return Name.g(simpleName);
        }
        return null;
    }
}

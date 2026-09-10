package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RuntimeTypeMapperKt {
    public static final String a(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.e(parameterTypes, "parameterTypes");
        sb.append(ArraysKt.I(parameterTypes, "(", ")", RuntimeTypeMapperKt$signature$1.X, 24));
        Class<?> returnType = method.getReturnType();
        Intrinsics.e(returnType, "returnType");
        sb.append(ReflectClassUtilKt.b(returnType));
        return sb.toString();
    }
}

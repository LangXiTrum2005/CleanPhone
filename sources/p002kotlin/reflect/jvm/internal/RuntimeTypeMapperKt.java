package p002kotlin.reflect.jvm.internal;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Method;
import p002kotlin.Metadata;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/lang/reflect/Method;", "", "saneness", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", InAppPurchaseMetaData.KEY_SIGNATURE, "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RuntimeTypeMapperKt {
    public static final String saneness(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        sb.append(polloi.lerp(parameterTypes, "", "(", ")", 0, null, new Function1<Class<?>, CharSequence>() { // from class: kotlin.reflect.jvm.internal.RuntimeTypeMapperKt$signature$1
            @Override // p002kotlin.jvm.functions.Function1
            public final CharSequence invoke(Class<?> cls) {
                Intrinsics.beachfront(cls);
                return ReflectClassUtilKt.saneness(cls);
            }
        }, 24, null));
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        sb.append(ReflectClassUtilKt.saneness(returnType));
        return sb.toString();
    }
}

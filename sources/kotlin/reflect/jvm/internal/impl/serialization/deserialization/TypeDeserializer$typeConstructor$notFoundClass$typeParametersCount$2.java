package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: loaded from: classes7.dex */
final class TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2 extends Lambda implements Function1<ProtoBuf.Type, Integer> {
    public static final TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2 X = new TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProtoBuf.Type it = (ProtoBuf.Type) obj;
        Intrinsics.f(it, "it");
        return Integer.valueOf(it.e0.size());
    }
}

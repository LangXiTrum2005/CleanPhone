package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes7.dex */
public final class ProtoBufUtilKt {
    public static final Object a(GeneratedMessageLite.ExtendableMessage extendableMessage, GeneratedMessageLite.GeneratedExtension extension) {
        Intrinsics.f(extendableMessage, "<this>");
        Intrinsics.f(extension, "extension");
        if (extendableMessage.l(extension)) {
            return extendableMessage.i(extension);
        }
        return null;
    }
}

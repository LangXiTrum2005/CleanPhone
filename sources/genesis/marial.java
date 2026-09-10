package genesis;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: ProtoBufUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class marial {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T attabal(GeneratedMessageLite.ExtendableMessage<M> extendableMessage, GeneratedMessageLite.marial<M, T> extension) {
        Intrinsics.checkNotNullParameter(extendableMessage, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (extendableMessage.hasExtension(extension)) {
            return (T) extendableMessage.getExtension(extension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T saneness(GeneratedMessageLite.ExtendableMessage<M> extendableMessage, GeneratedMessageLite.marial<M, List<T>> extension, int i) {
        Intrinsics.checkNotNullParameter(extendableMessage, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (i < extendableMessage.getExtensionCount(extension)) {
            return (T) extendableMessage.getExtension(extension, i);
        }
        return null;
    }
}

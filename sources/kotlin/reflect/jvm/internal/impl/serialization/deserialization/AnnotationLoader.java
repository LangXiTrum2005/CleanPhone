package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes7.dex */
public interface AnnotationLoader<A> {
    ArrayList a(ProtoContainer.Class r1);

    ArrayList b(ProtoBuf.Type type, NameResolver nameResolver);

    List c(ProtoContainer protoContainer, ProtoBuf.EnumEntry enumEntry);

    List d(ProtoContainer protoContainer, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind, int i2, ProtoBuf.ValueParameter valueParameter);

    List e(ProtoContainer protoContainer, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind);

    ArrayList g(ProtoBuf.TypeParameter typeParameter, NameResolver nameResolver);

    List i(ProtoContainer protoContainer, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind);

    List j(ProtoContainer protoContainer, ProtoBuf.Property property);

    List k(ProtoContainer protoContainer, ProtoBuf.Property property);
}

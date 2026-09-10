package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public interface AnnotationAndConstantLoader<A, C> extends AnnotationLoader<A> {
    Object f(ProtoContainer protoContainer, ProtoBuf.Property property, KotlinType kotlinType);

    Object h(ProtoContainer protoContainer, ProtoBuf.Property property, KotlinType kotlinType);
}

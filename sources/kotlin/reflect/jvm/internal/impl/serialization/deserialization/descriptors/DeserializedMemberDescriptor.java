package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: loaded from: classes7.dex */
public interface DeserializedMemberDescriptor extends DeserializedDescriptor, MemberDescriptor, DescriptorWithContainerSource {
    TypeTable A();

    NameResolver D();

    DeserializedContainerSource E();

    MessageLite X();
}

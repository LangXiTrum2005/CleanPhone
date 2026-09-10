package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes7.dex */
public final class AbstractBinaryClassAnnotationLoaderKt {
    public static final MemberSignature a(ProtoBuf.Property proto, NameResolver nameResolver, TypeTable typeTable, boolean z2, boolean z3, boolean z4) {
        Intrinsics.f(proto, "proto");
        Intrinsics.f(nameResolver, "nameResolver");
        GeneratedMessageLite.GeneratedExtension propertySignature = JvmProtoBuf.d;
        Intrinsics.e(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.a(proto, propertySignature);
        if (jvmPropertySignature != null) {
            if (z2) {
                ExtensionRegistryLite extensionRegistryLite = JvmProtoBufUtil.f44158a;
                JvmMemberSignature.Field fieldB = JvmProtoBufUtil.b(proto, nameResolver, typeTable, z4);
                if (fieldB != null) {
                    return MemberSignature.Companion.b(fieldB);
                }
            } else if (z3 && (jvmPropertySignature.f44140Y & 2) == 2) {
                JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.e0;
                Intrinsics.e(jvmMethodSignature, "signature.syntheticMethod");
                return MemberSignature.Companion.c(nameResolver, jvmMethodSignature);
            }
        }
        return null;
    }
}

package kotlin.reflect.jvm;

import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.EmptyContainerForLocal;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ReflectLambdaKt {
    public static final KFunctionImpl a(FunctionBase functionBase) {
        Metadata metadata = (Metadata) functionBase.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                String[] strings = metadata.d2();
                ExtensionRegistryLite extensionRegistryLite = JvmProtoBufUtil.f44158a;
                Intrinsics.f(strings, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.a(strArrD1));
                ExtensionRegistryLite extensionRegistryLite2 = JvmProtoBufUtil.f44158a;
                JvmNameResolver jvmNameResolverG = JvmProtoBufUtil.g(byteArrayInputStream, strings);
                ExtensionRegistryLite extensionRegistryLite3 = JvmProtoBufUtil.f44158a;
                AbstractParser abstractParser = (AbstractParser) ProtoBuf.Function.w0;
                abstractParser.getClass();
                CodedInputStream codedInputStream = new CodedInputStream(byteArrayInputStream);
                MessageLite messageLite = (MessageLite) abstractParser.a(codedInputStream, extensionRegistryLite3);
                try {
                    codedInputStream.a(0);
                    AbstractParser.b(messageLite);
                    ProtoBuf.Function function = (ProtoBuf.Function) messageLite;
                    JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(metadata.mv(), (metadata.xi() & 8) != 0);
                    Class<?> cls = functionBase.getClass();
                    ProtoBuf.TypeTable typeTable = function.q0;
                    Intrinsics.e(typeTable, "proto.typeTable");
                    return new KFunctionImpl(EmptyContainerForLocal.f43371Y, (SimpleFunctionDescriptor) UtilKt.f(cls, function, jvmNameResolverG, new TypeTable(typeTable), jvmMetadataVersion, ReflectLambdaKt$reflect$descriptor$1.X));
                } catch (InvalidProtocolBufferException e2) {
                    e2.X = messageLite;
                    throw e2;
                }
            }
        }
        return null;
    }
}

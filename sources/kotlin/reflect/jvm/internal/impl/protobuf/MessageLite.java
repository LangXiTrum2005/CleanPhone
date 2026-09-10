package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes7.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends Cloneable, MessageLiteOrBuilder {
        Builder a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        MessageLite build();
    }

    void b(CodedOutputStream codedOutputStream);

    int getSerializedSize();

    Builder newBuilderForType();

    Builder toBuilder();
}

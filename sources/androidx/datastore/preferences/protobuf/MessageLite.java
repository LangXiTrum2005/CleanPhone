package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite buildPartial();
    }

    void c(CodedOutputStream codedOutputStream);

    int getSerializedSize();

    GeneratedMessageLite.Builder newBuilderForType();

    GeneratedMessageLite.Builder toBuilder();

    ByteString toByteString();
}

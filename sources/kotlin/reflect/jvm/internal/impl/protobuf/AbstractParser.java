package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {
    static {
        int i2 = ExtensionRegistryLite.f44198b;
    }

    public static void b(MessageLite messageLite) throws InvalidProtocolBufferException {
        UninitializedMessageException uninitializedMessageException;
        if (messageLite == null || messageLite.isInitialized()) {
            return;
        }
        if (messageLite instanceof AbstractMessageLite) {
            uninitializedMessageException = new UninitializedMessageException();
        } else {
            uninitializedMessageException = new UninitializedMessageException();
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(uninitializedMessageException.getMessage());
        invalidProtocolBufferException.X = messageLite;
        throw invalidProtocolBufferException;
    }

    public final MessageLite c(ByteArrayInputStream byteArrayInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        MessageLite messageLite;
        try {
            int i2 = byteArrayInputStream.read();
            if (i2 == -1) {
                messageLite = null;
            } else {
                if ((i2 & 128) != 0) {
                    i2 &= 127;
                    int i3 = 7;
                    while (true) {
                        if (i3 < 32) {
                            int i4 = byteArrayInputStream.read();
                            if (i4 == -1) {
                                throw InvalidProtocolBufferException.d();
                            }
                            i2 |= (i4 & 127) << i3;
                            if ((i4 & 128) == 0) {
                                break;
                            }
                            i3 += 7;
                        } else {
                            while (true) {
                                if (i3 >= 64) {
                                    throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                                }
                                int i5 = byteArrayInputStream.read();
                                if (i5 == -1) {
                                    throw InvalidProtocolBufferException.d();
                                }
                                if ((i5 & 128) == 0) {
                                    break;
                                }
                                i3 += 7;
                            }
                        }
                    }
                }
                CodedInputStream codedInputStream = new CodedInputStream(new AbstractMessageLite.Builder.LimitedInputStream(byteArrayInputStream, i2));
                MessageLite messageLite2 = (MessageLite) a(codedInputStream, extensionRegistryLite);
                try {
                    codedInputStream.a(0);
                    messageLite = messageLite2;
                } catch (InvalidProtocolBufferException e2) {
                    e2.X = messageLite2;
                    throw e2;
                }
            }
            b(messageLite);
            return messageLite;
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3.getMessage());
        }
    }
}

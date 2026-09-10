package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class InvalidProtocolBufferException extends IOException {
    public MessageLite X;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.X = null;
    }

    public static InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}

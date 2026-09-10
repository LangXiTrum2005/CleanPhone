package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean X;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;
    }

    public static InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    public static InvalidProtocolBufferException g() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public static InvalidProtocolBufferException h() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    public static InvalidWireTypeException i() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    public static InvalidProtocolBufferException j() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public static InvalidProtocolBufferException k() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static InvalidProtocolBufferException l() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    public static InvalidProtocolBufferException m() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class ErrorOuterClass {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Error extends GeneratedMessageLite<Error, Builder> implements ErrorOrBuilder {
        private static final Error DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 3;
        public static final int ERROR_TEXT_FIELD_NUMBER = 2;
        public static final int ERROR_TOKEN_FIELD_NUMBER = 4;
        private static volatile Parser<Error> PARSER;
        private int errorCode_;
        private String errorText_ = "";
        private ByteString errorToken_ = ByteString.EMPTY;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class Builder extends GeneratedMessageLite.Builder<Error, Builder> implements ErrorOrBuilder {
            public /* synthetic */ Builder(ji.q qVar) {
                this();
            }

            public Builder clearErrorCode() {
                copyOnWrite();
                ((Error) this.instance).clearErrorCode();
                return this;
            }

            public Builder clearErrorText() {
                copyOnWrite();
                ((Error) this.instance).clearErrorText();
                return this;
            }

            public Builder clearErrorToken() {
                copyOnWrite();
                ((Error) this.instance).clearErrorToken();
                return this;
            }

            @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
            public PublicErrorCode getErrorCode() {
                return ((Error) this.instance).getErrorCode();
            }

            @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
            public int getErrorCodeValue() {
                return ((Error) this.instance).getErrorCodeValue();
            }

            @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
            public String getErrorText() {
                return ((Error) this.instance).getErrorText();
            }

            @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
            public ByteString getErrorTextBytes() {
                return ((Error) this.instance).getErrorTextBytes();
            }

            @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
            public ByteString getErrorToken() {
                return ((Error) this.instance).getErrorToken();
            }

            public Builder setErrorCode(PublicErrorCode publicErrorCode) {
                copyOnWrite();
                ((Error) this.instance).setErrorCode(publicErrorCode);
                return this;
            }

            public Builder setErrorCodeValue(int i10) {
                copyOnWrite();
                ((Error) this.instance).setErrorCodeValue(i10);
                return this;
            }

            public Builder setErrorText(String str) {
                copyOnWrite();
                ((Error) this.instance).setErrorText(str);
                return this;
            }

            public Builder setErrorTextBytes(ByteString byteString) {
                copyOnWrite();
                ((Error) this.instance).setErrorTextBytes(byteString);
                return this;
            }

            public Builder setErrorToken(ByteString byteString) {
                copyOnWrite();
                ((Error) this.instance).setErrorToken(byteString);
                return this;
            }

            private Builder() {
                super(Error.DEFAULT_INSTANCE);
            }
        }

        static {
            Error error = new Error();
            DEFAULT_INSTANCE = error;
            GeneratedMessageLite.registerDefaultInstance(Error.class, error);
        }

        private Error() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorText() {
            this.errorText_ = getDefaultInstance().getErrorText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorToken() {
            this.errorToken_ = getDefaultInstance().getErrorToken();
        }

        public static Error getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Error> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(PublicErrorCode publicErrorCode) {
            this.errorCode_ = publicErrorCode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCodeValue(int i10) {
            this.errorCode_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorText(String str) {
            str.getClass();
            this.errorText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorTextBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorText_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorToken(ByteString byteString) {
            byteString.getClass();
            this.errorToken_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            int i10 = ji.q.f43917a[methodToInvoke.ordinal()];
            ji.q qVar = null;
            switch (i10) {
                case 1:
                    return new Error();
                case 2:
                    return new Builder(qVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002Ȉ\u0003\f\u0004\n", new Object[]{"errorText_", "errorCode_", "errorToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Error> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Error.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
        public PublicErrorCode getErrorCode() {
            PublicErrorCode publicErrorCodeForNumber = PublicErrorCode.forNumber(this.errorCode_);
            return publicErrorCodeForNumber == null ? PublicErrorCode.UNRECOGNIZED : publicErrorCodeForNumber;
        }

        @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
        public int getErrorCodeValue() {
            return this.errorCode_;
        }

        @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
        public String getErrorText() {
            return this.errorText_;
        }

        @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
        public ByteString getErrorTextBytes() {
            return ByteString.copyFromUtf8(this.errorText_);
        }

        @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
        public ByteString getErrorToken() {
            return this.errorToken_;
        }

        public static Builder newBuilder(Error error) {
            return DEFAULT_INSTANCE.createBuilder(error);
        }

        public static Error parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Error parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Error parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Error parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Error parseFrom(InputStream inputStream) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Error parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Error parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface ErrorOrBuilder extends MessageLiteOrBuilder {
        PublicErrorCode getErrorCode();

        int getErrorCodeValue();

        String getErrorText();

        ByteString getErrorTextBytes();

        ByteString getErrorToken();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum PublicErrorCode implements Internal.EnumLite {
        PUBLIC_ERROR_CODE_UNSPECIFIED(0),
        PUBLIC_ERROR_CODE_TIMEOUT(2),
        PUBLIC_ERROR_CODE_INIT_UNKNOWN(PUBLIC_ERROR_CODE_INIT_UNKNOWN_VALUE),
        PUBLIC_ERROR_CODE_INIT_NOT_FOUND(PUBLIC_ERROR_CODE_INIT_NOT_FOUND_VALUE),
        PUBLIC_ERROR_CODE_INIT_MISMATCHED_PLATFORM(PUBLIC_ERROR_CODE_INIT_MISMATCHED_PLATFORM_VALUE),
        PUBLIC_ERROR_CODE_INIT_PROTO(PUBLIC_ERROR_CODE_INIT_PROTO_VALUE),
        PUBLIC_ERROR_CODE_INIT_INTERNAL_SYSTEM(PUBLIC_ERROR_CODE_INIT_INTERNAL_SYSTEM_VALUE),
        PUBLIC_ERROR_CODE_INIT_NETWORK(PUBLIC_ERROR_CODE_INIT_NETWORK_VALUE),
        PUBLIC_ERROR_CODE_INIT_FILE_SYSTEM(PUBLIC_ERROR_CODE_INIT_FILE_SYSTEM_VALUE),
        PUBLIC_ERROR_CODE_LOAD_NO_FILL(PUBLIC_ERROR_CODE_LOAD_NO_FILL_VALUE),
        PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED(PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED_VALUE),
        PUBLIC_ERROR_CODE_LOAD_PLACEMENT_NOT_FOUND(PUBLIC_ERROR_CODE_LOAD_PLACEMENT_NOT_FOUND_VALUE),
        PUBLIC_ERROR_CODE_LOAD_PROTO(PUBLIC_ERROR_CODE_LOAD_PROTO_VALUE),
        PUBLIC_ERROR_CODE_LOAD_UNSUPPORTED_PLACEMENT(PUBLIC_ERROR_CODE_LOAD_UNSUPPORTED_PLACEMENT_VALUE),
        PUBLIC_ERROR_CODE_LOAD_NETWORK(PUBLIC_ERROR_CODE_LOAD_NETWORK_VALUE),
        PUBLIC_ERROR_CODE_LOAD_FILE_SYSTEM(PUBLIC_ERROR_CODE_LOAD_FILE_SYSTEM_VALUE),
        PUBLIC_ERROR_CODE_LOAD_ADVIEWER(PUBLIC_ERROR_CODE_LOAD_ADVIEWER_VALUE),
        PUBLIC_ERROR_CODE_SHOW_EXPIRED(PUBLIC_ERROR_CODE_SHOW_EXPIRED_VALUE),
        PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN(PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN_VALUE),
        PUBLIC_ERROR_CODE_SHOW_INTERNAL(PUBLIC_ERROR_CODE_SHOW_INTERNAL_VALUE),
        UNRECOGNIZED(-1);

        public static final int PUBLIC_ERROR_CODE_INIT_FILE_SYSTEM_VALUE = 52006;
        public static final int PUBLIC_ERROR_CODE_INIT_INTERNAL_SYSTEM_VALUE = 52004;
        public static final int PUBLIC_ERROR_CODE_INIT_MISMATCHED_PLATFORM_VALUE = 52002;
        public static final int PUBLIC_ERROR_CODE_INIT_NETWORK_VALUE = 52005;
        public static final int PUBLIC_ERROR_CODE_INIT_NOT_FOUND_VALUE = 52001;
        public static final int PUBLIC_ERROR_CODE_INIT_PROTO_VALUE = 52003;
        public static final int PUBLIC_ERROR_CODE_INIT_UNKNOWN_VALUE = 52000;
        public static final int PUBLIC_ERROR_CODE_LOAD_ADVIEWER_VALUE = 52107;
        public static final int PUBLIC_ERROR_CODE_LOAD_FILE_SYSTEM_VALUE = 52106;
        public static final int PUBLIC_ERROR_CODE_LOAD_NETWORK_VALUE = 52105;
        public static final int PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED_VALUE = 52101;
        public static final int PUBLIC_ERROR_CODE_LOAD_NO_FILL_VALUE = 52100;
        public static final int PUBLIC_ERROR_CODE_LOAD_PLACEMENT_NOT_FOUND_VALUE = 52102;
        public static final int PUBLIC_ERROR_CODE_LOAD_PROTO_VALUE = 52103;
        public static final int PUBLIC_ERROR_CODE_LOAD_UNSUPPORTED_PLACEMENT_VALUE = 52104;
        public static final int PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN_VALUE = 52201;
        public static final int PUBLIC_ERROR_CODE_SHOW_EXPIRED_VALUE = 52200;
        public static final int PUBLIC_ERROR_CODE_SHOW_INTERNAL_VALUE = 52202;
        public static final int PUBLIC_ERROR_CODE_TIMEOUT_VALUE = 2;
        public static final int PUBLIC_ERROR_CODE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<PublicErrorCode> internalValueMap = new d0();
        private final int value;

        PublicErrorCode(int i10) {
            this.value = i10;
        }

        public static PublicErrorCode forNumber(int i10) {
            if (i10 == 0) {
                return PUBLIC_ERROR_CODE_UNSPECIFIED;
            }
            if (i10 == 2) {
                return PUBLIC_ERROR_CODE_TIMEOUT;
            }
            switch (i10) {
                case PUBLIC_ERROR_CODE_INIT_UNKNOWN_VALUE:
                    return PUBLIC_ERROR_CODE_INIT_UNKNOWN;
                case PUBLIC_ERROR_CODE_INIT_NOT_FOUND_VALUE:
                    return PUBLIC_ERROR_CODE_INIT_NOT_FOUND;
                case PUBLIC_ERROR_CODE_INIT_MISMATCHED_PLATFORM_VALUE:
                    return PUBLIC_ERROR_CODE_INIT_MISMATCHED_PLATFORM;
                case PUBLIC_ERROR_CODE_INIT_PROTO_VALUE:
                    return PUBLIC_ERROR_CODE_INIT_PROTO;
                case PUBLIC_ERROR_CODE_INIT_INTERNAL_SYSTEM_VALUE:
                    return PUBLIC_ERROR_CODE_INIT_INTERNAL_SYSTEM;
                case PUBLIC_ERROR_CODE_INIT_NETWORK_VALUE:
                    return PUBLIC_ERROR_CODE_INIT_NETWORK;
                case PUBLIC_ERROR_CODE_INIT_FILE_SYSTEM_VALUE:
                    return PUBLIC_ERROR_CODE_INIT_FILE_SYSTEM;
                default:
                    switch (i10) {
                        case PUBLIC_ERROR_CODE_LOAD_NO_FILL_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_NO_FILL;
                        case PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED;
                        case PUBLIC_ERROR_CODE_LOAD_PLACEMENT_NOT_FOUND_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_PLACEMENT_NOT_FOUND;
                        case PUBLIC_ERROR_CODE_LOAD_PROTO_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_PROTO;
                        case PUBLIC_ERROR_CODE_LOAD_UNSUPPORTED_PLACEMENT_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_UNSUPPORTED_PLACEMENT;
                        case PUBLIC_ERROR_CODE_LOAD_NETWORK_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_NETWORK;
                        case PUBLIC_ERROR_CODE_LOAD_FILE_SYSTEM_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_FILE_SYSTEM;
                        case PUBLIC_ERROR_CODE_LOAD_ADVIEWER_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_ADVIEWER;
                        default:
                            switch (i10) {
                                case PUBLIC_ERROR_CODE_SHOW_EXPIRED_VALUE:
                                    return PUBLIC_ERROR_CODE_SHOW_EXPIRED;
                                case PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN_VALUE:
                                    return PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN;
                                case PUBLIC_ERROR_CODE_SHOW_INTERNAL_VALUE:
                                    return PUBLIC_ERROR_CODE_SHOW_INTERNAL;
                                default:
                                    return null;
                            }
                    }
            }
        }

        public static Internal.EnumLiteMap<PublicErrorCode> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return e0.f41785a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static PublicErrorCode valueOf(int i10) {
            return forNumber(i10);
        }
    }

    private ErrorOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}

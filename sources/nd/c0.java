package nd;

import androidx.core.app.NotificationCompat;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final c0 DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile Parser<c0> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String url_ = "";
    private String responseContentType_ = "";
    private Internal.ProtobufList<k0> perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    static {
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        GeneratedMessageLite.registerDefaultInstance(c0.class, c0Var);
    }

    public static w N() {
        return (w) DEFAULT_INSTANCE.createBuilder();
    }

    public static void h(c0 c0Var, String str) {
        c0Var.getClass();
        str.getClass();
        c0Var.bitField0_ |= 1;
        c0Var.url_ = str;
    }

    public static void i(c0 c0Var) {
        c0Var.getClass();
        c0Var.networkClientErrorReason_ = 1;
        c0Var.bitField0_ |= 16;
    }

    public static void j(c0 c0Var, int i10) {
        c0Var.bitField0_ |= 32;
        c0Var.httpResponseCode_ = i10;
    }

    public static void k(c0 c0Var, String str) {
        c0Var.getClass();
        str.getClass();
        c0Var.bitField0_ |= 64;
        c0Var.responseContentType_ = str;
    }

    public static void l(c0 c0Var) {
        c0Var.bitField0_ &= -65;
        c0Var.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public static void m(c0 c0Var, long j10) {
        c0Var.bitField0_ |= 128;
        c0Var.clientStartTimeUs_ = j10;
    }

    public static void n(c0 c0Var, long j10) {
        c0Var.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
        c0Var.timeToRequestCompletedUs_ = j10;
    }

    public static void o(c0 c0Var, long j10) {
        c0Var.bitField0_ |= 512;
        c0Var.timeToResponseInitiatedUs_ = j10;
    }

    public static void p(c0 c0Var, long j10) {
        c0Var.bitField0_ |= 1024;
        c0Var.timeToResponseCompletedUs_ = j10;
    }

    public static MapFieldLite q(c0 c0Var) {
        if (!c0Var.customAttributes_.isMutable()) {
            c0Var.customAttributes_ = c0Var.customAttributes_.mutableCopy();
        }
        return c0Var.customAttributes_;
    }

    public static void r(c0 c0Var, Iterable iterable) {
        Internal.ProtobufList<k0> protobufList = c0Var.perfSessions_;
        if (!protobufList.isModifiable()) {
            c0Var.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(iterable, (List) c0Var.perfSessions_);
    }

    public static void s(c0 c0Var, z zVar) {
        c0Var.getClass();
        c0Var.httpMethod_ = zVar.f46711a;
        c0Var.bitField0_ |= 2;
    }

    public static void t(c0 c0Var, long j10) {
        c0Var.bitField0_ |= 4;
        c0Var.requestPayloadBytes_ = j10;
    }

    public static void u(c0 c0Var, long j10) {
        c0Var.bitField0_ |= 8;
        c0Var.responsePayloadBytes_ = j10;
    }

    public static c0 w() {
        return DEFAULT_INSTANCE;
    }

    public final long A() {
        return this.requestPayloadBytes_;
    }

    public final long B() {
        return this.responsePayloadBytes_;
    }

    public final long C() {
        return this.timeToRequestCompletedUs_;
    }

    public final long D() {
        return this.timeToResponseCompletedUs_;
    }

    public final long E() {
        return this.timeToResponseInitiatedUs_;
    }

    public final boolean F() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean G() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean J() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean K() {
        return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
    }

    public final boolean L() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean M() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (v.f46694a[methodToInvoke.ordinal()]) {
            case 1:
                return new c0();
            case 2:
                return new w(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", y.f46700a, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", a0.f46664a, "customAttributes_", x.f46699a, "perfSessions_", k0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<c0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (c0.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    public final long v() {
        return this.clientStartTimeUs_;
    }

    public final z x() {
        z zVarA = z.a(this.httpMethod_);
        return zVarA == null ? z.HTTP_METHOD_UNKNOWN : zVarA;
    }

    public final int y() {
        return this.httpResponseCode_;
    }

    public final Internal.ProtobufList z() {
        return this.perfSessions_;
    }
}

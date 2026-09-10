package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final o DEFAULT_INSTANCE;
    private static volatile Parser<o> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        GeneratedMessageLite.registerDefaultInstance(o.class, oVar);
    }

    public static void h(o oVar, long j10) {
        oVar.bitField0_ |= 1;
        oVar.clientTimeUs_ = j10;
    }

    public static void i(o oVar, long j10) {
        oVar.bitField0_ |= 2;
        oVar.userTimeUs_ = j10;
    }

    public static void j(o oVar, long j10) {
        oVar.bitField0_ |= 4;
        oVar.systemTimeUs_ = j10;
    }

    public static n k() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (m.f46682a[methodToInvoke.ordinal()]) {
            case 1:
                return new o();
            case 2:
                return new n(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<o> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (o.class) {
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
}

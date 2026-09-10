package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final u DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile Parser<u> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private r gaugeMetadata_;
    private String sessionId_ = "";
    private Internal.ProtobufList<o> cpuMetricReadings_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<f> androidMemoryReadings_ = GeneratedMessageLite.emptyProtobufList();

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        GeneratedMessageLite.registerDefaultInstance(u.class, uVar);
    }

    public static void h(u uVar, String str) {
        uVar.getClass();
        str.getClass();
        uVar.bitField0_ |= 1;
        uVar.sessionId_ = str;
    }

    public static void i(u uVar, f fVar) {
        uVar.getClass();
        fVar.getClass();
        Internal.ProtobufList<f> protobufList = uVar.androidMemoryReadings_;
        if (!protobufList.isModifiable()) {
            uVar.androidMemoryReadings_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        uVar.androidMemoryReadings_.add(fVar);
    }

    public static void j(u uVar, r rVar) {
        uVar.getClass();
        rVar.getClass();
        uVar.gaugeMetadata_ = rVar;
        uVar.bitField0_ |= 2;
    }

    public static void k(u uVar, o oVar) {
        uVar.getClass();
        oVar.getClass();
        Internal.ProtobufList<o> protobufList = uVar.cpuMetricReadings_;
        if (!protobufList.isModifiable()) {
            uVar.cpuMetricReadings_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        uVar.cpuMetricReadings_.add(oVar);
    }

    public static u n() {
        return DEFAULT_INSTANCE;
    }

    public static t q() {
        return (t) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (s.f46691a[methodToInvoke.ordinal()]) {
            case 1:
                return new u();
            case 2:
                return new t(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", o.class, "gaugeMetadata_", "androidMemoryReadings_", f.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<u> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (u.class) {
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

    public final boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public final int l() {
        return this.androidMemoryReadings_.size();
    }

    public final int m() {
        return this.cpuMetricReadings_.size();
    }

    public final r o() {
        r rVar = this.gaugeMetadata_;
        return rVar == null ? r.k() : rVar;
    }

    public final boolean p() {
        return (this.bitField0_ & 2) != 0;
    }
}

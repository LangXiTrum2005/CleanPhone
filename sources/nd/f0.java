package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends GeneratedMessageLite implements g0 {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final f0 DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile Parser<f0> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private j applicationInfo_;
    private int bitField0_;
    private u gaugeMetric_;
    private c0 networkRequestMetric_;
    private r0 traceMetric_;
    private w0 transportInfo_;

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        GeneratedMessageLite.registerDefaultInstance(f0.class, f0Var);
    }

    public static void h(f0 f0Var, j jVar) {
        f0Var.getClass();
        jVar.getClass();
        f0Var.applicationInfo_ = jVar;
        f0Var.bitField0_ |= 1;
    }

    public static void i(f0 f0Var, u uVar) {
        f0Var.getClass();
        uVar.getClass();
        f0Var.gaugeMetric_ = uVar;
        f0Var.bitField0_ |= 8;
    }

    public static void j(f0 f0Var, r0 r0Var) {
        f0Var.getClass();
        r0Var.getClass();
        f0Var.traceMetric_ = r0Var;
        f0Var.bitField0_ |= 2;
    }

    public static void k(f0 f0Var, c0 c0Var) {
        f0Var.getClass();
        c0Var.getClass();
        f0Var.networkRequestMetric_ = c0Var;
        f0Var.bitField0_ |= 4;
    }

    public static e0 n() {
        return (e0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // nd.g0
    public final boolean a() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // nd.g0
    public final boolean b() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // nd.g0
    public final c0 c() {
        c0 c0Var = this.networkRequestMetric_;
        return c0Var == null ? c0.w() : c0Var;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (d0.f46670a[methodToInvoke.ordinal()]) {
            case 1:
                return new f0();
            case 2:
                return new e0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<f0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (f0.class) {
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

    @Override // nd.g0
    public final boolean e() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // nd.g0
    public final r0 f() {
        r0 r0Var = this.traceMetric_;
        return r0Var == null ? r0.u() : r0Var;
    }

    @Override // nd.g0
    public final u g() {
        u uVar = this.gaugeMetric_;
        return uVar == null ? u.n() : uVar;
    }

    public final j l() {
        j jVar = this.applicationInfo_;
        return jVar == null ? j.n() : jVar;
    }

    public final boolean m() {
        return (this.bitField0_ & 1) != 0;
    }
}

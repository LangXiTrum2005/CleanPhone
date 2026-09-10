package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final k0 DEFAULT_INSTANCE;
    private static volatile Parser<k0> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final Internal.ListAdapter.Converter<Integer, m0> sessionVerbosity_converter_ = new h0();
    private int bitField0_;
    private String sessionId_ = "";
    private Internal.IntList sessionVerbosity_ = GeneratedMessageLite.emptyIntList();

    static {
        k0 k0Var = new k0();
        DEFAULT_INSTANCE = k0Var;
        GeneratedMessageLite.registerDefaultInstance(k0.class, k0Var);
    }

    public static void h(k0 k0Var, String str) {
        k0Var.getClass();
        str.getClass();
        k0Var.bitField0_ |= 1;
        k0Var.sessionId_ = str;
    }

    public static void i(k0 k0Var) {
        k0Var.getClass();
        Internal.IntList intList = k0Var.sessionVerbosity_;
        if (!intList.isModifiable()) {
            k0Var.sessionVerbosity_ = GeneratedMessageLite.mutableCopy(intList);
        }
        k0Var.sessionVerbosity_.addInt(1);
    }

    public static j0 l() {
        return (j0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (i0.f46673a[methodToInvoke.ordinal()]) {
            case 1:
                return new k0();
            case 2:
                return new j0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", l0.f46681a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<k0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (k0.class) {
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

    public final m0 j() {
        m0 m0VarA = m0.a(this.sessionVerbosity_.getInt(0));
        return m0VarA == null ? m0.SESSION_VERBOSITY_NONE : m0VarA;
    }

    public final int k() {
        return this.sessionVerbosity_.size();
    }
}

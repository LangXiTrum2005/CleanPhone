package nd;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final r0 DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<r0> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private MapFieldLite<String, Long> counters_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String name_ = "";
    private Internal.ProtobufList<r0> subtraces_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<k0> perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    static {
        r0 r0Var = new r0();
        DEFAULT_INSTANCE = r0Var;
        GeneratedMessageLite.registerDefaultInstance(r0.class, r0Var);
    }

    public static void h(r0 r0Var, String str) {
        r0Var.getClass();
        str.getClass();
        r0Var.bitField0_ |= 1;
        r0Var.name_ = str;
    }

    public static MapFieldLite i(r0 r0Var) {
        if (!r0Var.counters_.isMutable()) {
            r0Var.counters_ = r0Var.counters_.mutableCopy();
        }
        return r0Var.counters_;
    }

    public static void j(r0 r0Var, r0 r0Var2) {
        r0Var.getClass();
        r0Var2.getClass();
        Internal.ProtobufList<r0> protobufList = r0Var.subtraces_;
        if (!protobufList.isModifiable()) {
            r0Var.subtraces_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        r0Var.subtraces_.add(r0Var2);
    }

    public static void k(r0 r0Var, ArrayList arrayList) {
        Internal.ProtobufList<r0> protobufList = r0Var.subtraces_;
        if (!protobufList.isModifiable()) {
            r0Var.subtraces_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) r0Var.subtraces_);
    }

    public static MapFieldLite l(r0 r0Var) {
        if (!r0Var.customAttributes_.isMutable()) {
            r0Var.customAttributes_ = r0Var.customAttributes_.mutableCopy();
        }
        return r0Var.customAttributes_;
    }

    public static void m(r0 r0Var, k0 k0Var) {
        r0Var.getClass();
        k0Var.getClass();
        Internal.ProtobufList<k0> protobufList = r0Var.perfSessions_;
        if (!protobufList.isModifiable()) {
            r0Var.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        r0Var.perfSessions_.add(k0Var);
    }

    public static void n(r0 r0Var, Iterable iterable) {
        Internal.ProtobufList<k0> protobufList = r0Var.perfSessions_;
        if (!protobufList.isModifiable()) {
            r0Var.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(iterable, (List) r0Var.perfSessions_);
    }

    public static void o(r0 r0Var, long j10) {
        r0Var.bitField0_ |= 4;
        r0Var.clientStartTimeUs_ = j10;
    }

    public static void p(r0 r0Var, long j10) {
        r0Var.bitField0_ |= 8;
        r0Var.durationUs_ = j10;
    }

    public static r0 u() {
        return DEFAULT_INSTANCE;
    }

    public static o0 z() {
        return (o0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (n0.f46687a[methodToInvoke.ordinal()]) {
            case 1:
                return new r0();
            case 2:
                return new o0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", p0.f46689a, "subtraces_", r0.class, "customAttributes_", q0.f46690a, "perfSessions_", k0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<r0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (r0.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final boolean q() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int r() {
        return this.counters_.size();
    }

    public final Map s() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map t() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long v() {
        return this.durationUs_;
    }

    public final Internal.ProtobufList w() {
        return this.perfSessions_;
    }

    public final Internal.ProtobufList x() {
        return this.subtraces_;
    }

    public final boolean y() {
        return (this.bitField0_ & 4) != 0;
    }
}

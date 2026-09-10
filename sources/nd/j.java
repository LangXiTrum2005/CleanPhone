package nd;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final j DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile Parser<j> PARSER;
    private c androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        GeneratedMessageLite.registerDefaultInstance(j.class, jVar);
    }

    public static void h(j jVar, String str) {
        jVar.getClass();
        str.getClass();
        jVar.bitField0_ |= 1;
        jVar.googleAppId_ = str;
    }

    public static void i(j jVar, l lVar) {
        jVar.getClass();
        jVar.applicationProcessState_ = lVar.f46680a;
        jVar.bitField0_ |= 8;
    }

    public static MapFieldLite j(j jVar) {
        if (!jVar.customAttributes_.isMutable()) {
            jVar.customAttributes_ = jVar.customAttributes_.mutableCopy();
        }
        return jVar.customAttributes_;
    }

    public static void k(j jVar, String str) {
        jVar.getClass();
        str.getClass();
        jVar.bitField0_ |= 2;
        jVar.appInstanceId_ = str;
    }

    public static void l(j jVar, c cVar) {
        jVar.getClass();
        cVar.getClass();
        jVar.androidAppInfo_ = cVar;
        jVar.bitField0_ |= 4;
    }

    public static j n() {
        return DEFAULT_INSTANCE;
    }

    public static h s() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (g.f46671a[methodToInvoke.ordinal()]) {
            case 1:
                return new j();
            case 2:
                return new h(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", k.f46674a, "customAttributes_", i.f46672a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<j> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (j.class) {
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

    public final c m() {
        c cVar = this.androidAppInfo_;
        return cVar == null ? c.k() : cVar;
    }

    public final boolean o() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean p() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean q() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }
}

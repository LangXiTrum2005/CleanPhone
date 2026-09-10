package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Struct extends GeneratedMessageLite<Struct, Builder> implements StructOrBuilder {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser<Struct> PARSER;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.f4880Y;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Struct$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4924a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f4924a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4924a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4924a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4924a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4924a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4924a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4924a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Struct, Builder> implements StructOrBuilder {
    }

    public static final class FieldsDefaultEntryHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MapEntryLite f4925a = new MapEntryLite(WireFormat.FieldType.l0, WireFormat.FieldType.n0, Value.s());
    }

    static {
        Struct struct = new Struct();
        DEFAULT_INSTANCE = struct;
        GeneratedMessageLite.r(Struct.class, struct);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
        Parser defaultInstanceBasedParser;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", FieldsDefaultEntryHolder.f4925a});
            case 3:
                return new Struct();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Struct> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Struct.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser();
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

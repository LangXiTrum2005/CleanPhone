package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class ListValue extends GeneratedMessageLite<ListValue, Builder> implements ListValueOrBuilder {
    private static final ListValue DEFAULT_INSTANCE;
    private static volatile Parser<ListValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> values_ = ProtobufArrayList.e0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ListValue$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4870a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f4870a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4870a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4870a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4870a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4870a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4870a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4870a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListValue, Builder> implements ListValueOrBuilder {
    }

    static {
        ListValue listValue = new ListValue();
        DEFAULT_INSTANCE = listValue;
        GeneratedMessageLite.r(ListValue.class, listValue);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 3:
                return new ListValue();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<ListValue> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ListValue.class) {
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

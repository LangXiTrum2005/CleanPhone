package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class BytesValue extends GeneratedMessageLite<BytesValue, Builder> implements BytesValueOrBuilder {
    private static final BytesValue DEFAULT_INSTANCE;
    private static volatile Parser<BytesValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private ByteString value_ = ByteString.f4747Y;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.BytesValue$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4751a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f4751a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4751a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4751a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4751a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4751a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4751a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4751a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BytesValue, Builder> implements BytesValueOrBuilder {
    }

    static {
        BytesValue bytesValue = new BytesValue();
        DEFAULT_INSTANCE = bytesValue;
        GeneratedMessageLite.r(BytesValue.class, bytesValue);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case 3:
                return new BytesValue();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<BytesValue> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BytesValue.class) {
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

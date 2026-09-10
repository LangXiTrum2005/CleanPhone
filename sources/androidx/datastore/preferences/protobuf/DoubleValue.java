package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class DoubleValue extends GeneratedMessageLite<DoubleValue, Builder> implements DoubleValueOrBuilder {
    private static final DoubleValue DEFAULT_INSTANCE;
    private static volatile Parser<DoubleValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.DoubleValue$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4818a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f4818a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4818a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4818a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4818a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4818a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4818a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4818a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DoubleValue, Builder> implements DoubleValueOrBuilder {
    }

    static {
        DoubleValue doubleValue = new DoubleValue();
        DEFAULT_INSTANCE = doubleValue;
        GeneratedMessageLite.r(DoubleValue.class, doubleValue);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case 3:
                return new DoubleValue();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<DoubleValue> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (DoubleValue.class) {
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

package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Option extends GeneratedMessageLite<Option, Builder> implements OptionOrBuilder {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Option> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private Any value_;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Option$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4902a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f4902a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4902a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4902a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4902a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4902a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4902a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4902a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Option, Builder> implements OptionOrBuilder {
    }

    static {
        Option option = new Option();
        DEFAULT_INSTANCE = option;
        GeneratedMessageLite.r(Option.class, option);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "value_"});
            case 3:
                return new Option();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Option> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Option.class) {
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

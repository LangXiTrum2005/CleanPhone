package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Empty extends GeneratedMessageLite<Empty, Builder> implements EmptyOrBuilder {
    private static final Empty DEFAULT_INSTANCE;
    private static volatile Parser<Empty> PARSER;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Empty$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4820a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f4820a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4820a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4820a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4820a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4820a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4820a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4820a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Empty, Builder> implements EmptyOrBuilder {
    }

    static {
        Empty empty = new Empty();
        DEFAULT_INSTANCE = empty;
        GeneratedMessageLite.r(Empty.class, empty);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new Empty();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Empty> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Empty.class) {
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

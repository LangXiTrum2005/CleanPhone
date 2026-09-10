package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class JavaFeaturesProto {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.JavaFeaturesProto$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4861a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f4861a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4861a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4861a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4861a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4861a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4861a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4861a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class JavaFeatures extends GeneratedMessageLite<JavaFeatures, Builder> implements JavaFeaturesOrBuilder {
        private static final JavaFeatures DEFAULT_INSTANCE;
        public static final int LEGACY_CLOSED_ENUM_FIELD_NUMBER = 1;
        private static volatile Parser<JavaFeatures> PARSER = null;
        public static final int UTF8_VALIDATION_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean legacyClosedEnum_;
        private int utf8Validation_;

        public static final class Builder extends GeneratedMessageLite.Builder<JavaFeatures, Builder> implements JavaFeaturesOrBuilder {
        }

        public enum Utf8Validation implements Internal.EnumLite {
            UTF8_VALIDATION_UNKNOWN(0),
            DEFAULT(1),
            VERIFY(2);

            public final int X;

            /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.JavaFeaturesProto$JavaFeatures$Utf8Validation$1, reason: invalid class name */
            public class AnonymousClass1 implements Internal.EnumLiteMap<Utf8Validation> {
            }

            public static final class Utf8ValidationVerifier implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Internal.EnumVerifier f4863a = new Utf8ValidationVerifier();

                @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i2) {
                    Utf8Validation utf8Validation;
                    if (i2 == 0) {
                        utf8Validation = Utf8Validation.UTF8_VALIDATION_UNKNOWN;
                    } else if (i2 != 1) {
                        utf8Validation = i2 != 2 ? null : Utf8Validation.VERIFY;
                    } else {
                        utf8Validation = Utf8Validation.DEFAULT;
                    }
                    return utf8Validation != null;
                }
            }

            Utf8Validation(int i2) {
                this.X = i2;
            }

            @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.X;
            }
        }

        static {
            JavaFeatures javaFeatures = new JavaFeatures();
            DEFAULT_INSTANCE = javaFeatures;
            GeneratedMessageLite.r(JavaFeatures.class, javaFeatures);
        }

        public static JavaFeatures s() {
            return DEFAULT_INSTANCE;
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
                    return new RawMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "legacyClosedEnum_", "utf8Validation_", Utf8Validation.Utf8ValidationVerifier.f4863a});
                case 3:
                    return new JavaFeatures();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<JavaFeatures> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (JavaFeatures.class) {
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

    public interface JavaFeaturesOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        new GeneratedMessageLite.GeneratedExtension(DescriptorProtos.FeatureSet.s(), JavaFeatures.s(), JavaFeatures.s(), new GeneratedMessageLite.ExtensionDescriptor(WireFormat.FieldType.n0));
    }
}

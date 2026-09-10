package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Field extends GeneratedMessageLite<Field, Builder> implements FieldOrBuilder {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile Parser<Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private Internal.ProtobufList<Option> options_ = ProtobufArrayList.e0;
    private String jsonName_ = "";
    private String defaultValue_ = "";

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Field$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4832a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f4832a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4832a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4832a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4832a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4832a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4832a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4832a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Field, Builder> implements FieldOrBuilder {
    }

    public enum Cardinality implements Internal.EnumLite {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        public final int X;

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Field$Cardinality$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<Cardinality> {
        }

        public static final class CardinalityVerifier implements Internal.EnumVerifier {
            @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i2) {
                Cardinality cardinality;
                if (i2 == 0) {
                    cardinality = Cardinality.CARDINALITY_UNKNOWN;
                } else if (i2 == 1) {
                    cardinality = Cardinality.CARDINALITY_OPTIONAL;
                } else if (i2 != 2) {
                    cardinality = i2 != 3 ? null : Cardinality.CARDINALITY_REPEATED;
                } else {
                    cardinality = Cardinality.CARDINALITY_REQUIRED;
                }
                return cardinality != null;
            }
        }

        Cardinality(int i2) {
            this.X = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.X;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum Kind implements Internal.EnumLite {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);

        public final int X;

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Field$Kind$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<Kind> {
        }

        public static final class KindVerifier implements Internal.EnumVerifier {
            @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i2) {
                Kind kind;
                switch (i2) {
                    case 0:
                        kind = Kind.TYPE_UNKNOWN;
                        break;
                    case 1:
                        kind = Kind.TYPE_DOUBLE;
                        break;
                    case 2:
                        kind = Kind.TYPE_FLOAT;
                        break;
                    case 3:
                        kind = Kind.TYPE_INT64;
                        break;
                    case 4:
                        kind = Kind.TYPE_UINT64;
                        break;
                    case 5:
                        kind = Kind.TYPE_INT32;
                        break;
                    case 6:
                        kind = Kind.TYPE_FIXED64;
                        break;
                    case 7:
                        kind = Kind.TYPE_FIXED32;
                        break;
                    case 8:
                        kind = Kind.TYPE_BOOL;
                        break;
                    case 9:
                        kind = Kind.TYPE_STRING;
                        break;
                    case 10:
                        kind = Kind.TYPE_GROUP;
                        break;
                    case 11:
                        kind = Kind.TYPE_MESSAGE;
                        break;
                    case 12:
                        kind = Kind.TYPE_BYTES;
                        break;
                    case 13:
                        kind = Kind.TYPE_UINT32;
                        break;
                    case 14:
                        kind = Kind.TYPE_ENUM;
                        break;
                    case 15:
                        kind = Kind.TYPE_SFIXED32;
                        break;
                    case 16:
                        kind = Kind.TYPE_SFIXED64;
                        break;
                    case 17:
                        kind = Kind.TYPE_SINT32;
                        break;
                    case 18:
                        kind = Kind.TYPE_SINT64;
                        break;
                    default:
                        kind = null;
                        break;
                }
                return kind != null;
            }
        }

        Kind(int i2) {
            this.X = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.X;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        GeneratedMessageLite.r(Field.class, field);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
            case 3:
                return new Field();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Field> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Field.class) {
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

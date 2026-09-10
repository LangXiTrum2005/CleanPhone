package invest;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.overspeculate;
import java.io.IOException;

/* JADX INFO: compiled from: HmacParams.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cuirassed extends GeneratedMessageLite<cuirassed, saneness> implements com.google.crypto.tink.shaded.protobuf.creditor {
    private static final cuirassed DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile overspeculate<cuirassed> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    /* JADX INFO: compiled from: HmacParams.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f28947attabal;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f28947attabal = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28947attabal[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28947attabal[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28947attabal[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28947attabal[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28947attabal[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28947attabal[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: HmacParams.java */
    public static final class saneness extends GeneratedMessageLite.attabal<cuirassed, saneness> implements com.google.crypto.tink.shaded.protobuf.creditor {
        public /* synthetic */ saneness(attabal attabalVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.attabal, com.google.crypto.tink.shaded.protobuf.privatdozent.attabal
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.privatdozent build() {
            return super.build();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.attabal, com.google.crypto.tink.shaded.protobuf.privatdozent.attabal
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.privatdozent buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.attabal
        public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.attabal, com.google.crypto.tink.shaded.protobuf.privatdozent.attabal
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.privatdozent.attabal creditor(com.google.crypto.tink.shaded.protobuf.taiyuan taiyuanVar, com.google.crypto.tink.shaded.protobuf.kowloon kowloonVar) throws IOException {
            return super.creditor(taiyuanVar, kowloonVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.attabal, com.google.crypto.tink.shaded.protobuf.attabal.AbstractC0320attabal
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.attabal.AbstractC0320attabal dern(com.google.crypto.tink.shaded.protobuf.attabal attabalVar) {
            return super.dern((GeneratedMessageLite) attabalVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.attabal, com.google.crypto.tink.shaded.protobuf.creditor
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.privatdozent getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        public saneness graveside(int i) {
            taiyuan();
            ((cuirassed) this.f22129arytenoidectomy).dent(i);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.attabal.AbstractC0320attabal, com.google.crypto.tink.shaded.protobuf.privatdozent.attabal
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.privatdozent.attabal lerp(com.google.crypto.tink.shaded.protobuf.privatdozent privatdozentVar) {
            return super.lerp(privatdozentVar);
        }

        public saneness molybdenite(HashType hashType) {
            taiyuan();
            ((cuirassed) this.f22129arytenoidectomy).clubfoot(hashType);
            return this;
        }

        public saneness() {
            super(cuirassed.DEFAULT_INSTANCE);
        }
    }

    static {
        cuirassed cuirassedVar = new cuirassed();
        DEFAULT_INSTANCE = cuirassedVar;
        GeneratedMessageLite.grimness(cuirassed.class, cuirassedVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dent(int i) {
        this.tagSize_ = i;
    }

    public static saneness overspeculate() {
        return (saneness) DEFAULT_INSTANCE.arytenoidectomy();
    }

    public static cuirassed peridotite() {
        return DEFAULT_INSTANCE;
    }

    public final void clubfoot(HashType hashType) {
        this.hash_ = hashType.getNumber();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.creditor
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.privatdozent getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public HashType mathsort() {
        HashType hashTypeForNumber = HashType.forNumber(this.hash_);
        return hashTypeForNumber == null ? HashType.UNRECOGNIZED : hashTypeForNumber;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.privatdozent
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.privatdozent.attabal newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object polloi(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        overspeculate sanenessVar;
        attabal attabalVar = null;
        switch (attabal.f28947attabal[methodToInvoke.ordinal()]) {
            case 1:
                return new cuirassed();
            case 2:
                return new saneness(attabalVar);
            case 3:
                return GeneratedMessageLite.yemenite(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                overspeculate<cuirassed> overspeculateVar = PARSER;
                if (overspeculateVar != null) {
                    return overspeculateVar;
                }
                synchronized (cuirassed.class) {
                    try {
                        sanenessVar = PARSER;
                        if (sanenessVar == null) {
                            sanenessVar = new GeneratedMessageLite.saneness(DEFAULT_INSTANCE);
                            PARSER = sanenessVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return sanenessVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public int splinterproof() {
        return this.tagSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.privatdozent
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.privatdozent.attabal toBuilder() {
        return super.toBuilder();
    }
}

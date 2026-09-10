package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.creditor;
import com.google.crypto.tink.shaded.protobuf.kowloon;
import com.google.crypto.tink.shaded.protobuf.overspeculate;
import com.google.crypto.tink.shaded.protobuf.privatdozent;
import com.google.crypto.tink.shaded.protobuf.rotuma;
import com.google.crypto.tink.shaded.protobuf.taiyuan;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class KeyData extends GeneratedMessageLite<KeyData, saneness> implements creditor {
    private static final KeyData DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile overspeculate<KeyData> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.EMPTY;

    public enum KeyMaterialType implements rotuma.dern {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
        public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
        public static final int REMOTE_VALUE = 4;
        public static final int SYMMETRIC_VALUE = 1;
        public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final rotuma.wireman<KeyMaterialType> f22084kowloon = new attabal();
        private final int value;

        public class attabal implements rotuma.wireman<KeyMaterialType> {
            @Override // com.google.crypto.tink.shaded.protobuf.rotuma.wireman
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public KeyMaterialType findValueByNumber(int i) {
                return KeyMaterialType.forNumber(i);
            }
        }

        public static final class saneness implements rotuma.marial {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final rotuma.marial f22085attabal = new saneness();

            @Override // com.google.crypto.tink.shaded.protobuf.rotuma.marial
            public boolean isInRange(int i) {
                return KeyMaterialType.forNumber(i) != null;
            }
        }

        KeyMaterialType(int i) {
            this.value = i;
        }

        public static KeyMaterialType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        public static rotuma.wireman<KeyMaterialType> internalGetValueMap() {
            return f22084kowloon;
        }

        public static rotuma.marial internalGetVerifier() {
            return saneness.f22085attabal;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.rotuma.dern
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static KeyMaterialType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f22086attabal;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22086attabal = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22086attabal[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22086attabal[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22086attabal[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22086attabal[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22086attabal[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22086attabal[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class saneness extends GeneratedMessageLite.attabal<KeyData, saneness> implements creditor {
        public /* synthetic */ saneness(attabal attabalVar) {
            this();
        }

        public saneness adultoid(ByteString byteString) {
            taiyuan();
            ((KeyData) this.f22129arytenoidectomy).premeiotic(byteString);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.attabal, com.google.crypto.tink.shaded.protobuf.privatdozent.attabal
        public /* bridge */ /* synthetic */ privatdozent build() {
            return super.build();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.attabal, com.google.crypto.tink.shaded.protobuf.privatdozent.attabal
        public /* bridge */ /* synthetic */ privatdozent buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.attabal
        public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.attabal, com.google.crypto.tink.shaded.protobuf.privatdozent.attabal
        public /* bridge */ /* synthetic */ privatdozent.attabal creditor(taiyuan taiyuanVar, kowloon kowloonVar) throws IOException {
            return super.creditor(taiyuanVar, kowloonVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.attabal, com.google.crypto.tink.shaded.protobuf.attabal.AbstractC0320attabal
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.attabal.AbstractC0320attabal dern(com.google.crypto.tink.shaded.protobuf.attabal attabalVar) {
            return super.dern((GeneratedMessageLite) attabalVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.attabal, com.google.crypto.tink.shaded.protobuf.creditor
        public /* bridge */ /* synthetic */ privatdozent getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        public saneness graveside(String str) {
            taiyuan();
            ((KeyData) this.f22129arytenoidectomy).cultivated(str);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.attabal.AbstractC0320attabal, com.google.crypto.tink.shaded.protobuf.privatdozent.attabal
        public /* bridge */ /* synthetic */ privatdozent.attabal lerp(privatdozent privatdozentVar) {
            return super.lerp(privatdozentVar);
        }

        public saneness molybdenite(KeyMaterialType keyMaterialType) {
            taiyuan();
            ((KeyData) this.f22129arytenoidectomy).permissivist(keyMaterialType);
            return this;
        }

        public saneness() {
            super(KeyData.DEFAULT_INSTANCE);
        }
    }

    static {
        KeyData keyData = new KeyData();
        DEFAULT_INSTANCE = keyData;
        GeneratedMessageLite.grimness(KeyData.class, keyData);
    }

    public static saneness dent() {
        return (saneness) DEFAULT_INSTANCE.arytenoidectomy();
    }

    public static KeyData mathsort() {
        return DEFAULT_INSTANCE;
    }

    public ByteString clubfoot() {
        return this.value_;
    }

    public final void cultivated(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.creditor
    public /* bridge */ /* synthetic */ privatdozent getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.privatdozent
    public /* bridge */ /* synthetic */ privatdozent.attabal newBuilderForType() {
        return super.newBuilderForType();
    }

    public String overspeculate() {
        return this.typeUrl_;
    }

    public final void permissivist(KeyMaterialType keyMaterialType) {
        this.keyMaterialType_ = keyMaterialType.getNumber();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object polloi(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        overspeculate sanenessVar;
        attabal attabalVar = null;
        switch (attabal.f22086attabal[methodToInvoke.ordinal()]) {
            case 1:
                return new KeyData();
            case 2:
                return new saneness(attabalVar);
            case 3:
                return GeneratedMessageLite.yemenite(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                overspeculate<KeyData> overspeculateVar = PARSER;
                if (overspeculateVar != null) {
                    return overspeculateVar;
                }
                synchronized (KeyData.class) {
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

    public final void premeiotic(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    public KeyMaterialType splinterproof() {
        KeyMaterialType keyMaterialTypeForNumber = KeyMaterialType.forNumber(this.keyMaterialType_);
        return keyMaterialTypeForNumber == null ? KeyMaterialType.UNRECOGNIZED : keyMaterialTypeForNumber;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.privatdozent
    public /* bridge */ /* synthetic */ privatdozent.attabal toBuilder() {
        return super.toBuilder();
    }
}

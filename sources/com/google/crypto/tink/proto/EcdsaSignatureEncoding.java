package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.rotuma;

/* JADX INFO: loaded from: classes3.dex */
public enum EcdsaSignatureEncoding implements rotuma.dern {
    UNKNOWN_ENCODING(0),
    IEEE_P1363(1),
    DER(2),
    UNRECOGNIZED(-1);

    public static final int DER_VALUE = 2;
    public static final int IEEE_P1363_VALUE = 1;
    public static final int UNKNOWN_ENCODING_VALUE = 0;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final rotuma.wireman<EcdsaSignatureEncoding> f22075kowloon = new rotuma.wireman<EcdsaSignatureEncoding>() { // from class: com.google.crypto.tink.proto.EcdsaSignatureEncoding.attabal
        @Override // com.google.crypto.tink.shaded.protobuf.rotuma.wireman
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public EcdsaSignatureEncoding findValueByNumber(int i) {
            return EcdsaSignatureEncoding.forNumber(i);
        }
    };
    private final int value;

    public static final class saneness implements rotuma.marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final rotuma.marial f22076attabal = new saneness();

        @Override // com.google.crypto.tink.shaded.protobuf.rotuma.marial
        public boolean isInRange(int i) {
            return EcdsaSignatureEncoding.forNumber(i) != null;
        }
    }

    EcdsaSignatureEncoding(int i) {
        this.value = i;
    }

    public static EcdsaSignatureEncoding forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_ENCODING;
        }
        if (i == 1) {
            return IEEE_P1363;
        }
        if (i != 2) {
            return null;
        }
        return DER;
    }

    public static rotuma.wireman<EcdsaSignatureEncoding> internalGetValueMap() {
        return f22075kowloon;
    }

    public static rotuma.marial internalGetVerifier() {
        return saneness.f22076attabal;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rotuma.dern
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EcdsaSignatureEncoding valueOf(int i) {
        return forNumber(i);
    }
}

package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.rotuma;

/* JADX INFO: loaded from: classes3.dex */
public enum EllipticCurveType implements rotuma.dern {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);

    public static final int CURVE25519_VALUE = 5;
    public static final int NIST_P256_VALUE = 2;
    public static final int NIST_P384_VALUE = 3;
    public static final int NIST_P521_VALUE = 4;
    public static final int UNKNOWN_CURVE_VALUE = 0;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final rotuma.wireman<EllipticCurveType> f22078kowloon = new rotuma.wireman<EllipticCurveType>() { // from class: com.google.crypto.tink.proto.EllipticCurveType.attabal
        @Override // com.google.crypto.tink.shaded.protobuf.rotuma.wireman
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public EllipticCurveType findValueByNumber(int i) {
            return EllipticCurveType.forNumber(i);
        }
    };
    private final int value;

    public static final class saneness implements rotuma.marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final rotuma.marial f22079attabal = new saneness();

        @Override // com.google.crypto.tink.shaded.protobuf.rotuma.marial
        public boolean isInRange(int i) {
            return EllipticCurveType.forNumber(i) != null;
        }
    }

    EllipticCurveType(int i) {
        this.value = i;
    }

    public static EllipticCurveType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_CURVE;
        }
        if (i == 2) {
            return NIST_P256;
        }
        if (i == 3) {
            return NIST_P384;
        }
        if (i == 4) {
            return NIST_P521;
        }
        if (i != 5) {
            return null;
        }
        return CURVE25519;
    }

    public static rotuma.wireman<EllipticCurveType> internalGetValueMap() {
        return f22078kowloon;
    }

    public static rotuma.marial internalGetVerifier() {
        return saneness.f22079attabal;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rotuma.dern
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EllipticCurveType valueOf(int i) {
        return forNumber(i);
    }
}

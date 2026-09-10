package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.rotuma;

/* JADX INFO: loaded from: classes3.dex */
public enum HashType implements rotuma.dern {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public static final int SHA1_VALUE = 1;
    public static final int SHA224_VALUE = 5;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final rotuma.wireman<HashType> f22081kowloon = new rotuma.wireman<HashType>() { // from class: com.google.crypto.tink.proto.HashType.attabal
        @Override // com.google.crypto.tink.shaded.protobuf.rotuma.wireman
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public HashType findValueByNumber(int i) {
            return HashType.forNumber(i);
        }
    };
    private final int value;

    public static final class saneness implements rotuma.marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final rotuma.marial f22082attabal = new saneness();

        @Override // com.google.crypto.tink.shaded.protobuf.rotuma.marial
        public boolean isInRange(int i) {
            return HashType.forNumber(i) != null;
        }
    }

    HashType(int i) {
        this.value = i;
    }

    public static HashType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    public static rotuma.wireman<HashType> internalGetValueMap() {
        return f22081kowloon;
    }

    public static rotuma.marial internalGetVerifier() {
        return saneness.f22082attabal;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rotuma.dern
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HashType valueOf(int i) {
        return forNumber(i);
    }
}

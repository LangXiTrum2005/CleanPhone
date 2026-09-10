package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.rotuma;

/* JADX INFO: loaded from: classes3.dex */
public enum OutputPrefixType implements rotuma.dern {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);

    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    public static final int WITH_ID_REQUIREMENT_VALUE = 5;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final rotuma.wireman<OutputPrefixType> f22091kowloon = new rotuma.wireman<OutputPrefixType>() { // from class: com.google.crypto.tink.proto.OutputPrefixType.attabal
        @Override // com.google.crypto.tink.shaded.protobuf.rotuma.wireman
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public OutputPrefixType findValueByNumber(int i) {
            return OutputPrefixType.forNumber(i);
        }
    };
    private final int value;

    public static final class saneness implements rotuma.marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final rotuma.marial f22092attabal = new saneness();

        @Override // com.google.crypto.tink.shaded.protobuf.rotuma.marial
        public boolean isInRange(int i) {
            return OutputPrefixType.forNumber(i) != null;
        }
    }

    OutputPrefixType(int i) {
        this.value = i;
    }

    public static OutputPrefixType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i == 4) {
            return CRUNCHY;
        }
        if (i != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    public static rotuma.wireman<OutputPrefixType> internalGetValueMap() {
        return f22091kowloon;
    }

    public static rotuma.marial internalGetVerifier() {
        return saneness.f22092attabal;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rotuma.dern
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OutputPrefixType valueOf(int i) {
        return forNumber(i);
    }
}

package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.rotuma;

/* JADX INFO: loaded from: classes3.dex */
public enum KeyStatusType implements rotuma.dern {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final rotuma.wireman<KeyStatusType> f22088kowloon = new rotuma.wireman<KeyStatusType>() { // from class: com.google.crypto.tink.proto.KeyStatusType.attabal
        @Override // com.google.crypto.tink.shaded.protobuf.rotuma.wireman
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public KeyStatusType findValueByNumber(int i) {
            return KeyStatusType.forNumber(i);
        }
    };
    private final int value;

    public static final class saneness implements rotuma.marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final rotuma.marial f22089attabal = new saneness();

        @Override // com.google.crypto.tink.shaded.protobuf.rotuma.marial
        public boolean isInRange(int i) {
            return KeyStatusType.forNumber(i) != null;
        }
    }

    KeyStatusType(int i) {
        this.value = i;
    }

    public static KeyStatusType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    public static rotuma.wireman<KeyStatusType> internalGetValueMap() {
        return f22088kowloon;
    }

    public static rotuma.marial internalGetVerifier() {
        return saneness.f22089attabal;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rotuma.dern
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static KeyStatusType valueOf(int i) {
        return forNumber(i);
    }
}

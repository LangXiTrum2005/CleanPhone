package p002kotlin.reflect.jvm.internal.impl.metadata;

import p002kotlin.reflect.jvm.internal.impl.protobuf.impromptu;

/* JADX INFO: loaded from: classes5.dex */
public enum ProtoBuf$Visibility implements impromptu.attabal {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);


    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static impromptu.saneness<ProtoBuf$Visibility> f31023kowloon = new impromptu.saneness<ProtoBuf$Visibility>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility.attabal
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.saneness
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Visibility findValueByNumber(int i) {
            return ProtoBuf$Visibility.valueOf(i);
        }
    };
    private final int value;

    ProtoBuf$Visibility(int i, int i2) {
        this.value = i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.attabal
    public final int getNumber() {
        return this.value;
    }

    public static ProtoBuf$Visibility valueOf(int i) {
        if (i == 0) {
            return INTERNAL;
        }
        if (i == 1) {
            return PRIVATE;
        }
        if (i == 2) {
            return PROTECTED;
        }
        if (i == 3) {
            return PUBLIC;
        }
        if (i == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i != 5) {
            return null;
        }
        return LOCAL;
    }
}

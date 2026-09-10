package p002kotlin.reflect.jvm.internal.impl.metadata;

import p002kotlin.reflect.jvm.internal.impl.protobuf.impromptu;

/* JADX INFO: loaded from: classes5.dex */
public enum ProtoBuf$Modality implements impromptu.attabal {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);


    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static impromptu.saneness<ProtoBuf$Modality> f30908kowloon = new impromptu.saneness<ProtoBuf$Modality>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality.attabal
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.saneness
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$Modality findValueByNumber(int i) {
            return ProtoBuf$Modality.valueOf(i);
        }
    };
    private final int value;

    ProtoBuf$Modality(int i, int i2) {
        this.value = i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.attabal
    public final int getNumber() {
        return this.value;
    }

    public static ProtoBuf$Modality valueOf(int i) {
        if (i == 0) {
            return FINAL;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return ABSTRACT;
        }
        if (i != 3) {
            return null;
        }
        return SEALED;
    }
}

package p002kotlin.reflect.jvm.internal.impl.metadata;

import p002kotlin.reflect.jvm.internal.impl.protobuf.impromptu;

/* JADX INFO: loaded from: classes5.dex */
public enum ProtoBuf$MemberKind implements impromptu.attabal {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);


    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static impromptu.saneness<ProtoBuf$MemberKind> f30906kowloon = new impromptu.saneness<ProtoBuf$MemberKind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind.attabal
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.saneness
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public ProtoBuf$MemberKind findValueByNumber(int i) {
            return ProtoBuf$MemberKind.valueOf(i);
        }
    };
    private final int value;

    ProtoBuf$MemberKind(int i, int i2) {
        this.value = i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.impromptu.attabal
    public final int getNumber() {
        return this.value;
    }

    public static ProtoBuf$MemberKind valueOf(int i) {
        if (i == 0) {
            return DECLARATION;
        }
        if (i == 1) {
            return FAKE_OVERRIDE;
        }
        if (i == 2) {
            return DELEGATION;
        }
        if (i != 3) {
            return null;
        }
        return SYNTHESIZED;
    }
}

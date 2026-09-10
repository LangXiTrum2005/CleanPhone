package com.google.common.collect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class BoundType {
    public static final BoundType X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final BoundType f19795Y;
    public static final /* synthetic */ BoundType[] Z;

    static {
        BoundType boundType = new BoundType("OPEN", 0);
        X = boundType;
        BoundType boundType2 = new BoundType("CLOSED", 1);
        f19795Y = boundType2;
        Z = new BoundType[]{boundType, boundType2};
    }

    public static BoundType a(boolean z2) {
        return z2 ? f19795Y : X;
    }

    public static BoundType valueOf(String str) {
        return (BoundType) Enum.valueOf(BoundType.class, str);
    }

    public static BoundType[] values() {
        return (BoundType[]) Z.clone();
    }
}

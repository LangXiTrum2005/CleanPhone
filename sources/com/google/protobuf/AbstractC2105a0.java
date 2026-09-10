package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC2105a0 {
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

    static {
        int[] iArr = new int[WireFormat.JavaType.values().length];
        $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr;
        try {
            iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.ENUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}

package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC2133o0 {
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

    static {
        int[] iArr = new int[WireFormat.FieldType.values().length];
        $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
        try {
            iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

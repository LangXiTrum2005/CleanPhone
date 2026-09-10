package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2115f0 implements Internal.MapAdapter.Converter {
    final /* synthetic */ Internal.EnumLiteMap val$enumMap;
    final /* synthetic */ Internal.EnumLite val$unrecognizedValue;

    public C2115f0(Internal.EnumLiteMap enumLiteMap, Internal.EnumLite enumLite) {
        this.val$enumMap = enumLiteMap;
        this.val$unrecognizedValue = enumLite;
    }

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public Integer doBackward(Internal.EnumLite enumLite) {
        return Integer.valueOf(enumLite.getNumber());
    }

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public Internal.EnumLite doForward(Integer num) {
        Internal.EnumLite enumLiteFindValueByNumber = this.val$enumMap.findValueByNumber(num.intValue());
        return enumLiteFindValueByNumber == null ? this.val$unrecognizedValue : enumLiteFindValueByNumber;
    }
}

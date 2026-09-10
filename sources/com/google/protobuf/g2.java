package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g2 implements Internal.MapAdapter.Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Internal.EnumLiteMap f24844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Internal.EnumLite f24845b;

    public g2(Internal.EnumLiteMap enumLiteMap, Internal.EnumLite enumLite) {
        this.f24844a = enumLiteMap;
        this.f24845b = enumLite;
    }

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public final Object doBackward(Object obj) {
        return Integer.valueOf(((Internal.EnumLite) obj).getNumber());
    }

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public final Object doForward(Object obj) {
        Internal.EnumLite enumLiteFindValueByNumber = this.f24844a.findValueByNumber(((Integer) obj).intValue());
        return enumLiteFindValueByNumber == null ? this.f24845b : enumLiteFindValueByNumber;
    }
}

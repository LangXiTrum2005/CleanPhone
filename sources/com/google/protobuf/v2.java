package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24968a;

    static {
        int[] iArr = new int[WireFormat.FieldType.values().length];
        f24968a = iArr;
        try {
            iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f24968a[WireFormat.FieldType.ENUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f24968a[WireFormat.FieldType.GROUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24776a;

    static {
        int[] iArr = new int[WireFormat.JavaType.values().length];
        f24776a = iArr;
        try {
            iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f24776a[WireFormat.JavaType.ENUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}

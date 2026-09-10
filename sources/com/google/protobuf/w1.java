package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f24987b;

    static {
        int[] iArr = new int[JavaType.values().length];
        f24987b = iArr;
        try {
            iArr[JavaType.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f24987b[JavaType.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f24987b[JavaType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[x1.values().length];
        f24986a = iArr2;
        try {
            iArr2[3] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f24986a[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f24986a[0] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24873a;

    static {
        int[] iArr = new int[WireFormat.FieldType.values().length];
        f24873a = iArr;
        try {
            iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f24873a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f24873a[WireFormat.FieldType.INT64.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f24873a[WireFormat.FieldType.UINT64.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f24873a[WireFormat.FieldType.INT32.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f24873a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f24873a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f24873a[WireFormat.FieldType.BOOL.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f24873a[WireFormat.FieldType.UINT32.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f24873a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f24873a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f24873a[WireFormat.FieldType.SINT32.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f24873a[WireFormat.FieldType.SINT64.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f24873a[WireFormat.FieldType.ENUM.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f24873a[WireFormat.FieldType.BYTES.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f24873a[WireFormat.FieldType.STRING.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f24873a[WireFormat.FieldType.GROUP.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            f24873a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
    }
}

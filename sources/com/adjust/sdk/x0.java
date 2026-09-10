package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7063a;

    static {
        int[] iArr = new int[ActivityKind.values().length];
        f7063a = iArr;
        try {
            iArr[ActivityKind.SESSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f7063a[ActivityKind.CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f7063a[ActivityKind.ATTRIBUTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f7063a[ActivityKind.EVENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f7063a[ActivityKind.PURCHASE_VERIFICATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f7063a[ActivityKind.THIRD_PARTY_SHARING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

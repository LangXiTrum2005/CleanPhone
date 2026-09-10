package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6846a;

    static {
        int[] iArr = new int[ActivityKind.values().length];
        f6846a = iArr;
        try {
            iArr[ActivityKind.SESSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6846a[ActivityKind.EVENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6846a[ActivityKind.CLICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6846a[ActivityKind.ATTRIBUTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6846a[ActivityKind.INFO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6846a[ActivityKind.GDPR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f6846a[ActivityKind.AD_REVENUE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f6846a[ActivityKind.SUBSCRIPTION.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f6846a[ActivityKind.THIRD_PARTY_SHARING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f6846a[ActivityKind.MEASUREMENT_CONSENT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f6846a[ActivityKind.PURCHASE_VERIFICATION.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
    }
}

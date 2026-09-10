package com.bytedance.adsdk.ud;

/* JADX INFO: loaded from: classes.dex */
public enum exc {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.exc$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[exc.values().length];
            qdl = iArr;
            try {
                iArr[exc.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[exc.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[exc.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean qdl(int i2, boolean z2, int i3) {
        int i4 = AnonymousClass1.qdl[ordinal()];
        if (i4 == 1) {
            return false;
        }
        if (i4 != 2) {
            return (z2 && i2 < 28) || i3 > 4 || i2 <= 25;
        }
        return true;
    }
}

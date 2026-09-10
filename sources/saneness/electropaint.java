package saneness;

import com.google.android.libraries.ads.mobile.sdk.common.AdChoicesPlacement;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class electropaint {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final /* synthetic */ int[] f37137attabal;

    static {
        int[] iArr = new int[AdChoicesPlacement.values().length];
        try {
            iArr[AdChoicesPlacement.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdChoicesPlacement.BOTTOM_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AdChoicesPlacement.BOTTOM_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AdChoicesPlacement.TOP_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f37137attabal = iArr;
    }
}

package saneness;

import com.google.android.libraries.ads.mobile.sdk.common.AdChoicesPlacement;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class unhat {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final /* synthetic */ int[] f37353attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final /* synthetic */ int[] f37354dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final /* synthetic */ int[] f37355saneness;

    static {
        int[] iArr = new int[NativeAd.SwipeGestureDirection.values().length];
        try {
            iArr[NativeAd.SwipeGestureDirection.RIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeAd.SwipeGestureDirection.LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NativeAd.SwipeGestureDirection.UP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NativeAd.SwipeGestureDirection.DOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f37353attabal = iArr;
        int[] iArr2 = new int[AdChoicesPlacement.values().length];
        try {
            iArr2[AdChoicesPlacement.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AdChoicesPlacement.TOP_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[AdChoicesPlacement.BOTTOM_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[AdChoicesPlacement.BOTTOM_LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f37355saneness = iArr2;
        int[] iArr3 = new int[NativeAd.NativeMediaAspectRatio.values().length];
        try {
            iArr3[NativeAd.NativeMediaAspectRatio.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[NativeAd.NativeMediaAspectRatio.ANY.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[NativeAd.NativeMediaAspectRatio.LANDSCAPE.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[NativeAd.NativeMediaAspectRatio.PORTRAIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[NativeAd.NativeMediaAspectRatio.SQUARE.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        f37354dern = iArr3;
    }
}

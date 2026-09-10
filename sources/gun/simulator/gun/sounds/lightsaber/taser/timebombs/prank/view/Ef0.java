package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerErrorCode;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class Ef0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3032a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
        d = iArr;
        try {
            iArr[UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            d[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            d[UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            d[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            d[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            d[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            d[UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[UnityAds.UnityAdsLoadError.values().length];
        c = iArr2;
        try {
            iArr2[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            c[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            c[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            c[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            c[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        int[] iArr3 = new int[UnityAds.UnityAdsInitializationError.values().length];
        b = iArr3;
        try {
            iArr3[UnityAds.UnityAdsInitializationError.INTERNAL_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            b[UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            b[UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        int[] iArr4 = new int[BannerErrorCode.values().length];
        f3032a = iArr4;
        try {
            iArr4[BannerErrorCode.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f3032a[BannerErrorCode.NATIVE_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            f3032a[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            f3032a[BannerErrorCode.NO_FILL.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
    }
}

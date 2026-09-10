package com.unity3d.services.banners;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.UnityAdsErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class BannerErrorInfo {
    public BannerErrorCode errorCode;
    public String errorMessage;
    public int publicErrorCode;

    /* JADX INFO: renamed from: com.unity3d.services.banners.BannerErrorInfo$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError;
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError;
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$banners$BannerErrorCode;

        static {
            int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError = iArr;
            try {
                iArr[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.EXPIRED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[UnityAds.UnityAdsLoadError.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError = iArr2;
            try {
                iArr2[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr3 = new int[BannerErrorCode.values().length];
            $SwitchMap$com$unity3d$services$banners$BannerErrorCode = iArr3;
            try {
                iArr3[BannerErrorCode.NATIVE_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$BannerErrorCode[BannerErrorCode.NO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$BannerErrorCode[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public BannerErrorInfo(String str, BannerErrorCode bannerErrorCode) {
        this.errorCode = bannerErrorCode;
        this.errorMessage = str;
    }

    public static BannerErrorInfo fromLoadError(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[unityAdsLoadError.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return new BannerErrorInfo(str, BannerErrorCode.NATIVE_ERROR);
        }
        if (i10 != 4) {
            return i10 != 5 ? new BannerErrorInfo(str, BannerErrorCode.UNKNOWN) : new BannerErrorInfo(str, BannerErrorCode.NO_FILL);
        }
        return new BannerErrorInfo(str, BannerErrorCode.WEBVIEW_ERROR);
    }

    public static BannerErrorInfo fromShowError(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        switch (AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[unityAdsShowError.ordinal()]) {
            case 1:
                return new BannerErrorInfo(UnityAdsErrorKt.getShowErrorMsg(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN), BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN_VALUE);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return new BannerErrorInfo(UnityAdsErrorKt.getShowErrorMsg(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL), BannerErrorCode.WEBVIEW_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL_VALUE);
            case 8:
                return new BannerErrorInfo(UnityAdsErrorKt.getShowErrorMsg(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT), BannerErrorCode.NATIVE_ERROR, 2);
            case 9:
                return new BannerErrorInfo(UnityAdsErrorKt.getShowErrorMsg(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_EXPIRED), BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_EXPIRED_VALUE);
            default:
                return new BannerErrorInfo(str, BannerErrorCode.UNKNOWN, 0);
        }
    }

    public UnityAds.UnityAdsLoadError toLoadError() {
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$services$banners$BannerErrorCode[this.errorCode.ordinal()];
        if (i10 == 1) {
            return UnityAds.UnityAdsLoadError.INVALID_ARGUMENT;
        }
        if (i10 != 2) {
            return i10 != 3 ? UnityAds.UnityAdsLoadError.INTERNAL_ERROR : UnityAds.UnityAdsLoadError.INTERNAL_ERROR;
        }
        return UnityAds.UnityAdsLoadError.NO_FILL;
    }

    public BannerErrorInfo(String str, BannerErrorCode bannerErrorCode, int i10) {
        this.errorCode = bannerErrorCode;
        this.errorMessage = str;
        this.publicErrorCode = i10;
    }

    public static BannerErrorInfo fromLoadError(UnityAdsError unityAdsError) {
        return new BannerErrorInfo(unityAdsError.getMessage(), BannerErrorCode.NATIVE_ERROR, unityAdsError.getCode());
    }
}

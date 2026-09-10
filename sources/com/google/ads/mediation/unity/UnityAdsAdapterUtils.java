package com.google.ads.mediation.unity;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class UnityAdsAdapterUtils {

    public enum AdEvent {
        LOADED,
        OPENED,
        CLICKED,
        CLOSED,
        LEFT_APPLICATION,
        IMPRESSION,
        VIDEO_START,
        REWARD,
        VIDEO_COMPLETE
    }

    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f19116attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final /* synthetic */ int[] f19117dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f19118saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final /* synthetic */ int[] f19119wireman;

        static {
            int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
            f19119wireman = iArr;
            try {
                iArr[UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19119wireman[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19119wireman[UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19119wireman[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19119wireman[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19119wireman[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19119wireman[UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19119wireman[UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[UnityAds.UnityAdsLoadError.values().length];
            f19117dern = iArr2;
            try {
                iArr2[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19117dern[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19117dern[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19117dern[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19117dern[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[UnityAds.UnityAdsInitializationError.values().length];
            f19118saneness = iArr3;
            try {
                iArr3[UnityAds.UnityAdsInitializationError.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19118saneness[UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19118saneness[UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr4 = new int[BannerErrorCode.values().length];
            f19116attabal = iArr4;
            try {
                iArr4[BannerErrorCode.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19116attabal[BannerErrorCode.NATIVE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f19116attabal[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f19116attabal[BannerErrorCode.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public static boolean areValidIds(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? false : true;
    }

    public static AdError attabal(int i, String str) {
        return new AdError(i, str, "com.unity3d.ads");
    }

    public static int beachfront(UnityAds.UnityAdsInitializationError unityAdsInitializationError) {
        int i = attabal.f19118saneness[unityAdsInitializationError.ordinal()];
        if (i == 1) {
            return 301;
        }
        if (i == 2) {
            return 302;
        }
        if (i != 3) {
            return AdSize.MEDIUM_RECTANGLE_WIDTH;
        }
        return 303;
    }

    public static int competently(UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i = attabal.f19117dern[unityAdsLoadError.ordinal()];
        if (i == 1) {
            return 401;
        }
        if (i == 2) {
            return TTAdConstant.AD_ID_IS_NULL_CODE;
        }
        if (i == 3) {
            return 403;
        }
        if (i != 4) {
            return i != 5 ? 400 : 405;
        }
        return 404;
    }

    public static boolean cutely(RequestConfiguration requestConfiguration) {
        int tagForChildDirectedTreatment = requestConfiguration.getTagForChildDirectedTreatment();
        int tagForUnderAgeOfConsent = requestConfiguration.getTagForUnderAgeOfConsent();
        if (tagForChildDirectedTreatment == 1 || tagForUnderAgeOfConsent == 1) {
            return false;
        }
        return tagForChildDirectedTreatment == 0 || tagForUnderAgeOfConsent == 0;
    }

    public static AdError dern(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        return attabal(competently(unityAdsLoadError), str);
    }

    public static UnityBannerSize getUnityBannerSize(Context context, AdSize adSize, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AdSize.BANNER);
        arrayList.add(AdSize.LEADERBOARD);
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize != null) {
            return new UnityBannerSize(adSizeFindClosestSize.getWidth(), adSizeFindClosestSize.getHeight());
        }
        if (z) {
            return new UnityBannerSize(adSize.getWidth(), adSize.getHeight());
        }
        return null;
    }

    public static int impromptu(UnityAds.UnityAdsShowError unityAdsShowError) {
        switch (attabal.f19119wireman[unityAdsShowError.ordinal()]) {
            case 1:
                return 501;
            case 2:
                return 502;
            case 3:
                return PglCryptUtils.COMPRESS_FAILED;
            case 4:
                return PglCryptUtils.BASE64_FAILED;
            case 5:
                return 505;
            case 6:
                return 506;
            case 7:
                return PglCryptUtils.UNKNOWN_ERR;
            case 8:
                return IronSourceError.ERROR_CODE_INIT_FAILED;
            default:
                return 500;
        }
    }

    public static AdFormat marial(RtbSignalData rtbSignalData) {
        Iterator<MediationConfiguration> it = rtbSignalData.getConfigurations().iterator();
        if (it.hasNext()) {
            return it.next().getFormat();
        }
        return null;
    }

    public static AdError saneness(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        return attabal(beachfront(unityAdsInitializationError), str);
    }

    public static void setUnityAdsPrivacy(RequestConfiguration requestConfiguration, MetaData metaData) {
        if (cutely(requestConfiguration)) {
            metaData.set("user.nonbehavioral", Boolean.FALSE);
        } else {
            metaData.set("user.nonbehavioral", Boolean.TRUE);
        }
        metaData.commit();
    }

    public static int taiyuan(BannerErrorInfo bannerErrorInfo) {
        int i = attabal.f19116attabal[bannerErrorInfo.errorCode.ordinal()];
        if (i == 1) {
            return 201;
        }
        if (i == 2) {
            return 202;
        }
        if (i != 3) {
            return i != 4 ? 200 : 204;
        }
        return 203;
    }

    public static AdError wireman(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        return attabal(impromptu(unityAdsShowError), str);
    }
}

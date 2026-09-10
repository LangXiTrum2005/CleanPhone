package com.p004ironsource.mediationsdk.utils;

import android.support.v4.media.a;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public class ErrorBuilder {
    private static IronSourceError a() {
        return buildGenericError("Mediation - wrong configuration");
    }

    public static IronSourceError adContainerIsNull(String str) {
        return new IronSourceError(IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, a.m(str, " banner container is null"));
    }

    public static IronSourceError buildCappedPerPlacementError(String str) {
        return new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
    }

    public static IronSourceError buildCappedPerSessionError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CAPPED_PER_SESSION, a.m(str, " Show Fail - Networks have reached their cap per session"));
    }

    public static IronSourceError buildGenericError(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "An error occurred";
        }
        return new IronSourceError(510, str);
    }

    public static IronSourceError buildInitFailedError(String str) {
        StringBuilder sb = new StringBuilder("Init failed - ");
        if (TextUtils.isEmpty(str)) {
            str = "unknown error";
        }
        sb.append(str);
        return new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, sb.toString());
    }

    public static IronSourceError buildInvalidConfigurationError(String str) {
        return new IronSourceError(501, a.n("", str, " Init Fail - Configurations from the server are not valid"));
    }

    public static IronSourceError buildInvalidCredentialsError(String str, String str2, String str3) {
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("Init Fail - ", str, " value ", str2, " is not valid");
        sbQ.append(!TextUtils.isEmpty(str3) ? a.C(" - ", str3) : "");
        return new IronSourceError(506, sbQ.toString());
    }

    public static IronSourceError buildInvalidKeyValueError(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return a();
        }
        StringBuilder sbY = a.y("Mediation - ", str, " value is not valid ");
        sbY.append(!TextUtils.isEmpty(str2) ? a.C(" - ", str2) : "");
        return new IronSourceError(506, sbY.toString());
    }

    public static IronSourceError buildKeyNotSetError(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return a();
        }
        return new IronSourceError(505, str3 + " Mediation - " + str + " is not set for " + str2);
    }

    public static IronSourceError buildLoadFailedError(String str) {
        return new IronSourceError(510, TextUtils.isEmpty(str) ? "Load failed due to an unknown error" : a.C("Load failed - ", str));
    }

    public static IronSourceError buildNoAdsToShowError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, a.m(str, " Show Fail - No ads to show"));
    }

    public static IronSourceError buildNoConfigurationAvailableError(String str) {
        return new IronSourceError(501, a.n("", str, " Init Fail - Unable to retrieve configurations from the server"));
    }

    public static IronSourceError buildNoInternetConnectionInitFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, a.n("", str, " Init Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionLoadFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, a.n("", str, " Load Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionShowFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, a.n("", str, " Show Fail - No Internet connection"));
    }

    public static IronSourceError buildNonExistentInstanceError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, a.m(str, " The requested instance does not exist"));
    }

    public static IronSourceError buildShowFailedError(String str, String str2) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, a.D(str, " Show Fail - ", str2));
    }

    public static IronSourceError buildUsingCachedConfigurationError(String str, String str2) {
        return new IronSourceError(502, a.o("Mediation - Unable to retrieve configurations from IronSource server, using cached configurations with appKey:", str, " and userId:", str2));
    }

    public static IronSourceError unsupportedBannerSize(String str) {
        return new IronSourceError(IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, a.m(str, " unsupported banner size"));
    }

    public static IronSourceError buildInitFailedError(String str, String str2) {
        return new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, TextUtils.isEmpty(str) ? a.m(str2, " init failed due to an unknown error") : a.D(str2, " - ", str));
    }

    public static IronSourceError buildLoadFailedError(String str, String str2, String str3) {
        String strR = a.r(a.y("", str, " Load Fail"), TextUtils.isEmpty(str2) ? "" : a.C(" ", str2), " - ");
        if (TextUtils.isEmpty(str3)) {
            str3 = "unknown error";
        }
        return new IronSourceError(510, a.m(strR, str3));
    }
}

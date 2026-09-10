package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d5.u;
import defpackage.e;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ErrorBuilder {
    private static IronSourceError a() {
        return buildGenericError("Mediation - wrong configuration");
    }

    public static IronSourceError adContainerIsNull(String str) {
        return new IronSourceError(IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, d.h(str, " banner container is null"));
    }

    public static IronSourceError buildCappedPerPlacementError(String str) {
        return new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
    }

    public static IronSourceError buildCappedPerSessionError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CAPPED_PER_SESSION, d.h(str, " Show Fail - Networks have reached their cap per session"));
    }

    public static IronSourceError buildGenericError(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "An error occurred";
        }
        return new IronSourceError(510, str);
    }

    public static IronSourceError buildInitFailedError(String str, String str2) {
        return new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, TextUtils.isEmpty(str) ? d.h(str2, " init failed due to an unknown error") : d.i(str2, " - ", str));
    }

    public static IronSourceError buildInvalidConfigurationError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE, e.o("", str, " Init Fail - Configurations from the server are not valid"));
    }

    public static IronSourceError buildInvalidCredentialsError(String str, String str2, String str3) {
        StringBuilder sbV = e.v("Init Fail - ", str, " value ", str2, " is not valid");
        sbV.append(!TextUtils.isEmpty(str3) ? e.n(" - ", str3) : "");
        return new IronSourceError(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, sbV.toString());
    }

    public static IronSourceError buildInvalidKeyValueError(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return a();
        }
        StringBuilder sbK = u.k("Mediation - ", str, " value is not valid ");
        sbK.append(!TextUtils.isEmpty(str2) ? e.n(" - ", str2) : "");
        return new IronSourceError(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, sbK.toString());
    }

    public static IronSourceError buildKeyNotSetError(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return a();
        }
        return new IronSourceError(IronSourceError.ERROR_CODE_KEY_NOT_SET, str3 + " Mediation - " + str + " is not set for " + str2);
    }

    public static IronSourceError buildLoadFailedError(String str, String str2, String str3) {
        String strQ = e.q(TextUtils.isEmpty(str2) ? "" : e.n(" ", str2), " - ", u.k("", str, " Load Fail"));
        if (TextUtils.isEmpty(str3)) {
            str3 = "unknown error";
        }
        return new IronSourceError(510, d.h(strQ, str3));
    }

    public static IronSourceError buildNoAdsToShowError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, d.h(str, " Show Fail - No ads to show"));
    }

    public static IronSourceError buildNoConfigurationAvailableError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE, e.o("", str, " Init Fail - Unable to retrieve configurations from the server"));
    }

    public static IronSourceError buildNoInternetConnectionInitFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, e.o("", str, " Init Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionLoadFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, e.o("", str, " Load Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionShowFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, e.o("", str, " Show Fail - No Internet connection"));
    }

    public static IronSourceError buildNonExistentInstanceError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, d.h(str, " The requested instance does not exist"));
    }

    public static IronSourceError buildShowFailedError(String str, String str2) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, d.i(str, " Show Fail - ", str2));
    }

    public static IronSourceError buildUsingCachedConfigurationError(String str, String str2) {
        return new IronSourceError(IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION, l1.d.g("Mediation - Unable to retrieve configurations from IronSource server, using cached configurations with appKey:", str, " and userId:", str2));
    }

    public static IronSourceError unsupportedBannerSize(String str) {
        return new IronSourceError(IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, d.h(str, " unsupported banner size"));
    }

    public static IronSourceError buildInitFailedError(String str) {
        StringBuilder sb2 = new StringBuilder("Init failed - ");
        if (TextUtils.isEmpty(str)) {
            str = "unknown error";
        }
        sb2.append(str);
        return new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, sb2.toString());
    }

    public static IronSourceError buildLoadFailedError(String str) {
        return new IronSourceError(510, TextUtils.isEmpty(str) ? "Load failed due to an unknown error" : e.n("Load failed - ", str));
    }
}

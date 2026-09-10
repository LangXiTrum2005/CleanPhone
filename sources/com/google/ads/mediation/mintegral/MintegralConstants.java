package com.google.ads.mediation.mintegral;

import com.google.android.gms.ads.AdError;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralConstants {
    public static final String AD_UNIT_ID = "ad_unit_id";
    public static final String APP_ID = "app_id";
    public static final String APP_KEY = "app_key";
    public static final int ERROR_BANNER_SIZE_UNSUPPORTED = 102;
    public static final int ERROR_CODE_AD_ALREADY_LOADED = 106;
    public static final int ERROR_CODE_NO_FILL = 104;
    public static final int ERROR_CODE_SDK_INIT_FAILED = 105;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.mintegral";
    public static final int ERROR_INVALID_BID_RESPONSE = 103;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_MINTEGRAL_SDK = 100;
    public static final String ERROR_MSG_AD_ALREADY_LOADED = "An ad for the Mintegral slot is already loaded and is yet to be shown.";
    public static final String MINTEGRAL_SDK_ERROR_DOMAIN = "com.mbridge.msdk";
    public static final String PLACEMENT_ID = "placement_id";

    @Retention(RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    public static AdError createAdapterError(int i, String str) {
        return new AdError(i, str, "com.google.ads.mediation.mintegral");
    }

    public static AdError createSdkError(int i, String str) {
        return new AdError(i, str, "com.mbridge.msdk");
    }
}

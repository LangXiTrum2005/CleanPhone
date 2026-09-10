package sg.bigo.ads.api;

/* JADX INFO: loaded from: classes7.dex */
public class AdError {
    public static final int ERROR_AD_LIFE_CYCLE_CLICK = 3;
    public static final int ERROR_AD_LIFE_CYCLE_IMPRESSION = 2;
    public static final int ERROR_AD_LIFE_CYCLE_RENDER = 1;
    public static final int ERROR_AD_LIFE_CYCLE_UNKNOWN = 0;
    public static final int ERROR_CODE_ACTIVITY_CREATE_ERROR = 2005;
    public static final int ERROR_CODE_AD_DISABLE = 1002;
    public static final int ERROR_CODE_AD_EXPIRED = 2000;
    public static final int ERROR_CODE_APP_ID_UNMATCHED = 1007;
    public static final int ERROR_CODE_ASSETS_ERROR = 1006;
    public static final int ERROR_CODE_FULLSCREEN_AD_FAILED_TO_OPEN = 2004;
    public static final int ERROR_CODE_FULLSCREEN_AD_FAILED_TO_SHOW = 2003;
    public static final int ERROR_CODE_INTERNAL_ERROR = 1005;
    public static final int ERROR_CODE_INVALID_REQUEST = 1001;
    public static final int ERROR_CODE_NATIVE_VIEW_MISSING = 2001;
    public static final int ERROR_CODE_NETWORK_ERROR = 1003;
    public static final int ERROR_CODE_NO_FILL = 1004;
    public static final int ERROR_CODE_TIMEOUT_STRATEGY = 1011;
    public static final int ERROR_CODE_UNINITIALIZED = 1000;
    public static final int ERROR_CODE_VIDEO_ERROR = 2002;
    private final int errorCode;
    private final String errorMsg;
    private final int subErrorCode;

    public AdError(int i2, int i3, String str) {
        this.errorCode = i2;
        this.subErrorCode = i3;
        this.errorMsg = str;
    }

    public int getCode() {
        return this.errorCode;
    }

    public String getMessage() {
        return this.errorMsg;
    }

    public int getSubCode() {
        return this.subErrorCode;
    }

    public AdError(int i2, String str) {
        this.errorCode = i2;
        this.errorMsg = str;
        this.subErrorCode = 0;
    }
}

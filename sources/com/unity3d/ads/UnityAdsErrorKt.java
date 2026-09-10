package com.unity3d.ads;

import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u0001*\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0001\u001a\f\u0010\u001a\u001a\u0004\u0018\u00010\u0001*\u00020\u0018\u001a\n\u0010\u001b\u001a\u00020\u0001*\u00020\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"BOLD_LOAD_FAIL_MSG_PREF", "", "MSG_BOLD_LOAD_FAIL_INSUFFICIENT_STORAGE", "MSG_BOLD_LOAD_FAIL_NETWORK_ERROR", "MSG_BOLD_LOAD_FAIL_NO_FILL", "MSG_BOLD_LOAD_FAIL_PARSING_ERROR", "MSG_BOLD_LOAD_FAIL_PLACEMENT_NOT_FOUND", "MSG_BOLD_LOAD_FAIL_PROTO_ERROR", "MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED", "MSG_BOLD_LOAD_FAIL_TIME_OUT", "MSG_BOLD_LOAD_FAIL_UNSUPPORTED_PLACEMENT", "MSG_BOLD_SHOW_FAIL_AD_OBJECT_EXPIRED", "MSG_BOLD_SHOW_FAIL_ALREADY_SHOWING", "MSG_BOLD_SHOW_FAIL_INTERNAL_ERROR", "MSG_BOLD_SHOW_FAIL_TIMEOUT", "MSG_INIT_FAIL_GAME_NOT_FOUND", "MSG_INIT_FAIL_INSUFFICIENT_STORAGE", "MSG_INIT_FAIL_NETWORK_ERROR", "MSG_INIT_FAIL_PARSING_ERROR", "MSG_INIT_FAIL_SYSTEM_ERROR", "MSG_INIT_FAIL_TIMEOUT", "MSG_INIT_FAIL_UNKNOWN_ERROR", "MSG_INIT_FAIL_WRONG_PLATFORM", "getInitErrorMsg", "Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", AndroidGetAdPlayerContext.KEY_GAME_ID, "getLoadErrorMsg", "getShowErrorMsg", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class UnityAdsErrorKt {
    private static final String BOLD_LOAD_FAIL_MSG_PREF = "Unity Ads SDK ad load failed:";
    public static final String MSG_BOLD_LOAD_FAIL_INSUFFICIENT_STORAGE = "Unity Ads SDK ad load failed: Insufficient storage space on the device. Free up space and try again.";
    public static final String MSG_BOLD_LOAD_FAIL_NETWORK_ERROR = "Unity Ads SDK ad load failed: Network error occurred. Check your network connection and try again later.";
    public static final String MSG_BOLD_LOAD_FAIL_NO_FILL = "Unity Ads SDK ad load failed: No ad fill available for the requested placement.";
    public static final String MSG_BOLD_LOAD_FAIL_PARSING_ERROR = "Unity Ads SDK ad load failed: Internal error occurred while parsing ad response.";
    public static final String MSG_BOLD_LOAD_FAIL_PLACEMENT_NOT_FOUND = "Unity Ads SDK ad load failed: Placement not found. Use the correct placement ID from your Unity Ads Monetization dashboard.";
    public static final String MSG_BOLD_LOAD_FAIL_PROTO_ERROR = "Unity Ads SDK ad load failed: Internal protocol error occurred. Try again later.";
    public static final String MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED = "Unity Ads SDK ad load failed: The Unity Ads SDK is not initialized. Initialize the SDK before loading ads.";
    public static final String MSG_BOLD_LOAD_FAIL_TIME_OUT = "Unity Ads SDK ad load failed: Request timed out. Check your network connection and try again later.\n";
    public static final String MSG_BOLD_LOAD_FAIL_UNSUPPORTED_PLACEMENT = "Unity Ads SDK ad load failed: The placement ID doesn’t match the ad format or the placement type. Check your placement settings in the Monetization dashboard.";
    public static final String MSG_BOLD_SHOW_FAIL_AD_OBJECT_EXPIRED = "Unity Ads SDK ad show failed: The ad has expired. Load a new ad.";
    public static final String MSG_BOLD_SHOW_FAIL_ALREADY_SHOWING = "Unity Ads SDK ad show failed: An ad is already being shown. Wait until the current ad finishes before showing a new one.";
    public static final String MSG_BOLD_SHOW_FAIL_INTERNAL_ERROR = "Unity Ads SDK ad show failed: Internal error occurred.";
    public static final String MSG_BOLD_SHOW_FAIL_TIMEOUT = "Unity Ads SDK ad show failed: Request timed out. Check your network connection and try again later.";
    public static final String MSG_INIT_FAIL_GAME_NOT_FOUND = "Invalid Game ID: %s. Verify the Game ID in your Unity Ads Monetization dashboard.";
    public static final String MSG_INIT_FAIL_INSUFFICIENT_STORAGE = "Unity Ads SDK initialization failed: Insufficient storage space on the device. Free up space and try again.";
    public static final String MSG_INIT_FAIL_NETWORK_ERROR = "Unity Ads SDK initialization failed: Network error occurred. Check your network connection and try again later.";
    public static final String MSG_INIT_FAIL_PARSING_ERROR = "Unity Ads SDK initialization failed: Internal protocol error occurred.Try again later.";
    public static final String MSG_INIT_FAIL_SYSTEM_ERROR = "Unity Ads SDK initialization failed: System error occurred. Try again later.";
    public static final String MSG_INIT_FAIL_TIMEOUT = "Unity Ads SDK initialization failed: Request timed out. Check your network connection and try again later.";
    public static final String MSG_INIT_FAIL_UNKNOWN_ERROR = "Unity Ads SDK initialization failed: Unknown error occurred.";
    public static final String MSG_INIT_FAIL_WRONG_PLATFORM = "Unity Ads SDK initialization failed: Game ID mismatch. Use the correct Game ID for the target platform from your Unity Ads Monetization dashboard.";

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorOuterClass.PublicErrorCode.values().length];
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_PLACEMENT_NOT_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_PROTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_UNSUPPORTED_PLACEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_FILE_SYSTEM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_ADVIEWER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_NOT_FOUND.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_MISMATCHED_PLATFORM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_PROTO.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_INTERNAL_SYSTEM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_NETWORK.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_FILE_SYSTEM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_EXPIRED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getInitErrorMsg(ErrorOuterClass.PublicErrorCode publicErrorCode, String str) {
        n.f(publicErrorCode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[publicErrorCode.ordinal()];
        if (i10 == 1) {
            return MSG_INIT_FAIL_TIMEOUT;
        }
        switch (i10) {
            case 10:
                return MSG_INIT_FAIL_UNKNOWN_ERROR;
            case 11:
                return e.o("Invalid Game ID: ", str, ". Verify the Game ID in your Unity Ads Monetization dashboard.");
            case 12:
                return MSG_INIT_FAIL_WRONG_PLATFORM;
            case 13:
                return MSG_INIT_FAIL_PARSING_ERROR;
            case 14:
                return MSG_INIT_FAIL_SYSTEM_ERROR;
            case 15:
                return MSG_INIT_FAIL_NETWORK_ERROR;
            case 16:
                return MSG_INIT_FAIL_INSUFFICIENT_STORAGE;
            default:
                return null;
        }
    }

    public static /* synthetic */ String getInitErrorMsg$default(ErrorOuterClass.PublicErrorCode publicErrorCode, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return getInitErrorMsg(publicErrorCode, str);
    }

    public static final String getLoadErrorMsg(ErrorOuterClass.PublicErrorCode publicErrorCode) {
        n.f(publicErrorCode, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[publicErrorCode.ordinal()]) {
            case 1:
                return MSG_BOLD_LOAD_FAIL_TIME_OUT;
            case 2:
                return MSG_BOLD_LOAD_FAIL_NO_FILL;
            case 3:
                return MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED;
            case 4:
                return MSG_BOLD_LOAD_FAIL_PLACEMENT_NOT_FOUND;
            case 5:
                return MSG_BOLD_LOAD_FAIL_PROTO_ERROR;
            case 6:
                return MSG_BOLD_LOAD_FAIL_UNSUPPORTED_PLACEMENT;
            case 7:
                return MSG_BOLD_LOAD_FAIL_NETWORK_ERROR;
            case 8:
                return MSG_BOLD_LOAD_FAIL_INSUFFICIENT_STORAGE;
            case 9:
                return MSG_BOLD_LOAD_FAIL_PARSING_ERROR;
            default:
                return null;
        }
    }

    public static final String getShowErrorMsg(ErrorOuterClass.PublicErrorCode publicErrorCode) {
        n.f(publicErrorCode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[publicErrorCode.ordinal()];
        if (i10 == 1) {
            return MSG_BOLD_SHOW_FAIL_TIMEOUT;
        }
        if (i10 != 17) {
            return i10 != 18 ? MSG_BOLD_SHOW_FAIL_INTERNAL_ERROR : MSG_BOLD_SHOW_FAIL_ALREADY_SHOWING;
        }
        return MSG_BOLD_SHOW_FAIL_AD_OBJECT_EXPIRED;
    }
}

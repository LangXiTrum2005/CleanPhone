package com.tiktok.util;

/* JADX INFO: loaded from: classes6.dex */
public class TTConst {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ApiErrorCodes {
        public static final /* synthetic */ ApiErrorCodes[] X = {new ApiErrorCodes("PARTIAL_SUCCESS", 0), new ApiErrorCodes("API_ERROR", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ApiErrorCodes EF5;

        public static ApiErrorCodes valueOf(String str) {
            return (ApiErrorCodes) Enum.valueOf(ApiErrorCodes.class, str);
        }

        public static ApiErrorCodes[] values() {
            return (ApiErrorCodes[]) X.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AutoEvents {
        public static final /* synthetic */ AutoEvents[] X = {new AutoEvents("InstallApp", 0), new AutoEvents("SecondDayRetention", 1), new AutoEvents("LaunchAPP", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        AutoEvents EF5;

        public static AutoEvents valueOf(String str) {
            return (AutoEvents) Enum.valueOf(AutoEvents.class, str);
        }

        public static AutoEvents[] values() {
            return (AutoEvents[]) X.clone();
        }
    }
}

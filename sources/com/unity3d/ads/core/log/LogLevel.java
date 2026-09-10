package com.unity3d.ads.core.log;

import com.applovin.sdk.AppLovinEventTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/log/LogLevel;", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "", "(Ljava/lang/String;II)V", "getLevel$unity_ads_defaultRelease", "()I", "toAndroidLogLevel", "DISABLED", "ERROR", "INFO", "DEBUG", "TRACE", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum LogLevel {
    DISABLED(0),
    ERROR(1),
    INFO(2),
    DEBUG(3),
    TRACE(4);

    private final int level;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevel.values().length];
            try {
                iArr[LogLevel.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevel.TRACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    LogLevel(int i2) {
        this.level = i2;
    }

    /* JADX INFO: renamed from: getLevel$unity_ads_defaultRelease, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    public final int toAndroidLogLevel() {
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            return Integer.MAX_VALUE;
        }
        if (i2 == 2) {
            return 6;
        }
        if (i2 == 3) {
            return 4;
        }
        if (i2 == 4) {
            return 3;
        }
        if (i2 == 5) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}

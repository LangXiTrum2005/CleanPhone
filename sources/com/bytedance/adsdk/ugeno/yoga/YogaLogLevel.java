package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);

    private final int wd;

    YogaLogLevel(int i2) {
        this.wd = i2;
    }

    public static YogaLogLevel fromInt(int i2) {
        if (i2 == 0) {
            return ERROR;
        }
        if (i2 == 1) {
            return WARN;
        }
        if (i2 == 2) {
            return INFO;
        }
        if (i2 == 3) {
            return DEBUG;
        }
        if (i2 == 4) {
            return VERBOSE;
        }
        if (i2 == 5) {
            return FATAL;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i2)));
    }
}

package com.kochava.tracker.log;

import com.kochava.core.log.internal.Logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class LogLevel {
    public static final LogLevel X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final LogLevel f28246Y;
    public static final LogLevel Z;
    public static final LogLevel e0;
    public static final LogLevel f0;
    public static final LogLevel g0;
    public static final /* synthetic */ LogLevel[] h0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28247a;

        static {
            int[] iArr = new int[LogLevel.values().length];
            f28247a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28247a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28247a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28247a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28247a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28247a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        LogLevel logLevel = new LogLevel("NONE", 0);
        X = logLevel;
        LogLevel logLevel2 = new LogLevel("ERROR", 1);
        f28246Y = logLevel2;
        LogLevel logLevel3 = new LogLevel("WARN", 2);
        Z = logLevel3;
        LogLevel logLevel4 = new LogLevel("INFO", 3);
        e0 = logLevel4;
        LogLevel logLevel5 = new LogLevel("DEBUG", 4);
        f0 = logLevel5;
        LogLevel logLevel6 = new LogLevel("TRACE", 5);
        g0 = logLevel6;
        h0 = new LogLevel[]{logLevel, logLevel2, logLevel3, logLevel4, logLevel5, logLevel6};
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) h0.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i2;
        int i3 = a.f28247a[ordinal()];
        if (i3 != 1) {
            i2 = 6;
            if (i3 != 2) {
                if (i3 == 3) {
                    i2 = 5;
                } else if (i3 != 5) {
                    i2 = i3 != 6 ? 4 : 2;
                } else {
                    i2 = 3;
                }
            }
        } else {
            i2 = 7;
        }
        return Logger.b(i2, true);
    }
}

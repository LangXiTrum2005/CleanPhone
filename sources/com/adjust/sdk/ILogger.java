package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface ILogger {
    void Assert(String str, Object... objArr);

    void debug(String str, Object... objArr);

    void error(String str, Object... objArr);

    void info(String str, Object... objArr);

    void lockLogLevel();

    void setLogLevel(LogLevel logLevel, boolean z10);

    void setLogLevelString(String str, boolean z10);

    void verbose(String str, Object... objArr);

    void warn(String str, Object... objArr);

    void warnInProduction(String str, Object... objArr);
}

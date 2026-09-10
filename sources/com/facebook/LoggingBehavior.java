package com.facebook;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/LoggingBehavior;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class LoggingBehavior {
    public static final LoggingBehavior X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final LoggingBehavior f15954Y;
    public static final LoggingBehavior Z;
    public static final LoggingBehavior e0;
    public static final LoggingBehavior f0;
    public static final LoggingBehavior g0;
    public static final LoggingBehavior h0;
    public static final LoggingBehavior i0;
    public static final /* synthetic */ LoggingBehavior[] j0;

    static {
        LoggingBehavior loggingBehavior = new LoggingBehavior("REQUESTS", 0);
        X = loggingBehavior;
        LoggingBehavior loggingBehavior2 = new LoggingBehavior("INCLUDE_ACCESS_TOKENS", 1);
        f15954Y = loggingBehavior2;
        LoggingBehavior loggingBehavior3 = new LoggingBehavior("INCLUDE_RAW_RESPONSES", 2);
        Z = loggingBehavior3;
        LoggingBehavior loggingBehavior4 = new LoggingBehavior("CACHE", 3);
        e0 = loggingBehavior4;
        LoggingBehavior loggingBehavior5 = new LoggingBehavior("APP_EVENTS", 4);
        f0 = loggingBehavior5;
        LoggingBehavior loggingBehavior6 = new LoggingBehavior("DEVELOPER_ERRORS", 5);
        g0 = loggingBehavior6;
        LoggingBehavior loggingBehavior7 = new LoggingBehavior("GRAPH_API_DEBUG_WARNING", 6);
        h0 = loggingBehavior7;
        LoggingBehavior loggingBehavior8 = new LoggingBehavior("GRAPH_API_DEBUG_INFO", 7);
        i0 = loggingBehavior8;
        j0 = new LoggingBehavior[]{loggingBehavior, loggingBehavior2, loggingBehavior3, loggingBehavior4, loggingBehavior5, loggingBehavior6, loggingBehavior7, loggingBehavior8};
    }

    public static LoggingBehavior valueOf(String str) {
        return (LoggingBehavior) Enum.valueOf(LoggingBehavior.class, str);
    }

    public static LoggingBehavior[] values() {
        return (LoggingBehavior[]) j0.clone();
    }
}

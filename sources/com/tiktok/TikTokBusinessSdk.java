package com.tiktok;

import com.tiktok.appevents.TTCrashHandler;
import com.tiktok.util.TTLogger;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class TikTokBusinessSdk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f42660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LogLevel f42661b;

    /* JADX INFO: renamed from: com.tiktok.TikTokBusinessSdk$1, reason: invalid class name */
    final class AnonymousClass1 implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            TTLogger tTLogger = TTCrashHandler.f42665a;
            if (th != null) {
                Throwable th2 = null;
                loop0: for (Throwable cause = th; cause != null && cause != th2; cause = cause.getCause()) {
                    StackTraceElement[] stackTrace = cause.getStackTrace();
                    if (stackTrace != null) {
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            if (stackTraceElement.getClassName().startsWith("com.tiktok")) {
                                String str = TikTokBusinessSdk.f42660a;
                                TTCrashHandler.a("com.tiktok.TikTokBusinessSdk", th);
                                break loop0;
                            }
                        }
                    }
                    th2 = cause;
                }
            }
            String str2 = TikTokBusinessSdk.f42660a;
        }
    }

    public interface CrashListener {
    }

    public interface DiskStatusListener {
    }

    public interface FetchDeferredDeeplinkCompletion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LogLevel {
        public static final LogLevel X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ LogLevel[] f42662Y;

        /* JADX INFO: Fake field, exist only in values array */
        LogLevel EF0;

        static {
            LogLevel logLevel = new LogLevel("NONE", 0);
            LogLevel logLevel2 = new LogLevel("INFO", 1);
            X = logLevel2;
            f42662Y = new LogLevel[]{logLevel, logLevel2, new LogLevel("WARN", 2), new LogLevel("DEBUG", 3)};
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) f42662Y.clone();
        }
    }

    public interface MemoryListener {
    }

    public interface NetworkListener {
    }

    public interface NextTimeFlushListener {
    }

    public static class TTConfig {
    }

    public interface TTInitCallback {
    }

    static {
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        f42660a = "v1.2";
        f42661b = LogLevel.X;
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        UUID.randomUUID().toString();
    }

    public static void a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) Arrays.copyOfRange(stackTrace, 3, stackTrace.length);
        TTLogger tTLogger = TTCrashHandler.f42665a;
        if (stackTraceElementArr == null) {
            return;
        }
        int length = stackTraceElementArr.length;
        for (int i2 = 0; i2 < length && !stackTraceElementArr[i2].getClassName().startsWith("com.tiktok"); i2++) {
        }
    }
}

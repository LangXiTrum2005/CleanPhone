package com.chartboost.heliumsdk.utils;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.x4;
import com.smartdigimkt.q8.i;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002%&B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006J\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010 \u001a\u00020\u0004H\u0000¢\u0006\u0002\b!J\u0010\u0010\"\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006J\u0010\u0010#\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006J\u0010\u0010$\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u000f8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006'"}, d2 = {"Lcom/chartboost/heliumsdk/utils/LogController;", "", "()V", "STACK_TRACE_LEVEL", "", "TAG", "", "debugMode", "", "getDebugMode$annotations", "getDebugMode", "()Z", "setDebugMode", "(Z)V", "logLevel", "Lcom/chartboost/heliumsdk/utils/LogController$LogLevel;", "getLogLevel", "()Lcom/chartboost/heliumsdk/utils/LogController$LogLevel;", "setLogLevel", "(Lcom/chartboost/heliumsdk/utils/LogController$LogLevel;)V", "serverLogLevelOverride", "getServerLogLevelOverride$Helium_release", "setServerLogLevelOverride$Helium_release", "buildLogMsg", "stackTraceElements", "Lcom/chartboost/heliumsdk/utils/LogController$StackTraceElements;", PglCryptUtils.KEY_MESSAGE, "buildLogMsg$Helium_release", "d", "", "e", "getClassAndMethod", "stackTraceLevel", "getClassAndMethod$Helium_release", i.f37957c, "v", "w", "LogLevel", "StackTraceElements", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LogController {
    public static final int STACK_TRACE_LEVEL = 5;
    public static final String TAG = "[Helium]";
    private static boolean debugMode;
    private static LogLevel serverLogLevelOverride;
    public static final LogController INSTANCE = new LogController();
    private static LogLevel logLevel = LogLevel.INFO;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/chartboost/heliumsdk/utils/LogController$LogLevel;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int value;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/chartboost/heliumsdk/utils/LogController$LogLevel$Companion;", "", "()V", "fromInt", "Lcom/chartboost/heliumsdk/utils/LogController$LogLevel;", "logLevelInt", "", "(Ljava/lang/Integer;)Lcom/chartboost/heliumsdk/utils/LogController$LogLevel;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:13:0x001e  */
            /* JADX WARN: Code duplicated, block: B:15:0x0021 A[RETURN] */
            public final LogLevel fromInt(Integer logLevelInt) {
                for (LogLevel logLevel : LogLevel.values()) {
                    int value = logLevel.getValue();
                    if (logLevelInt != null && value == logLevelInt.intValue()) {
                        if (logLevel == null) {
                            return LogLevel.VERBOSE;
                        }
                        return logLevel;
                    }
                }
                logLevel = null;
                if (logLevel == null) {
                    return LogLevel.VERBOSE;
                }
                return logLevel;
            }

            private Companion() {
            }
        }

        LogLevel(int i2) {
            this.value = i2;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/chartboost/heliumsdk/utils/LogController$StackTraceElements;", "", "className", "", "methodName", "(Ljava/lang/String;Ljava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "getMethodName", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StackTraceElements {
        private final String className;
        private final String methodName;

        public StackTraceElements(String className, String methodName) {
            Intrinsics.f(className, "className");
            Intrinsics.f(methodName, "methodName");
            this.className = className;
            this.methodName = methodName;
        }

        public static /* synthetic */ StackTraceElements copy$default(StackTraceElements stackTraceElements, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = stackTraceElements.className;
            }
            if ((i2 & 2) != 0) {
                str2 = stackTraceElements.methodName;
            }
            return stackTraceElements.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getClassName() {
            return this.className;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMethodName() {
            return this.methodName;
        }

        public final StackTraceElements copy(String className, String methodName) {
            Intrinsics.f(className, "className");
            Intrinsics.f(methodName, "methodName");
            return new StackTraceElements(className, methodName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StackTraceElements)) {
                return false;
            }
            StackTraceElements stackTraceElements = (StackTraceElements) other;
            return Intrinsics.a(this.className, stackTraceElements.className) && Intrinsics.a(this.methodName, stackTraceElements.methodName);
        }

        public final String getClassName() {
            return this.className;
        }

        public final String getMethodName() {
            return this.methodName;
        }

        public int hashCode() {
            return this.methodName.hashCode() + (this.className.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("StackTraceElements(className=");
            sb.append(this.className);
            sb.append(", methodName=");
            return androidx.media3.extractor.text.ttml.a.p(sb, this.methodName, ')');
        }
    }

    private LogController() {
    }

    public static /* synthetic */ StackTraceElements getClassAndMethod$Helium_release$default(LogController logController, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 5;
        }
        return logController.getClassAndMethod$Helium_release(i2);
    }

    @Deprecated
    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public final String buildLogMsg$Helium_release(StackTraceElements stackTraceElements, String message) {
        String str;
        Intrinsics.f(message, "message");
        StringBuilder sb = new StringBuilder();
        if (stackTraceElements != null) {
            str = stackTraceElements.getClassName() + '.' + stackTraceElements.getMethodName() + "():";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(message);
        return sb.toString();
    }

    public final void d(String message) {
        if (getLogLevel().getValue() >= LogLevel.DEBUG.getValue() && message != null) {
            LogController logController = INSTANCE;
            Log.d(TAG, logController.buildLogMsg$Helium_release(getClassAndMethod$Helium_release$default(logController, 0, 1, null), message));
        }
    }

    public final void e(String message) {
        if (getLogLevel().getValue() >= LogLevel.ERROR.getValue() && message != null) {
            LogController logController = INSTANCE;
            Log.e(TAG, logController.buildLogMsg$Helium_release(getClassAndMethod$Helium_release$default(logController, 0, 1, null), message));
        }
    }

    public final StackTraceElements getClassAndMethod$Helium_release(int stackTraceLevel) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= stackTraceLevel) {
            return null;
        }
        String className = stackTrace[stackTraceLevel].getClassName();
        Intrinsics.e(className, "this[stackTraceLevel].className");
        String strQ = StringsKt.Q('.', className, className);
        String methodName = stackTrace[stackTraceLevel].getMethodName();
        Intrinsics.e(methodName, "this[stackTraceLevel].methodName");
        return new StackTraceElements(strQ, methodName);
    }

    public final boolean getDebugMode() {
        return debugMode;
    }

    public final LogLevel getLogLevel() {
        LogLevel logLevel2 = serverLogLevelOverride;
        return logLevel2 == null ? logLevel : logLevel2;
    }

    public final LogLevel getServerLogLevelOverride$Helium_release() {
        return serverLogLevelOverride;
    }

    public final void i(String message) {
        if (getLogLevel().getValue() >= LogLevel.INFO.getValue() && message != null) {
            LogController logController = INSTANCE;
            Log.i(TAG, logController.buildLogMsg$Helium_release(getClassAndMethod$Helium_release$default(logController, 0, 1, null), message));
        }
    }

    public final void setDebugMode(boolean z2) {
        debugMode = z2;
    }

    public final void setLogLevel(LogLevel logLevel2) {
        Intrinsics.f(logLevel2, "<set-?>");
        logLevel = logLevel2;
    }

    public final void setServerLogLevelOverride$Helium_release(LogLevel logLevel2) {
        serverLogLevelOverride = logLevel2;
    }

    public final void v(String message) {
        if (getLogLevel().getValue() >= LogLevel.VERBOSE.getValue() && message != null) {
            LogController logController = INSTANCE;
            Log.v(TAG, logController.buildLogMsg$Helium_release(getClassAndMethod$Helium_release$default(logController, 0, 1, null), message));
        }
    }

    public final void w(String message) {
        if (getLogLevel().getValue() >= LogLevel.WARNING.getValue() && message != null) {
            LogController logController = INSTANCE;
            Log.w(TAG, logController.buildLogMsg$Helium_release(getClassAndMethod$Helium_release$default(logController, 0, 1, null), message));
        }
    }
}

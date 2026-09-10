package com.ironsource.mediationsdk.logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class IronSourceLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f29587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29588b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int GENERAL = 4;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    public IronSourceLogger(String str) {
        this.f29588b = str;
        this.f29587a = 0;
    }

    public int a() {
        return this.f29587a;
    }

    public String b() {
        return this.f29588b;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof IronSourceLogger)) {
            IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
            String str = this.f29588b;
            if (str != null && str.equals(ironSourceLogger.f29588b)) {
                return true;
            }
        }
        return false;
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i10);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th2);

    public void setDebugLevel(int i10) {
        this.f29587a = i10;
    }

    public IronSourceLogger(String str, int i10) {
        this.f29588b = str;
        this.f29587a = i10;
    }
}

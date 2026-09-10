package com.p004ironsource.mediationsdk.logger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class IronSourceLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f25937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25938b;

    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int GENERAL = 4;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

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
        this.f25938b = str;
        this.f25937a = 0;
    }

    public int a() {
        return this.f25937a;
    }

    public String b() {
        return this.f25938b;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof IronSourceLogger)) {
            IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
            String str = this.f25938b;
            if (str != null && str.equals(ironSourceLogger.f25938b)) {
                return true;
            }
        }
        return false;
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i2);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th);

    public void setDebugLevel(int i2) {
        this.f25937a = i2;
    }

    public IronSourceLogger(String str, int i2) {
        this.f25938b = str;
        this.f25937a = i2;
    }
}

package com.p004ironsource.mediationsdk.logger;

import com.p004ironsource.mm;

/* JADX INFO: loaded from: classes5.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    IronSourceLogger.IronSourceTag f25934a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f25934a = ironSourceTag;
    }

    public void error() {
        IronSourceLoggerManager.getLogger().a(this.f25934a, new mm("", 3));
    }

    public void general() {
        IronSourceLoggerManager.getLogger().a(this.f25934a, new mm("", 4));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().a(this.f25934a, new mm("", 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().a(this.f25934a, new mm("", 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().a(this.f25934a, new mm("", 2));
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().a(this.f25934a, new mm(str, 3));
    }

    public void general(String str) {
        IronSourceLoggerManager.getLogger().a(this.f25934a, new mm(str, 4));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().a(this.f25934a, new mm(str, 1));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().a(this.f25934a, new mm(str, 0));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().a(this.f25934a, new mm(str, 2));
    }
}

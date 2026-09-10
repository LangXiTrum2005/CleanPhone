package com.ironsource.mediationsdk.logger;

import com.ironsource.C0356gb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
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
    IronSourceLogger.IronSourceTag f29584a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f29584a = ironSourceTag;
    }

    public void error(String str, Throwable th2) {
        IronSourceLoggerManager.getLogger().a(this.f29584a, new C0356gb(str, 3), th2);
    }

    public void general(String str) {
        IronSourceLoggerManager.getLogger().a(this.f29584a, new C0356gb(str, 4));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().a(this.f29584a, new C0356gb(str, 1));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().a(this.f29584a, new C0356gb(str, 0));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().a(this.f29584a, new C0356gb(str, 2));
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().a(this.f29584a, new C0356gb(str, 3));
    }

    public void general() {
        IronSourceLoggerManager.getLogger().a(this.f29584a, new C0356gb("", 4));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().a(this.f29584a, new C0356gb("", 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().a(this.f29584a, new C0356gb("", 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().a(this.f29584a, new C0356gb("", 2));
    }

    public void error() {
        IronSourceLoggerManager.getLogger().a(this.f29584a, new C0356gb("", 3));
    }
}

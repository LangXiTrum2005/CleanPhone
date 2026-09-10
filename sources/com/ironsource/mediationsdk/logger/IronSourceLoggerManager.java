package com.ironsource.mediationsdk.logger;

import com.ironsource.C0356gb;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class IronSourceLoggerManager extends IronSourceLogger {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile IronSourceLoggerManager f29591d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<IronSourceLogger> f29592c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.f29592c = new CopyOnWriteArrayList();
        c();
    }

    private void c() {
        this.f29592c.add(new a(0));
    }

    public static IronSourceLoggerManager getLogger() {
        if (f29591d == null) {
            synchronized (IronSourceLoggerManager.class) {
                try {
                    if (f29591d == null) {
                        f29591d = new IronSourceLoggerManager("IronSourceLoggerManager");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f29591d;
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, C0356gb c0356gb) {
        if (a(c0356gb.a())) {
            return;
        }
        a(ironSourceTag, c0356gb.c(), c0356gb.a());
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f29592c.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    @Deprecated(forRemoval = true, since = "8.3.0")
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        if (a(i10)) {
            return;
        }
        a(ironSourceTag, str, i10);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th2) {
        if (th2 == null) {
            Iterator<IronSourceLogger> it = this.f29592c.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = this.f29592c.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th2);
            }
        }
    }

    public void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        log(ironSourceTag, str, i10);
    }

    public void setLoggerDebugLevel(String str, int i10) {
        if (str == null) {
            return;
        }
        IronSourceLogger ironSourceLoggerA = a(str);
        if (ironSourceLoggerA == null) {
            log(IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
            return;
        }
        if (i10 < 0 || i10 > 3) {
            this.f29592c.remove(ironSourceLoggerA);
            return;
        }
        log(IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
        ironSourceLoggerA.setDebugLevel(i10);
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, C0356gb c0356gb, Throwable th2) {
        if (a(c0356gb.a())) {
            return;
        }
        logException(ironSourceTag, c0356gb.c(), th2);
    }

    private IronSourceLoggerManager(String str, int i10) {
        super(str, i10);
        this.f29592c = new CopyOnWriteArrayList();
        c();
    }

    private boolean a(int i10) {
        return i10 < this.f29587a;
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        for (IronSourceLogger ironSourceLogger : this.f29592c) {
            if (ironSourceLogger.a() <= i10) {
                ironSourceLogger.log(ironSourceTag, str, i10);
            }
        }
    }

    public static IronSourceLoggerManager getLogger(int i10) {
        IronSourceLoggerManager logger = getLogger();
        logger.f29587a = i10;
        return logger;
    }

    private IronSourceLogger a(String str) {
        for (IronSourceLogger ironSourceLogger : this.f29592c) {
            if (ironSourceLogger.b().equals(str)) {
                return ironSourceLogger;
            }
        }
        return null;
    }
}

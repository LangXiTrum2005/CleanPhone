package com.p004ironsource.mediationsdk.logger;

import com.p004ironsource.mm;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceLoggerManager extends IronSourceLogger implements LogListener {
    private static volatile IronSourceLoggerManager d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<IronSourceLogger> f25941c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.f25941c = new CopyOnWriteArrayList();
        c();
    }

    private IronSourceLogger a(String str) {
        for (IronSourceLogger ironSourceLogger : this.f25941c) {
            if (ironSourceLogger.b().equals(str)) {
                return ironSourceLogger;
            }
        }
        return null;
    }

    private void c() {
        this.f25941c.add(new a(0));
    }

    public static IronSourceLoggerManager getLogger() {
        if (d == null) {
            synchronized (IronSourceLoggerManager.class) {
                try {
                    if (d == null) {
                        d = new IronSourceLoggerManager("IronSourceLoggerManager");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f25941c.add(ironSourceLogger);
    }

    @Override // com.p004ironsource.mediationsdk.logger.IronSourceLogger
    @Deprecated(forRemoval = true, since = "8.3.0")
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i2) {
        if (a(i2)) {
            return;
        }
        a(ironSourceTag, str, i2);
    }

    @Override // com.p004ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th == null) {
            Iterator<IronSourceLogger> it = this.f25941c.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = this.f25941c.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th);
            }
        }
    }

    @Override // com.p004ironsource.mediationsdk.logger.LogListener
    public void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i2) {
        log(ironSourceTag, str, i2);
    }

    public void setLoggerDebugLevel(String str, int i2) {
        if (str == null) {
            return;
        }
        IronSourceLogger ironSourceLoggerA = a(str);
        if (ironSourceLoggerA == null) {
            log(IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i2 + ")", 0);
            return;
        }
        if (i2 < 0 || i2 > 3) {
            this.f25941c.remove(ironSourceLoggerA);
            return;
        }
        log(IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i2 + ")", 0);
        ironSourceLoggerA.setDebugLevel(i2);
    }

    private IronSourceLoggerManager(String str, int i2) {
        super(str, i2);
        this.f25941c = new CopyOnWriteArrayList();
        c();
    }

    public static IronSourceLoggerManager getLogger(int i2) {
        IronSourceLoggerManager logger = getLogger();
        logger.f25937a = i2;
        return logger;
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, mm mmVar) {
        if (a(mmVar.getLogLevel())) {
            return;
        }
        a(ironSourceTag, mmVar.c(), mmVar.getLogLevel());
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i2) {
        for (IronSourceLogger ironSourceLogger : this.f25941c) {
            if (ironSourceLogger.a() <= i2) {
                ironSourceLogger.log(ironSourceTag, str, i2);
            }
        }
    }

    private boolean a(int i2) {
        return i2 < this.f25937a;
    }
}

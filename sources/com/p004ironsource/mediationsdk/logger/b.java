package com.p004ironsource.mediationsdk.logger;

import com.p004ironsource.environment.thread.IronSourceThreadManager;

/* JADX INFO: loaded from: classes5.dex */
public class b extends IronSourceLogger {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f25943e = "publisher";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LogListener f25944c;
    private boolean d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceLogger.IronSourceTag f25946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f25947c;

        public a(String str, IronSourceLogger.IronSourceTag ironSourceTag, int i2) {
            this.f25945a = str;
            this.f25946b = ironSourceTag;
            this.f25947c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f25944c == null || this.f25945a == null) {
                return;
            }
            b.this.f25944c.onLog(this.f25946b, this.f25945a, this.f25947c);
        }
    }

    private b() {
        super("publisher");
    }

    @Override // com.p004ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i2) {
        a aVar = new a(str, ironSourceTag, i2);
        if (this.d) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(aVar);
        } else {
            IronSourceThreadManager.INSTANCE.postPublisherCallback(aVar);
        }
    }

    @Override // com.p004ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }

    public b(LogListener logListener, int i2) {
        super("publisher", i2);
        this.f25944c = logListener;
        this.d = false;
    }

    public void a(LogListener logListener) {
        this.f25944c = logListener;
    }

    public void a(boolean z2) {
        this.d = z2;
    }
}

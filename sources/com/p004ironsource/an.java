package com.p004ironsource;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.sdk.SegmentListener;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public class an implements SegmentListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SegmentListener f24383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f24384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f24385c;

    public class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f24386a;

        private b() {
        }

        public Handler a() {
            return this.f24386a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f24386a = new Handler();
            Looper.loop();
        }
    }

    public an() {
        b bVar = new b();
        this.f24384b = bVar;
        bVar.start();
        this.f24385c = new Date().getTime();
    }

    @Override // com.p004ironsource.mediationsdk.sdk.SegmentListener
    public void onSegmentReceived(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, android.support.v4.media.a.n("onSegmentReceived(", str, ")"), 1);
        if (a((Object) this.f24383a)) {
            a((Runnable) new G0(2, this, str));
        }
    }

    public void a(SegmentListener segmentListener) {
        this.f24383a = segmentListener;
    }

    public void a(Runnable runnable) {
        Handler handlerA;
        b bVar = this.f24384b;
        if (bVar == null || (handlerA = bVar.a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f24383a.onSegmentReceived(str);
    }

    public boolean a(Object obj) {
        return (obj == null || this.f24384b == null) ? false : true;
    }
}

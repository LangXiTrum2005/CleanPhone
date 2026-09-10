package com.ironsource.mediationsdk;

import com.ironsource.C0299d8;
import com.ironsource.C0651x2;
import com.ironsource.Md;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final l f29573f = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f29574a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Boolean> f29575b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29578e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSource.a f29579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f29580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29581c;

        public a(IronSource.a aVar, IronSourceError ironSourceError, String str) {
            this.f29579a = aVar;
            this.f29580b = ironSourceError;
            this.f29581c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            l.this.a(this.f29579a, this.f29580b);
            l.this.f29575b.put(this.f29581c, Boolean.FALSE);
        }
    }

    private l() {
    }

    public static synchronized l a() {
        return f29573f;
    }

    public synchronized void b(IronSource.a aVar, IronSourceError ironSourceError) {
        if (b(aVar)) {
            return;
        }
        String string = aVar.toString();
        if (!this.f29574a.containsKey(string)) {
            a(aVar, ironSourceError);
            return;
        }
        long jA = ((long) a(aVar)) * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f29574a.get(string).longValue();
        if (jCurrentTimeMillis > jA) {
            a(aVar, ironSourceError);
            return;
        }
        this.f29575b.put(string, Boolean.TRUE);
        long j10 = jA - jCurrentTimeMillis;
        IronLog.INTERNAL.verbose("delaying callback by " + j10);
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(aVar, ironSourceError, string), j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSource.a aVar, IronSourceError ironSourceError) {
        this.f29574a.put(aVar.toString(), Long.valueOf(System.currentTimeMillis()));
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            Md.a().a(ironSourceError);
            return;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            C0299d8.a().a(ironSourceError);
            return;
        }
        if (aVar == IronSource.a.BANNER) {
            C0651x2.a().a(ironSourceError);
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
    }

    public void a(IronSource.a aVar, int i10) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            this.f29577d = i10;
            return;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            this.f29576c = i10;
            return;
        }
        if (aVar == IronSource.a.BANNER) {
            this.f29578e = i10;
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
    }

    public synchronized boolean b(IronSource.a aVar) {
        if (!this.f29575b.containsKey(aVar.toString())) {
            return false;
        }
        return this.f29575b.get(aVar.toString()).booleanValue();
    }

    private int a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return this.f29577d;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return this.f29576c;
        }
        if (aVar == IronSource.a.BANNER) {
            return this.f29578e;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 0;
    }
}

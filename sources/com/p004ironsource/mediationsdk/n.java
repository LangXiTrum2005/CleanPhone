package com.p004ironsource.mediationsdk;

import com.p004ironsource.ah;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.fr;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.t5;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class n {
    private static final n f = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f25979a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Boolean> f25980b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25981c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25982e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSource.AD_UNIT f25983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f25984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25985c;

        public a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError, String str) {
            this.f25983a = ad_unit;
            this.f25984b = ironSourceError;
            this.f25985c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            n.this.a(this.f25983a, this.f25984b);
            n.this.f25980b.put(this.f25985c, Boolean.FALSE);
        }
    }

    private n() {
    }

    private int a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.d;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.f25981c;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.f25982e;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return 0;
    }

    public synchronized void b(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        if (b(ad_unit)) {
            return;
        }
        String string = ad_unit.toString();
        if (!this.f25979a.containsKey(string)) {
            a(ad_unit, ironSourceError);
            return;
        }
        long jA = ((long) a(ad_unit)) * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f25979a.get(string).longValue();
        if (jCurrentTimeMillis > jA) {
            a(ad_unit, ironSourceError);
            return;
        }
        this.f25980b.put(string, Boolean.TRUE);
        long j = jA - jCurrentTimeMillis;
        IronLog.INTERNAL.verbose("delaying callback by " + j);
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(ad_unit, ironSourceError, string), j);
    }

    public static synchronized n a() {
        return f;
    }

    public synchronized boolean b(IronSource.AD_UNIT ad_unit) {
        if (!this.f25980b.containsKey(ad_unit.toString())) {
            return false;
        }
        return this.f25980b.get(ad_unit.toString()).booleanValue();
    }

    public void a(IronSource.AD_UNIT ad_unit, int i2) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.d = i2;
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f25981c = i2;
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.f25982e = i2;
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        this.f25979a.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            fr.a().a(ironSourceError);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            ah.a().a(ironSourceError);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            t5.a().a(ironSourceError);
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
    }
}

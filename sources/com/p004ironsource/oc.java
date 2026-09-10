package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class oc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f26359e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f26360a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC3374o f26362c;
    private zm d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            if (oc.this.f26362c != null) {
                oc.this.f26362c.a();
            }
        }
    }

    public oc(int i2, InterfaceC3374o interfaceC3374o) {
        this.f26362c = interfaceC3374o;
        this.f26361b = i2;
    }

    public boolean b() {
        return this.f26361b > 0;
    }

    public void a() {
        if (!b() || this.d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.d.e();
        this.d = null;
    }

    public void a(long j) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.f26361b) - Math.max(j, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.f26362c.a();
                return;
            }
            a();
            this.d = new zm(millis, this.f26360a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }
}

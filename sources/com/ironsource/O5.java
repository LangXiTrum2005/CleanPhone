package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class O5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f26690e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f26691a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0487o f26693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0660xb f26694d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            InterfaceC0487o interfaceC0487o = O5.this.f26693c;
            if (interfaceC0487o != null) {
                interfaceC0487o.a();
            }
        }
    }

    public O5(int i10, InterfaceC0487o interfaceC0487o) {
        this.f26693c = interfaceC0487o;
        this.f26692b = i10;
    }

    public boolean b() {
        return this.f26692b > 0;
    }

    public void a(long j10) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.f26692b) - Math.max(j10, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.f26693c.a();
                return;
            }
            a();
            this.f26694d = new C0660xb(millis, this.f26691a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }

    public void a() {
        if (!b() || this.f26694d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.f26694d.e();
        this.f26694d = null;
    }
}

package com.thinkup.core.common.nm;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n.oo0;
import com.thinkup.core.common.ooo.onm;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class oo {
    private static oo o0;
    long m;
    private o0 m0;
    private boolean mm;
    private volatile Integer mn;
    private volatile Integer n0;
    private volatile Long no;
    private Context om;
    private ActivityManager on;
    private boolean oo = false;
    private final File mo = Environment.getDataDirectory();
    final long o = 5000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    AtomicInteger f41984n = new AtomicInteger();

    private oo() {
        Context contextOn = o0n.m().on();
        this.om = contextOn;
        this.on = (ActivityManager) contextOn.getSystemService("activity");
        this.m0 = new o0();
    }

    private void mm() {
        if (o0n.m().n("c_num")) {
            return;
        }
        if (this.n0 == null) {
            this.n0 = Integer.valueOf(onm.m(this.om, oo0.m.o, oo0.o.mo, -1));
        }
        if (this.n0.intValue() <= 0) {
            this.n0 = Integer.valueOf(Runtime.getRuntime().availableProcessors());
            onm.o(this.om, oo0.m.o, oo0.o.mo, this.n0.intValue());
        }
        this.m0.oo = this.n0.intValue();
    }

    private void mn() {
        if (o0n.m().n("t_store")) {
            return;
        }
        if (this.no == null) {
            this.no = Long.valueOf(onm.m(this.om, oo0.m.o, oo0.o.mm, -1L));
        }
        if (this.no.longValue() <= 0) {
            try {
                StatFs statFs = new StatFs(this.mo.getPath());
                this.no = Long.valueOf((statFs.getBlockCountLong() * ((long) statFs.getBlockSize())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            } catch (Throwable unused) {
            }
            onm.o(this.om, oo0.m.o, oo0.o.mm, this.no.longValue());
        }
        this.m0.om = this.no.longValue();
    }

    private void mo() {
        o0 o0Var = this.m0;
        Context context = this.om;
        ActivityManager activityManager = this.on;
        int memoryClass = activityManager.getMemoryClass();
        if ((context.getApplicationContext().getApplicationInfo().flags & 1048576) == 1048576) {
            memoryClass = activityManager.getLargeMemoryClass();
        }
        o0Var.o0 = memoryClass;
        if (o0n.m().n("t_mem")) {
            return;
        }
        if (this.mn == null) {
            this.mn = Integer.valueOf(onm.m(this.om, oo0.m.o, oo0.o.m0, -1));
        }
        if (this.mn.intValue() <= 0) {
            this.mn = Integer.valueOf(m.o());
            onm.o(this.om, oo0.m.o, oo0.o.m0, this.mn.intValue());
        }
        this.m0.o = this.mn.intValue();
    }

    private long n0() {
        try {
            StatFs statFs = new StatFs(this.mo.getPath());
            return (statFs.getAvailableBlocksLong() * ((long) statFs.getBlockSize())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static oo o() {
        if (o0 == null) {
            synchronized (oo.class) {
                try {
                    if (o0 == null) {
                        o0 = new oo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o0;
    }

    public final o0 m() {
        if (!this.oo) {
            return null;
        }
        if (SystemClock.elapsedRealtime() - this.m <= 5000) {
            return this.m0;
        }
        this.m = SystemClock.elapsedRealtime();
        this.m0.m0 = o.o();
        this.m0.m = m.m();
        this.m0.on = n0();
        this.m0.f41983n = m.o(this.on);
        return this.m0;
    }

    public final long m0() {
        if (o0n.m().n("t_store")) {
            return 0L;
        }
        if (this.no == null) {
            this.no = Long.valueOf(onm.m(this.om, oo0.m.o, oo0.o.mm, -1L));
        }
        if (this.no.longValue() > 0) {
            return this.no.longValue();
        }
        return 0L;
    }

    public final synchronized void n() {
        this.f41984n.incrementAndGet();
    }

    public final synchronized void o0() {
        this.f41984n.decrementAndGet();
    }

    public final int om() {
        if (o0n.m().n("t_mem")) {
            return 0;
        }
        if (this.mn == null) {
            this.mn = Integer.valueOf(onm.m(this.om, oo0.m.o, oo0.o.m0, -1));
        }
        if (this.mn.intValue() > 0) {
            return this.mn.intValue();
        }
        return 0;
    }

    public final int on() {
        if (o0n.m().n("c_num")) {
            return 0;
        }
        if (this.n0 == null) {
            this.n0 = Integer.valueOf(onm.m(this.om, oo0.m.o, oo0.o.mo, -1));
        }
        if (this.n0.intValue() > 0) {
            return this.n0.intValue();
        }
        return 0;
    }

    public final synchronized int oo() {
        return this.f41984n.get();
    }

    public final void o(com.thinkup.core.oo.m mVar) {
        this.oo = mVar.mo();
        synchronized (this) {
            try {
                if (!this.mm) {
                    o0 o0Var = this.m0;
                    Context context = this.om;
                    ActivityManager activityManager = this.on;
                    int memoryClass = activityManager.getMemoryClass();
                    if ((context.getApplicationContext().getApplicationInfo().flags & 1048576) == 1048576) {
                        memoryClass = activityManager.getLargeMemoryClass();
                    }
                    o0Var.o0 = memoryClass;
                    if (!o0n.m().n("t_mem")) {
                        if (this.mn == null) {
                            this.mn = Integer.valueOf(onm.m(this.om, oo0.m.o, oo0.o.m0, -1));
                        }
                        if (this.mn.intValue() <= 0) {
                            this.mn = Integer.valueOf(m.o());
                            onm.o(this.om, oo0.m.o, oo0.o.m0, this.mn.intValue());
                        }
                        this.m0.o = this.mn.intValue();
                    }
                    if (!o0n.m().n("c_num")) {
                        if (this.n0 == null) {
                            this.n0 = Integer.valueOf(onm.m(this.om, oo0.m.o, oo0.o.mo, -1));
                        }
                        if (this.n0.intValue() <= 0) {
                            this.n0 = Integer.valueOf(Runtime.getRuntime().availableProcessors());
                            onm.o(this.om, oo0.m.o, oo0.o.mo, this.n0.intValue());
                        }
                        this.m0.oo = this.n0.intValue();
                    }
                    if (!o0n.m().n("t_store")) {
                        if (this.no == null) {
                            this.no = Long.valueOf(onm.m(this.om, oo0.m.o, oo0.o.mm, -1L));
                        }
                        if (this.no.longValue() <= 0) {
                            try {
                                StatFs statFs = new StatFs(this.mo.getPath());
                                this.no = Long.valueOf((statFs.getBlockCountLong() * ((long) statFs.getBlockSize())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                            } catch (Throwable unused) {
                            }
                            onm.o(this.om, oo0.m.o, oo0.o.mm, this.no.longValue());
                        }
                        this.m0.om = this.no.longValue();
                    }
                    this.mm = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

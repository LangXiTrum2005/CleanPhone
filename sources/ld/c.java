package ld;

import a7.l;
import com.google.firebase.perf.config.RemoteConfigManager;
import dd.i;
import dd.t;
import dd.u;
import java.util.concurrent.TimeUnit;
import md.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f45280i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f45282b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f45285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f45286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f45287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f45288h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45283c = 500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f45284d = 500;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f45281a = new h();

    static {
        fd.a.d();
        f45280i = TimeUnit.SECONDS.toMicros(1L);
    }

    public c(l lVar, jj.d dVar, dd.a aVar, String str) {
        i iVar;
        long jLongValue;
        dd.h hVar;
        long jLongValue2;
        t tVar;
        u uVar;
        this.f45282b = lVar;
        long jK = str == "Trace" ? aVar.k() : aVar.k();
        if (str == "Trace") {
            synchronized (u.class) {
                try {
                    if (u.f38828a == null) {
                        u.f38828a = new u();
                    }
                    uVar = u.f38828a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            RemoteConfigManager remoteConfigManager = aVar.f38806a;
            uVar.getClass();
            md.d dVar2 = remoteConfigManager.getLong("fpr_rl_trace_event_count_fg");
            if (dVar2.b() && dd.a.l(((Long) dVar2.a()).longValue())) {
                aVar.f38808c.d(((Long) dVar2.a()).longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                jLongValue = ((Long) dVar2.a()).longValue();
            } else {
                md.d dVarC = aVar.c(uVar);
                jLongValue = (dVarC.b() && dd.a.l(((Long) dVarC.a()).longValue())) ? ((Long) dVarC.a()).longValue() : 300L;
            }
        } else {
            synchronized (i.class) {
                try {
                    if (i.f38816a == null) {
                        i.f38816a = new i();
                    }
                    iVar = i.f38816a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            RemoteConfigManager remoteConfigManager2 = aVar.f38806a;
            iVar.getClass();
            md.d dVar3 = remoteConfigManager2.getLong("fpr_rl_network_event_count_fg");
            if (dVar3.b() && dd.a.l(((Long) dVar3.a()).longValue())) {
                aVar.f38808c.d(((Long) dVar3.a()).longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                jLongValue = ((Long) dVar3.a()).longValue();
            } else {
                md.d dVarC2 = aVar.c(iVar);
                jLongValue = (dVarC2.b() && dd.a.l(((Long) dVarC2.a()).longValue())) ? ((Long) dVarC2.a()).longValue() : 700L;
            }
        }
        long j10 = jLongValue;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f45285e = new l(j10, jK, timeUnit);
        this.f45287g = j10;
        long jK2 = str == "Trace" ? aVar.k() : aVar.k();
        if (str == "Trace") {
            synchronized (t.class) {
                try {
                    if (t.f38827a == null) {
                        t.f38827a = new t();
                    }
                    tVar = t.f38827a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            RemoteConfigManager remoteConfigManager3 = aVar.f38806a;
            tVar.getClass();
            md.d dVar4 = remoteConfigManager3.getLong("fpr_rl_trace_event_count_bg");
            if (dVar4.b() && dd.a.l(((Long) dVar4.a()).longValue())) {
                aVar.f38808c.d(((Long) dVar4.a()).longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                jLongValue2 = ((Long) dVar4.a()).longValue();
            } else {
                md.d dVarC3 = aVar.c(tVar);
                jLongValue2 = (dVarC3.b() && dd.a.l(((Long) dVarC3.a()).longValue())) ? ((Long) dVarC3.a()).longValue() : 30L;
            }
        } else {
            synchronized (dd.h.class) {
                try {
                    if (dd.h.f38815a == null) {
                        dd.h.f38815a = new dd.h();
                    }
                    hVar = dd.h.f38815a;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            RemoteConfigManager remoteConfigManager4 = aVar.f38806a;
            hVar.getClass();
            md.d dVar5 = remoteConfigManager4.getLong("fpr_rl_network_event_count_bg");
            if (dVar5.b() && dd.a.l(((Long) dVar5.a()).longValue())) {
                aVar.f38808c.d(((Long) dVar5.a()).longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                jLongValue2 = ((Long) dVar5.a()).longValue();
            } else {
                md.d dVarC4 = aVar.c(hVar);
                jLongValue2 = (dVarC4.b() && dd.a.l(((Long) dVarC4.a()).longValue())) ? ((Long) dVarC4.a()).longValue() : 70L;
            }
        }
        long j11 = jLongValue2;
        this.f45286f = new l(j11, jK2, timeUnit);
        this.f45288h = j11;
    }

    public final synchronized void a(boolean z10) {
        try {
            this.f45282b = z10 ? this.f45285e : this.f45286f;
            this.f45283c = z10 ? this.f45287g : this.f45288h;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0061 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:3:0x0001, B:9:0x002e, B:14:0x0056, B:16:0x0061, B:19:0x0072, B:21:0x007a, B:10:0x0036, B:11:0x003f, B:12:0x0042, B:13:0x004c), top: B:29:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x007a A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:3:0x0001, B:9:0x002e, B:14:0x0056, B:16:0x0061, B:19:0x0072, B:21:0x007a, B:10:0x0036, B:11:0x003f, B:12:0x0042, B:13:0x004c), top: B:29:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x007f A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x007f, please report this as an issue */
    public final synchronized boolean b() {
        double d10;
        long nanos;
        double seconds;
        double d11;
        double d12;
        try {
            h hVar = new h();
            h hVar2 = this.f45281a;
            hVar2.getClass();
            double d13 = hVar.f45968b - hVar2.f45968b;
            l lVar = this.f45282b;
            long j10 = lVar.f3436b;
            long j11 = lVar.f3435a;
            int[] iArr = md.f.f45965a;
            TimeUnit timeUnit = (TimeUnit) lVar.f3437c;
            int i10 = iArr[timeUnit.ordinal()];
            if (i10 == 1) {
                d10 = j11 / j10;
                nanos = TimeUnit.SECONDS.toNanos(1L);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        seconds = j11 / timeUnit.toSeconds(j10);
                    } else {
                        d10 = j11 / j10;
                        nanos = TimeUnit.SECONDS.toMillis(1L);
                    }
                    d11 = (d13 * seconds) / f45280i;
                    if (d11 > 0.0d) {
                        this.f45284d = Math.min(this.f45284d + d11, this.f45283c);
                        this.f45281a = hVar;
                    }
                    d12 = this.f45284d;
                    if (d12 >= 1.0d) {
                        return false;
                    }
                    this.f45284d = d12 - 1.0d;
                    return true;
                }
                d10 = j11 / j10;
                nanos = TimeUnit.SECONDS.toMicros(1L);
            }
            seconds = d10 * nanos;
            d11 = (d13 * seconds) / f45280i;
            if (d11 > 0.0d) {
                this.f45284d = Math.min(this.f45284d + d11, this.f45283c);
                this.f45281a = hVar;
            }
            d12 = this.f45284d;
            if (d12 >= 1.0d) {
                return false;
            }
            this.f45284d = d12 - 1.0d;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

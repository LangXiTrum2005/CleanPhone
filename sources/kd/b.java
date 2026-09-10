package kd;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import md.h;
import nd.n;
import nd.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fd.a f44587g = fd.a.d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f44588h = TimeUnit.SECONDS.toMicros(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScheduledFuture f44593e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f44594f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f44589a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f44590b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44591c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f44592d = Os.sysconf(OsConstants._SC_CLK_TCK);

    public final synchronized void a(long j10, h hVar) {
        this.f44594f = j10;
        try {
            this.f44593e = this.f44590b.scheduleAtFixedRate(new a(this, hVar, 0), 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f44587g.f("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    public final o b(h hVar) {
        long j10 = this.f44592d;
        fd.a aVar = f44587g;
        if (hVar == null) {
            return null;
        }
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f44591c));
                try {
                    long jB = hVar.b() + hVar.f45967a;
                    String[] strArrSplit = bufferedReader.readLine().split(" ");
                    long j11 = Long.parseLong(strArrSplit[13]);
                    long j12 = Long.parseLong(strArrSplit[15]);
                    long j13 = Long.parseLong(strArrSplit[14]);
                    long j14 = Long.parseLong(strArrSplit[16]);
                    n nVarK = o.k();
                    nVarK.d(jB);
                    double d10 = (j13 + j14) / j10;
                    long j15 = f44588h;
                    nVarK.h(Math.round(d10 * j15));
                    nVarK.i(Math.round(((j11 + j12) / j10) * j15));
                    o oVar = (o) nVarK.build();
                    bufferedReader.close();
                    return oVar;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e10) {
                aVar.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e10.getMessage());
                return null;
            }
        } catch (IOException e11) {
            aVar.f("Unable to read 'proc/[pid]/stat' file: " + e11.getMessage());
            return null;
        }
    }
}

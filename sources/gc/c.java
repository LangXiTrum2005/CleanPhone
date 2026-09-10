package gc;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o8.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f41829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f41830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f41832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f41834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f41835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nf f41836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v6.c f41837i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41838j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f41839k;

    public c(nf nfVar, hc.b bVar, v6.c cVar) {
        double d10 = bVar.f42300d;
        double d11 = bVar.f42301e;
        long j10 = ((long) bVar.f42302f) * 1000;
        this.f41829a = d10;
        this.f41830b = d11;
        this.f41831c = j10;
        this.f41836h = nfVar;
        this.f41837i = cVar;
        this.f41832d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f41833e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f41834f = arrayBlockingQueue;
        this.f41835g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f41838j = 0;
        this.f41839k = 0L;
    }

    public final int a() {
        if (this.f41839k == 0) {
            this.f41839k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f41839k) / this.f41831c);
        int iMin = this.f41834f.size() == this.f41833e ? Math.min(100, this.f41838j + iCurrentTimeMillis) : Math.max(0, this.f41838j - iCurrentTimeMillis);
        if (this.f41838j != iMin) {
            this.f41838j = iMin;
            this.f41839k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(zb.a aVar, TaskCompletionSource taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + aVar.f54670b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.f41836h.y(new o8.a(aVar.f54669a, d.f47213c, null), new b(this, taskCompletionSource, SystemClock.elapsedRealtime() - this.f41832d < 2000, aVar));
    }
}

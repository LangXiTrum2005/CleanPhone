package gc;

import com.google.android.gms.tasks.TaskCompletionSource;
import i1.q0;
import i2.d;
import i2.e;
import i2.i;
import i2.m;
import i2.p;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import o8.g;
import oa.e0;
import oa.j0;
import oa.n1;
import zb.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements g, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f41825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41828d;

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, Object obj3) {
        this.f41826b = obj;
        this.f41827c = obj2;
        this.f41825a = z10;
        this.f41828d = obj3;
    }

    @Override // o8.g
    public void a(Exception exc) throws Throwable {
        c cVar = (c) this.f41826b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f41827c;
        zb.a aVar = (zb.a) this.f41828d;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f41825a) {
            boolean z10 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new com.unity3d.services.ads.operation.show.b(17, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = z.f54785a;
            boolean z11 = false;
            try {
                long nanos = timeUnit.toNanos(2L);
                long jNanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            nanos = jNanoTime - System.nanoTime();
                            z11 = true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (z10) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = z11;
            }
        }
        taskCompletionSource.trySetResult(aVar);
    }

    @Override // i2.m
    public n1 b(int i10, q0 q0Var, int[] iArr) {
        p pVar = (p) this.f41826b;
        i iVar = (i) this.f41827c;
        int[] iArr2 = (int[]) this.f41828d;
        pVar.getClass();
        d dVar = new d(pVar, iVar);
        int i11 = iArr2[i10];
        e0 e0VarU = j0.u();
        for (int i12 = 0; i12 < q0Var.f42659a; i12++) {
            e0VarU.b(new e(i10, q0Var, i12, iVar, iArr[i12], this.f41825a, dVar, i11));
        }
        return e0VarU.g();
    }
}

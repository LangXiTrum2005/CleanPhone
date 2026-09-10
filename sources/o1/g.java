package o1;

import com.google.android.gms.internal.ads.rx1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import go.k;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f47043a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d[] f47047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e[] f47048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f47050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f47051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public rx1 f47052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f47053k;
    public boolean l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f47044b = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f47054m = C.TIME_UNSET;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f47045c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f47046d = new ArrayDeque();

    public g(d[] dVarArr, e[] eVarArr) {
        this.f47047e = dVarArr;
        this.f47049g = dVarArr.length;
        for (int i10 = 0; i10 < this.f47049g; i10++) {
            this.f47047e[i10] = c();
        }
        this.f47048f = eVarArr;
        this.f47050h = eVarArr.length;
        for (int i11 = 0; i11 < this.f47050h; i11++) {
            this.f47048f[i11] = d();
        }
        f fVar = new f(this);
        this.f47043a = fVar;
        fVar.start();
    }

    @Override // o1.b
    public final void a(long j10) {
        synchronized (this.f47044b) {
            try {
                k.t(this.f47049g == this.f47047e.length || this.f47053k);
                this.f47054m = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract d c();

    public abstract e d();

    @Override // o1.b
    public final Object dequeueInputBuffer() {
        d dVar;
        synchronized (this.f47044b) {
            try {
                rx1 rx1Var = this.f47052j;
                if (rx1Var != null) {
                    throw rx1Var;
                }
                k.t(this.f47051i == null);
                int i10 = this.f47049g;
                if (i10 == 0) {
                    dVar = null;
                } else {
                    d[] dVarArr = this.f47047e;
                    int i11 = i10 - 1;
                    this.f47049g = i11;
                    dVar = dVarArr[i11];
                }
                this.f47051i = dVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public abstract rx1 e(Throwable th2);

    public abstract rx1 f(d dVar, e eVar, boolean z10);

    @Override // o1.b
    public final void flush() {
        synchronized (this.f47044b) {
            try {
                this.f47053k = true;
                d dVar = this.f47051i;
                if (dVar != null) {
                    dVar.g();
                    d[] dVarArr = this.f47047e;
                    int i10 = this.f47049g;
                    this.f47049g = i10 + 1;
                    dVarArr[i10] = dVar;
                    this.f47051i = null;
                }
                while (!this.f47045c.isEmpty()) {
                    d dVar2 = (d) this.f47045c.removeFirst();
                    dVar2.g();
                    d[] dVarArr2 = this.f47047e;
                    int i11 = this.f47049g;
                    this.f47049g = i11 + 1;
                    dVarArr2[i11] = dVar2;
                }
                while (!this.f47046d.isEmpty()) {
                    ((e) this.f47046d.removeFirst()).h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean g() {
        boolean z10;
        rx1 rx1VarE;
        synchronized (this.f47044b) {
            while (!this.l) {
                try {
                    if (!this.f47045c.isEmpty() && this.f47050h > 0) {
                        break;
                    }
                    this.f47044b.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.l) {
                return false;
            }
            d dVar = (d) this.f47045c.removeFirst();
            e[] eVarArr = this.f47048f;
            int i10 = this.f47050h - 1;
            this.f47050h = i10;
            e eVar = eVarArr[i10];
            boolean z11 = this.f47053k;
            this.f47053k = false;
            if (dVar.c(4)) {
                eVar.a(4);
            } else {
                eVar.f47040c = dVar.f47037g;
                if (dVar.c(134217728)) {
                    eVar.a(134217728);
                }
                long j10 = dVar.f47037g;
                synchronized (this.f47044b) {
                    long j11 = this.f47054m;
                    z10 = j11 == C.TIME_UNSET || j10 >= j11;
                }
                if (!z10) {
                    eVar.f47041d = true;
                }
                try {
                    rx1VarE = f(dVar, eVar, z11);
                } catch (OutOfMemoryError e10) {
                    rx1VarE = e(e10);
                } catch (RuntimeException e11) {
                    rx1VarE = e(e11);
                }
                if (rx1VarE != null) {
                    synchronized (this.f47044b) {
                        this.f47052j = rx1VarE;
                    }
                    return false;
                }
            }
            synchronized (this.f47044b) {
                try {
                    if (this.f47053k || eVar.f47041d) {
                        eVar.h();
                    } else {
                        this.f47046d.addLast(eVar);
                    }
                    dVar.g();
                    d[] dVarArr = this.f47047e;
                    int i11 = this.f47049g;
                    this.f47049g = i11 + 1;
                    dVarArr[i11] = dVar;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }

    @Override // o1.b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final e dequeueOutputBuffer() {
        synchronized (this.f47044b) {
            try {
                rx1 rx1Var = this.f47052j;
                if (rx1Var != null) {
                    throw rx1Var;
                }
                if (this.f47046d.isEmpty()) {
                    return null;
                }
                return (e) this.f47046d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o1.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void b(d dVar) {
        synchronized (this.f47044b) {
            try {
                rx1 rx1Var = this.f47052j;
                if (rx1Var != null) {
                    throw rx1Var;
                }
                k.i(dVar == this.f47051i);
                this.f47045c.addLast(dVar);
                if (!this.f47045c.isEmpty() && this.f47050h > 0) {
                    this.f47044b.notify();
                }
                this.f47051i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(e eVar) {
        synchronized (this.f47044b) {
            eVar.g();
            e[] eVarArr = this.f47048f;
            int i10 = this.f47050h;
            this.f47050h = i10 + 1;
            eVarArr[i10] = eVar;
            if (!this.f47045c.isEmpty() && this.f47050h > 0) {
                this.f47044b.notify();
            }
        }
    }

    @Override // o1.b
    public final void release() {
        synchronized (this.f47044b) {
            this.l = true;
            this.f47044b.notify();
        }
        try {
            this.f47043a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}

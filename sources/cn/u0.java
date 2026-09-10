package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u0 implements Runnable, Comparable, p0 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6773b = -1;

    public u0(long j10) {
        this.f6772a = j10;
    }

    public final int b(long j10, v0 v0Var, w0 w0Var) {
        synchronized (this) {
            if (this._heap == d0.f6689b) {
                return 2;
            }
            synchronized (v0Var) {
                try {
                    u0[] u0VarArr = v0Var.f42461a;
                    u0 u0Var = u0VarArr != null ? u0VarArr[0] : null;
                    if (w0.f6782h.get(w0Var) == 1) {
                        return 1;
                    }
                    if (u0Var == null) {
                        v0Var.f6777c = j10;
                    } else {
                        long j11 = u0Var.f6772a;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - v0Var.f6777c > 0) {
                            v0Var.f6777c = j10;
                        }
                    }
                    long j12 = this.f6772a;
                    long j13 = v0Var.f6777c;
                    if (j12 - j13 < 0) {
                        this.f6772a = j13;
                    }
                    v0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void c(v0 v0Var) {
        if (this._heap == d0.f6689b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = v0Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.f6772a - ((u0) obj).f6772a;
        if (j10 > 0) {
            return 1;
        }
        return j10 < 0 ? -1 : 0;
    }

    @Override // cn.p0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                hn.u uVar = d0.f6689b;
                if (obj == uVar) {
                    return;
                }
                v0 v0Var = obj instanceof v0 ? (v0) obj : null;
                if (v0Var != null) {
                    synchronized (v0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof hn.w ? (hn.w) obj2 : null) != null) {
                            v0Var.b(this.f6773b);
                        }
                    }
                }
                this._heap = uVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f6772a + ']';
    }
}

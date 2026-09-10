package ta;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends qk.i0 {
    @Override // qk.i0
    public final f F(r rVar) {
        f fVar;
        f fVar2 = f.f50609d;
        synchronized (rVar) {
            try {
                fVar = rVar.f50647b;
                if (fVar != fVar2) {
                    rVar.f50647b = fVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    @Override // qk.i0
    public final q G(r rVar) {
        q qVar;
        q qVar2 = q.f50639c;
        synchronized (rVar) {
            try {
                qVar = rVar.f50648c;
                if (qVar != qVar2) {
                    rVar.f50648c = qVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    @Override // qk.i0
    public final void X(q qVar, q qVar2) {
        qVar.f50641b = qVar2;
    }

    @Override // qk.i0
    public final void Y(q qVar, Thread thread) {
        qVar.f50640a = thread;
    }

    @Override // qk.i0
    public final boolean f(r rVar, f fVar, f fVar2) {
        synchronized (rVar) {
            try {
                if (rVar.f50647b != fVar) {
                    return false;
                }
                rVar.f50647b = fVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // qk.i0
    public final boolean g(r rVar, Object obj, Object obj2) {
        synchronized (rVar) {
            try {
                if (rVar.f50646a != obj) {
                    return false;
                }
                rVar.f50646a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // qk.i0
    public final boolean h(r rVar, q qVar, q qVar2) {
        synchronized (rVar) {
            try {
                if (rVar.f50648c != qVar) {
                    return false;
                }
                rVar.f50648c = qVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

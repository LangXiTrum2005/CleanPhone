package z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a.a {
    @Override // a.a
    public final void D(g gVar, g gVar2) {
        gVar.f54582b = gVar2;
    }

    @Override // a.a
    public final void E(g gVar, Thread thread) {
        gVar.f54581a = thread;
    }

    @Override // a.a
    public final boolean c(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f54588b != cVar) {
                    return false;
                }
                hVar.f54588b = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a.a
    public final boolean d(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f54587a != obj) {
                    return false;
                }
                hVar.f54587a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a.a
    public final boolean e(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f54589c != gVar) {
                    return false;
                }
                hVar.f54589c = gVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package o5;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.bumptech.glide.d {
    @Override // com.bumptech.glide.d
    public final void H(g gVar, g gVar2) {
        gVar.f47196b = gVar2;
    }

    @Override // com.bumptech.glide.d
    public final void I(g gVar, Thread thread) {
        gVar.f47195a = thread;
    }

    @Override // com.bumptech.glide.d
    public final boolean e(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f47202b != cVar) {
                    return false;
                }
                hVar.f47202b = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.d
    public final boolean f(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f47201a != obj) {
                    return false;
                }
                hVar.f47201a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.d
    public final boolean g(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f47203c != gVar) {
                    return false;
                }
                hVar.f47203c = gVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

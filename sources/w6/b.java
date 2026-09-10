package w6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f52945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f52946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c f52947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f52948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52949e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52950f = 3;

    public b(Object obj, d dVar) {
        this.f52945a = obj;
        this.f52946b = dVar;
    }

    @Override // w6.d, w6.c
    public final boolean a() {
        boolean z10;
        synchronized (this.f52945a) {
            try {
                z10 = this.f52947c.a() || this.f52948d.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // w6.d
    public final void b(c cVar) {
        synchronized (this.f52945a) {
            try {
                if (cVar.equals(this.f52947c)) {
                    this.f52949e = 4;
                } else if (cVar.equals(this.f52948d)) {
                    this.f52950f = 4;
                }
                d dVar = this.f52946b;
                if (dVar != null) {
                    dVar.b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // w6.c
    public final boolean c(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f52947c.c(bVar.f52947c) && this.f52948d.c(bVar.f52948d)) {
                return true;
            }
        }
        return false;
    }

    @Override // w6.c
    public final void clear() {
        synchronized (this.f52945a) {
            try {
                this.f52949e = 3;
                this.f52947c.clear();
                if (this.f52950f != 3) {
                    this.f52950f = 3;
                    this.f52948d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // w6.d
    public final void d(c cVar) {
        synchronized (this.f52945a) {
            try {
                if (cVar.equals(this.f52948d)) {
                    this.f52950f = 5;
                    d dVar = this.f52946b;
                    if (dVar != null) {
                        dVar.d(this);
                    }
                    return;
                }
                this.f52949e = 5;
                if (this.f52950f != 1) {
                    this.f52950f = 1;
                    this.f52948d.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // w6.d
    public final boolean e(c cVar) {
        boolean z10;
        boolean zEquals;
        int i10;
        synchronized (this.f52945a) {
            d dVar = this.f52946b;
            z10 = false;
            if (dVar == null || dVar.e(this)) {
                if (this.f52949e != 5) {
                    zEquals = cVar.equals(this.f52947c);
                } else {
                    zEquals = cVar.equals(this.f52948d) && ((i10 = this.f52950f) == 4 || i10 == 5);
                }
                if (zEquals) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // w6.d
    public final boolean f(c cVar) {
        boolean z10;
        synchronized (this.f52945a) {
            d dVar = this.f52946b;
            z10 = (dVar == null || dVar.f(this)) && cVar.equals(this.f52947c);
        }
        return z10;
    }

    @Override // w6.c
    public final boolean g() {
        boolean z10;
        synchronized (this.f52945a) {
            try {
                z10 = this.f52949e == 3 && this.f52950f == 3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [w6.d] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // w6.d
    public final d getRoot() {
        ?? root;
        synchronized (this.f52945a) {
            try {
                d dVar = this.f52946b;
                this = this;
                if (dVar != null) {
                    root = dVar.getRoot();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // w6.c
    public final boolean h() {
        boolean z10;
        synchronized (this.f52945a) {
            try {
                z10 = this.f52949e == 4 || this.f52950f == 4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // w6.d
    public final boolean i(c cVar) {
        boolean z10;
        synchronized (this.f52945a) {
            d dVar = this.f52946b;
            z10 = dVar == null || dVar.i(this);
        }
        return z10;
    }

    @Override // w6.c
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f52945a) {
            try {
                z10 = true;
                if (this.f52949e != 1 && this.f52950f != 1) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // w6.c
    public final void j() {
        synchronized (this.f52945a) {
            try {
                if (this.f52949e != 1) {
                    this.f52949e = 1;
                    this.f52947c.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // w6.c
    public final void pause() {
        synchronized (this.f52945a) {
            try {
                if (this.f52949e == 1) {
                    this.f52949e = 2;
                    this.f52947c.pause();
                }
                if (this.f52950f == 1) {
                    this.f52950f = 2;
                    this.f52948d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

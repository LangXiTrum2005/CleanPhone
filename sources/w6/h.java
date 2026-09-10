package w6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f52984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f52985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile g f52986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f52987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52988e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52989f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f52990g;

    public h(Object obj, d dVar) {
        this.f52985b = obj;
        this.f52984a = dVar;
    }

    @Override // w6.d, w6.c
    public final boolean a() {
        boolean z10;
        synchronized (this.f52985b) {
            try {
                z10 = this.f52987d.a() || this.f52986c.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // w6.d
    public final void b(c cVar) {
        synchronized (this.f52985b) {
            try {
                if (cVar.equals(this.f52987d)) {
                    this.f52989f = 4;
                    return;
                }
                this.f52988e = 4;
                d dVar = this.f52984a;
                if (dVar != null) {
                    dVar.b(this);
                }
                if (!q4.a.f(this.f52989f)) {
                    this.f52987d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // w6.c
    public final boolean c(c cVar) {
        if (!(cVar instanceof h)) {
            return false;
        }
        h hVar = (h) cVar;
        if (this.f52986c == null) {
            if (hVar.f52986c != null) {
                return false;
            }
        } else if (!this.f52986c.c(hVar.f52986c)) {
            return false;
        }
        if (this.f52987d == null) {
            return hVar.f52987d == null;
        }
        return this.f52987d.c(hVar.f52987d);
    }

    @Override // w6.c
    public final void clear() {
        synchronized (this.f52985b) {
            this.f52990g = false;
            this.f52988e = 3;
            this.f52989f = 3;
            this.f52987d.clear();
            this.f52986c.clear();
        }
    }

    @Override // w6.d
    public final void d(c cVar) {
        synchronized (this.f52985b) {
            try {
                if (!cVar.equals(this.f52986c)) {
                    this.f52989f = 5;
                    return;
                }
                this.f52988e = 5;
                d dVar = this.f52984a;
                if (dVar != null) {
                    dVar.d(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // w6.d
    public final boolean e(c cVar) {
        boolean z10;
        synchronized (this.f52985b) {
            try {
                d dVar = this.f52984a;
                z10 = (dVar == null || dVar.e(this)) && cVar.equals(this.f52986c) && !a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // w6.d
    public final boolean f(c cVar) {
        boolean z10;
        synchronized (this.f52985b) {
            try {
                d dVar = this.f52984a;
                z10 = (dVar == null || dVar.f(this)) && cVar.equals(this.f52986c) && this.f52988e != 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // w6.c
    public final boolean g() {
        boolean z10;
        synchronized (this.f52985b) {
            z10 = this.f52988e == 3;
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
        synchronized (this.f52985b) {
            try {
                d dVar = this.f52984a;
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
        synchronized (this.f52985b) {
            z10 = this.f52988e == 4;
        }
        return z10;
    }

    @Override // w6.d
    public final boolean i(c cVar) {
        boolean z10;
        synchronized (this.f52985b) {
            try {
                d dVar = this.f52984a;
                z10 = (dVar == null || dVar.i(this)) && (cVar.equals(this.f52986c) || this.f52988e != 4);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // w6.c
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f52985b) {
            z10 = true;
            if (this.f52988e != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // w6.c
    public final void j() {
        synchronized (this.f52985b) {
            try {
                this.f52990g = true;
                try {
                    if (this.f52988e != 4 && this.f52989f != 1) {
                        this.f52989f = 1;
                        this.f52987d.j();
                    }
                    if (this.f52990g && this.f52988e != 1) {
                        this.f52988e = 1;
                        this.f52986c.j();
                    }
                    this.f52990g = false;
                } catch (Throwable th2) {
                    this.f52990g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // w6.c
    public final void pause() {
        synchronized (this.f52985b) {
            try {
                if (!q4.a.f(this.f52989f)) {
                    this.f52989f = 2;
                    this.f52987d.pause();
                }
                if (!q4.a.f(this.f52988e)) {
                    this.f52988e = 2;
                    this.f52986c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

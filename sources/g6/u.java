package g6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f41695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f41696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f41697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e6.f f41698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41700g;

    public u(a0 a0Var, boolean z10, boolean z11, e6.f fVar, t tVar) {
        a7.h.c(a0Var, "Argument must not be null");
        this.f41696c = a0Var;
        this.f41694a = z10;
        this.f41695b = z11;
        this.f41698e = fVar;
        a7.h.c(tVar, "Argument must not be null");
        this.f41697d = tVar;
    }

    public final synchronized void a() {
        if (this.f41700g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f41699f++;
    }

    @Override // g6.a0
    public final synchronized void b() {
        if (this.f41699f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f41700g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f41700g = true;
        if (this.f41695b) {
            this.f41696c.b();
        }
    }

    @Override // g6.a0
    public final Class c() {
        return this.f41696c.c();
    }

    public final void d() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f41699f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f41699f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            ((m) this.f41697d).e(this.f41698e, this);
        }
    }

    @Override // g6.a0
    public final Object get() {
        return this.f41696c.get();
    }

    @Override // g6.a0
    public final int getSize() {
        return this.f41696c.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f41694a + ", listener=" + this.f41697d + ", key=" + this.f41698e + ", acquired=" + this.f41699f + ", isRecycled=" + this.f41700g + ", resource=" + this.f41696c + '}';
    }
}

package g6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements a0, b7.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v9.e f41712e = b7.d.a(20, new ea.b0(17));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7.e f41713a = new b7.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f41714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41716d;

    @Override // b7.b
    public final b7.e a() {
        return this.f41713a;
    }

    @Override // g6.a0
    public final synchronized void b() {
        this.f41713a.a();
        this.f41716d = true;
        if (!this.f41715c) {
            this.f41714b.b();
            this.f41714b = null;
            f41712e.e(this);
        }
    }

    @Override // g6.a0
    public final Class c() {
        return this.f41714b.c();
    }

    public final synchronized void d() {
        this.f41713a.a();
        if (!this.f41715c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f41715c = false;
        if (this.f41716d) {
            b();
        }
    }

    @Override // g6.a0
    public final Object get() {
        return this.f41714b.get();
    }

    @Override // g6.a0
    public final int getSize() {
        return this.f41714b.getSize();
    }
}

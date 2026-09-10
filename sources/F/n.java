package f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f40236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x3.c f40238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f40239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40240e;

    public n(o oVar, p pVar) {
        boolean z10 = oVar.f40242b;
        this.f40236a = pVar;
        this.f40237b = z10;
        this.f40239d = oVar;
        this.f40240e = true;
    }

    public final void a() {
        x3.c cVar = this.f40238c;
        if (cVar == null || !cVar.f53579c.remove(this)) {
            return;
        }
        x3.f fVar = cVar.f53578b;
        fVar.getClass();
        if (equals(fVar.f53590f)) {
            if (fVar.f53591g == -1) {
                this.f40239d.a();
            }
            fVar.f53590f = null;
            fVar.f53591g = 0;
            fVar.f53592h = null;
        }
        fVar.f53588d.remove(this);
        fVar.f53589e.remove(this);
        this.f40238c = null;
        fVar.b();
    }

    public final void b(boolean z10) {
        x3.f fVar;
        if (this.f40237b == z10) {
            return;
        }
        this.f40237b = z10;
        x3.c cVar = this.f40238c;
        if (cVar == null || (fVar = cVar.f53578b) == null) {
            return;
        }
        fVar.b();
    }

    public final void c(boolean z10) {
        this.f40240e = z10;
        b(z10 && this.f40239d.f40242b);
    }
}

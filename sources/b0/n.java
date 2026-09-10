package b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f5158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5159g;

    public char a() {
        return this.f5153a.charAt(this.f5154b);
    }

    public boolean b() {
        return this.f5154b < this.f5153a.length() - this.f5156d;
    }

    public void c(int i10, boolean z10) {
        if (z10) {
            this.f5156d = i10 | this.f5156d;
        } else {
            this.f5156d = (~i10) & this.f5156d;
        }
    }

    public void d(int i10) {
        ne.f fVar = (ne.f) this.f5159g;
        if (fVar == null || i10 > fVar.f46721b) {
            this.f5159g = ne.f.e(i10, (ne.g) this.f5157e);
        }
    }

    public void e(char c4) {
        ((StringBuilder) this.f5158f).append(c4);
    }
}

package a7;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends x.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3419g;

    @Override // x.i, java.util.Map
    public final void clear() {
        this.f3419g = 0;
        super.clear();
    }

    @Override // x.i
    public final void g(x.i iVar) {
        this.f3419g = 0;
        super.g(iVar);
    }

    @Override // x.i
    public final Object h(int i10) {
        this.f3419g = 0;
        return super.h(i10);
    }

    @Override // x.i, java.util.Map
    public final int hashCode() {
        if (this.f3419g == 0) {
            this.f3419g = super.hashCode();
        }
        return this.f3419g;
    }

    @Override // x.i
    public final Object i(int i10, Object obj) {
        this.f3419g = 0;
        return super.i(i10, obj);
    }

    @Override // x.i, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f3419g = 0;
        return super.put(obj, obj2);
    }
}

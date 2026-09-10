package oa;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends u0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object[] f47327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u1 f47328j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f47329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f47330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f47331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f47332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f47333h;

    static {
        Object[] objArr = new Object[0];
        f47327i = objArr;
        f47328j = new u1(0, 0, 0, objArr, objArr);
    }

    public u1(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f47329d = objArr;
        this.f47330e = i10;
        this.f47331f = objArr2;
        this.f47332g = i11;
        this.f47333h = i12;
    }

    @Override // oa.c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f47331f;
            if (objArr.length != 0) {
                int iW = q.w(obj);
                while (true) {
                    int i10 = iW & this.f47332g;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iW = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // oa.u0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f47330e;
    }

    @Override // oa.c0
    public final int m(int i10, Object[] objArr) {
        Object[] objArr2 = this.f47329d;
        int i11 = this.f47333h;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // oa.c0
    public final Object[] n() {
        return this.f47329d;
    }

    @Override // oa.c0
    public final int p() {
        return this.f47333h;
    }

    @Override // oa.c0
    public final int q() {
        return 0;
    }

    @Override // oa.c0
    public final boolean r() {
        return false;
    }

    @Override // oa.c0
    /* JADX INFO: renamed from: s */
    public final e2 iterator() {
        return h().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f47333h;
    }

    @Override // oa.u0, oa.c0
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // oa.u0
    public final j0 x() {
        return j0.t(this.f47333h, this.f47329d);
    }
}

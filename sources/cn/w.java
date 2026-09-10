package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w extends ak.a implements ak.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f6779a = new v(ak.g.f3619a, new bh.a(1));

    public w() {
        super(ak.g.f3619a);
    }

    @Override // ak.a, ak.k
    public final ak.i get(ak.j key) {
        ak.i iVar;
        kotlin.jvm.internal.n.f(key, "key");
        if (key instanceof v) {
            v vVar = (v) key;
            ak.j key2 = getKey();
            kotlin.jvm.internal.n.f(key2, "key");
            if ((key2 == vVar || vVar.f6776b == key2) && (iVar = (ak.i) vVar.f6775a.invoke(this)) != null) {
                return iVar;
            }
        } else if (ak.g.f3619a == key) {
            return this;
        }
        return null;
    }

    @Override // ak.a, ak.k
    public final ak.k minusKey(ak.j key) {
        kotlin.jvm.internal.n.f(key, "key");
        if (key instanceof v) {
            v vVar = (v) key;
            ak.j key2 = getKey();
            kotlin.jvm.internal.n.f(key2, "key");
            if ((key2 != vVar && vVar.f6776b != key2) || ((ak.i) vVar.f6775a.invoke(this)) == null) {
                return this;
            }
        } else if (ak.g.f3619a != key) {
            return this;
        }
        return ak.l.f3620a;
    }

    public abstract void p(ak.k kVar, Runnable runnable);

    public void q(ak.k kVar, Runnable runnable) throws j0 {
        hn.b.i(this, kVar, runnable);
    }

    public boolean r(ak.k kVar) {
        return !(this instanceof g2);
    }

    public w s(int i10) {
        hn.b.a(i10);
        return new hn.h(this, i10);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + d0.q(this);
    }
}

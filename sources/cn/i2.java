package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i2 implements ak.i, ak.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2 f6721a = new i2();

    @Override // ak.k
    public final Object fold(Object obj, jk.c cVar) {
        return cVar.invoke(obj, this);
    }

    @Override // ak.k
    public final /* bridge */ ak.i get(ak.j jVar) {
        return com.google.android.gms.internal.auth.i.r(this, jVar);
    }

    @Override // ak.k
    public final /* bridge */ ak.k minusKey(ak.j jVar) {
        return com.google.android.gms.internal.auth.i.z(this, jVar);
    }

    @Override // ak.k
    public final /* bridge */ ak.k plus(ak.k kVar) {
        return com.google.android.gms.internal.auth.i.D(this, kVar);
    }

    @Override // ak.i
    public final ak.j getKey() {
        return this;
    }
}

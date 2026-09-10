package ak;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements i {
    private final j key;

    public a(j key) {
        n.f(key, "key");
        this.key = key;
    }

    @Override // ak.k
    public /* bridge */ <R> R fold(R r2, jk.c cVar) {
        return (R) com.google.android.gms.internal.auth.i.p(this, r2, cVar);
    }

    @Override // ak.k
    public /* bridge */ <E extends i> E get(j jVar) {
        return (E) com.google.android.gms.internal.auth.i.r(this, jVar);
    }

    @Override // ak.i
    public j getKey() {
        return this.key;
    }

    @Override // ak.k
    public /* bridge */ k minusKey(j jVar) {
        return com.google.android.gms.internal.auth.i.z(this, jVar);
    }

    @Override // ak.k
    public /* bridge */ k plus(k kVar) {
        return com.google.android.gms.internal.auth.i.D(this, kVar);
    }
}

package xj;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements Iterable, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f53864b;

    public /* synthetic */ m(Object obj, int i10) {
        this.f53863a = i10;
        this.f53864b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f53863a) {
            case 0:
                return kotlin.jvm.internal.m.a((Object[]) this.f53864b);
            case 1:
                return new z((Iterator) ((jk.a) this.f53864b).invoke());
            default:
                return ((zm.i) this.f53864b).iterator();
        }
    }
}

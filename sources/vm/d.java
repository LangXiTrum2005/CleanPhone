package vm;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements Iterable, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f52661a;

    public final boolean isEmpty() {
        return this.f52661a.b() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f52661a.iterator();
    }
}

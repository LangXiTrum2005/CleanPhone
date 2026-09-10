package an;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements zm.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f3778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jk.c f3780c;

    public c(CharSequence input, int i10, jk.c cVar) {
        kotlin.jvm.internal.n.f(input, "input");
        this.f3778a = input;
        this.f3779b = i10;
        this.f3780c = cVar;
    }

    @Override // zm.i
    public final Iterator iterator() {
        return new b(this);
    }
}

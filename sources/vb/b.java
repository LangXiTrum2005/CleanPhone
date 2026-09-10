package vb;

import java.util.ArrayList;
import tb.o;
import x0.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f52530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f52531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f52532c;

    public b(o oVar) {
        yb.b bVar = new yb.b();
        un.a aVar = new un.a(9);
        this.f52532c = bVar;
        this.f52530a = new ArrayList();
        this.f52531b = aVar;
        oVar.a(new a(this));
    }

    public b(g gVar) {
        this.f52530a = gVar;
    }
}

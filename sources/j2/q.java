package j2;

import android.net.Uri;
import f2.u;
import n1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43678a = u.f40463b.getAndIncrement();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1.k f43679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f43681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f43682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f43683f;

    public q(n1.h hVar, n1.k kVar, int i10, p pVar) {
        this.f43681d = new y(hVar);
        this.f43679b = kVar;
        this.f43680c = i10;
        this.f43682e = pVar;
    }

    @Override // j2.j
    public final void load() {
        this.f43681d.f46417b = 0L;
        n1.j jVar = new n1.j(this.f43681d, this.f43679b);
        try {
            jVar.f46363a.C(jVar.f46364b);
            jVar.f46366d = true;
            Uri uri = this.f43681d.f46416a.getUri();
            uri.getClass();
            this.f43683f = this.f43682e.j(uri, jVar);
        } finally {
            l1.y.h(jVar);
        }
    }

    @Override // j2.j
    public final void cancelLoad() {
    }
}

package ud;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements wd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52055a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd.c f52056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rb.c f52057c;

    public d0(rb.c cVar, wd.c cVar2) {
        this.f52057c = cVar;
        this.f52056b = cVar2;
    }

    @Override // vj.a
    public final Object get() {
        switch (this.f52055a) {
            case 0:
                return new c0((Context) this.f52057c.f49529b, (h1) this.f52056b.get());
            default:
                return new xd.d((b) this.f52056b.get(), (ak.k) this.f52057c.f49529b);
        }
    }

    public d0(wd.c cVar, rb.c cVar2) {
        this.f52056b = cVar;
        this.f52057c = cVar2;
    }
}

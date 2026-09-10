package eo;

import lo.i;
import lo.r;
import lo.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f40191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f40193c;

    public e(g gVar) {
        this.f40193c = gVar;
        this.f40191a = new i(((lo.f) gVar.f40200f).timeout());
    }

    @Override // lo.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f40192b) {
            return;
        }
        this.f40192b = true;
        i iVar = this.f40191a;
        v vVar = iVar.f45642e;
        iVar.f45642e = v.f45672d;
        vVar.a();
        vVar.b();
        this.f40193c.f40196b = 3;
    }

    @Override // lo.r
    public final void e(long j10, lo.e eVar) {
        if (this.f40192b) {
            throw new IllegalStateException("closed");
        }
        yn.a.c(eVar.f45637b, 0L, j10);
        ((lo.f) this.f40193c.f40200f).e(j10, eVar);
    }

    @Override // lo.r, java.io.Flushable
    public final void flush() {
        if (this.f40192b) {
            return;
        }
        ((lo.f) this.f40193c.f40200f).flush();
    }

    @Override // lo.r
    public final v timeout() {
        return this.f40191a;
    }
}

package eo;

import lo.i;
import lo.r;
import lo.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f40182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f40184c;

    public b(g gVar) {
        this.f40184c = gVar;
        this.f40182a = new i(((lo.f) gVar.f40200f).timeout());
    }

    @Override // lo.r, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f40183b) {
            return;
        }
        this.f40183b = true;
        ((lo.f) this.f40184c.f40200f).writeUtf8("0\r\n\r\n");
        i iVar = this.f40182a;
        v vVar = iVar.f45642e;
        iVar.f45642e = v.f45672d;
        vVar.a();
        vVar.b();
        this.f40184c.f40196b = 3;
    }

    @Override // lo.r
    public final void e(long j10, lo.e eVar) {
        lo.f fVar = (lo.f) this.f40184c.f40200f;
        if (this.f40183b) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return;
        }
        fVar.writeHexadecimalUnsignedLong(j10);
        fVar.writeUtf8("\r\n");
        fVar.e(j10, eVar);
        fVar.writeUtf8("\r\n");
    }

    @Override // lo.r, java.io.Flushable
    public final synchronized void flush() {
        if (this.f40183b) {
            return;
        }
        ((lo.f) this.f40184c.f40200f).flush();
    }

    @Override // lo.r
    public final v timeout() {
        return this.f40182a;
    }
}

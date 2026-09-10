package ag;

import android.media.MediaCodec;
import android.media.MediaFormat;
import cg.l;
import cg.n;
import cg.p;
import g9.k;
import java.nio.ByteBuffer;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends cg.a implements cg.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f3571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vf.c f3572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f3573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MediaCodec.BufferInfo f3574g;

    public f(k kVar, vf.c cVar) {
        super("Writer");
        this.f3571d = kVar;
        this.f3572e = cVar;
        this.f3573f = this;
        this.f3574g = new MediaCodec.BufferInfo();
    }

    @Override // cg.a
    public final p c(n state) {
        kotlin.jvm.internal.n.f(state, "state");
        g gVar = (g) state.f6411a;
        ByteBuffer byteBuffer = gVar.f3575a;
        long j10 = gVar.f3576b;
        int i10 = gVar.f3577c;
        boolean z10 = state instanceof l;
        if (z10) {
            this.f3574g.set(0, 0, 0L, i10 | 4);
        } else {
            this.f3574g.set(byteBuffer.position(), byteBuffer.remaining(), j10, i10);
        }
        this.f3571d.c(this.f3572e, byteBuffer, this.f3574g);
        gVar.f3578d.invoke();
        r rVar = r.f53297a;
        return z10 ? new l(rVar) : new n(rVar);
    }

    @Override // cg.a
    public final cg.c d() {
        return this.f3573f;
    }

    public final void h(MediaFormat format) {
        kotlin.jvm.internal.n.f(format, "format");
        this.f6381b.a("handleFormat(" + format + ")");
        this.f3571d.a(this.f3572e, format);
    }
}

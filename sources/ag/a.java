package ag;

import android.media.MediaFormat;
import cg.l;
import cg.n;
import cg.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends cg.a implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaFormat f3560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteBuffer f3561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f3562f;

    public a(MediaFormat mediaFormat) {
        super("Bridge");
        this.f3560d = mediaFormat;
        this.f3561e = ByteBuffer.allocateDirect(mediaFormat.getInteger("max-input-size")).order(ByteOrder.nativeOrder());
        this.f3562f = this;
    }

    @Override // ag.c
    public final wj.f buffer() {
        ByteBuffer byteBuffer = this.f3561e;
        byteBuffer.clear();
        return new wj.f(byteBuffer, 0);
    }

    @Override // cg.a
    public final p c(n state) {
        kotlin.jvm.internal.n.f(state, "state");
        f2.e eVar = ((d) state.f6411a).f3567a;
        boolean z10 = eVar.f40320a;
        ByteBuffer buffer = (ByteBuffer) eVar.f40323d;
        kotlin.jvm.internal.n.e(buffer, "buffer");
        g gVar = new g(buffer, eVar.f40321b, z10 ? 1 : 0, new defpackage.c(25));
        return state instanceof l ? new l(gVar) : new n(gVar);
    }

    @Override // cg.a
    public final cg.c d() {
        return this.f3562f;
    }

    @Override // cg.a
    public final void f(cg.c cVar) {
        f next = (f) cVar;
        kotlin.jvm.internal.n.f(next, "next");
        StringBuilder sb2 = new StringBuilder("initialize(): format=");
        MediaFormat mediaFormat = this.f3560d;
        sb2.append(mediaFormat);
        this.f6381b.a(sb2.toString());
        next.h(mediaFormat);
    }
}

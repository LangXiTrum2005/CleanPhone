package xf;

import android.media.MediaFormat;
import android.view.Surface;
import cg.j;
import cg.l;
import cg.o;
import cg.p;
import f.q;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import kotlin.jvm.internal.n;
import qd.i;
import wj.f;
import xj.k;
import zf.g;
import zf.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends j implements zf.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lg.a f53776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gg.a f53777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MediaFormat f53778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f53779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f53780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f53781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f53782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediaFormat f53783k;
    public yf.a l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(lg.a stretcher, gg.a resampler, MediaFormat targetFormat) {
        super("AudioEngine");
        n.f(stretcher, "stretcher");
        n.f(resampler, "resampler");
        n.f(targetFormat, "targetFormat");
        this.f53776d = stretcher;
        this.f53777e = resampler;
        this.f53778f = targetFormat;
        this.f53779g = this;
        this.f53780h = new e(0);
        this.f53781i = new i(this.f6381b);
    }

    @Override // zf.c
    public final void a(MediaFormat mediaFormat) {
        yf.a aVar;
        this.f6381b.a("handleRawFormat(" + mediaFormat + ")");
        this.f53783k = mediaFormat;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = this.f53778f.getInteger("channel-count");
        if (integer == integer2) {
            aVar = new v1.j(15);
        } else {
            if (!k.E0(new Integer[]{1, 2}).contains(Integer.valueOf(integer))) {
                throw new IllegalStateException(("Input channel count not supported: " + integer).toString());
            }
            if (!k.E0(new Integer[]{1, 2}).contains(Integer.valueOf(integer2))) {
                throw new IllegalStateException(("Output channel count not supported: " + integer2).toString());
            }
            aVar = integer < integer2 ? new un.a(16) : new un.a(15);
        }
        this.l = aVar;
        this.f53782j = true;
    }

    @Override // zf.c
    public final Surface b(MediaFormat sourceFormat) {
        n.f(sourceFormat, "sourceFormat");
        return null;
    }

    @Override // cg.a
    public final cg.c d() {
        return this.f53779g;
    }

    @Override // cg.j
    public final p h() {
        boolean z10 = this.f53782j;
        ec.a aVar = this.f6381b;
        i iVar = this.f53781i;
        if (!z10) {
            aVar.a("drain(): not ready, waiting... (" + ((xj.j) iVar.f48981c).f53861c + " in queue)");
            return new o(false);
        }
        xj.j jVar = (xj.j) iVar.f48981c;
        xj.j jVar2 = (xj.j) iVar.f48981c;
        if (jVar.isEmpty()) {
            aVar.a("drain(): no chunks, waiting...");
            return new o(false);
        }
        f fVarC = ((g) e()).f54944d.c();
        if (fVarC == null) {
            aVar.a("drain(): no next buffer, waiting... (" + jVar2.f53861c + " in queue)");
            return new o(true);
        }
        final ByteBuffer byteBuffer = (ByteBuffer) fVarC.f53283a;
        final int iIntValue = ((Number) fVarC.f53284b).intValue();
        final ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        Object lVar = new l(new h(0L, byteBuffer, iIntValue));
        MediaFormat mediaFormat = this.f53783k;
        if (mediaFormat == null) {
            n.l("rawFormat");
            throw null;
        }
        jk.d dVar = new jk.d() { // from class: xf.a
            @Override // jk.d
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ShortBuffer inBuffer = (ShortBuffer) obj;
                long jLongValue = ((Long) obj2).longValue();
                double dDoubleValue = ((Double) obj3).doubleValue();
                b bVar = this;
                e eVar = bVar.f53780h;
                MediaFormat mediaFormat2 = bVar.f53778f;
                ByteBuffer outBytes = byteBuffer;
                n.f(outBytes, "$outBytes");
                n.f(inBuffer, "inBuffer");
                ShortBuffer shortBuffer = shortBufferAsShortBuffer;
                int iRemaining = shortBuffer.remaining();
                int iRemaining2 = inBuffer.remaining();
                double d10 = iRemaining2;
                double dCeil = Math.ceil(d10 * dDoubleValue);
                yf.a aVar2 = bVar.l;
                if (aVar2 == null) {
                    n.l("remixer");
                    throw null;
                }
                double integer = ((double) mediaFormat2.getInteger("sample-rate")) * ((double) aVar2.b((int) dCeil));
                MediaFormat mediaFormat3 = bVar.f53783k;
                if (mediaFormat3 == null) {
                    n.l("rawFormat");
                    throw null;
                }
                double dCeil2 = Math.ceil(integer / ((double) mediaFormat3.getInteger("sample-rate")));
                double d11 = iRemaining;
                if (dCeil2 > d11) {
                    iRemaining2 = (int) Math.floor(d11 / (dCeil2 / d10));
                }
                inBuffer.limit(inBuffer.position() + iRemaining2);
                int iCeil = (int) Math.ceil(((double) iRemaining2) * dDoubleValue);
                ShortBuffer shortBufferA = eVar.a(iCeil, "stretch");
                lg.a aVar3 = bVar.f53776d;
                MediaFormat mediaFormat4 = bVar.f53783k;
                if (mediaFormat4 == null) {
                    n.l("rawFormat");
                    throw null;
                }
                aVar3.e(inBuffer, shortBufferA, mediaFormat4.getInteger("channel-count"));
                shortBufferA.flip();
                yf.a aVar4 = bVar.l;
                if (aVar4 == null) {
                    n.l("remixer");
                    throw null;
                }
                ShortBuffer shortBufferA2 = eVar.a(aVar4.b(iCeil), "remix");
                yf.a aVar5 = bVar.l;
                if (aVar5 == null) {
                    n.l("remixer");
                    throw null;
                }
                aVar5.e(shortBufferA, shortBufferA2);
                shortBufferA2.flip();
                gg.a aVar6 = bVar.f53777e;
                MediaFormat mediaFormat5 = bVar.f53783k;
                if (mediaFormat5 == null) {
                    n.l("rawFormat");
                    throw null;
                }
                aVar6.m(shortBufferA2, mediaFormat5.getInteger("sample-rate"), shortBuffer, mediaFormat2.getInteger("sample-rate"), mediaFormat2.getInteger("channel-count"));
                shortBuffer.flip();
                outBytes.clear();
                outBytes.limit(shortBuffer.limit() * 2);
                outBytes.position(shortBuffer.position() * 2);
                ec.a aVar7 = bVar.f6381b;
                int i10 = ((xj.j) bVar.f53781i.f48981c).f53861c;
                int i11 = iIntValue;
                aVar7.c(l1.d.f("drain(): passing buffer ", i11, " to encoder... ", i10, " in queue"));
                return new cg.n(new h(jLongValue, outBytes, i11));
            }
        };
        ec.a aVar2 = (ec.a) iVar.f48980b;
        c cVar = (c) jVar2.removeFirst();
        if (cVar != c.f53784e) {
            ShortBuffer shortBuffer = cVar.f53785a;
            jk.a aVar3 = cVar.f53788d;
            long j10 = cVar.f53786b;
            int iRemaining = shortBuffer.remaining();
            int iLimit = shortBuffer.limit();
            Object objInvoke = dVar.invoke(shortBuffer, Long.valueOf(j10), Double.valueOf(cVar.f53787c));
            shortBuffer.limit(iLimit);
            if (shortBuffer.hasRemaining()) {
                int iRemaining2 = iRemaining - shortBuffer.remaining();
                int integer = mediaFormat.getInteger("sample-rate");
                int integer2 = mediaFormat.getInteger("channel-count");
                ShortBuffer shortBufferL = ((h2.d) iVar.f48982d).l(shortBuffer);
                aVar3.invoke();
                jVar2.addFirst(new c(shortBufferL, (((long) (iRemaining2 * 2)) * 1000000) / ((long) ((integer * 2) * integer2)), cVar.f53787c, new d(iVar, shortBufferL, 0)));
                aVar2.c("drain(): partially handled chunk at " + j10 + "us, " + shortBuffer.remaining() + " bytes left (" + jVar2.f53861c + ")");
            } else {
                int i10 = jVar2.f53861c;
                aVar2.c("drain(): consumed chunk at " + j10 + "us (" + (i10 + 1) + " => " + i10 + ")");
                aVar3.invoke();
            }
            lVar = objInvoke;
        }
        return (p) lVar;
    }

    @Override // cg.j
    public final void i(Object obj) throws InterruptedException {
        zf.d dVar = (zf.d) obj;
        zf.f fVar = dVar instanceof zf.f ? (zf.f) dVar : null;
        double d10 = fVar != null ? fVar.f54943d : 1.0d;
        ShortBuffer shortBufferAsShortBuffer = dVar.f54936a.asShortBuffer();
        n.e(shortBufferAsShortBuffer, "asShortBuffer(...)");
        long j10 = dVar.f54937b;
        q qVar = new q(dVar, 5);
        i iVar = this.f53781i;
        xj.j jVar = (xj.j) iVar.f48981c;
        if (shortBufferAsShortBuffer.hasRemaining()) {
            if (jVar.f53861c < 3) {
                jVar.addLast(new c(shortBufferAsShortBuffer, j10, d10, qVar));
                return;
            }
            ShortBuffer shortBufferL = ((h2.d) iVar.f48982d).l(shortBufferAsShortBuffer);
            jVar.addLast(new c(shortBufferL, j10, d10, new d(iVar, shortBufferL, 1)));
            qVar.invoke();
            return;
        }
        ((ec.a) iVar.f48980b).b(2, null, "enqueued invalid buffer (" + j10 + ", " + shortBufferAsShortBuffer.capacity() + ")");
        qVar.invoke();
    }

    @Override // cg.j
    public final void j(Object obj) {
        i iVar = this.f53781i;
        this.f6381b.a("enqueueEos (" + ((xj.j) iVar.f48981c).f53861c + " in queue)");
        ((zf.d) obj).f54938c.invoke(Boolean.FALSE);
        ((xj.j) iVar.f48981c).addLast(c.f53784e);
    }
}

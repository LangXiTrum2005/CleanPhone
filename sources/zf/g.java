package zf;

import android.media.MediaCodec;
import android.media.MediaFormat;
import cg.j;
import cg.l;
import cg.o;
import cg.p;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.n;
import m5.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends j implements cg.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wf.b f54944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f54945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f54946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MediaCodec.BufferInfo f54947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f54948h;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(fc.f codecs, vf.c cVar) {
        n.f(codecs, "codecs");
        wf.b encoder = (wf.b) ((wf.d) codecs.f40784f).l(cVar);
        boolean zBooleanValue = ((Boolean) ((wf.e) codecs.f40785g).l(cVar)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) ((wf.e) codecs.f40786h).l(cVar)).booleanValue();
        n.f(encoder, "encoder");
        super(encoder.f53180b == null ? "AudioEncoder" : "VideoEncoder");
        this.f54944d = encoder;
        this.f54945e = zBooleanValue2;
        this.f54946f = this;
        this.f54947g = new MediaCodec.BufferInfo();
        ec.a aVar = this.f6381b;
        encoder.f53181c = aVar;
        aVar.a("ownsStart=" + zBooleanValue + " ownsStop=" + zBooleanValue2 + " " + encoder.d());
        if (zBooleanValue) {
            encoder.f53179a.start();
        }
    }

    @Override // cg.a
    public final cg.c d() {
        return this.f54946f;
    }

    @Override // cg.a
    public final void g() {
        wf.b bVar = this.f54944d;
        String strD = bVar.d();
        StringBuilder sb2 = new StringBuilder("release(): ownsStop=");
        boolean z10 = this.f54945e;
        sb2.append(z10);
        sb2.append(" ");
        sb2.append(strD);
        this.f6381b.a(sb2.toString());
        if (z10) {
            bVar.f53179a.stop();
        }
    }

    @Override // cg.j
    public final p h() {
        long j10 = this.f54948h ? 5000L : 100L;
        wf.b bVar = this.f54944d;
        MediaCodec mediaCodec = bVar.f53179a;
        MediaCodec mediaCodec2 = bVar.f53179a;
        MediaCodec.BufferInfo bufferInfo = this.f54947g;
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j10);
        if (iDequeueOutputBuffer == -3) {
            return h();
        }
        ec.a aVar = this.f6381b;
        if (iDequeueOutputBuffer == -2) {
            aVar.a("INFO_OUTPUT_FORMAT_CHANGED! format=" + mediaCodec2.getOutputFormat());
            ag.f fVar = (ag.f) e();
            MediaFormat outputFormat = mediaCodec2.getOutputFormat();
            n.e(outputFormat, "getOutputFormat(...)");
            fVar.h(outputFormat);
            return h();
        }
        if (iDequeueOutputBuffer == -1) {
            if (!this.f54948h) {
                aVar.a("Can't dequeue output buffer: INFO_TRY_AGAIN_LATER");
                return new o(true);
            }
            aVar.a("Sending fake Eos. " + bVar.d());
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
            n.c(byteBufferAllocateDirect);
            return new l(new ag.g(byteBufferAllocateDirect, 0L, 0, new defpackage.c(25)));
        }
        if ((bufferInfo.flags & 2) != 0) {
            mediaCodec2.releaseOutputBuffer(iDequeueOutputBuffer, false);
            return h();
        }
        bVar.f(bVar.b() + 1);
        int i10 = bufferInfo.flags;
        boolean z10 = (i10 & 4) != 0;
        int i11 = i10 & (-5);
        ByteBuffer outputBuffer = mediaCodec2.getOutputBuffer(iDequeueOutputBuffer);
        if (outputBuffer == null) {
            throw new IllegalStateException(defpackage.e.h(iDequeueOutputBuffer, "outputBuffer(", ") should not be null.").toString());
        }
        long j11 = bufferInfo.presentationTimeUs;
        outputBuffer.clear();
        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
        outputBuffer.position(bufferInfo.offset);
        ag.g gVar = new ag.g(outputBuffer, j11, i11, new dg.b(this, iDequeueOutputBuffer));
        return z10 ? new l(gVar) : new cg.n(gVar);
    }

    @Override // cg.j
    public final void i(Object obj) {
        h hVar = (h) obj;
        wf.b bVar = this.f54944d;
        if (bVar.f53180b != null) {
            return;
        }
        ByteBuffer byteBuffer = hVar.f54950a;
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Audio should always pass a buffer to Encoder.");
        }
        bVar.f53179a.queueInputBuffer(hVar.f54951b, byteBuffer.position(), byteBuffer.remaining(), hVar.f54952c, 0);
        bVar.e(bVar.a() - 1);
    }

    @Override // cg.j
    public final void j(Object obj) {
        h hVar = (h) obj;
        wf.b bVar = this.f54944d;
        k kVar = bVar.f53180b;
        boolean z10 = this.f54945e;
        if (kVar != null) {
            if (z10) {
                bVar.f53179a.signalEndOfInputStream();
                return;
            } else {
                this.f54948h = true;
                return;
            }
        }
        if (z10) {
            bVar.f53179a.queueInputBuffer(hVar.f54951b, 0, 0, 0L, 4);
            bVar.e(bVar.a() - 1);
            return;
        }
        this.f54948h = true;
        ByteBuffer byteBuffer = hVar.f54950a;
        n.c(byteBuffer);
        bVar.f53184f.addLast(new wj.f(byteBuffer, Integer.valueOf(hVar.f54951b)));
    }
}

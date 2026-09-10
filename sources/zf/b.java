package zf;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import cc.a2;
import cg.j;
import cg.l;
import cg.o;
import cg.p;
import com.google.android.gms.internal.measurement.nf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends j implements ag.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaFormat f54929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f54930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wf.b f54931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MediaCodec.BufferInfo f54932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nf f54933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f54934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ByteBuffer f54935j;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(MediaFormat mediaFormat) throws IOException {
        String str;
        vf.c cVarV = a2.v(mediaFormat);
        if (cVarV == null) {
            throw new IllegalArgumentException(defpackage.e.n("Unexpected mime type: ", mediaFormat.getString("mime")).toString());
        }
        int iOrdinal = cVarV.ordinal();
        if (iOrdinal == 0) {
            str = "AudioDecoder";
        } else {
            if (iOrdinal != 1) {
                throw new aa.b((byte) 0, 20);
            }
            str = "VideoDecoder";
        }
        super(str);
        this.f54929d = mediaFormat;
        this.f54930e = this;
        this.f6381b.a("init: instantiating codec...");
        String string = mediaFormat.getString("mime");
        n.c(string);
        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
        n.e(mediaCodecCreateDecoderByType, "createDecoderByType(...)");
        this.f54931f = new wf.b(mediaCodecCreateDecoderByType, null, this.f6381b);
        this.f54932g = new MediaCodec.BufferInfo();
        this.f54933h = new nf(16);
        this.f54935j = ByteBuffer.allocateDirect(0);
    }

    @Override // ag.c
    public final wj.f buffer() {
        return this.f54931f.c();
    }

    @Override // cg.a
    public final cg.c d() {
        return this.f54930e;
    }

    @Override // cg.a
    public final void f(cg.c cVar) {
        c next = (c) cVar;
        n.f(next, "next");
        this.f6382c = next;
        this.f6381b.a("initialize()");
        MediaFormat mediaFormat = this.f54929d;
        Surface surfaceB = next.b(mediaFormat);
        this.f54934i = surfaceB != null;
        wf.b bVar = this.f54931f;
        bVar.f53179a.configure(mediaFormat, surfaceB, (MediaCrypto) null, 0);
        bVar.f53179a.start();
    }

    @Override // cg.a
    public final void g() {
        wf.b bVar = this.f54931f;
        this.f6381b.a("release: releasing codec. " + bVar.d());
        MediaCodec mediaCodec = bVar.f53179a;
        mediaCodec.stop();
        mediaCodec.release();
    }

    @Override // cg.j
    public final p h() {
        Long lValueOf;
        Long l;
        p oVar;
        wf.b bVar = this.f54931f;
        MediaCodec mediaCodec = bVar.f53179a;
        MediaCodec mediaCodec2 = bVar.f53179a;
        MediaCodec.BufferInfo bufferInfo = this.f54932g;
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100L);
        ec.a aVar = this.f6381b;
        if (iDequeueOutputBuffer == -3) {
            aVar.a("drain(): got INFO_OUTPUT_BUFFERS_CHANGED, retrying.");
            return h();
        }
        if (iDequeueOutputBuffer == -2) {
            aVar.a("drain(): got INFO_OUTPUT_FORMAT_CHANGED, handling format and retrying. format=" + mediaCodec2.getOutputFormat());
            c cVar = (c) e();
            MediaFormat outputFormat = mediaCodec2.getOutputFormat();
            n.e(outputFormat, "getOutputFormat(...)");
            cVar.a(outputFormat);
            return h();
        }
        if (iDequeueOutputBuffer == -1) {
            aVar.a("drain(): got INFO_TRY_AGAIN_LATER, waiting.");
            return new o(true);
        }
        boolean z10 = (bufferInfo.flags & 4) != 0;
        if (z10) {
            l = 0L;
        } else {
            long j10 = bufferInfo.presentationTimeUs;
            nf nfVar = this.f54933h;
            nfVar.getClass();
            ArrayList arrayList = (ArrayList) nfVar.f23783c;
            if (((Long) nfVar.f23786f) == null) {
                nfVar.f23786f = Long.valueOf(j10);
            }
            Long l10 = (Long) nfVar.f23785e;
            n.c(l10);
            long jLongValue = l10.longValue();
            Long l11 = (Long) nfVar.f23786f;
            n.c(l11);
            long jLongValue2 = (j10 - l11.longValue()) + jLongValue;
            Iterator it = arrayList.iterator();
            long jLongValue3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    pk.e eVar = (pk.e) nfVar.f23784d;
                    if (eVar != null && eVar.b(jLongValue2)) {
                        if (!arrayList.isEmpty()) {
                            pk.e eVar2 = (pk.e) nfVar.f23784d;
                            n.c(eVar2);
                            jLongValue3 = (eVar2.f48405a - ((pk.e) xj.n.w0(arrayList)).f48406b) + jLongValue3;
                        }
                        lValueOf = Long.valueOf(j10 - jLongValue3);
                        break;
                    }
                    lValueOf = null;
                    break;
                }
                pk.e eVar3 = (pk.e) it.next();
                Object obj = ((LinkedHashMap) nfVar.f23782b).get(eVar3);
                n.c(obj);
                jLongValue3 = ((Number) obj).longValue() + jLongValue3;
                if (eVar3.b(jLongValue2)) {
                    lValueOf = Long.valueOf(j10 - jLongValue3);
                    break;
                }
            }
            l = lValueOf;
        }
        if (l != null) {
            ByteBuffer outputBuffer = mediaCodec2.getOutputBuffer(iDequeueOutputBuffer);
            if (outputBuffer == null) {
                if (!this.f54934i) {
                    int i10 = bufferInfo.size;
                    int i11 = bufferInfo.offset;
                    int i12 = bufferInfo.flags;
                    StringBuilder sbL = l1.d.l("outputBuffer(", iDequeueOutputBuffer, ", ", i10, ", ");
                    sbL.append(i11);
                    sbL.append(", ");
                    sbL.append(i12);
                    sbL.append(") should not be null.");
                    throw new IllegalStateException(sbL.toString().toString());
                }
                outputBuffer = this.f54935j;
            }
            bVar.f(bVar.b() + 1);
            n.c(outputBuffer);
            d dVar = new d(outputBuffer, l.longValue(), new a(this, iDequeueOutputBuffer));
            oVar = z10 ? new l(dVar) : new cg.n(dVar);
        } else {
            mediaCodec2.releaseOutputBuffer(iDequeueOutputBuffer, false);
            oVar = new o(false);
        }
        aVar.c("drain(): returning " + oVar);
        return oVar;
    }

    @Override // cg.j
    public final void i(Object obj) {
        long j10;
        ag.d dVar = (ag.d) obj;
        wf.b bVar = this.f54931f;
        bVar.e(bVar.a() - 1);
        f2.e eVar = dVar.f3567a;
        int i10 = dVar.f3568b;
        boolean z10 = eVar.f40320a;
        this.f6381b.c("enqueued " + ((ByteBuffer) eVar.f40323d).remaining() + " bytes (" + eVar.f40321b + "us)");
        bVar.f53179a.queueInputBuffer(i10, ((ByteBuffer) eVar.f40323d).position(), ((ByteBuffer) eVar.f40323d).remaining(), eVar.f40321b, z10 ? 1 : 0);
        long j11 = eVar.f40321b;
        boolean z11 = eVar.f40322c;
        nf nfVar = this.f54933h;
        ArrayList arrayList = (ArrayList) nfVar.f23783c;
        if (((Long) nfVar.f23785e) == null) {
            nfVar.f23785e = Long.valueOf(j11);
        }
        if (z11) {
            pk.e eVar2 = (pk.e) nfVar.f23784d;
            if (eVar2 == null) {
                nfVar.f23784d = new pk.e(j11, Long.MAX_VALUE);
                return;
            } else {
                n.c(eVar2);
                nfVar.f23784d = new pk.e(eVar2.f48405a, j11);
                return;
            }
        }
        pk.e eVar3 = (pk.e) nfVar.f23784d;
        if (eVar3 != null && eVar3.f48406b != Long.MAX_VALUE) {
            arrayList.add(eVar3);
            LinkedHashMap linkedHashMap = (LinkedHashMap) nfVar.f23782b;
            pk.e eVar4 = (pk.e) nfVar.f23784d;
            n.c(eVar4);
            if (arrayList.size() >= 2) {
                pk.e eVar5 = (pk.e) nfVar.f23784d;
                n.c(eVar5);
                j10 = eVar5.f48405a - ((pk.e) arrayList.get(xj.o.P(arrayList) - 1)).f48406b;
            } else {
                j10 = 0;
            }
            linkedHashMap.put(eVar4, Long.valueOf(j10));
        }
        nfVar.f23784d = null;
    }

    @Override // cg.j
    public final void j(Object obj) {
        this.f6381b.a("enqueueEos()!");
        wf.b bVar = this.f54931f;
        bVar.e(bVar.a() - 1);
        bVar.f53179a.queueInputBuffer(((ag.d) obj).f3568b, 0, 0, 0L, 4);
    }
}
